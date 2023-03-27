package com.gozdebudak.rest.webservices.socialmediarestapi.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

    private UserDaoService service;

    public UserResource(UserDaoService service){
        this.service = service;
    }
    
    @GetMapping(path = "/users")
    public List<User> retrieveAllUsers(){
        return service.findAllUsers();
    }
    
    @GetMapping(path = "/users/{id}")
    public User retrieveUser(@PathVariable Integer id){
        return service.findUser(id);
    }

    @PostMapping("/users")
    public void createUser(@RequestBody User user){
        service.save(user);
    }
}
