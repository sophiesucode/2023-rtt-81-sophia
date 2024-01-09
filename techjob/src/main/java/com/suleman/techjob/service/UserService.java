package com.suleman.techjob.service;

import com.suleman.techjob.model.User;

import java.util.List;

public interface UserService {
     void saveUser(User user);

     User findUserByEmail(String email);

     List<User> findAllUsers();
}
