package com.kandashan.admin.service.impl;

import com.kandashan.admin.dao.AdminMapper;
import com.kandashan.admin.dao.IUserDao;
import com.kandashan.admin.entity.Admin;
import com.kandashan.admin.entity.User;
import com.kandashan.admin.service.IAdminService;
import com.kandashan.util.Base64;
import com.kandashan.util.DigestUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by silence on 2016-10-13.
 */
@Service("adminService")
public class AdminServiceImpl implements IAdminService {

    @Resource
    private IUserDao userDao;

    public User login(String username, String password) {
        try {
            password = Base64.encode(DigestUtil.digest(password.getBytes(), "MD5"));
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return userDao.login(username, password);
    }
}
