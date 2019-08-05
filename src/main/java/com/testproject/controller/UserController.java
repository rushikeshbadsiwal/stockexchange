package com.testproject.controller;

import com.testproject.model.User;
import com.testproject.service.UserService;

import java.util.List;
import java.util.UUID;

public class UserController {

    UserService userService;

    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    public String addUser(User user) {
        return userService.addUser(user);
    }

    public String deleteUser(String userUUID) {
        return userService.deleteUser(userUUID);
    }

    public User getUser(UUID userUUID) {
        return userService.getUser(userUUID);
    }

    public String updateUser(User user) {
        return userService.updateUser(user);
    }
}
