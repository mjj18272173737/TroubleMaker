package com.kandashan.admin.entity;

import java.util.Date;

public class Article {
    private String id;

    private Date createDate;

    private Date modifyDate;

    private String author;

    private Integer hits;

    private String htmlFilePath;

    private Boolean isPublication;

    private Boolean isRecommend;

    private Boolean isTop;

    private Integer pageCount;

    private String title;

    private String articleCategoryId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public String getHtmlFilePath() {
        return htmlFilePath;
    }

    public void setHtmlFilePath(String htmlFilePath) {
        this.htmlFilePath = htmlFilePath == null ? null : htmlFilePath.trim();
    }

    public Boolean getIsPublication() {
        return isPublication;
    }

    public void setIsPublication(Boolean isPublication) {
        this.isPublication = isPublication;
    }

    public Boolean getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Boolean isRecommend) {
        this.isRecommend = isRecommend;
    }

    public Boolean getIsTop() {
        return isTop;
    }

    public void setIsTop(Boolean isTop) {
        this.isTop = isTop;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getArticleCategoryId() {
        return articleCategoryId;
    }

    public void setArticleCategoryId(String articleCategoryId) {
        this.articleCategoryId = articleCategoryId == null ? null : articleCategoryId.trim();
    }
}