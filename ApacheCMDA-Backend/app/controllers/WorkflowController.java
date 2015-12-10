package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import models.*;
import play.mvc.*;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.PersistenceException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

/**
 * Created by zmhbh on 11/19/15.
 */
@Named
@Singleton
public class WorkflowController extends Controller {

    private final WorkflowRepository workflowRepository;
    private final TagRepository tagRepository;
    private final UserRepository userRepository;
    private final CommentRepository commentRepository;
    private final LevelRepository levelRepository;

    @Inject
    public WorkflowController(WorkflowRepository workflowRepository, TagRepository tagRepository, UserRepository userRepository
                                , CommentRepository commentRepository, LevelRepository levelRepository) {
        this.workflowRepository = workflowRepository;
        this.tagRepository = tagRepository;
        this.userRepository = userRepository;
        this.commentRepository = commentRepository;
        this.levelRepository = levelRepository;
    }

    public Result addWorkflow() {
        JsonNode json = request().body().asJson();
        if (json == null) {
            System.out.println("Workflow not saved, expecting Json data");
            return badRequest("Workflow not saved, expecting Json data");
        }
        String title = json.findPath("title").asText();
        String description = json.findPath("description").asText();
        String image = json.findPath("image").asText();
        String contributor = json.findPath("contributor").asText();
        String instruction = json.findPath("instruction").asText();
        String dataset = json.findPath("dataset").asText();
        String tags=json.findPath("tags").asText();
        Long userId = json.findPath("userId").asLong();
        String[] tagArr=tags.split(",",-1);
        List<Tag> tagList= new ArrayList<>();
        for(int i=0;i<tagArr.length;i++){
            tagList.add(new Tag(tagArr[i]));
        }
        List<Level> levelList = new ArrayList<Level>();

        try {
            Workflow workflow = new Workflow(title, description, image, contributor, instruction, dataset, tagList, levelList, userId
            ,0,0,0,0,0);
            Workflow savedWorkflow = workflowRepository.save(workflow);
            System.out.println("workflow saved: " + savedWorkflow.getId());
            return created(new Gson().toJson(savedWorkflow.getId()));
        } catch (PersistenceException pe) {
            pe.printStackTrace();
            System.out.println("workflow not created");
            return badRequest("workflow not created");
        }
    }
    public Result getWorkflowByUserId(long id, String format){
        List<Workflow> workflowList = workflowRepository.findByUserId(id);

        String result = new String();
        if (format.equals("json")) {
            result = new Gson().toJson(workflowList);
        }
        return ok(result);

    }
    public Result getWorkflow(long id, String format) {

        Workflow workflow = workflowRepository.findOne(id);
        if (workflow == null) {
            System.out.println("workflow not found with name: " + id);
            return notFound("workflow not found with name: " + id);
        }
        Workflow temp = workflow;

        temp.setLevelList(null);
        List<BigInteger> levelIdList = workflowRepository.findAllLevelId(id);
        HashSet<BigInteger> set = new HashSet<BigInteger>();
        set.addAll(levelIdList);
        List<Level> levelList = new ArrayList<Level>();

        for(BigInteger cur : set){
            levelList.add(levelRepository.findOne(cur.longValue()));
        }
        temp.setLevelList(levelList);

        String result = new String();
        if (format.equals("json")) {
            result = new Gson().toJson(temp);
        }

        return ok(result);
    }

    public Result getAllWorkflows(String format) {
        try {
            Iterable<Workflow> workflows = workflowRepository.findAll();
            String result = new Gson().toJson(workflows);
            return ok(result);
        } catch (Exception e) {
            return badRequest("workflow not found");
        }
    }


    public Result getAllLevels(long id, String format){
        System.out.println("getting level for workflow id: "+id);
        Workflow workflow = workflowRepository.findOne(id);
        if (workflow == null) {
            System.out.println("workflow not found with name: " + id);
            return notFound("workflow not found with name: " + id);
        }
        List<BigInteger> levelIdList = workflowRepository.findAllLevelId(id);
        String result = new String();

        List<Level> levelList = new ArrayList<Level>();

        for(BigInteger cur : levelIdList){
            levelList.add(levelRepository.findOne(cur.longValue()));
        }


        if (format.equals("json")) {
            result = new Gson().toJson(levelList);
        }

        System.out.println("result all levels: "+result);

        return ok(result);
    }

