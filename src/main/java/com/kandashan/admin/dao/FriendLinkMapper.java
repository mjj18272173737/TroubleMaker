package com.kandashan.admin.dao;

import com.kandashan.admin.entity.FriendLink;
import com.kandashan.admin.entity.FriendLinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FriendLinkMapper {
    int countByExample(FriendLinkExample example);

    int deleteByExample(FriendLinkExample example);

    int deleteByPrimaryKey(String id);

    int insert(FriendLink record);

    int insertSelective(FriendLink record);

    List<FriendLink> selectByExample(FriendLinkExample example);

    FriendLink selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FriendLink record, @Param("example") FriendLinkExample example);

    int updateByExample(@Param("record") FriendLink record, @Param("example") FriendLinkExample example);

    int updateByPrimaryKeySelective(FriendLink record);

    int updateByPrimaryKey(FriendLink record);
}