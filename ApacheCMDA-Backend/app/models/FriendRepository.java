package models;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.inject.Named;
import javax.inject.Singleton;
import java.util.List;

/**
 * Created by Peng on 11/18/15.
 */
@Named
@Singleton
public interface FriendRepository extends CrudRepository<Friend, Long> {
    List<Friend> findByUser1_Id(Long user1Id);
    List<Friend> findByUser2_Id(Long user2Id);

    @Query(value = "select f.* from Friend f where ((f.user1Id like ?1) and (f.user2Id like ?2))", nativeQuery = true)
    List<Friend> getFriednByUser1IdAndUser2Id(Long user1Id, Long User2Id);

}