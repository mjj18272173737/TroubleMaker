package com.kandashan.admin.controller;

import com.kandashan.admin.entity.Menu;
import com.kandashan.admin.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * menu controller
 * Created by silence on 2016-11-10.
 */
@Controller
@RequestMapping(value = "/menu")
public class MenuController extends BaseController {

    @Autowired
    private IMenuService menuService;

    @RequestMapping(value = "/list")
    public String list(HttpServletRequest request) {
        return "menu/menu_list";
    }

    @ResponseBody
    @RequestMapping(value = "/ajaxList")
    public Object ajaxList(HttpServletRequest request) {
        List<Menu> list = menuService.getTopMenu();
        return list;
    }

    @RequestMapping(value = "/edit")
    public String edit(HttpServletRequest request, String id) {
        return "menu_edit";
    }

    @ResponseBody
    @RequestMapping(value = "/save")
    public Object save(HttpServletRequest request, Menu menu) {

        return null;
    }
}
