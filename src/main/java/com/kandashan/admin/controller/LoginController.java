package com.kandashan.admin.controller;

import com.kandashan.admin.entity.User;
import com.kandashan.admin.service.IAdminService;
import com.kandashan.admin.service.IRedisService;
import com.kandashan.admin.service.IUserService;
import com.kandashan.common.bean.UserProfile;
import com.kandashan.util.Constants;
import com.kandashan.util.UserUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by silence on 2016-07-25.
 */
@Controller
public class LoginController extends BaseController{

    Logger log = Logger.getLogger(LoginController.class);

    @Autowired
    private IAdminService adminService;
    @Autowired
    private IRedisService redisService;
    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/toLogin")
    public String toLogin(HttpServletRequest request) {
        return "login";
    }

    @RequestMapping(value = "/login")
    public String login(HttpServletRequest request, String userName, String password, String status) {
        HttpSession session = request.getSession();
        UserProfile userProfile = (UserProfile) session.getAttribute(Constants.USER_PROFILE_KEY);
        Long time = System.currentTimeMillis();
        if (userProfile != null) {
            return "redirect:/admin/index.do";
        }
        if (StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)) {
            return "redirect:/toLogin.do";
        }
        User user = userService.login(userName, password);
        if (user == null) {
            return "login";
        }
        userProfile = new UserProfile();
        userProfile.setUser(user);
        request.getSession().setAttribute(Constants.LOGIN_TIMESTAMP_MILLTS, time);
        request.getSession().setAttribute(Constants.USER_PROFILE_KEY, userProfile);
        /*redisService.set(Constants.USER_PROFILE_KEY, user.getUserName());*/
        String sessionKey = UserUtils.getRedisSessionKey(userName);
        redisService.set(sessionKey, time.toString());
        return "redirect:/admin/index.do";
    }

    @RequestMapping(value = "/logout")
    public String logout(HttpServletRequest request) {
        UserProfile profile = (UserProfile) this.getSession(request).getAttribute(Constants.USER_PROFILE_KEY);
        if (profile != null) {
            this.getSession(request).removeAttribute(Constants.USER_PROFILE_KEY);
            this.getSession(request).removeAttribute(Constants.LOGIN_TIMESTAMP_MILLTS);
            redisService.del(Constants.USER_PROFILE_KEY);
        }
        return "login";
    }


}
