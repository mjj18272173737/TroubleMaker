package com.kandashan.admin.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Reship {
    private String id;

    private Date createDate;

    private Date modifyDate;

    private String deliveryCorpName;

    private BigDecimal deliveryFee;

    private String deliverySn;

    private String deliveryTypeName;

    private String memo;

    private String reshipSn;

    private String shipAddress;

    private String shipArea;

    private String shipAreaPath;

    private String shipMobile;

    private String shipName;

    private String shipPhone;

    private String shipZipCode;

    private String orderId;

    private String deliveryTypeId;

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

    public String getDeliveryCorpName() {
        return deliveryCorpName;
    }

    public void setDeliveryCorpName(String deliveryCorpName) {
        this.deliveryCorpName = deliveryCorpName == null ? null : deliveryCorpName.trim();
    }

    public BigDecimal getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(BigDecimal deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public String getDeliverySn() {
        return deliverySn;
    }

    public void setDeliverySn(String deliverySn) {
        this.deliverySn = deliverySn == null ? null : deliverySn.trim();
    }

    public String getDeliveryTypeName() {
        return deliveryTypeName;
    }

    public void setDeliveryTypeName(String deliveryTypeName) {
        this.deliveryTypeName = deliveryTypeName == null ? null : deliveryTypeName.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getReshipSn() {
        return reshipSn;
    }

    public void setReshipSn(String reshipSn) {
        this.reshipSn = reshipSn == null ? null : reshipSn.trim();
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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getDeliveryTypeId() {
        return deliveryTypeId;
    }

    public void setDeliveryTypeId(String deliveryTypeId) {
        this.deliveryTypeId = deliveryTypeId == null ? null : deliveryTypeId.trim();
    }
}