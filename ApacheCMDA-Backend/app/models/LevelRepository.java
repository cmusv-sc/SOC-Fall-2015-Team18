package models;

import org.springframework.data.repository.CrudRepository;

import javax.inject.Named;
import javax.inject.Singleton;

/**
 * Created by gongbailiang on 12/1/15.
 */
@Named
@Singleton
public interface LevelRepository extends CrudRepository<Level, Long> {

}
