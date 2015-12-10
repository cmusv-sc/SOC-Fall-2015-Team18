package models;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import util.APICall;
import util.Constants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vincent on 15/11/16.
 */
public class UserGroup {

    private static final String GET_ALL_GROUP = Constants.NEW_BACKEND + "userGroup/getAllUserGroup/";
    private static final String GET_ONE_GROUP = Constants.NEW_BACKEND + "userGroup/";
    private static final String ADD_GROUP = Constants.NEW_BACKEND + "userGroup/add";
    private static final String ADD_USER_TO_GROUP = Constants.NEW_BACKEND + "userGroup/addUserIntoUserGroup";

    public long id;
    public String groupName;
    public String summary;
    public List<User> listOfUser = new ArrayList<User>();

    public UserGroup() {

    }

    public static String addUserGroup(UserGroup userGroup) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode queryJson = mapper.createObjectNode();

        queryJson.put("groupName", userGroup.groupName);
        queryJson.put("groupSummary", userGroup.summary);

        JsonNode dataSetNode = APICall.postAPI(ADD_GROUP, queryJson);

        if (dataSetNode == null || dataSetNode.has("error")) {
            System.out.println("user creating failed: "+dataSetNode.toString());
            return "";
        }
        else {
            JsonNode gid = dataSetNode.get("userGroupId");
            String gidS = gid.toString();
            System.out.println("gidS: "+gidS);
            return gidS;
        }
    }

    public static boolean addUserToGroup(long userId, String gid) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode queryJson = mapper.createObjectNode();

        queryJson.put("userGroupId", gid);
        queryJson.put("userId", String.valueOf(userId));

        JsonNode dataSetNode = APICall.postAPI(ADD_USER_TO_GROUP, queryJson);

        if (dataSetNode == null || dataSetNode.has("error")) {
            System.out.println("Add user to group failed: "+dataSetNode.toString());
            return false;
        }
        return true;
    }

    public static UserGroup getUserGroup (long groupId) {

        JsonNode json = APICall.callAPI(GET_ONE_GROUP + groupId);

        return getUserGroup(json);
    }

    public static List<UserGroup> all(String userId) {

        List<UserGroup> groups = new ArrayList<UserGroup>();

        JsonNode groupNode = APICall.callAPI(GET_ALL_GROUP+userId);

        if (groupNode == null || groupNode.has("error")
                || !groupNode.isArray()) {
            return groups;
        }

        for (int i = 0; i < groupNode.size(); i++) {
            JsonNode json = groupNode.path(i);
            System.out.println("Xin: Here is "+i+" json node, "+json);
            UserGroup group = getUserGroup(json);
            groups.add(group);
        }
        return groups;
    }

    public static String getField(JsonNode node, String fieldName) {
        if(node.get(fieldName)!=null) {
            return node.get(fieldName).asText();
        }
        else {
            return "";
        }
    }

    public static UserGroup getUserGroup(JsonNode json) {
        UserGroup group = new UserGroup();
        group.id = json.get("id").asLong();
        group.groupName = getField(json, "groupName");
        group.summary = getField(json, "summary");
        group.listOfUser.clear();
        JsonNode users = json.get("groupList");
        for(int i=0; i<users.size(); i++) {
            JsonNode node = users.path(i);
            User thisUser = User.getUser(node);
            group.listOfUser.add(thisUser);
        }
        return group;
    }


}
