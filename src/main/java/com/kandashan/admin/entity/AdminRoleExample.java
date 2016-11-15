package com.kandashan.admin.entity;

import java.util.ArrayList;
import java.util.List;

public class AdminRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminRoleExample() {
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

        public Criteria andAdminSetIdIsNull() {
            addCriterion("admin_set_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminSetIdIsNotNull() {
            addCriterion("admin_set_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminSetIdEqualTo(String value) {
            addCriterion("admin_set_id =", value, "adminSetId");
            return (Criteria) this;
        }

        public Criteria andAdminSetIdNotEqualTo(String value) {
            addCriterion("admin_set_id <>", value, "adminSetId");
            return (Criteria) this;
        }

        public Criteria andAdminSetIdGreaterThan(String value) {
            addCriterion("admin_set_id >", value, "adminSetId");
            return (Criteria) this;
        }

        public Criteria andAdminSetIdGreaterThanOrEqualTo(String value) {
            addCriterion("admin_set_id >=", value, "adminSetId");
            return (Criteria) this;
        }

        public Criteria andAdminSetIdLessThan(String value) {
            addCriterion("admin_set_id <", value, "adminSetId");
            return (Criteria) this;
        }

        public Criteria andAdminSetIdLessThanOrEqualTo(String value) {
            addCriterion("admin_set_id <=", value, "adminSetId");
            return (Criteria) this;
        }

        public Criteria andAdminSetIdLike(String value) {
            addCriterion("admin_set_id like", value, "adminSetId");
            return (Criteria) this;
        }

        public Criteria andAdminSetIdNotLike(String value) {
            addCriterion("admin_set_id not like", value, "adminSetId");
            return (Criteria) this;
        }

        public Criteria andAdminSetIdIn(List<String> values) {
            addCriterion("admin_set_id in", values, "adminSetId");
            return (Criteria) this;
        }

        public Criteria andAdminSetIdNotIn(List<String> values) {
            addCriterion("admin_set_id not in", values, "adminSetId");
            return (Criteria) this;
        }

        public Criteria andAdminSetIdBetween(String value1, String value2) {
            addCriterion("admin_set_id between", value1, value2, "adminSetId");
            return (Criteria) this;
        }

        public Criteria andAdminSetIdNotBetween(String value1, String value2) {
            addCriterion("admin_set_id not between", value1, value2, "adminSetId");
            return (Criteria) this;
        }

        public Criteria andRoleSetIdIsNull() {
            addCriterion("role_set_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleSetIdIsNotNull() {
            addCriterion("role_set_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleSetIdEqualTo(String value) {
            addCriterion("role_set_id =", value, "roleSetId");
            return (Criteria) this;
        }

        public Criteria andRoleSetIdNotEqualTo(String value) {
            addCriterion("role_set_id <>", value, "roleSetId");
            return (Criteria) this;
        }

        public Criteria andRoleSetIdGreaterThan(String value) {
            addCriterion("role_set_id >", value, "roleSetId");
            return (Criteria) this;
        }

        public Criteria andRoleSetIdGreaterThanOrEqualTo(String value) {
            addCriterion("role_set_id >=", value, "roleSetId");
            return (Criteria) this;
        }

        public Criteria andRoleSetIdLessThan(String value) {
            addCriterion("role_set_id <", value, "roleSetId");
            return (Criteria) this;
        }

        public Criteria andRoleSetIdLessThanOrEqualTo(String value) {
            addCriterion("role_set_id <=", value, "roleSetId");
            return (Criteria) this;
        }

        public Criteria andRoleSetIdLike(String value) {
            addCriterion("role_set_id like", value, "roleSetId");
            return (Criteria) this;
        }

        public Criteria andRoleSetIdNotLike(String value) {
            addCriterion("role_set_id not like", value, "roleSetId");
            return (Criteria) this;
        }

        public Criteria andRoleSetIdIn(List<String> values) {
            addCriterion("role_set_id in", values, "roleSetId");
            return (Criteria) this;
        }

        public Criteria andRoleSetIdNotIn(List<String> values) {
            addCriterion("role_set_id not in", values, "roleSetId");
            return (Criteria) this;
        }

        public Criteria andRoleSetIdBetween(String value1, String value2) {
            addCriterion("role_set_id between", value1, value2, "roleSetId");
            return (Criteria) this;
        }

        public Criteria andRoleSetIdNotBetween(String value1, String value2) {
            addCriterion("role_set_id not between", value1, value2, "roleSetId");
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