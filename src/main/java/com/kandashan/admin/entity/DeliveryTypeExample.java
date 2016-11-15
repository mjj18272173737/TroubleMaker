package com.kandashan.admin.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeliveryTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeliveryTypeExample() {
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

        public Criteria andContinueWeightIsNull() {
            addCriterion("continue_weight is null");
            return (Criteria) this;
        }

        public Criteria andContinueWeightIsNotNull() {
            addCriterion("continue_weight is not null");
            return (Criteria) this;
        }

        public Criteria andContinueWeightEqualTo(Double value) {
            addCriterion("continue_weight =", value, "continueWeight");
            return (Criteria) this;
        }

        public Criteria andContinueWeightNotEqualTo(Double value) {
            addCriterion("continue_weight <>", value, "continueWeight");
            return (Criteria) this;
        }

        public Criteria andContinueWeightGreaterThan(Double value) {
            addCriterion("continue_weight >", value, "continueWeight");
            return (Criteria) this;
        }

        public Criteria andContinueWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("continue_weight >=", value, "continueWeight");
            return (Criteria) this;
        }

        public Criteria andContinueWeightLessThan(Double value) {
            addCriterion("continue_weight <", value, "continueWeight");
            return (Criteria) this;
        }

        public Criteria andContinueWeightLessThanOrEqualTo(Double value) {
            addCriterion("continue_weight <=", value, "continueWeight");
            return (Criteria) this;
        }

        public Criteria andContinueWeightIn(List<Double> values) {
            addCriterion("continue_weight in", values, "continueWeight");
            return (Criteria) this;
        }

        public Criteria andContinueWeightNotIn(List<Double> values) {
            addCriterion("continue_weight not in", values, "continueWeight");
            return (Criteria) this;
        }

        public Criteria andContinueWeightBetween(Double value1, Double value2) {
            addCriterion("continue_weight between", value1, value2, "continueWeight");
            return (Criteria) this;
        }

        public Criteria andContinueWeightNotBetween(Double value1, Double value2) {
            addCriterion("continue_weight not between", value1, value2, "continueWeight");
            return (Criteria) this;
        }

        public Criteria andContinueWeightPriceIsNull() {
            addCriterion("continue_weight_price is null");
            return (Criteria) this;
        }

        public Criteria andContinueWeightPriceIsNotNull() {
            addCriterion("continue_weight_price is not null");
            return (Criteria) this;
        }

        public Criteria andContinueWeightPriceEqualTo(BigDecimal value) {
            addCriterion("continue_weight_price =", value, "continueWeightPrice");
            return (Criteria) this;
        }

        public Criteria andContinueWeightPriceNotEqualTo(BigDecimal value) {
            addCriterion("continue_weight_price <>", value, "continueWeightPrice");
            return (Criteria) this;
        }

        public Criteria andContinueWeightPriceGreaterThan(BigDecimal value) {
            addCriterion("continue_weight_price >", value, "continueWeightPrice");
            return (Criteria) this;
        }

        public Criteria andContinueWeightPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("continue_weight_price >=", value, "continueWeightPrice");
            return (Criteria) this;
        }

        public Criteria andContinueWeightPriceLessThan(BigDecimal value) {
            addCriterion("continue_weight_price <", value, "continueWeightPrice");
            return (Criteria) this;
        }

        public Criteria andContinueWeightPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("continue_weight_price <=", value, "continueWeightPrice");
            return (Criteria) this;
        }

        public Criteria andContinueWeightPriceIn(List<BigDecimal> values) {
            addCriterion("continue_weight_price in", values, "continueWeightPrice");
            return (Criteria) this;
        }

        public Criteria andContinueWeightPriceNotIn(List<BigDecimal> values) {
            addCriterion("continue_weight_price not in", values, "continueWeightPrice");
            return (Criteria) this;
        }

        public Criteria andContinueWeightPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("continue_weight_price between", value1, value2, "continueWeightPrice");
            return (Criteria) this;
        }

        public Criteria andContinueWeightPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("continue_weight_price not between", value1, value2, "continueWeightPrice");
            return (Criteria) this;
        }

        public Criteria andContinueWeightUnitIsNull() {
            addCriterion("continue_weight_unit is null");
            return (Criteria) this;
        }

        public Criteria andContinueWeightUnitIsNotNull() {
            addCriterion("continue_weight_unit is not null");
            return (Criteria) this;
        }

        public Criteria andContinueWeightUnitEqualTo(Integer value) {
            addCriterion("continue_weight_unit =", value, "continueWeightUnit");
            return (Criteria) this;
        }

        public Criteria andContinueWeightUnitNotEqualTo(Integer value) {
            addCriterion("continue_weight_unit <>", value, "continueWeightUnit");
            return (Criteria) this;
        }

        public Criteria andContinueWeightUnitGreaterThan(Integer value) {
            addCriterion("continue_weight_unit >", value, "continueWeightUnit");
            return (Criteria) this;
        }

        public Criteria andContinueWeightUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("continue_weight_unit >=", value, "continueWeightUnit");
            return (Criteria) this;
        }

        public Criteria andContinueWeightUnitLessThan(Integer value) {
            addCriterion("continue_weight_unit <", value, "continueWeightUnit");
            return (Criteria) this;
        }

        public Criteria andContinueWeightUnitLessThanOrEqualTo(Integer value) {
            addCriterion("continue_weight_unit <=", value, "continueWeightUnit");
            return (Criteria) this;
        }

        public Criteria andContinueWeightUnitIn(List<Integer> values) {
            addCriterion("continue_weight_unit in", values, "continueWeightUnit");
            return (Criteria) this;
        }

        public Criteria andContinueWeightUnitNotIn(List<Integer> values) {
            addCriterion("continue_weight_unit not in", values, "continueWeightUnit");
            return (Criteria) this;
        }

        public Criteria andContinueWeightUnitBetween(Integer value1, Integer value2) {
            addCriterion("continue_weight_unit between", value1, value2, "continueWeightUnit");
            return (Criteria) this;
        }

        public Criteria andContinueWeightUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("continue_weight_unit not between", value1, value2, "continueWeightUnit");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodIsNull() {
            addCriterion("delivery_method is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodIsNotNull() {
            addCriterion("delivery_method is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodEqualTo(Integer value) {
            addCriterion("delivery_method =", value, "deliveryMethod");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodNotEqualTo(Integer value) {
            addCriterion("delivery_method <>", value, "deliveryMethod");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodGreaterThan(Integer value) {
            addCriterion("delivery_method >", value, "deliveryMethod");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_method >=", value, "deliveryMethod");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodLessThan(Integer value) {
            addCriterion("delivery_method <", value, "deliveryMethod");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_method <=", value, "deliveryMethod");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodIn(List<Integer> values) {
            addCriterion("delivery_method in", values, "deliveryMethod");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodNotIn(List<Integer> values) {
            addCriterion("delivery_method not in", values, "deliveryMethod");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodBetween(Integer value1, Integer value2) {
            addCriterion("delivery_method between", value1, value2, "deliveryMethod");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_method not between", value1, value2, "deliveryMethod");
            return (Criteria) this;
        }

        public Criteria andFirstWeightIsNull() {
            addCriterion("first_weight is null");
            return (Criteria) this;
        }

        public Criteria andFirstWeightIsNotNull() {
            addCriterion("first_weight is not null");
            return (Criteria) this;
        }

        public Criteria andFirstWeightEqualTo(Double value) {
            addCriterion("first_weight =", value, "firstWeight");
            return (Criteria) this;
        }

        public Criteria andFirstWeightNotEqualTo(Double value) {
            addCriterion("first_weight <>", value, "firstWeight");
            return (Criteria) this;
        }

        public Criteria andFirstWeightGreaterThan(Double value) {
            addCriterion("first_weight >", value, "firstWeight");
            return (Criteria) this;
        }

        public Criteria andFirstWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("first_weight >=", value, "firstWeight");
            return (Criteria) this;
        }

        public Criteria andFirstWeightLessThan(Double value) {
            addCriterion("first_weight <", value, "firstWeight");
            return (Criteria) this;
        }

        public Criteria andFirstWeightLessThanOrEqualTo(Double value) {
            addCriterion("first_weight <=", value, "firstWeight");
            return (Criteria) this;
        }

        public Criteria andFirstWeightIn(List<Double> values) {
            addCriterion("first_weight in", values, "firstWeight");
            return (Criteria) this;
        }

        public Criteria andFirstWeightNotIn(List<Double> values) {
            addCriterion("first_weight not in", values, "firstWeight");
            return (Criteria) this;
        }

        public Criteria andFirstWeightBetween(Double value1, Double value2) {
            addCriterion("first_weight between", value1, value2, "firstWeight");
            return (Criteria) this;
        }

        public Criteria andFirstWeightNotBetween(Double value1, Double value2) {
            addCriterion("first_weight not between", value1, value2, "firstWeight");
            return (Criteria) this;
        }

        public Criteria andFirstWeightPriceIsNull() {
            addCriterion("first_weight_price is null");
            return (Criteria) this;
        }

        public Criteria andFirstWeightPriceIsNotNull() {
            addCriterion("first_weight_price is not null");
            return (Criteria) this;
        }

        public Criteria andFirstWeightPriceEqualTo(BigDecimal value) {
            addCriterion("first_weight_price =", value, "firstWeightPrice");
            return (Criteria) this;
        }

        public Criteria andFirstWeightPriceNotEqualTo(BigDecimal value) {
            addCriterion("first_weight_price <>", value, "firstWeightPrice");
            return (Criteria) this;
        }

        public Criteria andFirstWeightPriceGreaterThan(BigDecimal value) {
            addCriterion("first_weight_price >", value, "firstWeightPrice");
            return (Criteria) this;
        }

        public Criteria andFirstWeightPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("first_weight_price >=", value, "firstWeightPrice");
            return (Criteria) this;
        }

        public Criteria andFirstWeightPriceLessThan(BigDecimal value) {
            addCriterion("first_weight_price <", value, "firstWeightPrice");
            return (Criteria) this;
        }

        public Criteria andFirstWeightPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("first_weight_price <=", value, "firstWeightPrice");
            return (Criteria) this;
        }

        public Criteria andFirstWeightPriceIn(List<BigDecimal> values) {
            addCriterion("first_weight_price in", values, "firstWeightPrice");
            return (Criteria) this;
        }

        public Criteria andFirstWeightPriceNotIn(List<BigDecimal> values) {
            addCriterion("first_weight_price not in", values, "firstWeightPrice");
            return (Criteria) this;
        }

        public Criteria andFirstWeightPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_weight_price between", value1, value2, "firstWeightPrice");
            return (Criteria) this;
        }

        public Criteria andFirstWeightPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_weight_price not between", value1, value2, "firstWeightPrice");
            return (Criteria) this;
        }

        public Criteria andFirstWeightUnitIsNull() {
            addCriterion("first_weight_unit is null");
            return (Criteria) this;
        }

        public Criteria andFirstWeightUnitIsNotNull() {
            addCriterion("first_weight_unit is not null");
            return (Criteria) this;
        }

        public Criteria andFirstWeightUnitEqualTo(Integer value) {
            addCriterion("first_weight_unit =", value, "firstWeightUnit");
            return (Criteria) this;
        }

        public Criteria andFirstWeightUnitNotEqualTo(Integer value) {
            addCriterion("first_weight_unit <>", value, "firstWeightUnit");
            return (Criteria) this;
        }

        public Criteria andFirstWeightUnitGreaterThan(Integer value) {
            addCriterion("first_weight_unit >", value, "firstWeightUnit");
            return (Criteria) this;
        }

        public Criteria andFirstWeightUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_weight_unit >=", value, "firstWeightUnit");
            return (Criteria) this;
        }

        public Criteria andFirstWeightUnitLessThan(Integer value) {
            addCriterion("first_weight_unit <", value, "firstWeightUnit");
            return (Criteria) this;
        }

        public Criteria andFirstWeightUnitLessThanOrEqualTo(Integer value) {
            addCriterion("first_weight_unit <=", value, "firstWeightUnit");
            return (Criteria) this;
        }

        public Criteria andFirstWeightUnitIn(List<Integer> values) {
            addCriterion("first_weight_unit in", values, "firstWeightUnit");
            return (Criteria) this;
        }

        public Criteria andFirstWeightUnitNotIn(List<Integer> values) {
            addCriterion("first_weight_unit not in", values, "firstWeightUnit");
            return (Criteria) this;
        }

        public Criteria andFirstWeightUnitBetween(Integer value1, Integer value2) {
            addCriterion("first_weight_unit between", value1, value2, "firstWeightUnit");
            return (Criteria) this;
        }

        public Criteria andFirstWeightUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("first_weight_unit not between", value1, value2, "firstWeightUnit");
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

        public Criteria andDefaultDeliveryCorpIdIsNull() {
            addCriterion("default_delivery_corp_id is null");
            return (Criteria) this;
        }

        public Criteria andDefaultDeliveryCorpIdIsNotNull() {
            addCriterion("default_delivery_corp_id is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultDeliveryCorpIdEqualTo(String value) {
            addCriterion("default_delivery_corp_id =", value, "defaultDeliveryCorpId");
            return (Criteria) this;
        }

        public Criteria andDefaultDeliveryCorpIdNotEqualTo(String value) {
            addCriterion("default_delivery_corp_id <>", value, "defaultDeliveryCorpId");
            return (Criteria) this;
        }

        public Criteria andDefaultDeliveryCorpIdGreaterThan(String value) {
            addCriterion("default_delivery_corp_id >", value, "defaultDeliveryCorpId");
            return (Criteria) this;
        }

        public Criteria andDefaultDeliveryCorpIdGreaterThanOrEqualTo(String value) {
            addCriterion("default_delivery_corp_id >=", value, "defaultDeliveryCorpId");
            return (Criteria) this;
        }

        public Criteria andDefaultDeliveryCorpIdLessThan(String value) {
            addCriterion("default_delivery_corp_id <", value, "defaultDeliveryCorpId");
            return (Criteria) this;
        }

        public Criteria andDefaultDeliveryCorpIdLessThanOrEqualTo(String value) {
            addCriterion("default_delivery_corp_id <=", value, "defaultDeliveryCorpId");
            return (Criteria) this;
        }

        public Criteria andDefaultDeliveryCorpIdLike(String value) {
            addCriterion("default_delivery_corp_id like", value, "defaultDeliveryCorpId");
            return (Criteria) this;
        }

        public Criteria andDefaultDeliveryCorpIdNotLike(String value) {
            addCriterion("default_delivery_corp_id not like", value, "defaultDeliveryCorpId");
            return (Criteria) this;
        }

        public Criteria andDefaultDeliveryCorpIdIn(List<String> values) {
            addCriterion("default_delivery_corp_id in", values, "defaultDeliveryCorpId");
            return (Criteria) this;
        }

        public Criteria andDefaultDeliveryCorpIdNotIn(List<String> values) {
            addCriterion("default_delivery_corp_id not in", values, "defaultDeliveryCorpId");
            return (Criteria) this;
        }

        public Criteria andDefaultDeliveryCorpIdBetween(String value1, String value2) {
            addCriterion("default_delivery_corp_id between", value1, value2, "defaultDeliveryCorpId");
            return (Criteria) this;
        }

        public Criteria andDefaultDeliveryCorpIdNotBetween(String value1, String value2) {
            addCriterion("default_delivery_corp_id not between", value1, value2, "defaultDeliveryCorpId");
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