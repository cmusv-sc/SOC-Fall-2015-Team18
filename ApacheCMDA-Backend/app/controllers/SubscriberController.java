package controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.PersistenceException;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by gongbailiang on 11/12/15.
 */
@Named
@Singleton
public class SubscriberController extends Controller {
    private final SubscriberRepository subscriberRepository;
    private final UserRepository userRepository;

    @Inject
    public SubscriberController(final SubscriberRepository subscriberRepository, final UserRepository userRepository) {
        this.subscriberRepository = subscriberRepository;
        this.userRepository = userRepository;
    }

    public Result addSubscriber(){
        JsonNode json = request().body().asJson();
        if (json == null) {
            System.out.println("FromUser or ToUser not created, expecting Json data");
            return badRequest("ToUser or FromUser not created, expecting Json data");
        }

        // Parse JSON file
        // User userName to find user
        Long fromUserId = json.path("fromUserId").asLong();
        Long toUserId = json.path("toUserId").asLong();


        try {
            if (userRepository.findOne(fromUserId) == null) {
                System.out.println("FromUser not found: " + fromUserId);
                return badRequest("FromUser not found");
            }
            if (userRepository.findOne(toUserId) == null) {
                System.out.println("ToUser not found: " + toUserId);
                return badRequest("ToUser not found");
            }
            User fromUser = userRepository.findOne(fromUserId);
            User toUser = userRepository.findOne(toUserId);

            Subscriber subscriber = new Subscriber(fromUser, toUser);
            subscriberRepository.save(subscriber);
            System.out.println("subscriber saved: " + subscriber.getId());

            ObjectMapper mapper = new ObjectMapper();
            ObjectNode queryJson = mapper.createObjectNode();
            queryJson.put("subscriberId", subscriber.getId());

            return created(queryJson.toString());
        } catch (PersistenceException pe) {
            pe.printStackTrace();
            System.out.println("subscriber not saved: " + fromUserId);
            return badRequest("subscriber not saved: " + toUserId);
        }
    }

    public Result deleteSubscriber() {

        JsonNode json = request().body().asJson();
        if (json == null) {
            System.out.println("FromUser or ToUser not created, expecting Json data");
            return badRequest("ToUser or FromUser not created, expecting Json data");
        }

        // Parse JSON file
        // User userName to find user
        Long fromUserId = json.path("fromUserId").asLong();
        Long toUserId = json.path("toUserId").asLong();
        Long subscriberId = null;
        List<Subscriber> subscriberList = subscriberRepository.findByFromUser_Id(fromUserId);
        for (Subscriber subscriber : subscriberList) {
            if (subscriber.getToUser().getId()== toUserId) {
                subscriberId = subscriber.getId();
                break;
            }
        }
        if(subscriberId == null){
            System.out.println("subscriber not found !");
            return notFound("subscriber not found !");
        }
        Subscriber deleteSubscriber = subscriberRepository.findOne(subscriberId);
        if (deleteSubscriber == null) {
            System.out.println("subscriber not found with id: " + subscriberId);
            return notFound("subscriber not found with id: " + subscriberId);
        }

        subscriberRepository.delete(deleteSubscriber);
        System.out.println("subscriber is deleted: " + subscriberId);
        return ok("subscriber is deleted: ");
    }

    public Result getSubscriber(Long id, String format) {
        if (id == null) {
            System.out.println("subscriber id is null or empty!");
            return badRequest("subscriber id is null or empty!");
        }

        Subscriber subscriber = subscriberRepository.findOne(id);

        if (subscriber == null) {
            System.out.println("subscriber not found with with id: " + id);
            return notFound("subscriber not found with with id: " + id);
        }
        String result = new String();
        if (format.equals("json")) {
            result = new Gson().toJson(subscriber);
        }

        return ok(result);
    }
    public Result getSubscriberByUserId(Long id, String format){
        if (id == null) {
            System.out.println("User id is null or empty!");
            return badRequest("User id is null or empty!");
        }
        List<Subscriber> subscriberList = subscriberRepository.findByFromUser_Id(id);
        List<User> userList = new ArrayList<User>();
        for(Subscriber subscriber : subscriberList){
            userList.add(userRepository.findOne(subscriber.getToUser().getId()));
        }
        String result = new Gson().toJson(userList);

        try{
            return ok(result);
        } catch (Exception e) {
            return badRequest(new Gson().toJson(""));
        }
    }
    public Result getCollectorByUserId(Long id, String format){
        if(id == null){
            System.out.println("User id is null or empty!");
            return badRequest("User id is null or empty!");
        }
        List<Subscriber> subscriberList = subscriberRepository.findByToUser_Id(id);
        List<User> userList = new ArrayList<User>();
        for(Subscriber subscriber : subscriberList){
            userList.add(userRepository.findOne(subscriber.getFromUser().getId()));
        }
        String result = new Gson().toJson(userList);

        try{
            return ok(result);
        } catch (Exception e){
            return badRequest(new Gson().toJson(""));
        }
    }

    public Result isSubscriberValid() {
        JsonNode json = request().body().asJson();
        if (json == null) {
            System.out.println("Ids are missing, expecting Json data");
            return badRequest("Ids are missing, expecting Json data");
        }

        Long fromUserId = json.path("fromUserId").asLong();
        Long toUserId = json.path("toUserId").asLong();

        try {
            List<Subscriber> subscriberList = subscriberRepository.findByFromUser_Id(fromUserId);
            for (Subscriber subscriber : subscriberList) {
                if (subscriber.getToUser().getId()== toUserId) {
                    return ok(new Gson().toJson("1"));
                }
            }
            return ok(new Gson().toJson("0"));
        } catch (Exception e) {
            return badRequest(new Gson().toJson(""));
        }
    }
}
