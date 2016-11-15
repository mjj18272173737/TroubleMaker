package com.kandashan.admin.dao;

import com.kandashan.admin.entity.GoodsGoodsAttributeMapStore;
import com.kandashan.admin.entity.GoodsGoodsAttributeMapStoreExample;
import com.kandashan.admin.entity.GoodsGoodsAttributeMapStoreKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsGoodsAttributeMapStoreMapper {
    int countByExample(GoodsGoodsAttributeMapStoreExample example);

    int deleteByExample(GoodsGoodsAttributeMapStoreExample example);

    int deleteByPrimaryKey(GoodsGoodsAttributeMapStoreKey key);

    int insert(GoodsGoodsAttributeMapStore record);

    int insertSelective(GoodsGoodsAttributeMapStore record);

    List<GoodsGoodsAttributeMapStore> selectByExample(GoodsGoodsAttributeMapStoreExample example);

    GoodsGoodsAttributeMapStore selectByPrimaryKey(GoodsGoodsAttributeMapStoreKey key);

    int updateByExampleSelective(@Param("record") GoodsGoodsAttributeMapStore record, @Param("example") GoodsGoodsAttributeMapStoreExample example);

    int updateByExample(@Param("record") GoodsGoodsAttributeMapStore record, @Param("example") GoodsGoodsAttributeMapStoreExample example);

    int updateByPrimaryKeySelective(GoodsGoodsAttributeMapStore record);

    int updateByPrimaryKey(GoodsGoodsAttributeMapStore record);
}