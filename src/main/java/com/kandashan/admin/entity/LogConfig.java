package com.kandashan.admin.entity;

import java.util.Date;

public class LogConfig {
    private String id;

    private Date createDate;

    private Date modifyDate;

    private String actionClassName;

    private String actionMethodName;

    private String operationName;

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

    public String getActionClassName() {
        return actionClassName;
    }

    public void setActionClassName(String actionClassName) {
        this.actionClassName = actionClassName == null ? null : actionClassName.trim();
    }

    public String getActionMethodName() {
        return actionMethodName;
    }

    public void setActionMethodName(String actionMethodName) {
        this.actionMethodName = actionMethodName == null ? null : actionMethodName.trim();
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName == null ? null : operationName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}