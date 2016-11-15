package com.kandashan.admin.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNull() {
            addCriterion("modify_date is null");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNotNull() {
            addCriterion("modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDateEqualTo(Date value) {
            addCriterion("modify_date =", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotEqualTo(Date value) {
            addCriterion("modify_date <>", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThan(Date value) {
            addCriterion("modify_date >", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_date >=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThan(Date value) {
            addCriterion("modify_date <", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("modify_date <=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIn(List<Date> values) {
            addCriterion("modify_date in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotIn(List<Date> values) {
            addCriterion("modify_date not in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateBetween(Date value1, Date value2) {
            addCriterion("modify_date between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("modify_date not between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andDepositIsNull() {
            addCriterion("deposit is null");
            return (Criteria) this;
        }

        public Criteria andDepositIsNotNull() {
            addCriterion("deposit is not null");
            return (Criteria) this;
        }

        public Criteria andDepositEqualTo(BigDecimal value) {
            addCriterion("deposit =", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotEqualTo(BigDecimal value) {
            addCriterion("deposit <>", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThan(BigDecimal value) {
            addCriterion("deposit >", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deposit >=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThan(BigDecimal value) {
            addCriterion("deposit <", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deposit <=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositIn(List<BigDecimal> values) {
            addCriterion("deposit in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotIn(List<BigDecimal> values) {
            addCriterion("deposit not in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposit between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposit not between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andIsAccountEnabledIsNull() {
            addCriterion("is_account_enabled is null");
            return (Criteria) this;
        }

        public Criteria andIsAccountEnabledIsNotNull() {
            addCriterion("is_account_enabled is not null");
            return (Criteria) this;
        }

        public Criteria andIsAccountEnabledEqualTo(Boolean value) {
            addCriterion("is_account_enabled =", value, "isAccountEnabled");
            return (Criteria) this;
        }

        public Criteria andIsAccountEnabledNotEqualTo(Boolean value) {
            addCriterion("is_account_enabled <>", value, "isAccountEnabled");
            return (Criteria) this;
        }

        public Criteria andIsAccountEnabledGreaterThan(Boolean value) {
            addCriterion("is_account_enabled >", value, "isAccountEnabled");
            return (Criteria) this;
        }

        public Criteria andIsAccountEnabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_account_enabled >=", value, "isAccountEnabled");
            return (Criteria) this;
        }

        public Criteria andIsAccountEnabledLessThan(Boolean value) {
            addCriterion("is_account_enabled <", value, "isAccountEnabled");
            return (Criteria) this;
        }

        public Criteria andIsAccountEnabledLessThanOrEqualTo(Boolean value) {
            addCriterion("is_account_enabled <=", value, "isAccountEnabled");
            return (Criteria) this;
        }

        public Criteria andIsAccountEnabledIn(List<Boolean> values) {
            addCriterion("is_account_enabled in", values, "isAccountEnabled");
            return (Criteria) this;
        }

        public Criteria andIsAccountEnabledNotIn(List<Boolean> values) {
            addCriterion("is_account_enabled not in", values, "isAccountEnabled");
            return (Criteria) this;
        }

        public Criteria andIsAccountEnabledBetween(Boolean value1, Boolean value2) {
            addCriterion("is_account_enabled between", value1, value2, "isAccountEnabled");
            return (Criteria) this;
        }

        public Criteria andIsAccountEnabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_account_enabled not between", value1, value2, "isAccountEnabled");
            return (Criteria) this;
        }

        public Criteria andIsAccountLockedIsNull() {
            addCriterion("is_account_locked is null");
            return (Criteria) this;
        }

        public Criteria andIsAccountLockedIsNotNull() {
            addCriterion("is_account_locked is not null");
            return (Criteria) this;
        }

        public Criteria andIsAccountLockedEqualTo(Boolean value) {
            addCriterion("is_account_locked =", value, "isAccountLocked");
            return (Criteria) this;
        }

        public Criteria andIsAccountLockedNotEqualTo(Boolean value) {
            addCriterion("is_account_locked <>", value, "isAccountLocked");
            return (Criteria) this;
        }

        public Criteria andIsAccountLockedGreaterThan(Boolean value) {
            addCriterion("is_account_locked >", value, "isAccountLocked");
            return (Criteria) this;
        }

        public Criteria andIsAccountLockedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_account_locked >=", value, "isAccountLocked");
            return (Criteria) this;
        }

        public Criteria andIsAccountLockedLessThan(Boolean value) {
            addCriterion("is_account_locked <", value, "isAccountLocked");
            return (Criteria) this;
        }

        public Criteria andIsAccountLockedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_account_locked <=", value, "isAccountLocked");
            return (Criteria) this;
        }

        public Criteria andIsAccountLockedIn(List<Boolean> values) {
            addCriterion("is_account_locked in", values, "isAccountLocked");
            return (Criteria) this;
        }

        public Criteria andIsAccountLockedNotIn(List<Boolean> values) {
            addCriterion("is_account_locked not in", values, "isAccountLocked");
            return (Criteria) this;
        }

        public Criteria andIsAccountLockedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_account_locked between", value1, value2, "isAccountLocked");
            return (Criteria) this;
        }

        public Criteria andIsAccountLockedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_account_locked not between", value1, value2, "isAccountLocked");
            return (Criteria) this;
        }

        public Criteria andLockedDateIsNull() {
            addCriterion("locked_date is null");
            return (Criteria) this;
        }

        public Criteria andLockedDateIsNotNull() {
            addCriterion("locked_date is not null");
            return (Criteria) this;
        }

        public Criteria andLockedDateEqualTo(Date value) {
            addCriterion("locked_date =", value, "lockedDate");
            return (Criteria) this;
        }

        public Criteria andLockedDateNotEqualTo(Date value) {
            addCriterion("locked_date <>", value, "lockedDate");
            return (Criteria) this;
        }

        public Criteria andLockedDateGreaterThan(Date value) {
            addCriterion("locked_date >", value, "lockedDate");
            return (Criteria) this;
        }

        public Criteria andLockedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("locked_date >=", value, "lockedDate");
            return (Criteria) this;
        }

        public Criteria andLockedDateLessThan(Date value) {
            addCriterion("locked_date <", value, "lockedDate");
            return (Criteria) this;
        }

        public Criteria andLockedDateLessThanOrEqualTo(Date value) {
            addCriterion("locked_date <=", value, "lockedDate");
            return (Criteria) this;
        }

        public Criteria andLockedDateIn(List<Date> values) {
            addCriterion("locked_date in", values, "lockedDate");
            return (Criteria) this;
        }

        public Criteria andLockedDateNotIn(List<Date> values) {
            addCriterion("locked_date not in", values, "lockedDate");
            return (Criteria) this;
        }

        public Criteria andLockedDateBetween(Date value1, Date value2) {
            addCriterion("locked_date between", value1, value2, "lockedDate");
            return (Criteria) this;
        }

        public Criteria andLockedDateNotBetween(Date value1, Date value2) {
            addCriterion("locked_date not between", value1, value2, "lockedDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateIsNull() {
            addCriterion("login_date is null");
            return (Criteria) this;
        }

        public Criteria andLoginDateIsNotNull() {
            addCriterion("login_date is not null");
            return (Criteria) this;
        }

        public Criteria andLoginDateEqualTo(Date value) {
            addCriterion("login_date =", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateNotEqualTo(Date value) {
            addCriterion("login_date <>", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateGreaterThan(Date value) {
            addCriterion("login_date >", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("login_date >=", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateLessThan(Date value) {
            addCriterion("login_date <", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateLessThanOrEqualTo(Date value) {
            addCriterion("login_date <=", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateIn(List<Date> values) {
            addCriterion("login_date in", values, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateNotIn(List<Date> values) {
            addCriterion("login_date not in", values, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateBetween(Date value1, Date value2) {
            addCriterion("login_date between", value1, value2, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateNotBetween(Date value1, Date value2) {
            addCriterion("login_date not between", value1, value2, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginFailureCountIsNull() {
            addCriterion("login_failure_count is null");
            return (Criteria) this;
        }

        public Criteria andLoginFailureCountIsNotNull() {
            addCriterion("login_failure_count is not null");
            return (Criteria) this;
        }

        public Criteria andLoginFailureCountEqualTo(Integer value) {
            addCriterion("login_failure_count =", value, "loginFailureCount");
            return (Criteria) this;
        }

        public Criteria andLoginFailureCountNotEqualTo(Integer value) {
            addCriterion("login_failure_count <>", value, "loginFailureCount");
            return (Criteria) this;
        }

        public Criteria andLoginFailureCountGreaterThan(Integer value) {
            addCriterion("login_failure_count >", value, "loginFailureCount");
            return (Criteria) this;
        }

        public Criteria andLoginFailureCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_failure_count >=", value, "loginFailureCount");
            return (Criteria) this;
        }

        public Criteria andLoginFailureCountLessThan(Integer value) {
            addCriterion("login_failure_count <", value, "loginFailureCount");
            return (Criteria) this;
        }

        public Criteria andLoginFailureCountLessThanOrEqualTo(Integer value) {
            addCriterion("login_failure_count <=", value, "loginFailureCount");
            return (Criteria) this;
        }

        public Criteria andLoginFailureCountIn(List<Integer> values) {
            addCriterion("login_failure_count in", values, "loginFailureCount");
            return (Criteria) this;
        }

        public Criteria andLoginFailureCountNotIn(List<Integer> values) {
            addCriterion("login_failure_count not in", values, "loginFailureCount");
            return (Criteria) this;
        }

        public Criteria andLoginFailureCountBetween(Integer value1, Integer value2) {
            addCriterion("login_failure_count between", value1, value2, "loginFailureCount");
            return (Criteria) this;
        }

        public Criteria andLoginFailureCountNotBetween(Integer value1, Integer value2) {
            addCriterion("login_failure_count not between", value1, value2, "loginFailureCount");
            return (Criteria) this;
        }

        public Criteria andLoginIpIsNull() {
            addCriterion("login_ip is null");
            return (Criteria) this;
        }

        public Criteria andLoginIpIsNotNull() {
            addCriterion("login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIpEqualTo(String value) {
            addCriterion("login_ip =", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotEqualTo(String value) {
            addCriterion("login_ip <>", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThan(String value) {
            addCriterion("login_ip >", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("login_ip >=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThan(String value) {
            addCriterion("login_ip <", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThanOrEqualTo(String value) {
            addCriterion("login_ip <=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLike(String value) {
            addCriterion("login_ip like", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotLike(String value) {
            addCriterion("login_ip not like", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpIn(List<String> values) {
            addCriterion("login_ip in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotIn(List<String> values) {
            addCriterion("login_ip not in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpBetween(String value1, String value2) {
            addCriterion("login_ip between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotBetween(String value1, String value2) {
            addCriterion("login_ip not between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordRecoverKeyIsNull() {
            addCriterion("password_recover_key is null");
            return (Criteria) this;
        }

        public Criteria andPasswordRecoverKeyIsNotNull() {
            addCriterion("password_recover_key is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordRecoverKeyEqualTo(String value) {
            addCriterion("password_recover_key =", value, "passwordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPasswordRecoverKeyNotEqualTo(String value) {
            addCriterion("password_recover_key <>", value, "passwordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPasswordRecoverKeyGreaterThan(String value) {
            addCriterion("password_recover_key >", value, "passwordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPasswordRecoverKeyGreaterThanOrEqualTo(String value) {
            addCriterion("password_recover_key >=", value, "passwordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPasswordRecoverKeyLessThan(String value) {
            addCriterion("password_recover_key <", value, "passwordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPasswordRecoverKeyLessThanOrEqualTo(String value) {
            addCriterion("password_recover_key <=", value, "passwordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPasswordRecoverKeyLike(String value) {
            addCriterion("password_recover_key like", value, "passwordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPasswordRecoverKeyNotLike(String value) {
            addCriterion("password_recover_key not like", value, "passwordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPasswordRecoverKeyIn(List<String> values) {
            addCriterion("password_recover_key in", values, "passwordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPasswordRecoverKeyNotIn(List<String> values) {
            addCriterion("password_recover_key not in", values, "passwordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPasswordRecoverKeyBetween(String value1, String value2) {
            addCriterion("password_recover_key between", value1, value2, "passwordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPasswordRecoverKeyNotBetween(String value1, String value2) {
            addCriterion("password_recover_key not between", value1, value2, "passwordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andRegisterIpIsNull() {
            addCriterion("register_ip is null");
            return (Criteria) this;
        }

        public Criteria andRegisterIpIsNotNull() {
            addCriterion("register_ip is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterIpEqualTo(String value) {
            addCriterion("register_ip =", value, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpNotEqualTo(String value) {
            addCriterion("register_ip <>", value, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpGreaterThan(String value) {
            addCriterion("register_ip >", value, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpGreaterThanOrEqualTo(String value) {
            addCriterion("register_ip >=", value, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpLessThan(String value) {
            addCriterion("register_ip <", value, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpLessThanOrEqualTo(String value) {
            addCriterion("register_ip <=", value, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpLike(String value) {
            addCriterion("register_ip like", value, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpNotLike(String value) {
            addCriterion("register_ip not like", value, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpIn(List<String> values) {
            addCriterion("register_ip in", values, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpNotIn(List<String> values) {
            addCriterion("register_ip not in", values, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpBetween(String value1, String value2) {
            addCriterion("register_ip between", value1, value2, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpNotBetween(String value1, String value2) {
            addCriterion("register_ip not between", value1, value2, "registerIp");
            return (Criteria) this;
        }

        public Criteria andSafeAnswerIsNull() {
            addCriterion("safe_answer is null");
            return (Criteria) this;
        }

        public Criteria andSafeAnswerIsNotNull() {
            addCriterion("safe_answer is not null");
            return (Criteria) this;
        }

        public Criteria andSafeAnswerEqualTo(String value) {
            addCriterion("safe_answer =", value, "safeAnswer");
            return (Criteria) this;
        }

        public Criteria andSafeAnswerNotEqualTo(String value) {
            addCriterion("safe_answer <>", value, "safeAnswer");
            return (Criteria) this;
        }

        public Criteria andSafeAnswerGreaterThan(String value) {
            addCriterion("safe_answer >", value, "safeAnswer");
            return (Criteria) this;
        }

        public Criteria andSafeAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("safe_answer >=", value, "safeAnswer");
            return (Criteria) this;
        }

        public Criteria andSafeAnswerLessThan(String value) {
            addCriterion("safe_answer <", value, "safeAnswer");
            return (Criteria) this;
        }

        public Criteria andSafeAnswerLessThanOrEqualTo(String value) {
            addCriterion("safe_answer <=", value, "safeAnswer");
            return (Criteria) this;
        }

        public Criteria andSafeAnswerLike(String value) {
            addCriterion("safe_answer like", value, "safeAnswer");
            return (Criteria) this;
        }

        public Criteria andSafeAnswerNotLike(String value) {
            addCriterion("safe_answer not like", value, "safeAnswer");
            return (Criteria) this;
        }

        public Criteria andSafeAnswerIn(List<String> values) {
            addCriterion("safe_answer in", values, "safeAnswer");
            return (Criteria) this;
        }

        public Criteria andSafeAnswerNotIn(List<String> values) {
            addCriterion("safe_answer not in", values, "safeAnswer");
            return (Criteria) this;
        }

        public Criteria andSafeAnswerBetween(String value1, String value2) {
            addCriterion("safe_answer between", value1, value2, "safeAnswer");
            return (Criteria) this;
        }

        public Criteria andSafeAnswerNotBetween(String value1, String value2) {
            addCriterion("safe_answer not between", value1, value2, "safeAnswer");
            return (Criteria) this;
        }

        public Criteria andSafeQuestionIsNull() {
            addCriterion("safe_question is null");
            return (Criteria) this;
        }

        public Criteria andSafeQuestionIsNotNull() {
            addCriterion("safe_question is not null");
            return (Criteria) this;
        }

        public Criteria andSafeQuestionEqualTo(String value) {
            addCriterion("safe_question =", value, "safeQuestion");
            return (Criteria) this;
        }

        public Criteria andSafeQuestionNotEqualTo(String value) {
            addCriterion("safe_question <>", value, "safeQuestion");
            return (Criteria) this;
        }

        public Criteria andSafeQuestionGreaterThan(String value) {
            addCriterion("safe_question >", value, "safeQuestion");
            return (Criteria) this;
        }

        public Criteria andSafeQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("safe_question >=", value, "safeQuestion");
            return (Criteria) this;
        }

        public Criteria andSafeQuestionLessThan(String value) {
            addCriterion("safe_question <", value, "safeQuestion");
            return (Criteria) this;
        }

        public Criteria andSafeQuestionLessThanOrEqualTo(String value) {
            addCriterion("safe_question <=", value, "safeQuestion");
            return (Criteria) this;
        }

        public Criteria andSafeQuestionLike(String value) {
            addCriterion("safe_question like", value, "safeQuestion");
            return (Criteria) this;
        }

        public Criteria andSafeQuestionNotLike(String value) {
            addCriterion("safe_question not like", value, "safeQuestion");
            return (Criteria) this;
        }

        public Criteria andSafeQuestionIn(List<String> values) {
            addCriterion("safe_question in", values, "safeQuestion");
            return (Criteria) this;
        }

        public Criteria andSafeQuestionNotIn(List<String> values) {
            addCriterion("safe_question not in", values, "safeQuestion");
            return (Criteria) this;
        }

        public Criteria andSafeQuestionBetween(String value1, String value2) {
            addCriterion("safe_question between", value1, value2, "safeQuestion");
            return (Criteria) this;
        }

        public Criteria andSafeQuestionNotBetween(String value1, String value2) {
            addCriterion("safe_question not between", value1, value2, "safeQuestion");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andMemberRankIdIsNull() {
            addCriterion("member_rank_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberRankIdIsNotNull() {
            addCriterion("member_rank_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberRankIdEqualTo(String value) {
            addCriterion("member_rank_id =", value, "memberRankId");
            return (Criteria) this;
        }

        public Criteria andMemberRankIdNotEqualTo(String value) {
            addCriterion("member_rank_id <>", value, "memberRankId");
            return (Criteria) this;
        }

        public Criteria andMemberRankIdGreaterThan(String value) {
            addCriterion("member_rank_id >", value, "memberRankId");
            return (Criteria) this;
        }

        public Criteria andMemberRankIdGreaterThanOrEqualTo(String value) {
            addCriterion("member_rank_id >=", value, "memberRankId");
            return (Criteria) this;
        }

        public Criteria andMemberRankIdLessThan(String value) {
            addCriterion("member_rank_id <", value, "memberRankId");
            return (Criteria) this;
        }

        public Criteria andMemberRankIdLessThanOrEqualTo(String value) {
            addCriterion("member_rank_id <=", value, "memberRankId");
            return (Criteria) this;
        }

        public Criteria andMemberRankIdLike(String value) {
            addCriterion("member_rank_id like", value, "memberRankId");
            return (Criteria) this;
        }

        public Criteria andMemberRankIdNotLike(String value) {
            addCriterion("member_rank_id not like", value, "memberRankId");
            return (Criteria) this;
        }

        public Criteria andMemberRankIdIn(List<String> values) {
            addCriterion("member_rank_id in", values, "memberRankId");
            return (Criteria) this;
        }

        public Criteria andMemberRankIdNotIn(List<String> values) {
            addCriterion("member_rank_id not in", values, "memberRankId");
            return (Criteria) this;
        }

        public Criteria andMemberRankIdBetween(String value1, String value2) {
            addCriterion("member_rank_id between", value1, value2, "memberRankId");
            return (Criteria) this;
        }

        public Criteria andMemberRankIdNotBetween(String value1, String value2) {
            addCriterion("member_rank_id not between", value1, value2, "memberRankId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}