package com.kandashan.admin.dao;

import com.kandashan.admin.entity.ArticleCategory;
import com.kandashan.admin.entity.ArticleCategoryExample;
import com.kandashan.admin.entity.ArticleCategoryWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleCategoryMapper {
    int countByExample(ArticleCategoryExample example);

    int deleteByExample(ArticleCategoryExample example);

    int deleteByPrimaryKey(String id);

    int insert(ArticleCategoryWithBLOBs record);

    int insertSelective(ArticleCategoryWithBLOBs record);

    List<ArticleCategoryWithBLOBs> selectByExampleWithBLOBs(ArticleCategoryExample example);

    List<ArticleCategory> selectByExample(ArticleCategoryExample example);

    ArticleCategoryWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ArticleCategoryWithBLOBs record, @Param("example") ArticleCategoryExample example);

    int updateByExampleWithBLOBs(@Param("record") ArticleCategoryWithBLOBs record, @Param("example") ArticleCategoryExample example);

    int updateByExample(@Param("record") ArticleCategory record, @Param("example") ArticleCategoryExample example);

    int updateByPrimaryKeySelective(ArticleCategoryWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ArticleCategoryWithBLOBs record);

    int updateByPrimaryKey(ArticleCategory record);
}