    public Result addLevel(){
        JsonNode json = request().body().asJson();
        if (json == null) {
            System.out.println("Workflow not saved, expecting Json data");
            return badRequest("Workflow not saved, expecting Json data");
        }
        long workflowId = json.findPath("workflowId").asLong();
        long userId = json.findPath("userId").asLong();
        String comments = json.findPath("comments").asText();

        User user = userRepository.findOne(userId);

        Comment comment = new Comment(comments, userId, user.getUserName(), new Date());


        comment = commentRepository.save(comment);
        List<Comment> commentList = new ArrayList<Comment>();
        Level level = new Level(commentList, comment);
        level = levelRepository.save(level);

        Workflow workflow = workflowRepository.findOne(workflowId);
        if (workflow == null) {
            System.out.println("workflow not found with id: " + workflowId);
            return notFound("workflow not found with id: " + workflowId);
        }

        workflow.getLevelList().add(level);
        workflow = workflowRepository.save(workflow);

        System.out.println("level saved: " + level.getId());
        return created(new Gson().toJson(level.getId()));

    }

    public Result addComment(){
        JsonNode json = request().body().asJson();
        if (json == null) {
            System.out.println("Workflow not saved, expecting Json data");
            return badRequest("Workflow not saved, expecting Json data");
        }

        long levelId = json.findPath("levelId").asLong();
        System.out.println("levelId: "+levelId);
        long userId = json.findPath("userId").asLong();
        System.out.println("userId: "+userId);
        String comments = json.findPath("comments").asText();
        System.out.println("comments: "+comments);

        User user = userRepository.findOne(userId);

        Comment comment = new Comment(comments, userId, user.getUserName(), new Date());
        Level level = levelRepository.findOne(levelId);
        comment = commentRepository.save(comment);
        level.getCommentList().add(comment);
        level = levelRepository.save(level);

        System.out.println("comment saved: " + level.getId());
        return created(new Gson().toJson(level.getId()));


    }


    //workflow popularity things
    //ViewCount+1;
    public Result updateWorkflowViewCount(long id, String format) {
        if (id < 0) {
            System.out.println("Workflow id is not valid!");
        }
        Workflow workflow = workflowRepository.findOne(id);
        if (workflow == null) {
            System.out.println("Workflow not found with id: " + id) ;
            return notFound("Workflow not found with id: " + id);
        }

        String result = new String();
        int count = workflow.getViewCount();
        count = count + 1;
        workflow.setViewCount(count);
        workflowRepository.save(workflow);

        if (format.equals("json")) {
            result = new Gson().toJson(count);
        }
        return ok(result);

//        // Parse JSON file
//        int viewCount = Integer.parseInt(json.path("viewCount").asText());//需不需要由前端往回传? 还有是不是整合在别的函数里;
//        viewCount = viewCount + 1;
//        try {
//            Workflow updateWorkflow = workflowRepository.findOne(id);
//
//            updateWorkflow.setViewCount(viewCount);
//
//
//            Workflow savedWorkflow = workflowRepository.save(updateWorkflow);
//            System.out.println("Workflow ViewCount updated: " + savedWorkflow.getViewCount());
//            return created("Workflow ViewCount updated: " + savedWorkflow.getViewCount());
//        } catch (PersistenceException pe) {
//            pe.printStackTrace();
//            System.out.println("Workflow ViewCount not updated: " + viewCount);
//            return badRequest("Workflow ViewCount not updated: " + viewCount);
//        }
    }

    //get Workflow ViewCount
    public Result getWorkflowViewCount(long id, String format) {
        if (id < 0) {
            System.out.println("Workflow id is not valid!");
        }
        Workflow workflow = workflowRepository.findOne(id);

        if (workflow == null) {
            System.out.println("Workflow not found with id: " + id) ;
            return notFound("Workflow not found with id: " + id);
        }

        String result = new String();
        if (format.equals("json")) {
            result = new Gson().toJson(workflow.getViewCount());
        }
        return ok(result);
    }

