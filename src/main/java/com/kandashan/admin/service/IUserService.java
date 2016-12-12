package com.kandashan.admin.service;

import com.kandashan.admin.entity.User;

import java.util.List;

/**
 * Created by silence on 2016-07-25.
 */
public interface IUserService {

    User getUserById(Integer userId);

    int addUser(User user);

    List<User> getUser();

    User login(String userName, String password);

    void update(User user);

    List<User> getUserByName(String userName);
}