package com.kandashan.admin.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.kandashan.admin.dao.IUserDao;
import com.kandashan.admin.entity.Menu;
import com.kandashan.admin.entity.User;
import com.kandashan.admin.service.IMenuService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by silence on 2016-07-28.
 */

/**
 * 后台首页
 */
@Controller
@RequestMapping("/admin")
public class IndexController {

    Logger log = Logger.getLogger(LoginController.class);

    @Autowired
    IUserDao userDao;
    @Autowired
    IMenuService menuService;

    @RequestMapping("/index")
    public String index(HttpServletRequest request) {
        Map<String, Object> reslut = new HashMap<String, Object>();
        List<Map<String, Object>> treeList = menuService.getMenuListTree();
        //String treeString = JSONArray.toJSON(treeList).toString();
        request.setAttribute("menuList", treeList);
        return "main";
    }

    @ResponseBody
    @RequestMapping("/getUser")
    public Object getUser() {
        List<User> list = userDao.getUser();
        String userList = JSON.toJSONString(list, true);
        return userList;
    }

    @ResponseBody
    @RequestMapping(value = "/getMenu")
    public Object getMenu(HttpServletRequest request, HttpServletResponse response) {
        String parentMenuCode = request.getParameter("parentCode");
        List<Menu> menuList = menuService.getChildMenuByParentCode(parentMenuCode);
        return menuList;
    }
}
