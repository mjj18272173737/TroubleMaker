package com.kandashan.admin.dao;

import com.kandashan.admin.entity.MemberGoodsExample;
import com.kandashan.admin.entity.MemberGoodsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberGoodsMapper {
    int countByExample(MemberGoodsExample example);

    int deleteByExample(MemberGoodsExample example);

    int deleteByPrimaryKey(MemberGoodsKey key);

    int insert(MemberGoodsKey record);

    int insertSelective(MemberGoodsKey record);

    List<MemberGoodsKey> selectByExample(MemberGoodsExample example);

    int updateByExampleSelective(@Param("record") MemberGoodsKey record, @Param("example") MemberGoodsExample example);

    int updateByExample(@Param("record") MemberGoodsKey record, @Param("example") MemberGoodsExample example);
}