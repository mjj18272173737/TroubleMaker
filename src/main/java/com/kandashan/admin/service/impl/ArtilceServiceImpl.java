package com.kandashan.admin.service.impl;

import com.kandashan.admin.dao.ArticleMapper;
import com.kandashan.admin.entity.Article;
import com.kandashan.admin.service.IArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CPR199 on 2016-12-06.
 */
@Service
public class ArtilceServiceImpl implements IArticleService {

    @Override
    public List<Article> list() {
        return null;
    }

    @Override
    public void update(Article article) {

    }

    @Override
    public void save(Article article) {

    }
}
