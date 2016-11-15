package com.kandashan.admin.dao;

import com.kandashan.admin.entity.GoodsCategory;
import com.kandashan.admin.entity.GoodsCategoryExample;
import com.kandashan.admin.entity.GoodsCategoryWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsCategoryMapper {
    int countByExample(GoodsCategoryExample example);

    int deleteByExample(GoodsCategoryExample example);

    int deleteByPrimaryKey(String id);

    int insert(GoodsCategoryWithBLOBs record);

    int insertSelective(GoodsCategoryWithBLOBs record);

    List<GoodsCategoryWithBLOBs> selectByExampleWithBLOBs(GoodsCategoryExample example);

    List<GoodsCategory> selectByExample(GoodsCategoryExample example);

    GoodsCategoryWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GoodsCategoryWithBLOBs record, @Param("example") GoodsCategoryExample example);

    int updateByExampleWithBLOBs(@Param("record") GoodsCategoryWithBLOBs record, @Param("example") GoodsCategoryExample example);

    int updateByExample(@Param("record") GoodsCategory record, @Param("example") GoodsCategoryExample example);

    int updateByPrimaryKeySelective(GoodsCategoryWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(GoodsCategoryWithBLOBs record);

    int updateByPrimaryKey(GoodsCategory record);
}