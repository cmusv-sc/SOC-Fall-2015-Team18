package models.metadata;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.gson.Gson;
import models.User;
import util.APICall;
import util.Constants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zmhbh on 11/18/15.
 */
public class Workflow {
    private int id;
    private String title;
    private String description;
    private String image;
    private String contributor;
    private String instruction;
    private String dataset;
    private String userId;
    private List<Tag> tags;

    //for popularity
    private int viewCount;
    private int usageCount;
    private int commentCount;
    private int downloadCount;
    private int referenceCount;


    private List<Level> levelList;

    public int visibility = 0;

    private static final String GET_ALL_WORKFLOWS = Constants.NEW_BACKEND+"workflow/getAllWorkflows/json";
    private static final String ADD_WORKFLOW = Constants.NEW_BACKEND+"workflow/addWorkflow";
    private static final String CREATE_TAGS=Constants.NEW_BACKEND+"workflow/createTags";
    private static final String GET_WORKFLOW=Constants.NEW_BACKEND+"workflow/getWorkflow/id/";
    private static final String GET_ALL_LEVELS=Constants.NEW_BACKEND+"workflow/getAllLevels/";
    private static final String ADD_LEVEL=Constants.NEW_BACKEND+"workflow/addLevel";
    private static final String ADD_COMMENT=Constants.NEW_BACKEND+"workflow/addComment";

    public Workflow(){

    }

    public Workflow(String title, String description, String image, String contributor, String instruction, String dataset, String userId) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.contributor = contributor;
        this.instruction = instruction;
        this.dataset = dataset;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getContributor() {
        return contributor;
    }

    public void setContributor(String contributor) {
        this.contributor = contributor;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getDataset() {
        return dataset;
    }

    public void setDataset(String dataset) {
        this.dataset = dataset;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public int getUsageCount() {
        return usageCount;
    }

    public void setUsageCount(int usageCount) {
        this.usageCount = usageCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public int getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(int downloadCount) {
        this.downloadCount = downloadCount;
    }

    public int getReferenceCount() {
        return referenceCount;
    }

    public void setReferenceCount(int referenceCount) {
        this.referenceCount = referenceCount;
    }

    public List<Level> getLevelList() {
        return levelList;
    }

    public void setLevelList(List<Level> levelList) {
        this.levelList = levelList;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    // restful call
    public static JsonNode create(JsonNode jsonData) {
        return APICall.postAPI(ADD_WORKFLOW, jsonData);
    }
    public static JsonNode createTags(JsonNode jsonData){return APICall.postAPI(CREATE_TAGS, jsonData);}

    public static Workflow getWorkflow(long id, String currID){
        Workflow workflow = new Workflow();
        JsonNode workflowNode= APICall.callAPI(GET_WORKFLOW + id);
        if(workflowNode==null)
            return workflow;

        Gson gson = new Gson();
        String workflowInfo = workflowNode.toString();
        System.out.println("Single workflow: "+workflowInfo);
        Workflow ans = gson.fromJson(workflowInfo, Workflow.class);
        System.out.println("level num: "+ans.getLevelList().size());
        if(ans.getLevelList().size()>0) {
            System.out.println("Xin: Level: Comment: Date: " +ans.getLevelList().get(0).comment.date.toString());
        }
        if((currID.equals("112"))||(ans.getUserId().equals(currID))||User.isFriend(currID, ans.getUserId())||User.isSubscribed(currID, ans.getUserId())) {
            System.out.println("Xin Visible!");
            ans.visibility = 1;
        }
        else {
            System.out.println("Xin Invisible!");
        }
        return ans;
    }

    public static List<Workflow> all() {
        List<Workflow> workflows = new ArrayList<Workflow>();

        JsonNode workflowNode = APICall
                .callAPI(GET_ALL_WORKFLOWS);

        if (workflowNode == null || !workflowNode.isArray()) {
            return workflows;
        }

        for (int i = 0; i < workflowNode.size(); i++) {
            JsonNode json = workflowNode.path(i);
            Workflow newWorkflow = new Workflow();
            newWorkflow.setId(json.path("id").asInt());
            newWorkflow.setTitle(json.path("title").asText());
            newWorkflow.setDescription(json.path("description").asText());
            newWorkflow.setImage(json.path("image").asText());
            newWorkflow.setContributor(json.path("contributor").asText());
            newWorkflow.setInstruction(json.path("instruction").asText());
            newWorkflow.setDataset(json.path("dataset").asText());
            newWorkflow.setViewCount(json.path("viewCount").asInt());
            newWorkflow.setUsageCount(json.path("usageCount").asInt());
            newWorkflow.setCommentCount(json.path("commentCount").asInt());
            newWorkflow.setDownloadCount(json.path("downloadCount").asInt());
            newWorkflow.setReferenceCount(json.path("referenceCount").asInt());

            workflows.add(newWorkflow);
        }
        return workflows;
    }

    public static List<Level> getAllLevels(long id) {
        List<Level> levelList = new ArrayList<Level>();

        JsonNode levels = APICall.callAPI(GET_ALL_LEVELS + String.valueOf(id));

        if (levels == null || levels.has("error")
                || !levels.isArray()) {
            return levelList;
        }

        for (int i = 0; i < levels.size(); i++) {
            JsonNode json = levels.path(i);
            Level level = getLevel(json);
            levelList.add(level);
        }
        return levelList;
    }

    private static Level getLevel(JsonNode json) {
        Level level = new Level();
        level.id = json.get("id").asLong();
        JsonNode comment = json.get("comment");
        JsonNode commentList = json.get("commentList");
        System.out.println("in this level: comment = "+comment);
        System.out.println("in this level: commentList = "+commentList);
        level.comment = getComment(comment);
        if (commentList == null || commentList.has("error")
                || !commentList.isArray()) {
            return level;
        }
        System.out.println("getting commentList");
        List<Comment> listComment = new ArrayList<Comment>();
        for (int i = 0; i < commentList.size(); i++) {
            JsonNode jsonList = commentList.path(i);
            Comment commentInner = getComment(jsonList);
            listComment.add(commentInner);
        }
        level.commentList = listComment;
        return level;
    }

    private static Comment getComment(JsonNode json) {
        Comment comment = new Comment();
        comment.id = json.get("id").asLong();

        comment.userId = json.get("userId").asLong();
        comment.userName = json.get("userName").asText();
        comment.comments = json.get("comments").asText();
        return comment;
    }

    public static void addLevelComment(String workFlowId, String userId, String comments) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode queryJson = mapper.createObjectNode();

        queryJson.put("workflowId", workFlowId);
        queryJson.put("userId", userId);
        queryJson.put("comments", comments);

        System.out.println("addLevelCommenting");

        JsonNode dataSetNode = APICall.postAPI(ADD_LEVEL, queryJson);
        System.out.println("add level response: "+dataSetNode);
    }

    public static void addSingleComment(String levelId, String userId, String comments) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode queryJson = mapper.createObjectNode();

        queryJson.put("levelId", levelId);
        queryJson.put("userId", userId);
        queryJson.put("comments", comments);

        System.out.println("addSingleCommenting");

        JsonNode dataSetNode = APICall.postAPI(ADD_COMMENT, queryJson);
        System.out.println("add comment response: "+dataSetNode);
    }
}
