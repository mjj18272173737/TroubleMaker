package com.kandashan.admin.dao;

import com.kandashan.admin.entity.GoodsGoodsSpecificationExample;
import com.kandashan.admin.entity.GoodsGoodsSpecificationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsGoodsSpecificationMapper {
    int countByExample(GoodsGoodsSpecificationExample example);

    int deleteByExample(GoodsGoodsSpecificationExample example);

    int deleteByPrimaryKey(GoodsGoodsSpecificationKey key);

    int insert(GoodsGoodsSpecificationKey record);

    int insertSelective(GoodsGoodsSpecificationKey record);

    List<GoodsGoodsSpecificationKey> selectByExample(GoodsGoodsSpecificationExample example);

    int updateByExampleSelective(@Param("record") GoodsGoodsSpecificationKey record, @Param("example") GoodsGoodsSpecificationExample example);

    int updateByExample(@Param("record") GoodsGoodsSpecificationKey record, @Param("example") GoodsGoodsSpecificationExample example);
}