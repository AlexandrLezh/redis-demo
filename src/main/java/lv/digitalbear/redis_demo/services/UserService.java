package lv.digitalbear.redis_demo.services;

import lv.digitalbear.redis_demo.entity.User;
import lv.digitalbear.redis_demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User save(User user) {
        return userRepo.save(user);
    }

    public User getById(Integer id) {
        return userRepo.findById(id).orElse(null);
    }
}
