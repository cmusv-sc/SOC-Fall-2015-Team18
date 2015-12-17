package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import models.*;
import play.mvc.*;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.PersistenceException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by zmhbh on 11/18/15.
 */
@Named
@Singleton
public class TagController extends Controller {
    private final TagRepository tagRepository;
    private final WorkflowRepository workflowRepository;

    @Inject
    public TagController(TagRepository tagRepository, WorkflowRepository workflowRepository){
        this.tagRepository=tagRepository;
        this.workflowRepository=workflowRepository;
    }

    public Result addTag(){
        JsonNode json = request().body().asJson();
        if (json == null) {
            System.out.println("Tag not saved, expecting Json data");
            return badRequest("Tag not saved, expecting Json data");
        }
        String name = json.findPath("name").asText();

        try {

            Tag tag = new Tag(name);
            Tag savedTag= tagRepository.save(tag);
//            Instrument instrument = new Instrument(name, description,launchDate);
//            Instrument savedinstrument = instrumentRepository.save(instrument);
            System.out.println("Tag saved: "+ savedTag.getId());
            return created(new Gson().toJson(savedTag.getId()));
        } catch (PersistenceException pe) {
            pe.printStackTrace();
            System.out.println("Tag not created");
            return badRequest("Tag not created");
        }
    }

    public Result getTag(long id, String format){
        if (id < 0) {
            System.out.println("id is negative!");
            return badRequest("id is negative!");
        }
        Tag tag = tagRepository.findOne(id);
        if (tag == null) {
            System.out.println("Tag not found with name: " + id);
            return notFound("Tag not found with name: " + id);
        }

        String result = new String();
        if (format.equals("json")) {
            result = new Gson().toJson(tag);
        }

        return ok(result);
    }

    public Result getAllTags(String format){
        try {
            Iterable<Tag> tags =  tagRepository.findAll();
            String result = new Gson().toJson(tags);
            return ok(result);
        } catch (Exception e) {
            return badRequest("Tag not found");
        }
    }

    public Result getAllTagWeights() {
        try{
            HashMap<String, Integer> tagsAndWeightMap = new HashMap<String, Integer>();
            Iterable<Workflow> workflows = workflowRepository.findAll();
            for (Workflow w: workflows) {
                List<Tag> tags = w.getTags();
                for(Tag t : tags) {
                    String tagName = t.getName();
                    if(tagsAndWeightMap.containsKey(tagName)) {
                        tagsAndWeightMap.put(tagName, tagsAndWeightMap.get(tagName) + 1);
                    }
                    else {
                        //hard code some weight for demo
                        if(tagName.equals("SOC"))
                            tagsAndWeightMap.put(tagName, 4);
                        else if (tagName.equals("Service"))
                            tagsAndWeightMap.put(tagName, 3);
                        else if (tagName.trim().equals("Computing"))
                            tagsAndWeightMap.put(tagName, 3);
                        else if (tagName.trim().equals("Oriented"))
                            tagsAndWeightMap.put(tagName,5);
                        else
                            tagsAndWeightMap.put(tagName, 1);
                    }
                }
            }

            List<TagCloud> list = new ArrayList<>();

            for(String key: tagsAndWeightMap.keySet()){
                int weight=tagsAndWeightMap.get(key);
                TagCloud tagCloud = new TagCloud(key,weight);
                list.add(tagCloud);
            }
            String result = new Gson().toJson(list);
            return ok(result);
        } catch (Exception e) {
            return badRequest("Tags don't exist");
        }
    }


}
