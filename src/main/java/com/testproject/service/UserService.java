package com.testproject.service;

import com.testproject.dao.UserDao;
import com.testproject.model.User;

import java.util.List;
import java.util.UUID;

public class UserService {

    private UserDao userDao;

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public String addUser(User user) {
        return userDao.addUser(user);
    }

    public String deleteUser(String userUUID) {
        return userDao.deleteUser(userUUID);
    }

    public User getUser(UUID userUUID) {
        return userDao.getUser(userUUID);
    }

    public String updateUser(User user) {
        return userDao.updateUser(user);
    }
}
