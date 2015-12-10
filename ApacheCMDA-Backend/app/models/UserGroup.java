package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gongbailiang on 11/6/15.
 */
@Entity
public class UserGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String groupName;
    private String groupSummary;
    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE})
    @JoinTable(name = "UserGroupAndUser", joinColumns = { @JoinColumn(name ="userGroupId", referencedColumnName = "id")}, inverseJoinColumns = { @JoinColumn(name = "userId", referencedColumnName = "id") })
    private List<User> groupList;
    // need to add more later

    public UserGroup() {
    }

    public UserGroup(String groupName, String groupSummary, List<User> groupList) {
        this.groupName = groupName;
        this.groupSummary = groupSummary;
        this.groupList = groupList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void addUser(User user){
        groupList.add(user);
    }
    public String getGroupName() {
        return groupName;
    }

    public String getGroupSummary() {
        return groupSummary;
    }

    public String getGroupList() {
        StringBuffer sb = new StringBuffer();
        for(User cur : groupList){
            sb.append(cur.toString());
        }
        return sb.toString();
    }
    public String getAllUserName(){
        StringBuffer sb = new StringBuffer();
        for(User cur : groupList){
            sb.append(cur.getUserName());
            sb.append(" ,");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
    public List<User> getAllUser(){
        return groupList;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setGroupSummary(String groupSummary) {
        this.groupSummary = groupSummary;
    }

    public void setGroupList(List<User> groupList) {
        this.groupList = groupList;
    }
    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("UserGroup [id=" + id + ", groupName=" + groupName + ", groupSummary=" + groupSummary);
        sb.append(", " + getAllUserName());
        return sb.toString();
    }
}
