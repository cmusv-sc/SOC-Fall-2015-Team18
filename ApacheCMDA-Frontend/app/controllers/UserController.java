package controllers;

import models.User;
import models.UserGroup;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.climate.profile;
import views.html.climate.oneUser;
import views.html.climate.userList;
import views.html.climate.signUp;
import views.html.climate.home;
import views.html.climate.friendList;
import views.html.climate.signIn;
import views.html.climate.subscriptionList;

import java.util.ArrayList;
import java.util.List;

public class UserController extends Controller {

    final static Form<User> userForm = Form
            .form(User.class);

    /**
     * Profile page.
     */
    public static Result profile() {
        String userID = session().get("userId");
        if(userID!=null && userID.trim().length()!=0) {
            User user = User.getUser(Long.parseLong(userID));
            return ok(profile.render(user));
        }
        else {
            return ok(home.render("","",""));
        }
    }

    /**
     * Profile page.
     */
    public static Result allUsers() {
        return ok(userList.render(User.all(),
                userForm));
    }

    public static Result oneUser(long userId) {
        User user = User.getUser(userId);
        String currID = session().get("userId");
        if(currID!=null && currID.trim().length()!=0) {
            boolean isFriend = User.isFriend(currID, String.valueOf(userId));
            boolean isSubscribed = User.isSubscribed(currID, String.valueOf(userId));
            System.out.println("isFriend: "+isFriend);
            System.out.println("isSubscribed: "+isSubscribed);
            return ok(oneUser.render(user, isFriend, isSubscribed));
        }
        else {
            return ok(home.render("", "", ""));
        }

    }

    public static Result signUpForm() {
        return ok(signUp.render(userForm));
    }

    public static Result signUp(){
        Form<User> dc = userForm.bindFromRequest();

        User user = toUser(dc);

        if(User.signUp(user)) {
            flash("success", "The user is successfully created");
            return ok(signIn.render(userForm));
        }
        else {
            flash("error", "Email or UserName has already been used");
            return ok(signUp.render(userForm));
        }
    }

    public static Result signInForm() {
        return ok(signIn.render(userForm));
    }

    public static Result signIn() {
        Form<User> dc = userForm.bindFromRequest();
        User user = toSignInUser(dc);
        String id = User.signIn(user);
        if(id.equals("")) {
            flash("error", "Email and Password do not match");
            return ok(signIn.render(userForm));
        }
        else {
            session("userId", id);
            flash("success", "Successfully Logged In");
            return ok(home.render(user.email, "", ""));
        }
    }

    public static Result showFriends() {
        String userID = session().get("userId");
        if(userID!=null && userID.trim().length()!=0) {
            List<User> friends = User.getFriends(userID);
            return ok(friendList.render(friends, userForm));
        }
        else {
            return ok(friendList.render(new ArrayList<User>(), userForm));
        }
    }

    public static Result showSubscriptions() {
        String userID = session().get("userId");
        if(userID!=null && userID.trim().length()!=0) {
            List<User> subscriptions = User.getSubscriptions(userID);
            return ok(subscriptionList.render(subscriptions, userForm));
        }
        else {
            return ok(subscriptionList.render(new ArrayList<User>(), userForm));
        }
    }

    public static Result addFriend(long userId2, boolean isSubscribe) {
        User user2 = User.getUser(userId2);
        String currID = session().get("userId");
        System.out.println("adding friend!");
        User.addFriend(currID, String.valueOf(userId2));
        return ok(oneUser.render(user2, true, isSubscribe));
    }

    public static Result deleteFriend(long userId2, boolean isSubscribe) {
        User user2 = User.getUser(userId2);
        String currID = session().get("userId");
        User.deleteFriend(currID, String.valueOf(userId2));
        return ok(oneUser.render(user2, false, isSubscribe));
    }

    public static Result addSubscribe(long userId2, boolean isFriend) {
        User user2 = User.getUser(userId2);
        String currID = session().get("userId");
        System.out.println("adding subscribe!");
        User.addSubscribe(currID, String.valueOf(userId2));
        return ok(oneUser.render(user2, isFriend, true));
    }

    public static Result deleteSubscribe(long userId2, boolean isFriend) {
        User user2 = User.getUser(userId2);
        String currID = session().get("userId");
        User.deleteSubscribe(currID, String.valueOf(userId2));
        return ok(oneUser.render(user2, isFriend, false));
    }



    public static Result signOut() {
        session().clear();
        return ok(home.render("", "", ""));
    }

    public static User toSignInUser(Form<User> form) {
        User user = new User();
        user.email = form.field("Email").value();
        user.password = form.field("Password").value();
        return user;
    }

    public static User toUser(Form<User> form) {
        User user = new User();
        user.userName = form.field("User Name").value();
        user.firstName = form.field("First Name").value();
        user.lastName = form.field("Last Name").value();
        user.affiliation = form.field("Affiliation").value();
        user.phoneNumber = form.field("Phone Number").value();
        user.researchFields = form.field("Research Fields").value();
        user.email = form.field("Email").value();
        user.password = form.field("Password").value();
        user.description = form.field("Description").value();
        return user;
    }

/*
    public static Result authenticate() {
        GroupedForm<User> form = form(User.class, User.SignIn.class).bindFromRequest();

        if (form.hasErrors()) {
            return badRequest(signin.render(form));
        }

        session().clear();
        session("email", form.get().email);

        return redirect(
                routes.Application.index()
        );
    }

    public static Result signOut() {
        session().clear();
        flash("success", "You've been signed out.");

        return redirect(
                routes.UserController.signIn()
        );
    }
    */
}
