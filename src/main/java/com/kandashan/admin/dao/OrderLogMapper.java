package com.kandashan.admin.dao;

import com.kandashan.admin.entity.OrderLog;
import com.kandashan.admin.entity.OrderLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderLogMapper {
    int countByExample(OrderLogExample example);

    int deleteByExample(OrderLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderLog record);

    int insertSelective(OrderLog record);

    List<OrderLog> selectByExampleWithBLOBs(OrderLogExample example);

    List<OrderLog> selectByExample(OrderLogExample example);

    OrderLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderLog record, @Param("example") OrderLogExample example);

    int updateByExampleWithBLOBs(@Param("record") OrderLog record, @Param("example") OrderLogExample example);

    int updateByExample(@Param("record") OrderLog record, @Param("example") OrderLogExample example);

    int updateByPrimaryKeySelective(OrderLog record);

    int updateByPrimaryKeyWithBLOBs(OrderLog record);

    int updateByPrimaryKey(OrderLog record);
}