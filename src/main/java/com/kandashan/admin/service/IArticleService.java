package com.kandashan.admin.service;

import com.kandashan.admin.entity.Article;

import java.util.List;

/**
 * Created by CPR199 on 2016-12-06.
 */
public interface IArticleService {

    public List<Article> list();

    public void update(Article article);

    public void save(Article article);

}
