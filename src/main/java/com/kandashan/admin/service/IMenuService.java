package com.kandashan.admin.service;

import com.kandashan.admin.entity.Menu;

import java.util.List;
import java.util.Map;

/** MenuSerivce
 * Created by silence on 2016/7/28.
 */
public interface IMenuService {

    /**
     * 获取顶级节点
     *
     * @return
     */
    List<Menu> getTopMenu();

    /**
     * 递归获取所有子节点
     *
     * @param parentMenu 父节点code
     * @return
     */
    List<Map<String, Object>> getChildrenMenu(String parentMenu);

    /**
     * 获取菜单树
     *
     * @return
     */
    List<Map<String, Object>> getMenuListTree();

    /**
     * 获取所有节点
     *
     * @return
     */
    List<Menu> getAllMenu();

    /**
     * 获取子节点
     * @param parentCode
     * @return
     */
    List<Menu> getChildMenuByParentCode(String parentCode);
}
