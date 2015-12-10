package models;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.inject.Named;
import javax.inject.Singleton;
import java.math.BigInteger;
import java.util.List;

/**
 * Created by gongbailiang on 11/6/15.
 */
@Named
@Singleton
public interface UserGroupRepository extends CrudRepository<UserGroup, Long> {

    List<UserGroup> findByGroupName(String groupName);
    @Query(value = "select u.userGroupId from UserGroupAndUser u where (u.userId like ?1) ", nativeQuery = true)
    List<BigInteger> findAllUserGroupId(Long id);



}
