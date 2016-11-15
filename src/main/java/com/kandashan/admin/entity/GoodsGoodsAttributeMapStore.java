package com.kandashan.admin.entity;

public class GoodsGoodsAttributeMapStore extends GoodsGoodsAttributeMapStoreKey {
    private String goodsAttributeMapStoreElement;

    public String getGoodsAttributeMapStoreElement() {
        return goodsAttributeMapStoreElement;
    }

    public void setGoodsAttributeMapStoreElement(String goodsAttributeMapStoreElement) {
        this.goodsAttributeMapStoreElement = goodsAttributeMapStoreElement == null ? null : goodsAttributeMapStoreElement.trim();
    }
}