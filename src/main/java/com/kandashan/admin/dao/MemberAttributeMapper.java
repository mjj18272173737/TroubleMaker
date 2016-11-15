package com.kandashan.admin.dao;

import com.kandashan.admin.entity.MemberAttribute;
import com.kandashan.admin.entity.MemberAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberAttributeMapper {
    int countByExample(MemberAttributeExample example);

    int deleteByExample(MemberAttributeExample example);

    int deleteByPrimaryKey(String id);

    int insert(MemberAttribute record);

    int insertSelective(MemberAttribute record);

    List<MemberAttribute> selectByExample(MemberAttributeExample example);

    MemberAttribute selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MemberAttribute record, @Param("example") MemberAttributeExample example);

    int updateByExample(@Param("record") MemberAttribute record, @Param("example") MemberAttributeExample example);

    int updateByPrimaryKeySelective(MemberAttribute record);

    int updateByPrimaryKey(MemberAttribute record);
}