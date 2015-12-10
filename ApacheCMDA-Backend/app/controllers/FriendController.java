package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.gson.Gson;
import models.Friend;
import models.FriendRepository;
import models.User;
import models.UserRepository;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.PersistenceException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Peng on 11/16/15.
 */
@Named
@Singleton
public class FriendController extends Controller {
    private final FriendRepository friendRepository;
    private final UserRepository userRepository;

    @Inject
    public FriendController(final FriendRepository friendRepository, final UserRepository userRepository) {
        this.friendRepository = friendRepository;
        this.userRepository = userRepository;
    }

    public Result addFriend() {
        JsonNode json = request().body().asJson();
        if (json == null) {
            System.out.println("Friend not created, expecting Json data");
            return badRequest("Friend not created, expecting Json data");
        }

        Long user1Id = json.path("user1Id").asLong();
        Long user2Id = json.path("user2Id").asLong();

        try {
            if (userRepository.findOne(user1Id) == null) {
                System.out.println("User1 not found");
                return badRequest("User1 not found");
            }

            if (userRepository.findOne(user2Id) == null) {
                System.out.println("User2 not found");
                return badRequest("User2 not found");
            }

            User user1 = userRepository.findOne(user1Id);
            User user2 = userRepository.findOne(user2Id);
            Friend friend = null;

            if (user1Id < user2Id) {
                friend = new Friend(user1, user2);
            } else {
                friend = new Friend(user2, user1);
            }
            friend = friendRepository.save(friend);
            System.out.println("Friend saved: " + friend.getId());

            ObjectMapper mapper = new ObjectMapper();
            ObjectNode queryJson = mapper.createObjectNode();
            queryJson.put("friendId", friend.getId());

            return created(queryJson.toString());
        } catch (PersistenceException pe) {
            pe.printStackTrace();
            System.out.println("friend not saved");
            return badRequest("friend not saved");
        }
    }

    public Result getFriend(Long id, String format) {
        if (id == null) {
            System.out.println("User id is null");
            return badRequest("User id is null");
        }

        List<Friend> friendList1 = friendRepository.findByUser1_Id(id);
        List<Friend> friendList2 = friendRepository.findByUser2_Id(id);

        List<User>  userList = new ArrayList<User>();
        for(Friend friend : friendList1){
            userList.add(friend.getUser2());
        }
        for(Friend friend : friendList2){
            userList.add(friend.getUser1());
        }
        String result = new Gson().toJson(userList);

        try {
            return ok(result);
        } catch (Exception e) {
            return badRequest(new Gson().toJson(""));
        }
    }

    public Result deleteFriend() {
        JsonNode json = request().body().asJson();
        if (json == null) {
            System.out.println("Ids are missing, expecting Json data");
            return badRequest("Ids are missing, expecting Json data");
        }

        Long user1Id = json.path("user1Id").asLong();
        Long user2Id = json.path("user2Id").asLong();
        List<Friend> friendList = null;
        if (user1Id < user2Id) {
            friendList = friendRepository.getFriednByUser1IdAndUser2Id(user1Id, user2Id);
        } else {
            friendList = friendRepository.getFriednByUser1IdAndUser2Id(user2Id, user1Id);
        }
        if (friendList.size() == 0) {
            System.out.println("friend to be deleted does not exist");
            return badRequest("friend to be deleted does not exist");
        }
        Friend friend = friendList.get(0);
        friendRepository.delete(friend);

        String result = new Gson().toJson(friend);

        try {
            return ok(result);
        } catch (Exception e) {
            return badRequest(new Gson().toJson(""));
        }

    }

    public Result isFriendValid() {
        JsonNode json = request().body().asJson();
        if (json == null) {
            System.out.println("Ids are missing, expecting Json data");
            return badRequest("Ids are missing, expecting Json data");
        }

        Long user1Id = json.path("user1Id").asLong();
        Long user2Id = json.path("user2Id").asLong();

        List<Friend> friendList = null;
        if (user1Id < user2Id) {
            friendList = friendRepository.getFriednByUser1IdAndUser2Id(user1Id, user2Id);
        } else {
            friendList = friendRepository.getFriednByUser1IdAndUser2Id(user2Id, user1Id);
        }

        try {
            if (friendList == null || friendList.size() == 0) {
                return ok(new Gson().toJson("0"));
            } else {
                return ok(new Gson().toJson("1"));
            }
        } catch (Exception e) {
            return badRequest(new Gson().toJson(""));
        }

    }

}
