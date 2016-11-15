package com.kandashan.admin.service;

import com.kandashan.admin.entity.User;

/**
 * Created by silence on 2016-10-13.
 */
public interface IAdminService {

    User login(String username, String password);
}
