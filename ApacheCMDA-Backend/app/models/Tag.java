package models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by zmhbh on 11/18/15.
 */
@Entity
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(unique = true)
    private String name;



    public Tag(){

    }

    public Tag(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Tag(String name){
        this.name=name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
