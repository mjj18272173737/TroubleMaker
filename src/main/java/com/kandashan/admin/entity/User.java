package com.kandashan.admin.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by silence on 2016-07-25.
 */
public class User {

    private Long userId;
    private String userName;
    private String password;
    private String realName;
    private BigDecimal isValid;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp loginDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp createDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp modifyDate;

    public User() {}

    public User(Long userId, String userName, String password, String realName, BigDecimal isValid, Timestamp loginDate, Timestamp createDate, Timestamp modifyDate) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.realName = realName;
        this.isValid = isValid;
        this.loginDate = loginDate;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public BigDecimal getIsValid() {
        return isValid;
    }

    public void setIsValid(BigDecimal isValid) {
        this.isValid = isValid;
    }

    public Timestamp getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Timestamp loginDate) {
        this.loginDate = loginDate;
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
