package com.kandashan.admin.dao;

import com.kandashan.admin.entity.DeliveryItem;
import com.kandashan.admin.entity.DeliveryItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeliveryItemMapper {
    int countByExample(DeliveryItemExample example);

    int deleteByExample(DeliveryItemExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeliveryItem record);

    int insertSelective(DeliveryItem record);

    List<DeliveryItem> selectByExample(DeliveryItemExample example);

    DeliveryItem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeliveryItem record, @Param("example") DeliveryItemExample example);

    int updateByExample(@Param("record") DeliveryItem record, @Param("example") DeliveryItemExample example);

    int updateByPrimaryKeySelective(DeliveryItem record);

    int updateByPrimaryKey(DeliveryItem record);
}