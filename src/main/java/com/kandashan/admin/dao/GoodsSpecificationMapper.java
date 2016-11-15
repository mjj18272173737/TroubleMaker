package com.kandashan.admin.dao;

import com.kandashan.admin.entity.GoodsSpecification;
import com.kandashan.admin.entity.GoodsSpecificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsSpecificationMapper {
    int countByExample(GoodsSpecificationExample example);

    int deleteByExample(GoodsSpecificationExample example);

    int deleteByPrimaryKey(String id);

    int insert(GoodsSpecification record);

    int insertSelective(GoodsSpecification record);

    List<GoodsSpecification> selectByExampleWithBLOBs(GoodsSpecificationExample example);

    List<GoodsSpecification> selectByExample(GoodsSpecificationExample example);

    GoodsSpecification selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GoodsSpecification record, @Param("example") GoodsSpecificationExample example);

    int updateByExampleWithBLOBs(@Param("record") GoodsSpecification record, @Param("example") GoodsSpecificationExample example);

    int updateByExample(@Param("record") GoodsSpecification record, @Param("example") GoodsSpecificationExample example);

    int updateByPrimaryKeySelective(GoodsSpecification record);

    int updateByPrimaryKeyWithBLOBs(GoodsSpecification record);

    int updateByPrimaryKey(GoodsSpecification record);
}