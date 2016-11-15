package com.kandashan.admin.entity;

public class ProductGoodsSpecificationValueKey {
    private String productSetId;

    private String goodsSpecificationValueSetId;

    public String getProductSetId() {
        return productSetId;
    }

    public void setProductSetId(String productSetId) {
        this.productSetId = productSetId == null ? null : productSetId.trim();
    }

    public String getGoodsSpecificationValueSetId() {
        return goodsSpecificationValueSetId;
    }

    public void setGoodsSpecificationValueSetId(String goodsSpecificationValueSetId) {
        this.goodsSpecificationValueSetId = goodsSpecificationValueSetId == null ? null : goodsSpecificationValueSetId.trim();
    }
}