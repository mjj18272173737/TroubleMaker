package com.kandashan.admin.dao;

import com.kandashan.admin.entity.Role;
import com.kandashan.admin.entity.RoleExample;
import com.kandashan.admin.entity.RoleWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMapper {
    int countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(RoleWithBLOBs record);

    int insertSelective(RoleWithBLOBs record);

    List<RoleWithBLOBs> selectByExampleWithBLOBs(RoleExample example);

    List<Role> selectByExample(RoleExample example);

    RoleWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RoleWithBLOBs record, @Param("example") RoleExample example);

    int updateByExampleWithBLOBs(@Param("record") RoleWithBLOBs record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(RoleWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(RoleWithBLOBs record);

    int updateByPrimaryKey(Role record);
}