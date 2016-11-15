package com.kandashan.admin.entity;

import java.util.ArrayList;
import java.util.List;

public class MemberMemberAttributeMapStoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberMemberAttributeMapStoreExample() {
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

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberAttributeMapStoreMapkeyIdIsNull() {
            addCriterion("member_attribute_map_store_mapkey_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberAttributeMapStoreMapkeyIdIsNotNull() {
            addCriterion("member_attribute_map_store_mapkey_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberAttributeMapStoreMapkeyIdEqualTo(String value) {
            addCriterion("member_attribute_map_store_mapkey_id =", value, "memberAttributeMapStoreMapkeyId");
            return (Criteria) this;
        }

        public Criteria andMemberAttributeMapStoreMapkeyIdNotEqualTo(String value) {
            addCriterion("member_attribute_map_store_mapkey_id <>", value, "memberAttributeMapStoreMapkeyId");
            return (Criteria) this;
        }

        public Criteria andMemberAttributeMapStoreMapkeyIdGreaterThan(String value) {
            addCriterion("member_attribute_map_store_mapkey_id >", value, "memberAttributeMapStoreMapkeyId");
            return (Criteria) this;
        }

        public Criteria andMemberAttributeMapStoreMapkeyIdGreaterThanOrEqualTo(String value) {
            addCriterion("member_attribute_map_store_mapkey_id >=", value, "memberAttributeMapStoreMapkeyId");
            return (Criteria) this;
        }

        public Criteria andMemberAttributeMapStoreMapkeyIdLessThan(String value) {
            addCriterion("member_attribute_map_store_mapkey_id <", value, "memberAttributeMapStoreMapkeyId");
            return (Criteria) this;
        }

        public Criteria andMemberAttributeMapStoreMapkeyIdLessThanOrEqualTo(String value) {
            addCriterion("member_attribute_map_store_mapkey_id <=", value, "memberAttributeMapStoreMapkeyId");
            return (Criteria) this;
        }

        public Criteria andMemberAttributeMapStoreMapkeyIdLike(String value) {
            addCriterion("member_attribute_map_store_mapkey_id like", value, "memberAttributeMapStoreMapkeyId");
            return (Criteria) this;
        }

        public Criteria andMemberAttributeMapStoreMapkeyIdNotLike(String value) {
            addCriterion("member_attribute_map_store_mapkey_id not like", value, "memberAttributeMapStoreMapkeyId");
            return (Criteria) this;
        }

        public Criteria andMemberAttributeMapStoreMapkeyIdIn(List<String> values) {
            addCriterion("member_attribute_map_store_mapkey_id in", values, "memberAttributeMapStoreMapkeyId");
            return (Criteria) this;
        }

        public Criteria andMemberAttributeMapStoreMapkeyIdNotIn(List<String> values) {
            addCriterion("member_attribute_map_store_mapkey_id not in", values, "memberAttributeMapStoreMapkeyId");
            return (Criteria) this;
        }

        public Criteria andMemberAttributeMapStoreMapkeyIdBetween(String value1, String value2) {
            addCriterion("member_attribute_map_store_mapkey_id between", value1, value2, "memberAttributeMapStoreMapkeyId");
            return (Criteria) this;
        }

        public Criteria andMemberAttributeMapStoreMapkeyIdNotBetween(String value1, String value2) {
            addCriterion("member_attribute_map_store_mapkey_id not between", value1, value2, "memberAttributeMapStoreMapkeyId");
            return (Criteria) this;
        }

        public Criteria andMemberAttributeMapStoreElementIsNull() {
            addCriterion("member_attribute_map_store_element is null");
            return (Criteria) this;
        }

        public Criteria andMemberAttributeMapStoreElementIsNotNull() {
            addCriterion("member_attribute_map_store_element is not null");
            return (Criteria) this;
        }

        public Criteria andMemberAttributeMapStoreElementEqualTo(String value) {
            addCriterion("member_attribute_map_store_element =", value, "memberAttributeMapStoreElement");
            return (Criteria) this;
        }

        public Criteria andMemberAttributeMapStoreElementNotEqualTo(String value) {
            addCriterion("member_attribute_map_store_element <>", value, "memberAttributeMapStoreElement");
            return (Criteria) this;
        }

        public Criteria andMemberAttributeMapStoreElementGreaterThan(String value) {
            addCriterion("member_attribute_map_store_element >", value, "memberAttributeMapStoreElement");
            return (Criteria) this;
        }

        public Criteria andMemberAttributeMapStoreElementGreaterThanOrEqualTo(String value) {
            addCriterion("member_attribute_map_store_element >=", value, "memberAttributeMapStoreElement");
            return (Criteria) this;
        }

        public Criteria andMemberAttributeMapStoreElementLessThan(String value) {
            addCriterion("member_attribute_map_store_element <", value, "memberAttributeMapStoreElement");
            return (Criteria) this;
        }

        public Criteria andMemberAttributeMapStoreElementLessThanOrEqualTo(String value) {
            addCriterion("member_attribute_map_store_element <=", value, "memberAttributeMapStoreElement");
            return (Criteria) this;
        }

        public Criteria andMemberAttributeMapStoreElementLike(String value) {
            addCriterion("member_attribute_map_store_element like", value, "memberAttributeMapStoreElement");
            return (Criteria) this;
        }

        public Criteria andMemberAttributeMapStoreElementNotLike(String value) {
            addCriterion("member_attribute_map_store_element not like", value, "memberAttributeMapStoreElement");
            return (Criteria) this;
        }

        public Criteria andMemberAttributeMapStoreElementIn(List<String> values) {
            addCriterion("member_attribute_map_store_element in", values, "memberAttributeMapStoreElement");
            return (Criteria) this;
        }

        public Criteria andMemberAttributeMapStoreElementNotIn(List<String> values) {
            addCriterion("member_attribute_map_store_element not in", values, "memberAttributeMapStoreElement");
            return (Criteria) this;
        }

        public Criteria andMemberAttributeMapStoreElementBetween(String value1, String value2) {
            addCriterion("member_attribute_map_store_element between", value1, value2, "memberAttributeMapStoreElement");
            return (Criteria) this;
        }

        public Criteria andMemberAttributeMapStoreElementNotBetween(String value1, String value2) {
            addCriterion("member_attribute_map_store_element not between", value1, value2, "memberAttributeMapStoreElement");
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