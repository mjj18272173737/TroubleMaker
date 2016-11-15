package com.kandashan.admin.dao;

import com.kandashan.admin.entity.Payment;
import com.kandashan.admin.entity.PaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentMapper {
    int countByExample(PaymentExample example);

    int deleteByExample(PaymentExample example);

    int deleteByPrimaryKey(String id);

    int insert(Payment record);

    int insertSelective(Payment record);

    List<Payment> selectByExampleWithBLOBs(PaymentExample example);

    List<Payment> selectByExample(PaymentExample example);

    Payment selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Payment record, @Param("example") PaymentExample example);

    int updateByExampleWithBLOBs(@Param("record") Payment record, @Param("example") PaymentExample example);

    int updateByExample(@Param("record") Payment record, @Param("example") PaymentExample example);

    int updateByPrimaryKeySelective(Payment record);

    int updateByPrimaryKeyWithBLOBs(Payment record);

    int updateByPrimaryKey(Payment record);
}