    //UsageCount
    //UsageCount+1;
    public Result updateWorkflowUsageCount(long id) {
        JsonNode json = request().body().asJson();
        if (json == null) {
            System.out.println("Workflow not found, expecting Json data");
            return badRequest("Workflow not found, expecting Json data");
        }

        // Parse JSON file
        int usageCount = Integer.parseInt(json.path("usageCount").asText());//需不需要由前端往回传? 还有是不是整合在别的函数里;
        usageCount = usageCount + 1;
        try {
            Workflow updateWorkflow = workflowRepository.findOne(id);

            updateWorkflow.setUsageCount(usageCount);


            Workflow savedWorkflow = workflowRepository.save(updateWorkflow);
            System.out.println("Workflow UsageCount updated: " + savedWorkflow.getUsageCount());
            return created("Workflow UsageCount updated: " + savedWorkflow.getUsageCount());
        } catch (PersistenceException pe) {
            pe.printStackTrace();
            System.out.println("Workflow UsageCount not updated: " + usageCount);
            return badRequest("Workflow UsageCount not updated: " + usageCount);
        }
    }

    //get Workflow UsageCount
    public Result getWorkflowUsageCount(long id, String format) {
        if (id < 0) {
            System.out.println("Workflow id is not valid!");
        }
        Workflow workflow = workflowRepository.findOne(id);

        if (workflow == null) {
            System.out.println("Workflow not found with id: " + id) ;
            return notFound("Workflow not found with id: " + id);
        }

        String result = new String();
        if (format.equals("json")) {
            result = new Gson().toJson(workflow.getUsageCount());
        }
        return ok(result);
    }


    //commentCount
    //CommentCount+1;
    public Result updateWorkflowCommentCount(long id) {
        JsonNode json = request().body().asJson();
        if (json == null) {
            System.out.println("Workflow not found, expecting Json data");
            return badRequest("Workflow not found, expecting Json data");
        }

        // Parse JSON file
        int commentCount = Integer.parseInt(json.path("commentCount").asText());//需不需要由前端往回传? 还有是不是整合在别的函数里;
        commentCount = commentCount + 1;
        try {
            Workflow updateWorkflow = workflowRepository.findOne(id);

            updateWorkflow.setCommentCount(commentCount);


            Workflow savedWorkflow = workflowRepository.save(updateWorkflow);
            System.out.println("Workflow CommentCount updated: " + savedWorkflow.getCommentCount());
            return created("Workflow CommentCount updated: " + savedWorkflow.getCommentCount());
        } catch (PersistenceException pe) {
            pe.printStackTrace();
            System.out.println("Workflow CommentCount not updated: " + commentCount);
            return badRequest("Workflow CommentCount not updated: " + commentCount);
        }
    }

    //get Workflow CommentCount
    public Result getWorkflowCommentCount(long id, String format) {
        if (id < 0) {
            System.out.println("Workflow id is not valid!");
        }
        Workflow workflow = workflowRepository.findOne(id);

        if (workflow == null) {
            System.out.println("Workflow not found with id: " + id) ;
            return notFound("Workflow not found with id: " + id);
        }

        String result = new String();
        if (format.equals("json")) {
            result = new Gson().toJson(workflow.getCommentCount());
        }
        return ok(result);
    }
//    this.commentCount = commentCount;
//    this.downloadCount = downloadCount;

    //downloadCount
//DownloadCount+1;
    public Result updateWorkflowDownloadCount(long id) {
        JsonNode json = request().body().asJson();
        if (json == null) {
            System.out.println("Workflow not found, expecting Json data");
            return badRequest("Workflow not found, expecting Json data");
        }

        // Parse JSON file
        int downloadCount = Integer.parseInt(json.path("downloadCount").asText());//需不需要由前端往回传? 还有是不是整合在别的函数里;
        downloadCount = downloadCount + 1;
        try {
            Workflow updateWorkflow = workflowRepository.findOne(id);

            updateWorkflow.setDownloadCount(downloadCount);


            Workflow savedWorkflow = workflowRepository.save(updateWorkflow);
            System.out.println("Workflow DownloadCount updated: " + savedWorkflow.getDownloadCount());
            return created("Workflow DownloadCount updated: " + savedWorkflow.getDownloadCount());
        } catch (PersistenceException pe) {
            pe.printStackTrace();
            System.out.println("Workflow DownloadCount not updated: " + downloadCount);
            return badRequest("Workflow DownloadCount not updated: " + downloadCount);
        }
    }

    //get Workflow DownloadCount

