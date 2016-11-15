package com.kandashan.admin.dao;

import com.kandashan.admin.entity.GoodsSpecificationValue;
import com.kandashan.admin.entity.GoodsSpecificationValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsSpecificationValueMapper {
    int countByExample(GoodsSpecificationValueExample example);

    int deleteByExample(GoodsSpecificationValueExample example);

    int deleteByPrimaryKey(String id);

    int insert(GoodsSpecificationValue record);

    int insertSelective(GoodsSpecificationValue record);

    List<GoodsSpecificationValue> selectByExample(GoodsSpecificationValueExample example);

    GoodsSpecificationValue selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GoodsSpecificationValue record, @Param("example") GoodsSpecificationValueExample example);

    int updateByExample(@Param("record") GoodsSpecificationValue record, @Param("example") GoodsSpecificationValueExample example);

    int updateByPrimaryKeySelective(GoodsSpecificationValue record);

    int updateByPrimaryKey(GoodsSpecificationValue record);
}