package com.kandashan.admin.dao;

import com.kandashan.admin.entity.GoodsAttribute;
import com.kandashan.admin.entity.GoodsAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsAttributeMapper {
    int countByExample(GoodsAttributeExample example);

    int deleteByExample(GoodsAttributeExample example);

    int deleteByPrimaryKey(String id);

    int insert(GoodsAttribute record);

    int insertSelective(GoodsAttribute record);

    List<GoodsAttribute> selectByExample(GoodsAttributeExample example);

    GoodsAttribute selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GoodsAttribute record, @Param("example") GoodsAttributeExample example);

    int updateByExample(@Param("record") GoodsAttribute record, @Param("example") GoodsAttributeExample example);

    int updateByPrimaryKeySelective(GoodsAttribute record);

    int updateByPrimaryKey(GoodsAttribute record);
}