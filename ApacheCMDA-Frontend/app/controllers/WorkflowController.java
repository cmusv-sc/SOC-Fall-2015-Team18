package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.User;
import models.metadata.Comment;
import models.metadata.Level;
import models.metadata.Tag;
import models.metadata.Workflow;
import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.climate.createWorkflow;
import views.html.climate.workflows;
import views.html.climate.workflowDisplay;

import java.util.List;

/**
 * Created by zmhbh on 11/18/15.
 */
public class WorkflowController extends Controller{
    final static Form<Workflow> workflowForm = Form.form(Workflow.class);
    final static Form<Comment> commentForm = Form.form(Comment.class);

    public static Result workflows() {
        return ok(workflows.render(Workflow.all(), workflowForm));
    }

    public static Result createWorkflow() {
        return ok(createWorkflow.render(workflowForm));
    }

    public static Result handleCreateWorkflow(){
        Form<Workflow> dc = workflowForm.bindFromRequest();
        ObjectNode jsonData = Json.newObject();
        JsonNode response=null;
        try {
           String title = dc.field("Title").value();
           String description = dc.field("Description").value();
           String image = dc.field("Image").value();
           String contributor = dc.field("Contributor").value();
           String instruction = dc.field("Instruction").value();
           String dataset = dc.field("Dataset").value();
            String tags=dc.field("tags").value();
            jsonData.put("title",title);
            jsonData.put("description",description);
            jsonData.put("image",image);
            jsonData.put("contributor",contributor);
            jsonData.put("instruction",instruction);
            jsonData.put("dataset",dataset);
            jsonData.put("tags",tags);

            String currID = session().get("userId");
            jsonData.put("userId",currID);

             response= Workflow.create(jsonData);
            Application.flashMsg(response);
        }catch(Exception e){
            e.printStackTrace();
        }
        return redirect("/workflows");


       // return redirect("/workflows");
    }

    public static Result linkTags(){
        Form<Tag> dc = TagController.tagForm.bindFromRequest();
        int workflowId=Integer.parseInt(dc.field("workflowId").value());
        String tags=dc.field("tags").value();
        ObjectNode jsonData = Json.newObject();
        jsonData.put("workflowId",workflowId);
        jsonData.put("tags",tags);
        JsonNode response=Workflow.createTags(jsonData);

        return redirect("/workflows");
    }


    public static Result displayWorkflow(long id) {
        String currID = session().get("userId");
        Workflow workflow=Workflow.getWorkflow(id, currID);
        List<Level> levelList = workflow.getLevelList();
        for(Level each : levelList) {
            System.out.println("Xin Display date: "+ each.comment.date);
        }
        return ok(workflowDisplay.render(workflow, commentForm));
    }

    public static Result viewComments(long id){
        String currID = session().get("userId");
        Workflow workflow=Workflow.getWorkflow(id, currID);
        return ok(workflowDisplay.render(workflow, commentForm));
    }


    public static Result addLevelComment(long workFlowId) {
        Form<Comment> dc = commentForm.bindFromRequest();
        System.out.println("Xin Add Comment");
        String comments = dc.field("Comment on workflow").value();
        String currID = session().get("userId");
        Workflow.addLevelComment(String.valueOf(workFlowId), currID, comments);
        Workflow workflow=Workflow.getWorkflow(workFlowId, currID);
        return ok(workflowDisplay.render(workflow, commentForm));
    }

    public static Result addSingleComment(long workFlowId, long levelId) {
        Form<Comment> dc = commentForm.bindFromRequest();
        System.out.println("Xin Add Comment");
        String comments = dc.field("Reply on this comment").value();
        String currID = session().get("userId");
        Workflow.addSingleComment(String.valueOf(levelId), currID, comments);
        Workflow workflow=Workflow.getWorkflow(workFlowId, currID);
        return ok(workflowDisplay.render(workflow, commentForm));
    }


    /*public static Result createWorkflow() {
        Form<Workflow> dc = workflowForm.bindFromRequest();
        ObjectNode jsonData = Json.newObject();
        try {

            String originalClimateServiceName = dc.field("Name").value();
            String newClimateServiceName = originalClimateServiceName.replace(' ', '-');

            if (newClimateServiceName != null && !newClimateServiceName.isEmpty()) {
                jsonData.put("name", newClimateServiceName);
            }

            jsonData.put("creatorId", 1);
            jsonData.put("purpose", dc.field("Purpose").value());
            jsonData.put("url", dc.field("Url").value());
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
            Date date = new Date();
            jsonData.put("createTime", dateFormat.format(date));
            jsonData.put("scenario", dc.field("Scenario").value());
            jsonData.put("versionNo", dc.field("Version").value());
            jsonData.put("rootServiceId", dc.field("Root_Service").value());
            JsonNode response = ClimateService.create(jsonData);
            Application.flashMsg(response);
        } catch (IllegalStateException e) {
            e.printStackTrace();
            Application.flashMsg(APICall
                    .createResponse(APICall.ResponseType.CONVERSIONERROR));
        } catch (Exception e) {
            e.printStackTrace();
            Application.flashMsg(APICall.createResponse(APICall.ResponseType.UNKNOWN));
        }
        return redirect("/workflows");
    }*/
}
