package models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Peng on 11/18/15.
 */
@Entity
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne(optional = false)
    @JoinColumn(name = "user1Id", referencedColumnName = "id")
    private User user1;
    @ManyToOne(optional = false)
    @JoinColumn(name = "user2Id", referencedColumnName = "id")
    private User user2;

    public Friend() {

    }

    public Friend(User user1, User user2) {
        this.user1 = user1;
        this.user2 = user2;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser1() {
        return user1;
    }

    public void setUser1(User user1) {
        this.user1 = user1;
    }

    public User getUser2() {
        return user2;
    }

    public void setUser2(User user2) {
        this.user2 = user2;
    }


}