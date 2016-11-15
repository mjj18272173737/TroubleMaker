package com.kandashan.admin.entity;

import java.util.Date;

public class MemberRank {
    private String id;

    private Date createDate;

    private Date modifyDate;

    private Boolean isDefault;

    private String name;

    private Double preferentialScale;

    private Integer score;

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

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getPreferentialScale() {
        return preferentialScale;
    }

    public void setPreferentialScale(Double preferentialScale) {
        this.preferentialScale = preferentialScale;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}