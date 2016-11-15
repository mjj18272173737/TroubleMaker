package com.kandashan.admin.entity;

import java.math.BigDecimal;
import java.util.Date;

public class DeliveryType {
    private String id;

    private Date createDate;

    private Date modifyDate;

    private Double continueWeight;

    private BigDecimal continueWeightPrice;

    private Integer continueWeightUnit;

    private Integer deliveryMethod;

    private Double firstWeight;

    private BigDecimal firstWeightPrice;

    private Integer firstWeightUnit;

    private String name;

    private Integer orderList;

    private String defaultDeliveryCorpId;

    private String description;

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

    public Double getContinueWeight() {
        return continueWeight;
    }

    public void setContinueWeight(Double continueWeight) {
        this.continueWeight = continueWeight;
    }

    public BigDecimal getContinueWeightPrice() {
        return continueWeightPrice;
    }

    public void setContinueWeightPrice(BigDecimal continueWeightPrice) {
        this.continueWeightPrice = continueWeightPrice;
    }

    public Integer getContinueWeightUnit() {
        return continueWeightUnit;
    }

    public void setContinueWeightUnit(Integer continueWeightUnit) {
        this.continueWeightUnit = continueWeightUnit;
    }

    public Integer getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(Integer deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public Double getFirstWeight() {
        return firstWeight;
    }

    public void setFirstWeight(Double firstWeight) {
        this.firstWeight = firstWeight;
    }

    public BigDecimal getFirstWeightPrice() {
        return firstWeightPrice;
    }

    public void setFirstWeightPrice(BigDecimal firstWeightPrice) {
        this.firstWeightPrice = firstWeightPrice;
    }

    public Integer getFirstWeightUnit() {
        return firstWeightUnit;
    }

    public void setFirstWeightUnit(Integer firstWeightUnit) {
        this.firstWeightUnit = firstWeightUnit;
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

    public String getDefaultDeliveryCorpId() {
        return defaultDeliveryCorpId;
    }

    public void setDefaultDeliveryCorpId(String defaultDeliveryCorpId) {
        this.defaultDeliveryCorpId = defaultDeliveryCorpId == null ? null : defaultDeliveryCorpId.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}