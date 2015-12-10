package models;

import org.springframework.data.repository.CrudRepository;

import javax.inject.Named;
import javax.inject.Singleton;
import java.util.List;

/**
 * Created by gongbailiang on 11/12/15.
 */
@Named
@Singleton
public interface SubscriberRepository extends CrudRepository<Subscriber, Long> {

    List<Subscriber> findByFromUser_Id(long fromUserId);
    List<Subscriber> findByToUser_Id(long toUserId);
}
