package com.example.Singleton.Pattern.controller;

import com.example.Singleton.Pattern.dto.User;
import com.example.Singleton.Pattern.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public List<User> getUser(@PathVariable String id) {
        return userService.findByName(id);
    }

}
