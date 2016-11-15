package com.kandashan.admin.dao;

import com.kandashan.admin.entity.GoodsNotify;
import com.kandashan.admin.entity.GoodsNotifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsNotifyMapper {
    int countByExample(GoodsNotifyExample example);

    int deleteByExample(GoodsNotifyExample example);

    int deleteByPrimaryKey(String id);

    int insert(GoodsNotify record);

    int insertSelective(GoodsNotify record);

    List<GoodsNotify> selectByExample(GoodsNotifyExample example);

    GoodsNotify selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GoodsNotify record, @Param("example") GoodsNotifyExample example);

    int updateByExample(@Param("record") GoodsNotify record, @Param("example") GoodsNotifyExample example);

    int updateByPrimaryKeySelective(GoodsNotify record);

    int updateByPrimaryKey(GoodsNotify record);
}