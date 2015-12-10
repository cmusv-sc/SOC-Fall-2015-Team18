package models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by gongbailiang on 12/1/15.
 */
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
//    @OneToOne(optional = false)
//    @JoinColumn(name = "userId", referencedColumnName = "id")
    private long userId;
    private String userName;
    private String comments;
    private Date date;
    public Comment(){

    }
    public Comment(String comments, Long userId, String userName,Date date) {
        this.comments = comments;
        this.userId = userId;
        this.userName = userName;
        this.date = date;

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", comments='" + comments + '\'' +
                '}';
    }
}
