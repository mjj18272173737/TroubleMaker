package com.kandashan.admin.service.impl;

import com.kandashan.admin.dao.IMenuDao;
import com.kandashan.admin.entity.Menu;
import com.kandashan.admin.service.IMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by silence on 2016/7/28.
 */
@Service
public class MenuServiceImpl implements IMenuService {

    @Resource
    private IMenuDao menuDao;

    public List<Menu> getTopMenu() {
        return menuDao.getTopMenu();
    }

    /**
     * 递归查询子节点
     * @param parentMenu 父节点code
     * @return
     */
    public List<Map<String, Object>> getChildrenMenu(String parentMenu) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        List<Menu> menuList = menuDao.getChildrenMenu(parentMenu);
        if (menuList != null && menuList.size() > 0) {
            for (Menu menu : menuList) {
                Map<String, Object> colMap = new HashMap<String, Object>();
                List<Map<String, Object>> cMenuList = this.getChildrenMenu(menu.getCode());
                colMap.put("code", menu.getCode());
                colMap.put("name", menu.getName());
                colMap.put("url", menu.getUrl());
                colMap.put("parentCode", menu.getParentCode());
                if (cMenuList != null && cMenuList.size() > 0) {
                    colMap.put("children", cMenuList);
                }
                list.add(colMap);
            }
        } else {
            return null;
        }
        return list;
    }

    public List<Map<String, Object>> getMenuListTree() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        List<Menu> topMenuList = this.getTopMenu();
        for (Menu menu : topMenuList) {
            Map<String, Object> colMap = new HashMap<String, Object>();
            List<Map<String, Object>> cMenus = this.getChildrenMenu(menu.getCode());
            colMap.put("code", menu.getCode());
            colMap.put("name", menu.getName());
            colMap.put("url", menu.getUrl());
            colMap.put("parentCode", menu.getParentCode());
            if (cMenus != null) {
                colMap.put("children", cMenus);
            }
            list.add(colMap);
        }
        return list;
    }

    public List<Menu> getAllMenu() {
        return menuDao.getTopMenu();
    }

    public List<Menu> getChildMenuByParentCode(String parentCode) {
        return menuDao.getChildrenMenu(parentCode);
    }
}
