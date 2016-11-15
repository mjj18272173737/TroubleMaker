package com.kandashan.admin.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Goods {
    private String id;

    private Date createDate;

    private Date modifyDate;

    private BigDecimal cost;

    private Integer freezeStore;

    private String goodsSn;

    private String htmlFilePath;

    private Boolean isBest;

    private Boolean isHasGoodsSpecification;

    private Boolean isHot;

    private Boolean isMarketable;

    private Boolean isNew;

    private BigDecimal marketPrice;

    private String name;

    private BigDecimal price;

    private Integer score;

    private Integer store;

    private String storePlace;

    private Double weight;

    private Integer weightUnit;

    private String goodsTypeId;

    private String brandId;

    private String goodsCategoryId;

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

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Integer getFreezeStore() {
        return freezeStore;
    }

    public void setFreezeStore(Integer freezeStore) {
        this.freezeStore = freezeStore;
    }

    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn == null ? null : goodsSn.trim();
    }

    public String getHtmlFilePath() {
        return htmlFilePath;
    }

    public void setHtmlFilePath(String htmlFilePath) {
        this.htmlFilePath = htmlFilePath == null ? null : htmlFilePath.trim();
    }

    public Boolean getIsBest() {
        return isBest;
    }

    public void setIsBest(Boolean isBest) {
        this.isBest = isBest;
    }

    public Boolean getIsHasGoodsSpecification() {
        return isHasGoodsSpecification;
    }

    public void setIsHasGoodsSpecification(Boolean isHasGoodsSpecification) {
        this.isHasGoodsSpecification = isHasGoodsSpecification;
    }

    public Boolean getIsHot() {
        return isHot;
    }

    public void setIsHot(Boolean isHot) {
        this.isHot = isHot;
    }

    public Boolean getIsMarketable() {
        return isMarketable;
    }

    public void setIsMarketable(Boolean isMarketable) {
        this.isMarketable = isMarketable;
    }

    public Boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }

    public String getStorePlace() {
        return storePlace;
    }

    public void setStorePlace(String storePlace) {
        this.storePlace = storePlace == null ? null : storePlace.trim();
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(Integer weightUnit) {
        this.weightUnit = weightUnit;
    }

    public String getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(String goodsTypeId) {
        this.goodsTypeId = goodsTypeId == null ? null : goodsTypeId.trim();
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId == null ? null : brandId.trim();
    }

    public String getGoodsCategoryId() {
        return goodsCategoryId;
    }

    public void setGoodsCategoryId(String goodsCategoryId) {
        this.goodsCategoryId = goodsCategoryId == null ? null : goodsCategoryId.trim();
    }
}