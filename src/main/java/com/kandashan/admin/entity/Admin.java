package com.kandashan.admin.entity;

import java.util.Date;

public class Admin {
    private String id;

    private Date createDate;

    private Date modifyDate;

    private String department;

    private String email;

    private Boolean isAccountEnabled;

    private Boolean isAccountExpired;

    private Boolean isAccountLocked;

    private Boolean isCredentialsExpired;

    private Date lockedDate;

    private Date loginDate;

    private Integer loginFailureCount;

    private String loginIp;

    private String name;

    private String password;

    private String username;

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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Boolean getIsAccountEnabled() {
        return isAccountEnabled;
    }

    public void setIsAccountEnabled(Boolean isAccountEnabled) {
        this.isAccountEnabled = isAccountEnabled;
    }

    public Boolean getIsAccountExpired() {
        return isAccountExpired;
    }

    public void setIsAccountExpired(Boolean isAccountExpired) {
        this.isAccountExpired = isAccountExpired;
    }

    public Boolean getIsAccountLocked() {
        return isAccountLocked;
    }

    public void setIsAccountLocked(Boolean isAccountLocked) {
        this.isAccountLocked = isAccountLocked;
    }

    public Boolean getIsCredentialsExpired() {
        return isCredentialsExpired;
    }

    public void setIsCredentialsExpired(Boolean isCredentialsExpired) {
        this.isCredentialsExpired = isCredentialsExpired;
    }

    public Date getLockedDate() {
        return lockedDate;
    }

    public void setLockedDate(Date lockedDate) {
        this.lockedDate = lockedDate;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public Integer getLoginFailureCount() {
        return loginFailureCount;
    }

    public void setLoginFailureCount(Integer loginFailureCount) {
        this.loginFailureCount = loginFailureCount;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}