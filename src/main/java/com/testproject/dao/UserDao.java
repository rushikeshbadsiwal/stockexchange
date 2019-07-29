package com.testproject.dao;

import com.testproject.model.User;

import java.util.UUID;

public class UserDao {

    User getUser() {
        return new User(new UUID(1, 5));
    }

    void insertUser() {

    }
}