    public Result getWorkflowDownloadCount(long id, String format) {
        if (id < 0) {
            System.out.println("Workflow id is not valid!");
        }
        Workflow workflow = workflowRepository.findOne(id);

        if (workflow == null) {
            System.out.println("Workflow not found with id: " + id) ;
            return notFound("Workflow not found with id: " + id);
        }

        String result = new String();
        if (format.equals("json")) {
            result = new Gson().toJson(workflow.getDownloadCount());
        }
        return ok(result);
    }

    //    this.referenceCount = referenceCount;
//referenceCount
//ReferenceCount+1;
    public Result updateWorkflowReferenceCount(long id) {
        JsonNode json = request().body().asJson();
        if (json == null) {
            System.out.println("Workflow not found, expecting Json data");
            return badRequest("Workflow not found, expecting Json data");
        }

        // Parse JSON file
        int referenceCount = Integer.parseInt(json.path("referenceCount").asText());//需不需要由前端往回传? 还有是不是整合在别的函数里;
        referenceCount = referenceCount + 1;
        try {
            Workflow updateWorkflow = workflowRepository.findOne(id);

            updateWorkflow.setReferenceCount(referenceCount);


            Workflow savedWorkflow = workflowRepository.save(updateWorkflow);
            System.out.println("Workflow ReferenceCount updated: " + savedWorkflow.getReferenceCount());
            return created("Workflow ReferenceCount updated: " + savedWorkflow.getReferenceCount());
        } catch (PersistenceException pe) {
            pe.printStackTrace();
            System.out.println("Workflow ReferenceCount not updated: " + referenceCount);
            return badRequest("Workflow ReferenceCount not updated: " + referenceCount);
        }
    }

    //get Workflow ReferenceCount
    public Result getWorkflowReferenceCount(long id, String format) {
        if (id < 0) {
            System.out.println("Workflow id is not valid!");
        }
        Workflow workflow = workflowRepository.findOne(id);

        if (workflow == null) {
            System.out.println("Workflow not found with id: " + id) ;
            return notFound("Workflow not found with id: " + id);
        }

        String result = new String();
        if (format.equals("json")) {
            result = new Gson().toJson(workflow.getReferenceCount());
        }
        return ok(result);
    }

    public Result getTop10WorkflowByViewCount(String format) {
        Iterable<Workflow> workflowIterable = workflowRepository.findTop10ByOrderByViewCountDesc();
        List<Workflow> workflowList = new ArrayList<Workflow>();
        for (Workflow workflow : workflowIterable) {
            workflowList.add(workflow);
        }
        String result = new String();
        if (format.equals("json")) {
            result = new Gson().toJson(workflowList);
        }
        return ok(result);
    }

    public Result getTop10WorkflowByUsageCount(String format) {
        Iterable<Workflow> workflowIterable = workflowRepository.findTop10ByOrderByUsageCountDesc();
        List<Workflow> workflowList = new ArrayList<Workflow>();
        for (Workflow workflow : workflowIterable) {
            workflowList.add(workflow);
        }
        String result = new String();
        if (format.equals("json")) {
            result = new Gson().toJson(workflowList);
        }
        return ok(result);
    }

    public Result getTop10WorkflowByDownloadCount(String format) {
        Iterable<Workflow> workflowIterable = workflowRepository.findTop10ByOrderByDownloadCountDesc();
        List<Workflow> workflowList = new ArrayList<Workflow>();
        for (Workflow workflow : workflowIterable) {
            workflowList.add(workflow);
        }
        String result = new String();
        if (format.equals("json")) {
            result = new Gson().toJson(workflowList);
        }
        return ok(result);
    }

    public Result getTop10WorkflowByReferenceCount(String format) {
        Iterable<Workflow> workflowIterable = workflowRepository.findTop10ByOrderByReferenceCountDesc();
        List<Workflow> workflowList = new ArrayList<Workflow>();
        for (Workflow workflow : workflowIterable) {
            workflowList.add(workflow);
        }
        String result = new String();
        if (format.equals("json")) {
            result = new Gson().toJson(workflowList);
        }
        return ok(result);
    }

    public Result getTop10WorkflowByCommentCount(String format) {
        Iterable<Workflow> workflowIterable = workflowRepository.findTop10ByOrderByCommentCountDesc();
        List<Workflow> workflowList = new ArrayList<Workflow>();
        for (Workflow workflow : workflowIterable) {
            workflowList.add(workflow);
        }
        String result = new String();
        if (format.equals("json")) {
            result = new Gson().toJson(workflowList);
        }
        return ok(result);
    }

}
