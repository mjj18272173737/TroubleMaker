package com.kandashan.admin.entity;

public class GoodsWithBLOBs extends Goods {
    private String goodsImageListStore;

    private String introduction;

    private String metaDescription;

    private String metaKeywords;

    public String getGoodsImageListStore() {
        return goodsImageListStore;
    }

    public void setGoodsImageListStore(String goodsImageListStore) {
        this.goodsImageListStore = goodsImageListStore == null ? null : goodsImageListStore.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription == null ? null : metaDescription.trim();
    }

    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords == null ? null : metaKeywords.trim();
    }
}