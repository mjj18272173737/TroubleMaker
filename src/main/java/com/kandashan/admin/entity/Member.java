package com.kandashan.admin.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Member {
    private String id;

    private Date createDate;

    private Date modifyDate;

    private BigDecimal deposit;

    private String email;

    private Boolean isAccountEnabled;

    private Boolean isAccountLocked;

    private Date lockedDate;

    private Date loginDate;

    private Integer loginFailureCount;

    private String loginIp;

    private String password;

    private String passwordRecoverKey;

    private String registerIp;

    private String safeAnswer;

    private String safeQuestion;

    private Integer score;

    private String username;

    private String memberRankId;

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

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
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

    public Boolean getIsAccountLocked() {
        return isAccountLocked;
    }

    public void setIsAccountLocked(Boolean isAccountLocked) {
        this.isAccountLocked = isAccountLocked;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPasswordRecoverKey() {
        return passwordRecoverKey;
    }

    public void setPasswordRecoverKey(String passwordRecoverKey) {
        this.passwordRecoverKey = passwordRecoverKey == null ? null : passwordRecoverKey.trim();
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp == null ? null : registerIp.trim();
    }

    public String getSafeAnswer() {
        return safeAnswer;
    }

    public void setSafeAnswer(String safeAnswer) {
        this.safeAnswer = safeAnswer == null ? null : safeAnswer.trim();
    }

    public String getSafeQuestion() {
        return safeQuestion;
    }

    public void setSafeQuestion(String safeQuestion) {
        this.safeQuestion = safeQuestion == null ? null : safeQuestion.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getMemberRankId() {
        return memberRankId;
    }

    public void setMemberRankId(String memberRankId) {
        this.memberRankId = memberRankId == null ? null : memberRankId.trim();
    }
}