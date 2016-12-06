package com.kandashan.admin.controller;

import com.kandashan.admin.entity.User;
import com.kandashan.admin.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @RequestMapping("/{userId}/eidt")
    public ModelAndView edit(HttpServletRequest request, @PathVariable("userId") Integer userId) {
        ModelAndView mv = new ModelAndView("user/eidt");
        User user = userService.getUserById(userId);
        mv.addObject(user);
        return mv;
    }

    @RequestMapping("/save")
    public ModelAndView save(HttpServletRequest request, User user) {
        ModelAndView mv = new ModelAndView("redirect:/user/list.do");
        userService.update(user);
        return mv;
    }

}
