package lv.digitalbear.redis_demo.repository;

import lv.digitalbear.redis_demo.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {
}
