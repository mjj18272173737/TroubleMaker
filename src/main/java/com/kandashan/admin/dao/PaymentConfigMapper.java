package com.kandashan.admin.dao;

import com.kandashan.admin.entity.PaymentConfig;
import com.kandashan.admin.entity.PaymentConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentConfigMapper {
    int countByExample(PaymentConfigExample example);

    int deleteByExample(PaymentConfigExample example);

    int deleteByPrimaryKey(String id);

    int insert(PaymentConfig record);

    int insertSelective(PaymentConfig record);

    List<PaymentConfig> selectByExampleWithBLOBs(PaymentConfigExample example);

    List<PaymentConfig> selectByExample(PaymentConfigExample example);

    PaymentConfig selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PaymentConfig record, @Param("example") PaymentConfigExample example);

    int updateByExampleWithBLOBs(@Param("record") PaymentConfig record, @Param("example") PaymentConfigExample example);

    int updateByExample(@Param("record") PaymentConfig record, @Param("example") PaymentConfigExample example);

    int updateByPrimaryKeySelective(PaymentConfig record);

    int updateByPrimaryKeyWithBLOBs(PaymentConfig record);

    int updateByPrimaryKey(PaymentConfig record);
}