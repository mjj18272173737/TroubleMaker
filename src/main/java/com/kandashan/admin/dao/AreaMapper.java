package com.kandashan.admin.dao;

import com.kandashan.admin.entity.Area;
import com.kandashan.admin.entity.AreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreaMapper {
    int countByExample(AreaExample example);

    int deleteByExample(AreaExample example);

    int deleteByPrimaryKey(String id);

    int insert(Area record);

    int insertSelective(Area record);

    List<Area> selectByExampleWithBLOBs(AreaExample example);

    List<Area> selectByExample(AreaExample example);

    Area selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Area record, @Param("example") AreaExample example);

    int updateByExampleWithBLOBs(@Param("record") Area record, @Param("example") AreaExample example);

    int updateByExample(@Param("record") Area record, @Param("example") AreaExample example);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKeyWithBLOBs(Area record);

    int updateByPrimaryKey(Area record);
}