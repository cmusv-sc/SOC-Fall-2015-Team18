package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import java.util.List;

/**
 * Created by gongbailiang on 11/12/15.
 */


@Entity
public class Subscriber {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne(optional = false)
    @JoinColumn(name = "fromUserId", referencedColumnName = "id")
    private User fromUser;
    @ManyToOne(optional = false)
    @JoinColumn(name = "toUserId", referencedColumnName = "id")
    private User toUser;
//     need to add more later

    public Subscriber(){

    }
    public Subscriber(User fromUser, User toUser) {
        super();
        this.fromUser = fromUser;
        this.toUser = toUser;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getFromUser() {
        return fromUser;
    }

    public void setFromUser(User fromUser) {
        this.fromUser = fromUser;
    }

    public User getToUser() {
        return toUser;
    }

    public void setToUser(User toUser) {
        this.toUser = toUser;
    }

    @Override
    public String toString(){
        return "Subscribe [id = " + id +
                "fromUser = " + fromUser.getUserName() +
                "toUser = " + toUser.getUserName() +
                " ]";
    }
}
