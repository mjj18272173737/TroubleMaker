package com.kandashan.admin.dao;

import com.kandashan.admin.entity.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jj on 2016/7/28.
 */
@Repository
public interface IMenuDao {

    List<Menu> getChildrenMenu(String parentCode);

    List<Menu> getTopMenu();
}
