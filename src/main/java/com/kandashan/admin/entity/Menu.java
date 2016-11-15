package com.kandashan.admin.entity;

import java.sql.Timestamp;

/**
 * Created by jj on 2016/7/28.
 */
public class Menu {

    private Long id;
    private String code;
    private String name;
    private String url;
    private String parentCode;
    private Timestamp createDate;
    private Timestamp modifyDate;

    public Menu(Long id, String code, String name, String url, String parentCode, Timestamp createDate, Timestamp modifyDate) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.url = url;
        this.parentCode = parentCode;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Timestamp getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Timestamp modifyDate) {
        this.modifyDate = modifyDate;
    }
}
