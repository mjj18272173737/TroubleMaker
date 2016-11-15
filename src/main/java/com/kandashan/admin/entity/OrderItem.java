package com.kandashan.admin.entity;

import java.math.BigDecimal;
import java.util.Date;

public class OrderItem {
    private String id;

    private Date createDate;

    private Date modifyDate;

    private Integer deliveryQuantity;

    private String productHtmlFilePath;

    private String productName;

    private BigDecimal productPrice;

    private Integer productQuantity;

    private String productSn;

    private Integer totalDeliveryQuantity;

    private String productId;

    private String orderId;

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

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn == null ? null : productSn.trim();
    }

    public Integer getTotalDeliveryQuantity() {
        return totalDeliveryQuantity;
    }

    public void setTotalDeliveryQuantity(Integer totalDeliveryQuantity) {
        this.totalDeliveryQuantity = totalDeliveryQuantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }
}