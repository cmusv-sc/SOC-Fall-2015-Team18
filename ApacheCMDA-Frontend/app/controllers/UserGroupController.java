package controllers;

import models.User;
import models.UserGroup;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.ArrayList;
import java.util.List;
import views.html.climate.groupList;
import views.html.climate.groupUserList;
import views.html.climate.newGroup;

/**
 * Created by vincent on 15/11/17.
 */
public class UserGroupController extends Controller {
    final static Form<UserGroup> userGroupForm = Form
            .form(UserGroup.class);


    public static Result showGroups() {
        String userID = session().get("userId");
        if(userID!=null && userID.trim().length()!=0) {
            List<UserGroup> groups = UserGroup.all(userID);
            return ok(groupList.render(groups, userGroupForm));
        }
        else {
            return ok(groupList.render(new ArrayList<UserGroup>(), userGroupForm));
        }
    }


    public static Result oneGroup(long userGroupId) {
        UserGroup userGroup = UserGroup.getUserGroup(userGroupId);
        List<User> users = userGroup.listOfUser;
        return ok(groupUserList.render(userGroup, users, userGroupForm));
    }

    public static Result newGroupForm() {
        return ok(newGroup.render(userGroupForm));
    }

    public static Result newGroup() {
        Form<UserGroup> dc = userGroupForm.bindFromRequest();
        UserGroup userGroup = toUserGroup(dc);
        System.out.println("new userGroup requested!");
        String gid = UserGroup.addUserGroup(userGroup);
        System.out.println("userGroup added!");
        String userID = session().get("userId");
        if(userID!=null && userID.trim().length()!=0) {
            if(gid.trim().length()!=0) {
                boolean isAdded = UserGroup.addUserToGroup(Long.parseLong(userID), gid);
                if(isAdded) {
                    flash("success", "User Group Successfully created");
                    return showGroups();
                }
            }
        }
        flash("error", "User Group Name or User already exists");
        return ok(newGroup.render(userGroupForm));
    }

    public static UserGroup toUserGroup(Form<UserGroup> dc) {
        System.out.println("toUserGroup!");
        UserGroup userGroup = new UserGroup();
        userGroup.groupName = dc.field("User Group Name").value();
        userGroup.summary = dc.field("Summary").value();
        return userGroup;
    }

}
