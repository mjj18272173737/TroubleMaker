package com.kandashan.admin.dao;

import com.kandashan.admin.entity.ProductGoodsSpecificationValueExample;
import com.kandashan.admin.entity.ProductGoodsSpecificationValueKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductGoodsSpecificationValueMapper {
    int countByExample(ProductGoodsSpecificationValueExample example);

    int deleteByExample(ProductGoodsSpecificationValueExample example);

    int deleteByPrimaryKey(ProductGoodsSpecificationValueKey key);

    int insert(ProductGoodsSpecificationValueKey record);

    int insertSelective(ProductGoodsSpecificationValueKey record);

    List<ProductGoodsSpecificationValueKey> selectByExample(ProductGoodsSpecificationValueExample example);

    int updateByExampleSelective(@Param("record") ProductGoodsSpecificationValueKey record, @Param("example") ProductGoodsSpecificationValueExample example);

    int updateByExample(@Param("record") ProductGoodsSpecificationValueKey record, @Param("example") ProductGoodsSpecificationValueExample example);
}