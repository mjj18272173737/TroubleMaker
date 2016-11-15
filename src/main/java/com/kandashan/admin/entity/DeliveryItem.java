package com.kandashan.admin.entity;

import java.util.Date;

public class DeliveryItem {
    private String id;

    private Date createDate;

    private Date modifyDate;

    private Integer deliveryQuantity;

    private String productHtmlFilePath;

    private String productName;

    private String productSn;

    private String shippingId;

    private String productId;

    private String reshipId;

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

    public Integer getDeliveryQuantity() {
        return deliveryQuantity;
    }

    public void setDeliveryQuantity(Integer deliveryQuantity) {
        this.deliveryQuantity = deliveryQuantity;
    }

    public String getProductHtmlFilePath() {
        return productHtmlFilePath;
    }

    public void setProductHtmlFilePath(String productHtmlFilePath) {
        this.productHtmlFilePath = productHtmlFilePath == null ? null : productHtmlFilePath.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn == null ? null : productSn.trim();
    }

    public String getShippingId() {
        return shippingId;
    }

    public void setShippingId(String shippingId) {
        this.shippingId = shippingId == null ? null : shippingId.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getReshipId() {
        return reshipId;
    }

    public void setReshipId(String reshipId) {
        this.reshipId = reshipId == null ? null : reshipId.trim();
    }
}