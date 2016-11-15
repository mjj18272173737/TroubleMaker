package com.kandashan.admin.dao;

import com.kandashan.admin.entity.Reship;
import com.kandashan.admin.entity.ReshipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReshipMapper {
    int countByExample(ReshipExample example);

    int deleteByExample(ReshipExample example);

    int deleteByPrimaryKey(String id);

    int insert(Reship record);

    int insertSelective(Reship record);

    List<Reship> selectByExample(ReshipExample example);

    Reship selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Reship record, @Param("example") ReshipExample example);

    int updateByExample(@Param("record") Reship record, @Param("example") ReshipExample example);

    int updateByPrimaryKeySelective(Reship record);

    int updateByPrimaryKey(Reship record);
}