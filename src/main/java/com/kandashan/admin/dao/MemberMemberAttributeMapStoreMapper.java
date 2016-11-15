package com.kandashan.admin.dao;

import com.kandashan.admin.entity.MemberMemberAttributeMapStore;
import com.kandashan.admin.entity.MemberMemberAttributeMapStoreExample;
import com.kandashan.admin.entity.MemberMemberAttributeMapStoreKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberMemberAttributeMapStoreMapper {
    int countByExample(MemberMemberAttributeMapStoreExample example);

    int deleteByExample(MemberMemberAttributeMapStoreExample example);

    int deleteByPrimaryKey(MemberMemberAttributeMapStoreKey key);

    int insert(MemberMemberAttributeMapStore record);

    int insertSelective(MemberMemberAttributeMapStore record);

    List<MemberMemberAttributeMapStore> selectByExample(MemberMemberAttributeMapStoreExample example);

    MemberMemberAttributeMapStore selectByPrimaryKey(MemberMemberAttributeMapStoreKey key);

    int updateByExampleSelective(@Param("record") MemberMemberAttributeMapStore record, @Param("example") MemberMemberAttributeMapStoreExample example);

    int updateByExample(@Param("record") MemberMemberAttributeMapStore record, @Param("example") MemberMemberAttributeMapStoreExample example);

    int updateByPrimaryKeySelective(MemberMemberAttributeMapStore record);

    int updateByPrimaryKey(MemberMemberAttributeMapStore record);
}