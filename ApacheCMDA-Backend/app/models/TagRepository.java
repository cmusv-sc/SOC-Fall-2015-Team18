package models;

import org.springframework.data.repository.CrudRepository;
import javax.inject.Named;
import javax.inject.Singleton;

/**
 * Created by zmhbh on 11/18/15.
 */
@Named
@Singleton
public interface TagRepository extends CrudRepository<Tag, Long> {

}
