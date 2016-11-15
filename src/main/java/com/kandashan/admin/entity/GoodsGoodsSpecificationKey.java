package com.kandashan.admin.entity;

public class GoodsGoodsSpecificationKey {
    private String goodsSetId;

    private String goodsSpecificationSetId;

    public String getGoodsSetId() {
        return goodsSetId;
    }

    public void setGoodsSetId(String goodsSetId) {
        this.goodsSetId = goodsSetId == null ? null : goodsSetId.trim();
    }

    public String getGoodsSpecificationSetId() {
        return goodsSpecificationSetId;
    }

    public void setGoodsSpecificationSetId(String goodsSpecificationSetId) {
        this.goodsSpecificationSetId = goodsSpecificationSetId == null ? null : goodsSpecificationSetId.trim();
    }
}