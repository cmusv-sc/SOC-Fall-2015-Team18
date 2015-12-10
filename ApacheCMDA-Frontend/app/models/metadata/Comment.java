package models.metadata;

import models.User;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by gongbailiang on 12/1/15.
 */
public class Comment {
    public long id;
    public long userId;
    public String userName;
    public String comments;
    public Date date;

    public Comment(){

    }
    public Comment(String comments, Long userId, String userName,Date date) {
        this.comments = comments;
        this.userId = userId;
        this.userName = userName;
        this.date = date;

    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", comments='" + comments + '\'' +
                '}';
    }
}
