package com.suleman.taskmanagement.service;

import com.suleman.taskmanagement.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    User findByEmail(String email);

    List<User> findAllUsers();
}
