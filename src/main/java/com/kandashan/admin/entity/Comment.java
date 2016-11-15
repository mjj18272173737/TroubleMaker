package com.kandashan.admin.entity;

import java.util.Date;

public class Comment {
    private String id;

    private Date createDate;

    private Date modifyDate;

    private String contact;

    private String ip;

    private Boolean isAdminReply;

    private Boolean isShow;

    private String username;

    private String forCommentId;

    private String goodsId;

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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Boolean getIsAdminReply() {
        return isAdminReply;
    }

    public void setIsAdminReply(Boolean isAdminReply) {
        this.isAdminReply = isAdminReply;
    }

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getForCommentId() {
        return forCommentId;
    }

    public void setForCommentId(String forCommentId) {
        this.forCommentId = forCommentId == null ? null : forCommentId.trim();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}