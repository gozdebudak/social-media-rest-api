package com.gozdebudak.rest.webservices.socialmediarestapi.user;

import java.util.List;

import org.springframework.stereotype.Component;

//Data Access Object
@Component
public class UserDaoService {
    private static List<User> users;

    public List<User> findAllUsers(){
        return users;
    }

    public User save(User user){
        return user;
    }

    public User findUser(Integer id){
        return null;
    }
}
