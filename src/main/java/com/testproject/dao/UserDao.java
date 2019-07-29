package com.testproject.dao;

import com.testproject.model.User;

import java.util.UUID;

public class UserDao {

    User getUser(UUID userId) {
        return new User(userId);
    }

    void insertUser(User user) {
        //insert into db
    }
}
