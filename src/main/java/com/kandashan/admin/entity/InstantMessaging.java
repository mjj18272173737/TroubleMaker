package com.kandashan.admin.entity;

import java.util.Date;

public class InstantMessaging {
    private String id;

    private Date createDate;

    private Date modifyDate;

    private Integer instantMessagingType;

    private String value;

    private String title;

    private Integer orderList;

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

    public Integer getInstantMessagingType() {
        return instantMessagingType;
    }

    public void setInstantMessagingType(Integer instantMessagingType) {
        this.instantMessagingType = instantMessagingType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getOrderList() {
        return orderList;
    }

    public void setOrderList(Integer orderList) {
        this.orderList = orderList;
    }
}