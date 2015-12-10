package controllers;

/**
 * Created by gongbailiang on 11/6/15.
 */

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.gson.Gson;
import models.UserGroup;
import models.UserRepository;
import play.mvc.Controller;
import play.mvc.Result;

import java.math.BigInteger;
import java.util.List;
import java.util.ArrayList;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.PersistenceException;

import models.UserGroupRepository;
import models.User;
/**
 * The main set of web services.
 */
@Named
@Singleton
public class UserGroupController extends Controller {

    private final UserGroupRepository userGroupRepository;
    private final UserRepository userRepository;

    // We are using constructor injection to receive a repository to support our
    // desire for immutability.
    @Inject
    public UserGroupController(final UserGroupRepository userGroupRepository, final UserRepository userRepository) {
        this.userGroupRepository = userGroupRepository;
        this.userRepository = userRepository;
    }

    public Result addUserGroup() {
        JsonNode json = request().body().asJson();
        if (json == null) {
            System.out.println("UserGroup not created, expecting Json data");
            return badRequest("UserGroup not created, expecting Json data");
        }

        // Parse JSON file
        String groupName = json.path("groupName").asText();
        String groupSummary = json.path("groupSummary").asText();



        try {
            if (userGroupRepository.findByGroupName(groupName).size() > 0) {
                System.out.println("GroupName has been used: " + groupName);
                return badRequest("GroupName has been used");
            }
            UserGroup userGroup = new UserGroup(groupName, groupSummary, null);
            userGroupRepository.save(userGroup);
            System.out.println("UserGroup saved: " + userGroup.getId());

            ObjectMapper mapper = new ObjectMapper();
            ObjectNode queryJson = mapper.createObjectNode();
            queryJson.put("userGroupId", userGroup.getId());

            return ok(queryJson.toString());
        } catch (PersistenceException pe) {
            pe.printStackTrace();
            System.out.println("UserGroup not saved: " + groupName + " " + groupSummary);
            return badRequest("UserGroup not saved: " + groupName + " " + groupSummary);
        }
    }

    public Result deleteUserGroup(Long id) {
        UserGroup deleteUserGroup = userGroupRepository.findOne(id);
        if (deleteUserGroup == null) {
            System.out.println("UserGroup not found with id: " + id);
            return notFound("UserGroup not found with id: " + id);
        }

        userGroupRepository.delete(deleteUserGroup);
        System.out.println("UserGroup is deleted: " + id);
        return ok("UserGroup is deleted: " + id);
    }

    public Result getUserGroup(Long id, String format) {
        if (id == null) {
            System.out.println("UserGroup id is null or empty!");
            return badRequest("UserGroup id is null or empty!");
        }

        UserGroup userGroup = userGroupRepository.findOne(id);

        if (userGroup == null) {
            System.out.println("UserGroup not found with with id: " + id);
            return notFound("UserGroup not found with with id: " + id);
        }
        String result = new String();
        if (format.equals("json")) {
            result = new Gson().toJson(userGroup);
        }

        return ok(result);
    }

    public Result getAllUsersInGroup(Long id, String format) {
        if (id == null) {
            System.out.println("UserGroup id is null or empty!");
            return badRequest("UserGroup id is null or empty!");
        }

        UserGroup userGroup = userGroupRepository.findOne(id);

        if (userGroup == null) {
            System.out.println("UserGroup not found with with id: " + id);
            return notFound("UserGroup not found with with id: " + id);
        }

        try {
            Iterable<User> users = userGroup.getAllUser();
            String result = new String();
            result = new Gson().toJson(users);
            return ok(result);
        } catch (Exception e) {
            return badRequest("UserGroup not found");
        }
    }
    public Result isBelongToUserGroup(){
        JsonNode json = request().body().asJson();
        if (json == null) {
            System.out.println("User not found, expecting Json data");
            return badRequest("User not found, expecting Json data");
        }
        Long userId1 = json.path("userId1").asLong();
        Long userId2 = json.path("userId2").asLong();

        List<BigInteger> userGroupList1 = userGroupRepository.findAllUserGroupId(userId1);
        List<BigInteger> userGroupList2 = userGroupRepository.findAllUserGroupId(userId2);

        boolean res = false;

        for(BigInteger cur : userGroupList1){
            if(userGroupList2.contains(cur)){
                res = true;
            }
        }


        if(res){
            return ok("1");
        }else{
            return ok("0");
        }


    }
    public Result addUserIntoUserGroup(){
        JsonNode json = request().body().asJson();
        if (json == null) {
            System.out.println("User not added, expecting Json data");
            return badRequest("User not added, expecting Json data");
        }

        // Parse JSON file
        Long userGroupId = json.path("userGroupId").asLong();
        Long userId = json.path("userId").asLong();

        UserGroup userGroup = userGroupRepository.findOne(userGroupId);
        User      user = userRepository.findOne(userId);

        try {
            if (userGroupRepository.findOne(userGroupId) == null) {
                System.out.println("UserGroup Not Found: " + userGroupId);
                return badRequest("UserGroup Not Found:");
            }
            if (userRepository.findOne(userId) == null) {
                System.out.println("User Not Found: " + userId);
                return badRequest("User Not Found:");
            }
            userGroup.addUser(user);
            userGroup = userGroupRepository.save(userGroup);
            System.out.println("User saved into : " + userGroup.getId());

            ObjectMapper mapper = new ObjectMapper();
            ObjectNode queryJson = mapper.createObjectNode();
            queryJson.put("userGroupId", userGroup.getId());

            return ok(queryJson.toString());
        } catch (PersistenceException pe) {
            pe.printStackTrace();
            System.out.println("UserGroup or User not saved: " + userGroupId + " " + userId);
            return badRequest("UserGroup or User not saved: " + userGroupId + " " + userId);
        }

    }

    public Result getAllUserGroup(Long id, String format){
        if (id == null) {
            System.out.println("User id is null or empty!");
            return badRequest("User id is null or empty!");
        }

        List<BigInteger> idList = userGroupRepository.findAllUserGroupId(id);

        if (idList == null) {
            System.out.println("User not found with with id: " + id);
            return notFound("User not found with with id: " + id);
        }

        List<UserGroup> userGroups = new ArrayList<UserGroup>();

        for(BigInteger cur : idList){
            userGroups.add(userGroupRepository.findOne(cur.longValue()));
        }
        String result = new String();
        result = new Gson().toJson(userGroups);


        try{
            return ok(result);
        } catch (Exception e) {
            return badRequest(new Gson().toJson(""));
        }

    }
}
