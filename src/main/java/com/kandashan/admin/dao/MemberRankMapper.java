package com.kandashan.admin.dao;

import com.kandashan.admin.entity.MemberRank;
import com.kandashan.admin.entity.MemberRankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberRankMapper {
    int countByExample(MemberRankExample example);

    int deleteByExample(MemberRankExample example);

    int deleteByPrimaryKey(String id);

    int insert(MemberRank record);

    int insertSelective(MemberRank record);

    List<MemberRank> selectByExample(MemberRankExample example);

    MemberRank selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MemberRank record, @Param("example") MemberRankExample example);

    int updateByExample(@Param("record") MemberRank record, @Param("example") MemberRankExample example);

    int updateByPrimaryKeySelective(MemberRank record);

    int updateByPrimaryKey(MemberRank record);
}