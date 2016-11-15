package com.kandashan.admin.entity;

import java.util.Date;

public class MemberAttribute {
    private String id;

    private Date createDate;

    private Date modifyDate;

    private String attributeOptionStore;

    private Integer attributeType;

    private Boolean isEnabled;

    private Boolean isRequired;

    private String name;

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

    public String getAttributeOptionStore() {
        return attributeOptionStore;
    }

    public void setAttributeOptionStore(String attributeOptionStore) {
        this.attributeOptionStore = attributeOptionStore == null ? null : attributeOptionStore.trim();
    }

    public Integer getAttributeType() {
        return attributeType;
    }

    public void setAttributeType(Integer attributeType) {
        this.attributeType = attributeType;
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Boolean getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
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
}