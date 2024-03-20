package com.example.usersservice.controller;

import com.example.usersservice.model.UserModel;
import com.example.usersservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserModel> getAll(){
        return userService.getAll();
    }

    @GetMapping(path = "/{id}")
    public UserModel getUserById(@PathVariable Long id){
        return userService.getUser(id);
    }

    @PostMapping
    public UserModel createUser(@RequestBody UserModel newUser){
        return userService.createUser(newUser);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }

}
