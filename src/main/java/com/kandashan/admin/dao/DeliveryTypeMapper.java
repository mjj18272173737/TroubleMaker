package com.kandashan.admin.dao;

import com.kandashan.admin.entity.DeliveryType;
import com.kandashan.admin.entity.DeliveryTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeliveryTypeMapper {
    int countByExample(DeliveryTypeExample example);

    int deleteByExample(DeliveryTypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeliveryType record);

    int insertSelective(DeliveryType record);

    List<DeliveryType> selectByExampleWithBLOBs(DeliveryTypeExample example);

    List<DeliveryType> selectByExample(DeliveryTypeExample example);

    DeliveryType selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeliveryType record, @Param("example") DeliveryTypeExample example);

    int updateByExampleWithBLOBs(@Param("record") DeliveryType record, @Param("example") DeliveryTypeExample example);

    int updateByExample(@Param("record") DeliveryType record, @Param("example") DeliveryTypeExample example);

    int updateByPrimaryKeySelective(DeliveryType record);

    int updateByPrimaryKeyWithBLOBs(DeliveryType record);

    int updateByPrimaryKey(DeliveryType record);
}