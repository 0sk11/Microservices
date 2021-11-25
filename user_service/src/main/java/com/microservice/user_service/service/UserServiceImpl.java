package com.microservice.user_service.service;

import com.microservice.user_service.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{

//    Fake user list
    List<User> list  = List.of(
            new User(1331L,"Shubham","32343432322"),
            new User(1312L,"Ramu","56543434"),
            new User(1312L,"Shamu","565093434")
);
    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId()
                        .equals(id))
                        .findAny()
                .orElse(null);

    }
}
