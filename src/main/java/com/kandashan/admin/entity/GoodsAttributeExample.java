package com.kandashan.admin.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsAttributeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsAttributeExample() {
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

        public Criteria andAttributeOptionStoreIsNull() {
            addCriterion("attribute_option_store is null");
            return (Criteria) this;
        }

        public Criteria andAttributeOptionStoreIsNotNull() {
            addCriterion("attribute_option_store is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeOptionStoreEqualTo(String value) {
            addCriterion("attribute_option_store =", value, "attributeOptionStore");
            return (Criteria) this;
        }

        public Criteria andAttributeOptionStoreNotEqualTo(String value) {
            addCriterion("attribute_option_store <>", value, "attributeOptionStore");
            return (Criteria) this;
        }

        public Criteria andAttributeOptionStoreGreaterThan(String value) {
            addCriterion("attribute_option_store >", value, "attributeOptionStore");
            return (Criteria) this;
        }

        public Criteria andAttributeOptionStoreGreaterThanOrEqualTo(String value) {
            addCriterion("attribute_option_store >=", value, "attributeOptionStore");
            return (Criteria) this;
        }

        public Criteria andAttributeOptionStoreLessThan(String value) {
            addCriterion("attribute_option_store <", value, "attributeOptionStore");
            return (Criteria) this;
        }

        public Criteria andAttributeOptionStoreLessThanOrEqualTo(String value) {
            addCriterion("attribute_option_store <=", value, "attributeOptionStore");
            return (Criteria) this;
        }

        public Criteria andAttributeOptionStoreLike(String value) {
            addCriterion("attribute_option_store like", value, "attributeOptionStore");
            return (Criteria) this;
        }

        public Criteria andAttributeOptionStoreNotLike(String value) {
            addCriterion("attribute_option_store not like", value, "attributeOptionStore");
            return (Criteria) this;
        }

        public Criteria andAttributeOptionStoreIn(List<String> values) {
            addCriterion("attribute_option_store in", values, "attributeOptionStore");
            return (Criteria) this;
        }

        public Criteria andAttributeOptionStoreNotIn(List<String> values) {
            addCriterion("attribute_option_store not in", values, "attributeOptionStore");
            return (Criteria) this;
        }

        public Criteria andAttributeOptionStoreBetween(String value1, String value2) {
            addCriterion("attribute_option_store between", value1, value2, "attributeOptionStore");
            return (Criteria) this;
        }

        public Criteria andAttributeOptionStoreNotBetween(String value1, String value2) {
            addCriterion("attribute_option_store not between", value1, value2, "attributeOptionStore");
            return (Criteria) this;
        }

        public Criteria andAttributeTypeIsNull() {
            addCriterion("attribute_type is null");
            return (Criteria) this;
        }

        public Criteria andAttributeTypeIsNotNull() {
            addCriterion("attribute_type is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeTypeEqualTo(Integer value) {
            addCriterion("attribute_type =", value, "attributeType");
            return (Criteria) this;
        }

        public Criteria andAttributeTypeNotEqualTo(Integer value) {
            addCriterion("attribute_type <>", value, "attributeType");
            return (Criteria) this;
        }

        public Criteria andAttributeTypeGreaterThan(Integer value) {
            addCriterion("attribute_type >", value, "attributeType");
            return (Criteria) this;
        }

        public Criteria andAttributeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("attribute_type >=", value, "attributeType");
            return (Criteria) this;
        }

        public Criteria andAttributeTypeLessThan(Integer value) {
            addCriterion("attribute_type <", value, "attributeType");
            return (Criteria) this;
        }

        public Criteria andAttributeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("attribute_type <=", value, "attributeType");
            return (Criteria) this;
        }

        public Criteria andAttributeTypeIn(List<Integer> values) {
            addCriterion("attribute_type in", values, "attributeType");
            return (Criteria) this;
        }

        public Criteria andAttributeTypeNotIn(List<Integer> values) {
            addCriterion("attribute_type not in", values, "attributeType");
            return (Criteria) this;
        }

        public Criteria andAttributeTypeBetween(Integer value1, Integer value2) {
            addCriterion("attribute_type between", value1, value2, "attributeType");
            return (Criteria) this;
        }

        public Criteria andAttributeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("attribute_type not between", value1, value2, "attributeType");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIsNull() {
            addCriterion("is_enabled is null");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIsNotNull() {
            addCriterion("is_enabled is not null");
            return (Criteria) this;
        }

        public Criteria andIsEnabledEqualTo(Boolean value) {
            addCriterion("is_enabled =", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotEqualTo(Boolean value) {
            addCriterion("is_enabled <>", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledGreaterThan(Boolean value) {
            addCriterion("is_enabled >", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_enabled >=", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledLessThan(Boolean value) {
            addCriterion("is_enabled <", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledLessThanOrEqualTo(Boolean value) {
            addCriterion("is_enabled <=", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIn(List<Boolean> values) {
            addCriterion("is_enabled in", values, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotIn(List<Boolean> values) {
            addCriterion("is_enabled not in", values, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledBetween(Boolean value1, Boolean value2) {
            addCriterion("is_enabled between", value1, value2, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_enabled not between", value1, value2, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsRequiredIsNull() {
            addCriterion("is_required is null");
            return (Criteria) this;
        }

        public Criteria andIsRequiredIsNotNull() {
            addCriterion("is_required is not null");
            return (Criteria) this;
        }

        public Criteria andIsRequiredEqualTo(Boolean value) {
            addCriterion("is_required =", value, "isRequired");
            return (Criteria) this;
        }

        public Criteria andIsRequiredNotEqualTo(Boolean value) {
            addCriterion("is_required <>", value, "isRequired");
            return (Criteria) this;
        }

        public Criteria andIsRequiredGreaterThan(Boolean value) {
            addCriterion("is_required >", value, "isRequired");
            return (Criteria) this;
        }

        public Criteria andIsRequiredGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_required >=", value, "isRequired");
            return (Criteria) this;
        }

        public Criteria andIsRequiredLessThan(Boolean value) {
            addCriterion("is_required <", value, "isRequired");
            return (Criteria) this;
        }

        public Criteria andIsRequiredLessThanOrEqualTo(Boolean value) {
            addCriterion("is_required <=", value, "isRequired");
            return (Criteria) this;
        }

        public Criteria andIsRequiredIn(List<Boolean> values) {
            addCriterion("is_required in", values, "isRequired");
            return (Criteria) this;
        }

        public Criteria andIsRequiredNotIn(List<Boolean> values) {
            addCriterion("is_required not in", values, "isRequired");
            return (Criteria) this;
        }

        public Criteria andIsRequiredBetween(Boolean value1, Boolean value2) {
            addCriterion("is_required between", value1, value2, "isRequired");
            return (Criteria) this;
        }

        public Criteria andIsRequiredNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_required not between", value1, value2, "isRequired");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andOrderListIsNull() {
            addCriterion("order_list is null");
            return (Criteria) this;
        }

        public Criteria andOrderListIsNotNull() {
            addCriterion("order_list is not null");
            return (Criteria) this;
        }

        public Criteria andOrderListEqualTo(Integer value) {
            addCriterion("order_list =", value, "orderList");
            return (Criteria) this;
        }

        public Criteria andOrderListNotEqualTo(Integer value) {
            addCriterion("order_list <>", value, "orderList");
            return (Criteria) this;
        }

        public Criteria andOrderListGreaterThan(Integer value) {
            addCriterion("order_list >", value, "orderList");
            return (Criteria) this;
        }

        public Criteria andOrderListGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_list >=", value, "orderList");
            return (Criteria) this;
        }

        public Criteria andOrderListLessThan(Integer value) {
            addCriterion("order_list <", value, "orderList");
            return (Criteria) this;
        }

        public Criteria andOrderListLessThanOrEqualTo(Integer value) {
            addCriterion("order_list <=", value, "orderList");
            return (Criteria) this;
        }

        public Criteria andOrderListIn(List<Integer> values) {
            addCriterion("order_list in", values, "orderList");
            return (Criteria) this;
        }

        public Criteria andOrderListNotIn(List<Integer> values) {
            addCriterion("order_list not in", values, "orderList");
            return (Criteria) this;
        }

        public Criteria andOrderListBetween(Integer value1, Integer value2) {
            addCriterion("order_list between", value1, value2, "orderList");
            return (Criteria) this;
        }

        public Criteria andOrderListNotBetween(Integer value1, Integer value2) {
            addCriterion("order_list not between", value1, value2, "orderList");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdIsNull() {
            addCriterion("goods_type_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdIsNotNull() {
            addCriterion("goods_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdEqualTo(String value) {
            addCriterion("goods_type_id =", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdNotEqualTo(String value) {
            addCriterion("goods_type_id <>", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdGreaterThan(String value) {
            addCriterion("goods_type_id >", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_type_id >=", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdLessThan(String value) {
            addCriterion("goods_type_id <", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdLessThanOrEqualTo(String value) {
            addCriterion("goods_type_id <=", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdLike(String value) {
            addCriterion("goods_type_id like", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdNotLike(String value) {
            addCriterion("goods_type_id not like", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdIn(List<String> values) {
            addCriterion("goods_type_id in", values, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdNotIn(List<String> values) {
            addCriterion("goods_type_id not in", values, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdBetween(String value1, String value2) {
            addCriterion("goods_type_id between", value1, value2, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdNotBetween(String value1, String value2) {
            addCriterion("goods_type_id not between", value1, value2, "goodsTypeId");
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