package com.kandashan.admin.entity;

import java.util.Date;

public class Message {
    private String id;

    private Date createDate;

    private Date modifyDate;

    private Integer deleteStatus;

    private Boolean isRead;

    private Boolean isSaveDraftbox;

    private String title;

    private String toMemberId;

    private String fromMemberId;

    private String content;

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

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Boolean getIsRead() {
        return isRead;
    }

    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }

    public Boolean getIsSaveDraftbox() {
        return isSaveDraftbox;
    }

    public void setIsSaveDraftbox(Boolean isSaveDraftbox) {
        this.isSaveDraftbox = isSaveDraftbox;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getToMemberId() {
        return toMemberId;
    }

    public void setToMemberId(String toMemberId) {
        this.toMemberId = toMemberId == null ? null : toMemberId.trim();
    }

    public String getFromMemberId() {
        return fromMemberId;
    }

    public void setFromMemberId(String fromMemberId) {
        this.fromMemberId = fromMemberId == null ? null : fromMemberId.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}