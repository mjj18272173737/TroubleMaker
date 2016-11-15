package com.kandashan.admin.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaymentConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaymentConfigExample() {
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

        public Criteria andBargainorIdIsNull() {
            addCriterion("bargainor_id is null");
            return (Criteria) this;
        }

        public Criteria andBargainorIdIsNotNull() {
            addCriterion("bargainor_id is not null");
            return (Criteria) this;
        }

        public Criteria andBargainorIdEqualTo(String value) {
            addCriterion("bargainor_id =", value, "bargainorId");
            return (Criteria) this;
        }

        public Criteria andBargainorIdNotEqualTo(String value) {
            addCriterion("bargainor_id <>", value, "bargainorId");
            return (Criteria) this;
        }

        public Criteria andBargainorIdGreaterThan(String value) {
            addCriterion("bargainor_id >", value, "bargainorId");
            return (Criteria) this;
        }

        public Criteria andBargainorIdGreaterThanOrEqualTo(String value) {
            addCriterion("bargainor_id >=", value, "bargainorId");
            return (Criteria) this;
        }

        public Criteria andBargainorIdLessThan(String value) {
            addCriterion("bargainor_id <", value, "bargainorId");
            return (Criteria) this;
        }

        public Criteria andBargainorIdLessThanOrEqualTo(String value) {
            addCriterion("bargainor_id <=", value, "bargainorId");
            return (Criteria) this;
        }

        public Criteria andBargainorIdLike(String value) {
            addCriterion("bargainor_id like", value, "bargainorId");
            return (Criteria) this;
        }

        public Criteria andBargainorIdNotLike(String value) {
            addCriterion("bargainor_id not like", value, "bargainorId");
            return (Criteria) this;
        }

        public Criteria andBargainorIdIn(List<String> values) {
            addCriterion("bargainor_id in", values, "bargainorId");
            return (Criteria) this;
        }

        public Criteria andBargainorIdNotIn(List<String> values) {
            addCriterion("bargainor_id not in", values, "bargainorId");
            return (Criteria) this;
        }

        public Criteria andBargainorIdBetween(String value1, String value2) {
            addCriterion("bargainor_id between", value1, value2, "bargainorId");
            return (Criteria) this;
        }

        public Criteria andBargainorIdNotBetween(String value1, String value2) {
            addCriterion("bargainor_id not between", value1, value2, "bargainorId");
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

        public Criteria andPaymentConfigTypeIsNull() {
            addCriterion("payment_config_type is null");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigTypeIsNotNull() {
            addCriterion("payment_config_type is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigTypeEqualTo(Integer value) {
            addCriterion("payment_config_type =", value, "paymentConfigType");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigTypeNotEqualTo(Integer value) {
            addCriterion("payment_config_type <>", value, "paymentConfigType");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigTypeGreaterThan(Integer value) {
            addCriterion("payment_config_type >", value, "paymentConfigType");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_config_type >=", value, "paymentConfigType");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigTypeLessThan(Integer value) {
            addCriterion("payment_config_type <", value, "paymentConfigType");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigTypeLessThanOrEqualTo(Integer value) {
            addCriterion("payment_config_type <=", value, "paymentConfigType");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigTypeIn(List<Integer> values) {
            addCriterion("payment_config_type in", values, "paymentConfigType");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigTypeNotIn(List<Integer> values) {
            addCriterion("payment_config_type not in", values, "paymentConfigType");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigTypeBetween(Integer value1, Integer value2) {
            addCriterion("payment_config_type between", value1, value2, "paymentConfigType");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_config_type not between", value1, value2, "paymentConfigType");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeIsNull() {
            addCriterion("payment_fee is null");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeIsNotNull() {
            addCriterion("payment_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeEqualTo(BigDecimal value) {
            addCriterion("payment_fee =", value, "paymentFee");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeNotEqualTo(BigDecimal value) {
            addCriterion("payment_fee <>", value, "paymentFee");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeGreaterThan(BigDecimal value) {
            addCriterion("payment_fee >", value, "paymentFee");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payment_fee >=", value, "paymentFee");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeLessThan(BigDecimal value) {
            addCriterion("payment_fee <", value, "paymentFee");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payment_fee <=", value, "paymentFee");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeIn(List<BigDecimal> values) {
            addCriterion("payment_fee in", values, "paymentFee");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeNotIn(List<BigDecimal> values) {
            addCriterion("payment_fee not in", values, "paymentFee");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payment_fee between", value1, value2, "paymentFee");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payment_fee not between", value1, value2, "paymentFee");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeTypeIsNull() {
            addCriterion("payment_fee_type is null");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeTypeIsNotNull() {
            addCriterion("payment_fee_type is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeTypeEqualTo(Integer value) {
            addCriterion("payment_fee_type =", value, "paymentFeeType");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeTypeNotEqualTo(Integer value) {
            addCriterion("payment_fee_type <>", value, "paymentFeeType");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeTypeGreaterThan(Integer value) {
            addCriterion("payment_fee_type >", value, "paymentFeeType");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_fee_type >=", value, "paymentFeeType");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeTypeLessThan(Integer value) {
            addCriterion("payment_fee_type <", value, "paymentFeeType");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("payment_fee_type <=", value, "paymentFeeType");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeTypeIn(List<Integer> values) {
            addCriterion("payment_fee_type in", values, "paymentFeeType");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeTypeNotIn(List<Integer> values) {
            addCriterion("payment_fee_type not in", values, "paymentFeeType");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeTypeBetween(Integer value1, Integer value2) {
            addCriterion("payment_fee_type between", value1, value2, "paymentFeeType");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_fee_type not between", value1, value2, "paymentFeeType");
            return (Criteria) this;
        }

        public Criteria andPaymentProductIdIsNull() {
            addCriterion("payment_product_id is null");
            return (Criteria) this;
        }

        public Criteria andPaymentProductIdIsNotNull() {
            addCriterion("payment_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentProductIdEqualTo(String value) {
            addCriterion("payment_product_id =", value, "paymentProductId");
            return (Criteria) this;
        }

        public Criteria andPaymentProductIdNotEqualTo(String value) {
            addCriterion("payment_product_id <>", value, "paymentProductId");
            return (Criteria) this;
        }

        public Criteria andPaymentProductIdGreaterThan(String value) {
            addCriterion("payment_product_id >", value, "paymentProductId");
            return (Criteria) this;
        }

        public Criteria andPaymentProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("payment_product_id >=", value, "paymentProductId");
            return (Criteria) this;
        }

        public Criteria andPaymentProductIdLessThan(String value) {
            addCriterion("payment_product_id <", value, "paymentProductId");
            return (Criteria) this;
        }

        public Criteria andPaymentProductIdLessThanOrEqualTo(String value) {
            addCriterion("payment_product_id <=", value, "paymentProductId");
            return (Criteria) this;
        }

        public Criteria andPaymentProductIdLike(String value) {
            addCriterion("payment_product_id like", value, "paymentProductId");
            return (Criteria) this;
        }

        public Criteria andPaymentProductIdNotLike(String value) {
            addCriterion("payment_product_id not like", value, "paymentProductId");
            return (Criteria) this;
        }

        public Criteria andPaymentProductIdIn(List<String> values) {
            addCriterion("payment_product_id in", values, "paymentProductId");
            return (Criteria) this;
        }

        public Criteria andPaymentProductIdNotIn(List<String> values) {
            addCriterion("payment_product_id not in", values, "paymentProductId");
            return (Criteria) this;
        }

        public Criteria andPaymentProductIdBetween(String value1, String value2) {
            addCriterion("payment_product_id between", value1, value2, "paymentProductId");
            return (Criteria) this;
        }

        public Criteria andPaymentProductIdNotBetween(String value1, String value2) {
            addCriterion("payment_product_id not between", value1, value2, "paymentProductId");
            return (Criteria) this;
        }

        public Criteria andBargainorKeyIsNull() {
            addCriterion("bargainor_key is null");
            return (Criteria) this;
        }

        public Criteria andBargainorKeyIsNotNull() {
            addCriterion("bargainor_key is not null");
            return (Criteria) this;
        }

        public Criteria andBargainorKeyEqualTo(String value) {
            addCriterion("bargainor_key =", value, "bargainorKey");
            return (Criteria) this;
        }

        public Criteria andBargainorKeyNotEqualTo(String value) {
            addCriterion("bargainor_key <>", value, "bargainorKey");
            return (Criteria) this;
        }

        public Criteria andBargainorKeyGreaterThan(String value) {
            addCriterion("bargainor_key >", value, "bargainorKey");
            return (Criteria) this;
        }

        public Criteria andBargainorKeyGreaterThanOrEqualTo(String value) {
            addCriterion("bargainor_key >=", value, "bargainorKey");
            return (Criteria) this;
        }

        public Criteria andBargainorKeyLessThan(String value) {
            addCriterion("bargainor_key <", value, "bargainorKey");
            return (Criteria) this;
        }

        public Criteria andBargainorKeyLessThanOrEqualTo(String value) {
            addCriterion("bargainor_key <=", value, "bargainorKey");
            return (Criteria) this;
        }

        public Criteria andBargainorKeyLike(String value) {
            addCriterion("bargainor_key like", value, "bargainorKey");
            return (Criteria) this;
        }

        public Criteria andBargainorKeyNotLike(String value) {
            addCriterion("bargainor_key not like", value, "bargainorKey");
            return (Criteria) this;
        }

        public Criteria andBargainorKeyIn(List<String> values) {
            addCriterion("bargainor_key in", values, "bargainorKey");
            return (Criteria) this;
        }

        public Criteria andBargainorKeyNotIn(List<String> values) {
            addCriterion("bargainor_key not in", values, "bargainorKey");
            return (Criteria) this;
        }

        public Criteria andBargainorKeyBetween(String value1, String value2) {
            addCriterion("bargainor_key between", value1, value2, "bargainorKey");
            return (Criteria) this;
        }

        public Criteria andBargainorKeyNotBetween(String value1, String value2) {
            addCriterion("bargainor_key not between", value1, value2, "bargainorKey");
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