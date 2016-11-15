package com.kandashan.admin.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private String id;

    private Date createDate;

    private Date modifyDate;

    private BigDecimal deliveryFee;

    private String deliveryTypeName;

    private String orderSn;

    private Integer orderStatus;

    private BigDecimal paidAmount;

    private String paymentConfigName;

    private BigDecimal paymentFee;

    private Integer paymentStatus;

    private BigDecimal productTotalPrice;

    private Integer productTotalQuantity;

    private Double productWeight;

    private Integer productWeightUnit;

    private String shipAddress;

    private String shipArea;

    private String shipAreaPath;

    private String shipMobile;

    private String shipName;

    private String shipPhone;

    private String shipZipCode;

    private Integer shippingStatus;

    private BigDecimal totalAmount;

    private String memberId;

    private String deliveryTypeId;

    private String paymentConfigId;

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

    public BigDecimal getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(BigDecimal deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public String getDeliveryTypeName() {
        return deliveryTypeName;
    }

    public void setDeliveryTypeName(String deliveryTypeName) {
        this.deliveryTypeName = deliveryTypeName == null ? null : deliveryTypeName.trim();
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public BigDecimal getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(BigDecimal paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getPaymentConfigName() {
        return paymentConfigName;
    }

    public void setPaymentConfigName(String paymentConfigName) {
        this.paymentConfigName = paymentConfigName == null ? null : paymentConfigName.trim();
    }

    public BigDecimal getPaymentFee() {
        return paymentFee;
    }

    public void setPaymentFee(BigDecimal paymentFee) {
        this.paymentFee = paymentFee;
    }

    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public BigDecimal getProductTotalPrice() {
        return productTotalPrice;
    }

    public void setProductTotalPrice(BigDecimal productTotalPrice) {
        this.productTotalPrice = productTotalPrice;
    }

    public Integer getProductTotalQuantity() {
        return productTotalQuantity;
    }

    public void setProductTotalQuantity(Integer productTotalQuantity) {
        this.productTotalQuantity = productTotalQuantity;
    }

    public Double getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(Double productWeight) {
        this.productWeight = productWeight;
    }

    public Integer getProductWeightUnit() {
        return productWeightUnit;
    }

    public void setProductWeightUnit(Integer productWeightUnit) {
        this.productWeightUnit = productWeightUnit;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress == null ? null : shipAddress.trim();
    }

    public String getShipArea() {
        return shipArea;
    }

    public void setShipArea(String shipArea) {
        this.shipArea = shipArea == null ? null : shipArea.trim();
    }

    public String getShipAreaPath() {
        return shipAreaPath;
    }

    public void setShipAreaPath(String shipAreaPath) {
        this.shipAreaPath = shipAreaPath == null ? null : shipAreaPath.trim();
    }

    public String getShipMobile() {
        return shipMobile;
    }

    public void setShipMobile(String shipMobile) {
        this.shipMobile = shipMobile == null ? null : shipMobile.trim();
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName == null ? null : shipName.trim();
    }

    public String getShipPhone() {
        return shipPhone;
    }

    public void setShipPhone(String shipPhone) {
        this.shipPhone = shipPhone == null ? null : shipPhone.trim();
    }

    public String getShipZipCode() {
        return shipZipCode;
    }

    public void setShipZipCode(String shipZipCode) {
        this.shipZipCode = shipZipCode == null ? null : shipZipCode.trim();
    }

    public Integer getShippingStatus() {
        return shippingStatus;
    }

    public void setShippingStatus(Integer shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    public String getDeliveryTypeId() {
        return deliveryTypeId;
    }

    public void setDeliveryTypeId(String deliveryTypeId) {
        this.deliveryTypeId = deliveryTypeId == null ? null : deliveryTypeId.trim();
    }

    public String getPaymentConfigId() {
        return paymentConfigId;
    }

    public void setPaymentConfigId(String paymentConfigId) {
        this.paymentConfigId = paymentConfigId == null ? null : paymentConfigId.trim();
    }
}