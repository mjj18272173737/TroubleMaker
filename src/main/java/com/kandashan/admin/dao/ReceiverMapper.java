package com.kandashan.admin.dao;

import com.kandashan.admin.entity.Receiver;
import com.kandashan.admin.entity.ReceiverExample;
import com.kandashan.admin.entity.ReceiverWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReceiverMapper {
    int countByExample(ReceiverExample example);

    int deleteByExample(ReceiverExample example);

    int deleteByPrimaryKey(String id);

    int insert(ReceiverWithBLOBs record);

    int insertSelective(ReceiverWithBLOBs record);

    List<ReceiverWithBLOBs> selectByExampleWithBLOBs(ReceiverExample example);

    List<Receiver> selectByExample(ReceiverExample example);

    ReceiverWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ReceiverWithBLOBs record, @Param("example") ReceiverExample example);

    int updateByExampleWithBLOBs(@Param("record") ReceiverWithBLOBs record, @Param("example") ReceiverExample example);

    int updateByExample(@Param("record") Receiver record, @Param("example") ReceiverExample example);

    int updateByPrimaryKeySelective(ReceiverWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ReceiverWithBLOBs record);

    int updateByPrimaryKey(Receiver record);
}