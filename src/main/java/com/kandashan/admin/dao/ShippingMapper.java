package com.kandashan.admin.dao;

import com.kandashan.admin.entity.Shipping;
import com.kandashan.admin.entity.ShippingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShippingMapper {
    int countByExample(ShippingExample example);

    int deleteByExample(ShippingExample example);

    int deleteByPrimaryKey(String id);

    int insert(Shipping record);

    int insertSelective(Shipping record);

    List<Shipping> selectByExample(ShippingExample example);

    Shipping selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Shipping record, @Param("example") ShippingExample example);

    int updateByExample(@Param("record") Shipping record, @Param("example") ShippingExample example);

    int updateByPrimaryKeySelective(Shipping record);

    int updateByPrimaryKey(Shipping record);
}