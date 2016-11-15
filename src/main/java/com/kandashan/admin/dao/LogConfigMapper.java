package com.kandashan.admin.dao;

import com.kandashan.admin.entity.LogConfig;
import com.kandashan.admin.entity.LogConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogConfigMapper {
    int countByExample(LogConfigExample example);

    int deleteByExample(LogConfigExample example);

    int deleteByPrimaryKey(String id);

    int insert(LogConfig record);

    int insertSelective(LogConfig record);

    List<LogConfig> selectByExampleWithBLOBs(LogConfigExample example);

    List<LogConfig> selectByExample(LogConfigExample example);

    LogConfig selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LogConfig record, @Param("example") LogConfigExample example);

    int updateByExampleWithBLOBs(@Param("record") LogConfig record, @Param("example") LogConfigExample example);

    int updateByExample(@Param("record") LogConfig record, @Param("example") LogConfigExample example);

    int updateByPrimaryKeySelective(LogConfig record);

    int updateByPrimaryKeyWithBLOBs(LogConfig record);

    int updateByPrimaryKey(LogConfig record);
}