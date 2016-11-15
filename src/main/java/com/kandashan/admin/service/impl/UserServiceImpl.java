package com.kandashan.admin.service.impl;

import com.kandashan.admin.dao.IUserDao;
import com.kandashan.admin.entity.User;
import com.kandashan.admin.service.IUserService;
import com.kandashan.util.Base64;
import com.kandashan.util.DigestUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by silence on 2016-07-25.
 */
@Service("userService")
public class UserServiceImpl implements IUserService{

    @Resource
    private IUserDao userDao;

    public int addUser(User user) {
        return userDao.addUser(user);
    }

    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    public List<User> getUser() {
        return null;
    }

    public User login(String userName, String password) {
        try {
            password = Base64.encode(DigestUtil.digest(password.getBytes(), "MD5"));
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return userDao.login(userName, password);
    }
}
