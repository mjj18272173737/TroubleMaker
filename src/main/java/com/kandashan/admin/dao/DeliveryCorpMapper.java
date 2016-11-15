package com.kandashan.admin.dao;

import com.kandashan.admin.entity.DeliveryCorp;
import com.kandashan.admin.entity.DeliveryCorpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeliveryCorpMapper {
    int countByExample(DeliveryCorpExample example);

    int deleteByExample(DeliveryCorpExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeliveryCorp record);

    int insertSelective(DeliveryCorp record);

    List<DeliveryCorp> selectByExample(DeliveryCorpExample example);

    DeliveryCorp selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeliveryCorp record, @Param("example") DeliveryCorpExample example);

    int updateByExample(@Param("record") DeliveryCorp record, @Param("example") DeliveryCorpExample example);

    int updateByPrimaryKeySelective(DeliveryCorp record);

    int updateByPrimaryKey(DeliveryCorp record);
}