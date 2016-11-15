package com.kandashan.admin.entity;

import java.util.Date;

public class GoodsSpecification {
    private String id;

    private Date createDate;

    private Date modifyDate;

    private Integer goodsSpecificationType;

    private String name;

    private Integer showType;

    private String memo;

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

    public Integer getGoodsSpecificationType() {
        return goodsSpecificationType;
    }

    public void setGoodsSpecificationType(Integer goodsSpecificationType) {
        this.goodsSpecificationType = goodsSpecificationType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getShowType() {
        return showType;
    }

    public void setShowType(Integer showType) {
        this.showType = showType;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}