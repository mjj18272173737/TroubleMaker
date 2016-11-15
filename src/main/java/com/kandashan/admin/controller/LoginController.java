package com.kandashan.admin.controller;

import com.kandashan.admin.entity.Admin;
import com.kandashan.admin.entity.User;
import com.kandashan.admin.service.IAdminService;
import com.kandashan.admin.service.IUserService;
import com.kandashan.common.UserProfile;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by silence on 2016-07-25.
 */
@Controller
@RequestMapping("/")
public class LoginController {

    Logger log = Logger.getLogger(LoginController.class);

    @Autowired
    private IAdminService adminService;

    @RequestMapping(value = "/index")
    public String index() {
        return "redirect:/toLogin.do";
    }

    @RequestMapping("/toLogin")
    public String toLogin(HttpServletRequest request) {
        return "/login";
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request, String userName, String password) {
        HttpSession session = request.getSession();
        UserProfile userProfile = (UserProfile) session.getAttribute("USER_PROFILE_KEY");
        if (userProfile != null) {
            return "redirect:/admin/index.do";
        }
        User user = adminService.login(userName, password);
        if (user == null) {
            return "login";
        }
        userProfile = new UserProfile();
        userProfile.setUser(user);
        request.getSession().setAttribute("USER_PROFILE_KEY", userProfile);
        return "redirect:/admin/index.do";
    }

}
