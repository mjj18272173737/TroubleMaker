package com.kandashan.admin.entity;

import java.util.ArrayList;
import java.util.List;

public class GoodsGoodsAttributeMapStoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsGoodsAttributeMapStoreExample() {
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(String value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(String value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(String value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(String value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLike(String value) {
            addCriterion("goods_id like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotLike(String value) {
            addCriterion("goods_id not like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<String> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<String> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(String value1, String value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(String value1, String value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeMapStoreMapkeyIdIsNull() {
            addCriterion("goods_attribute_map_store_mapkey_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeMapStoreMapkeyIdIsNotNull() {
            addCriterion("goods_attribute_map_store_mapkey_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeMapStoreMapkeyIdEqualTo(String value) {
            addCriterion("goods_attribute_map_store_mapkey_id =", value, "goodsAttributeMapStoreMapkeyId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeMapStoreMapkeyIdNotEqualTo(String value) {
            addCriterion("goods_attribute_map_store_mapkey_id <>", value, "goodsAttributeMapStoreMapkeyId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeMapStoreMapkeyIdGreaterThan(String value) {
            addCriterion("goods_attribute_map_store_mapkey_id >", value, "goodsAttributeMapStoreMapkeyId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeMapStoreMapkeyIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_attribute_map_store_mapkey_id >=", value, "goodsAttributeMapStoreMapkeyId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeMapStoreMapkeyIdLessThan(String value) {
            addCriterion("goods_attribute_map_store_mapkey_id <", value, "goodsAttributeMapStoreMapkeyId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeMapStoreMapkeyIdLessThanOrEqualTo(String value) {
            addCriterion("goods_attribute_map_store_mapkey_id <=", value, "goodsAttributeMapStoreMapkeyId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeMapStoreMapkeyIdLike(String value) {
            addCriterion("goods_attribute_map_store_mapkey_id like", value, "goodsAttributeMapStoreMapkeyId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeMapStoreMapkeyIdNotLike(String value) {
            addCriterion("goods_attribute_map_store_mapkey_id not like", value, "goodsAttributeMapStoreMapkeyId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeMapStoreMapkeyIdIn(List<String> values) {
            addCriterion("goods_attribute_map_store_mapkey_id in", values, "goodsAttributeMapStoreMapkeyId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeMapStoreMapkeyIdNotIn(List<String> values) {
            addCriterion("goods_attribute_map_store_mapkey_id not in", values, "goodsAttributeMapStoreMapkeyId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeMapStoreMapkeyIdBetween(String value1, String value2) {
            addCriterion("goods_attribute_map_store_mapkey_id between", value1, value2, "goodsAttributeMapStoreMapkeyId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeMapStoreMapkeyIdNotBetween(String value1, String value2) {
            addCriterion("goods_attribute_map_store_mapkey_id not between", value1, value2, "goodsAttributeMapStoreMapkeyId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeMapStoreElementIsNull() {
            addCriterion("goods_attribute_map_store_element is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeMapStoreElementIsNotNull() {
            addCriterion("goods_attribute_map_store_element is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeMapStoreElementEqualTo(String value) {
            addCriterion("goods_attribute_map_store_element =", value, "goodsAttributeMapStoreElement");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeMapStoreElementNotEqualTo(String value) {
            addCriterion("goods_attribute_map_store_element <>", value, "goodsAttributeMapStoreElement");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeMapStoreElementGreaterThan(String value) {
            addCriterion("goods_attribute_map_store_element >", value, "goodsAttributeMapStoreElement");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeMapStoreElementGreaterThanOrEqualTo(String value) {
            addCriterion("goods_attribute_map_store_element >=", value, "goodsAttributeMapStoreElement");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeMapStoreElementLessThan(String value) {
            addCriterion("goods_attribute_map_store_element <", value, "goodsAttributeMapStoreElement");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeMapStoreElementLessThanOrEqualTo(String value) {
            addCriterion("goods_attribute_map_store_element <=", value, "goodsAttributeMapStoreElement");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeMapStoreElementLike(String value) {
            addCriterion("goods_attribute_map_store_element like", value, "goodsAttributeMapStoreElement");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeMapStoreElementNotLike(String value) {
            addCriterion("goods_attribute_map_store_element not like", value, "goodsAttributeMapStoreElement");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeMapStoreElementIn(List<String> values) {
            addCriterion("goods_attribute_map_store_element in", values, "goodsAttributeMapStoreElement");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeMapStoreElementNotIn(List<String> values) {
            addCriterion("goods_attribute_map_store_element not in", values, "goodsAttributeMapStoreElement");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeMapStoreElementBetween(String value1, String value2) {
            addCriterion("goods_attribute_map_store_element between", value1, value2, "goodsAttributeMapStoreElement");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeMapStoreElementNotBetween(String value1, String value2) {
            addCriterion("goods_attribute_map_store_element not between", value1, value2, "goodsAttributeMapStoreElement");
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