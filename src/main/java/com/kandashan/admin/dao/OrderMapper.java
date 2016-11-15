package com.kandashan.admin.dao;

import com.kandashan.admin.entity.Order;
import com.kandashan.admin.entity.OrderExample;
import com.kandashan.admin.entity.OrderWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    int countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderWithBLOBs record);

    int insertSelective(OrderWithBLOBs record);

    List<OrderWithBLOBs> selectByExampleWithBLOBs(OrderExample example);

    List<Order> selectByExample(OrderExample example);

    OrderWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderWithBLOBs record, @Param("example") OrderExample example);

    int updateByExampleWithBLOBs(@Param("record") OrderWithBLOBs record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByPrimaryKeySelective(OrderWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(OrderWithBLOBs record);

    int updateByPrimaryKey(Order record);
}