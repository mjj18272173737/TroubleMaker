package com.kandashan.admin.dao;

import com.kandashan.admin.entity.InstantMessaging;
import com.kandashan.admin.entity.InstantMessagingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InstantMessagingMapper {
    int countByExample(InstantMessagingExample example);

    int deleteByExample(InstantMessagingExample example);

    int deleteByPrimaryKey(String id);

    int insert(InstantMessaging record);

    int insertSelective(InstantMessaging record);

    List<InstantMessaging> selectByExample(InstantMessagingExample example);

    InstantMessaging selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") InstantMessaging record, @Param("example") InstantMessagingExample example);

    int updateByExample(@Param("record") InstantMessaging record, @Param("example") InstantMessagingExample example);

    int updateByPrimaryKeySelective(InstantMessaging record);

    int updateByPrimaryKey(InstantMessaging record);
}