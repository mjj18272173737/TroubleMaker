package com.kandashan.admin.entity;

public class GoodsGoodsAttributeMapStoreKey {
    private String goodsId;

    private String goodsAttributeMapStoreMapkeyId;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public String getGoodsAttributeMapStoreMapkeyId() {
        return goodsAttributeMapStoreMapkeyId;
    }

    public void setGoodsAttributeMapStoreMapkeyId(String goodsAttributeMapStoreMapkeyId) {
        this.goodsAttributeMapStoreMapkeyId = goodsAttributeMapStoreMapkeyId == null ? null : goodsAttributeMapStoreMapkeyId.trim();
    }
}