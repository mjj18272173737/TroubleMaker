package com.kandashan.admin.entity;

public class OrderWithBLOBs extends Order {
    private String memo;

    private String goodsIdListStore;

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getGoodsIdListStore() {
        return goodsIdListStore;
    }

    public void setGoodsIdListStore(String goodsIdListStore) {
        this.goodsIdListStore = goodsIdListStore == null ? null : goodsIdListStore.trim();
    }
}