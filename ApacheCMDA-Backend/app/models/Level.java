package models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by gongbailiang on 12/1/15.
 */
@Entity
public class Level {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE})
    @JoinTable(name = "LevelAndComment", joinColumns = { @JoinColumn(name ="levelId", referencedColumnName = "id")}, inverseJoinColumns = { @JoinColumn(name = "commentId", referencedColumnName = "id") })
    private List<Comment> commentList;
    @OneToOne(optional = false)
    @JoinColumn(name = "commentId", referencedColumnName = "id")
    private Comment comment;

    public Level(){

    }

    public Level(List<Comment> commentList, Comment comment) {
        this.commentList = commentList;
        this.comment = comment;

    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
