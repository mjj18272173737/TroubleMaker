package com.kandashan.admin.entity;

import java.util.Date;

public class GoodsSpecificationValue {
    private String id;

    private Date createDate;

    private Date modifyDate;

    private String imagePath;

    private String name;

    private Integer orderList;

    private String goodsSpecificationId;

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

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath == null ? null : imagePath.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getOrderList() {
        return orderList;
    }

    public void setOrderList(Integer orderList) {
        this.orderList = orderList;
    }

    public String getGoodsSpecificationId() {
        return goodsSpecificationId;
    }

    public void setGoodsSpecificationId(String goodsSpecificationId) {
        this.goodsSpecificationId = goodsSpecificationId == null ? null : goodsSpecificationId.trim();
    }
}