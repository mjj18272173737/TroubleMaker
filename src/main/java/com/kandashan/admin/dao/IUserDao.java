package com.kandashan.admin.dao;

import com.kandashan.admin.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by silence on 2016-07-25.
 */
@Repository
public interface IUserDao {

    User getUserById(Integer userId);

    List<User> getUser();

    int save(User user);

    User login(@Param("userName") String userName, @Param("password") String password);

    void update(User user);

    List<User> getUserByName(String userName);

}
