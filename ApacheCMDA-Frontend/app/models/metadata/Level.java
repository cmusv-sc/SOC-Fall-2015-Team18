package models.metadata;

import javax.persistence.*;
import java.util.List;

/**
 * Created by gongbailiang on 12/1/15.
 */
public class Level {
    public long id;
    public List<Comment> commentList;
    public Comment comment;


    public Level(){

    }

    public Level(List<Comment> commentList, Comment comment) {
        this.commentList = commentList;
        this.comment = comment;

    }

    @Override
    public String toString() {
        return "Level{" +
                "id=" + id +
                ", commentList=" + commentList +
                ", comment=" + comment +
                '}';
    }
}
