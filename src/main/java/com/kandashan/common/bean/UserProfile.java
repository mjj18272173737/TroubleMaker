package com.kandashan.common.bean;

import com.kandashan.admin.entity.Admin;
import com.kandashan.admin.entity.User;

import java.io.Serializable;

/**
 * Created by silence on 2016-10-11.
 */
public class UserProfile implements Serializable {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
