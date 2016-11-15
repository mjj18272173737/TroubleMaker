package com.kandashan.admin.dao;

import com.kandashan.admin.entity.refund;
import com.kandashan.admin.entity.refundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface refundMapper {
    int countByExample(refundExample example);

    int deleteByExample(refundExample example);

    int deleteByPrimaryKey(String id);

    int insert(refund record);

    int insertSelective(refund record);

    List<refund> selectByExampleWithBLOBs(refundExample example);

    List<refund> selectByExample(refundExample example);

    refund selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") refund record, @Param("example") refundExample example);

    int updateByExampleWithBLOBs(@Param("record") refund record, @Param("example") refundExample example);

    int updateByExample(@Param("record") refund record, @Param("example") refundExample example);

    int updateByPrimaryKeySelective(refund record);

    int updateByPrimaryKeyWithBLOBs(refund record);

    int updateByPrimaryKey(refund record);
}