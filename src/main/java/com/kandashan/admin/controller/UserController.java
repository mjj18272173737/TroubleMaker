package com.kandashan.admin.controller;

import com.kandashan.admin.entity.User;
import com.kandashan.admin.service.IUserService;
import com.kandashan.util.Base64;
import com.kandashan.util.DigestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.*;

/**
 * Created by CPR199 on 2016-12-06.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/list")
    public ModelAndView list(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView("user/list");
        List<User> userList = userService.getUser();
        mv.addObject(userList);
        return mv;
    }

    @RequestMapping("/add")
    public ModelAndView add(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView("user/edit");
        return mv;
    }

    @RequestMapping("/{userId}/eidt")
    public ModelAndView edit(HttpServletRequest request, @PathVariable("userId") Integer userId) {
        ModelAndView mv = new ModelAndView("user/edit");
        User user = userService.getUserById(userId);
        mv.addObject(user);
        return mv;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(HttpServletRequest request, User user, int isNew) {
        ModelAndView mv = new ModelAndView("redirect:/user/list.do");
        if (isNew == 0) {
            try {
                user.setPassword(Base64.encode(DigestUtil.digest(user.getPassword().getBytes(), "MD5")));
                user.setCreateDate(new Timestamp(new Date().getTime()));
            } catch (Exception e) {
                e.printStackTrace();
            }
            int result = userService.addUser(user);
        } else {
            userService.update(user);
        }
        return mv;
    }

}
