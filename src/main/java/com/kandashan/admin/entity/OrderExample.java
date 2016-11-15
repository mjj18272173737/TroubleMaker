package com.kandashan.admin.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andDeliveryFeeIsNull() {
            addCriterion("delivery_fee is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeIsNotNull() {
            addCriterion("delivery_fee is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeEqualTo(BigDecimal value) {
            addCriterion("delivery_fee =", value, "deliveryFee");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeNotEqualTo(BigDecimal value) {
            addCriterion("delivery_fee <>", value, "deliveryFee");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeGreaterThan(BigDecimal value) {
            addCriterion("delivery_fee >", value, "deliveryFee");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("delivery_fee >=", value, "deliveryFee");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeLessThan(BigDecimal value) {
            addCriterion("delivery_fee <", value, "deliveryFee");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("delivery_fee <=", value, "deliveryFee");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeIn(List<BigDecimal> values) {
            addCriterion("delivery_fee in", values, "deliveryFee");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeNotIn(List<BigDecimal> values) {
            addCriterion("delivery_fee not in", values, "deliveryFee");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("delivery_fee between", value1, value2, "deliveryFee");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("delivery_fee not between", value1, value2, "deliveryFee");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNameIsNull() {
            addCriterion("delivery_type_name is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNameIsNotNull() {
            addCriterion("delivery_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNameEqualTo(String value) {
            addCriterion("delivery_type_name =", value, "deliveryTypeName");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNameNotEqualTo(String value) {
            addCriterion("delivery_type_name <>", value, "deliveryTypeName");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNameGreaterThan(String value) {
            addCriterion("delivery_type_name >", value, "deliveryTypeName");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_type_name >=", value, "deliveryTypeName");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNameLessThan(String value) {
            addCriterion("delivery_type_name <", value, "deliveryTypeName");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNameLessThanOrEqualTo(String value) {
            addCriterion("delivery_type_name <=", value, "deliveryTypeName");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNameLike(String value) {
            addCriterion("delivery_type_name like", value, "deliveryTypeName");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNameNotLike(String value) {
            addCriterion("delivery_type_name not like", value, "deliveryTypeName");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNameIn(List<String> values) {
            addCriterion("delivery_type_name in", values, "deliveryTypeName");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNameNotIn(List<String> values) {
            addCriterion("delivery_type_name not in", values, "deliveryTypeName");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNameBetween(String value1, String value2) {
            addCriterion("delivery_type_name between", value1, value2, "deliveryTypeName");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNameNotBetween(String value1, String value2) {
            addCriterion("delivery_type_name not between", value1, value2, "deliveryTypeName");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNull() {
            addCriterion("order_sn is null");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNotNull() {
            addCriterion("order_sn is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSnEqualTo(String value) {
            addCriterion("order_sn =", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotEqualTo(String value) {
            addCriterion("order_sn <>", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThan(String value) {
            addCriterion("order_sn >", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThanOrEqualTo(String value) {
            addCriterion("order_sn >=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThan(String value) {
            addCriterion("order_sn <", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThanOrEqualTo(String value) {
            addCriterion("order_sn <=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLike(String value) {
            addCriterion("order_sn like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotLike(String value) {
            addCriterion("order_sn not like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnIn(List<String> values) {
            addCriterion("order_sn in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotIn(List<String> values) {
            addCriterion("order_sn not in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnBetween(String value1, String value2) {
            addCriterion("order_sn between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotBetween(String value1, String value2) {
            addCriterion("order_sn not between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andPaidAmountIsNull() {
            addCriterion("paid_amount is null");
            return (Criteria) this;
        }

        public Criteria andPaidAmountIsNotNull() {
            addCriterion("paid_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPaidAmountEqualTo(BigDecimal value) {
            addCriterion("paid_amount =", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountNotEqualTo(BigDecimal value) {
            addCriterion("paid_amount <>", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountGreaterThan(BigDecimal value) {
            addCriterion("paid_amount >", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("paid_amount >=", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountLessThan(BigDecimal value) {
            addCriterion("paid_amount <", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("paid_amount <=", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountIn(List<BigDecimal> values) {
            addCriterion("paid_amount in", values, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountNotIn(List<BigDecimal> values) {
            addCriterion("paid_amount not in", values, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paid_amount between", value1, value2, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paid_amount not between", value1, value2, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigNameIsNull() {
            addCriterion("payment_config_name is null");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigNameIsNotNull() {
            addCriterion("payment_config_name is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigNameEqualTo(String value) {
            addCriterion("payment_config_name =", value, "paymentConfigName");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigNameNotEqualTo(String value) {
            addCriterion("payment_config_name <>", value, "paymentConfigName");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigNameGreaterThan(String value) {
            addCriterion("payment_config_name >", value, "paymentConfigName");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigNameGreaterThanOrEqualTo(String value) {
            addCriterion("payment_config_name >=", value, "paymentConfigName");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigNameLessThan(String value) {
            addCriterion("payment_config_name <", value, "paymentConfigName");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigNameLessThanOrEqualTo(String value) {
            addCriterion("payment_config_name <=", value, "paymentConfigName");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigNameLike(String value) {
            addCriterion("payment_config_name like", value, "paymentConfigName");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigNameNotLike(String value) {
            addCriterion("payment_config_name not like", value, "paymentConfigName");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigNameIn(List<String> values) {
            addCriterion("payment_config_name in", values, "paymentConfigName");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigNameNotIn(List<String> values) {
            addCriterion("payment_config_name not in", values, "paymentConfigName");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigNameBetween(String value1, String value2) {
            addCriterion("payment_config_name between", value1, value2, "paymentConfigName");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigNameNotBetween(String value1, String value2) {
            addCriterion("payment_config_name not between", value1, value2, "paymentConfigName");
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

        public Criteria andPaymentStatusIsNull() {
            addCriterion("payment_status is null");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIsNotNull() {
            addCriterion("payment_status is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusEqualTo(Integer value) {
            addCriterion("payment_status =", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotEqualTo(Integer value) {
            addCriterion("payment_status <>", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusGreaterThan(Integer value) {
            addCriterion("payment_status >", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_status >=", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLessThan(Integer value) {
            addCriterion("payment_status <", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLessThanOrEqualTo(Integer value) {
            addCriterion("payment_status <=", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIn(List<Integer> values) {
            addCriterion("payment_status in", values, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotIn(List<Integer> values) {
            addCriterion("payment_status not in", values, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusBetween(Integer value1, Integer value2) {
            addCriterion("payment_status between", value1, value2, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_status not between", value1, value2, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andProductTotalPriceIsNull() {
            addCriterion("product_total_price is null");
            return (Criteria) this;
        }

        public Criteria andProductTotalPriceIsNotNull() {
            addCriterion("product_total_price is not null");
            return (Criteria) this;
        }

        public Criteria andProductTotalPriceEqualTo(BigDecimal value) {
            addCriterion("product_total_price =", value, "productTotalPrice");
            return (Criteria) this;
        }

        public Criteria andProductTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("product_total_price <>", value, "productTotalPrice");
            return (Criteria) this;
        }

        public Criteria andProductTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("product_total_price >", value, "productTotalPrice");
            return (Criteria) this;
        }

        public Criteria andProductTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("product_total_price >=", value, "productTotalPrice");
            return (Criteria) this;
        }

        public Criteria andProductTotalPriceLessThan(BigDecimal value) {
            addCriterion("product_total_price <", value, "productTotalPrice");
            return (Criteria) this;
        }

        public Criteria andProductTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("product_total_price <=", value, "productTotalPrice");
            return (Criteria) this;
        }

        public Criteria andProductTotalPriceIn(List<BigDecimal> values) {
            addCriterion("product_total_price in", values, "productTotalPrice");
            return (Criteria) this;
        }

        public Criteria andProductTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("product_total_price not in", values, "productTotalPrice");
            return (Criteria) this;
        }

        public Criteria andProductTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("product_total_price between", value1, value2, "productTotalPrice");
            return (Criteria) this;
        }

        public Criteria andProductTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("product_total_price not between", value1, value2, "productTotalPrice");
            return (Criteria) this;
        }

        public Criteria andProductTotalQuantityIsNull() {
            addCriterion("product_total_quantity is null");
            return (Criteria) this;
        }

        public Criteria andProductTotalQuantityIsNotNull() {
            addCriterion("product_total_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andProductTotalQuantityEqualTo(Integer value) {
            addCriterion("product_total_quantity =", value, "productTotalQuantity");
            return (Criteria) this;
        }

        public Criteria andProductTotalQuantityNotEqualTo(Integer value) {
            addCriterion("product_total_quantity <>", value, "productTotalQuantity");
            return (Criteria) this;
        }

        public Criteria andProductTotalQuantityGreaterThan(Integer value) {
            addCriterion("product_total_quantity >", value, "productTotalQuantity");
            return (Criteria) this;
        }

        public Criteria andProductTotalQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_total_quantity >=", value, "productTotalQuantity");
            return (Criteria) this;
        }

        public Criteria andProductTotalQuantityLessThan(Integer value) {
            addCriterion("product_total_quantity <", value, "productTotalQuantity");
            return (Criteria) this;
        }

        public Criteria andProductTotalQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("product_total_quantity <=", value, "productTotalQuantity");
            return (Criteria) this;
        }

        public Criteria andProductTotalQuantityIn(List<Integer> values) {
            addCriterion("product_total_quantity in", values, "productTotalQuantity");
            return (Criteria) this;
        }

        public Criteria andProductTotalQuantityNotIn(List<Integer> values) {
            addCriterion("product_total_quantity not in", values, "productTotalQuantity");
            return (Criteria) this;
        }

        public Criteria andProductTotalQuantityBetween(Integer value1, Integer value2) {
            addCriterion("product_total_quantity between", value1, value2, "productTotalQuantity");
            return (Criteria) this;
        }

        public Criteria andProductTotalQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("product_total_quantity not between", value1, value2, "productTotalQuantity");
            return (Criteria) this;
        }

        public Criteria andProductWeightIsNull() {
            addCriterion("product_weight is null");
            return (Criteria) this;
        }

        public Criteria andProductWeightIsNotNull() {
            addCriterion("product_weight is not null");
            return (Criteria) this;
        }

        public Criteria andProductWeightEqualTo(Double value) {
            addCriterion("product_weight =", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotEqualTo(Double value) {
            addCriterion("product_weight <>", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightGreaterThan(Double value) {
            addCriterion("product_weight >", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("product_weight >=", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightLessThan(Double value) {
            addCriterion("product_weight <", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightLessThanOrEqualTo(Double value) {
            addCriterion("product_weight <=", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightIn(List<Double> values) {
            addCriterion("product_weight in", values, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotIn(List<Double> values) {
            addCriterion("product_weight not in", values, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightBetween(Double value1, Double value2) {
            addCriterion("product_weight between", value1, value2, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotBetween(Double value1, Double value2) {
            addCriterion("product_weight not between", value1, value2, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightUnitIsNull() {
            addCriterion("product_weight_unit is null");
            return (Criteria) this;
        }

        public Criteria andProductWeightUnitIsNotNull() {
            addCriterion("product_weight_unit is not null");
            return (Criteria) this;
        }

        public Criteria andProductWeightUnitEqualTo(Integer value) {
            addCriterion("product_weight_unit =", value, "productWeightUnit");
            return (Criteria) this;
        }

        public Criteria andProductWeightUnitNotEqualTo(Integer value) {
            addCriterion("product_weight_unit <>", value, "productWeightUnit");
            return (Criteria) this;
        }

        public Criteria andProductWeightUnitGreaterThan(Integer value) {
            addCriterion("product_weight_unit >", value, "productWeightUnit");
            return (Criteria) this;
        }

        public Criteria andProductWeightUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_weight_unit >=", value, "productWeightUnit");
            return (Criteria) this;
        }

        public Criteria andProductWeightUnitLessThan(Integer value) {
            addCriterion("product_weight_unit <", value, "productWeightUnit");
            return (Criteria) this;
        }

        public Criteria andProductWeightUnitLessThanOrEqualTo(Integer value) {
            addCriterion("product_weight_unit <=", value, "productWeightUnit");
            return (Criteria) this;
        }

        public Criteria andProductWeightUnitIn(List<Integer> values) {
            addCriterion("product_weight_unit in", values, "productWeightUnit");
            return (Criteria) this;
        }

        public Criteria andProductWeightUnitNotIn(List<Integer> values) {
            addCriterion("product_weight_unit not in", values, "productWeightUnit");
            return (Criteria) this;
        }

        public Criteria andProductWeightUnitBetween(Integer value1, Integer value2) {
            addCriterion("product_weight_unit between", value1, value2, "productWeightUnit");
            return (Criteria) this;
        }

        public Criteria andProductWeightUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("product_weight_unit not between", value1, value2, "productWeightUnit");
            return (Criteria) this;
        }

        public Criteria andShipAddressIsNull() {
            addCriterion("ship_address is null");
            return (Criteria) this;
        }

        public Criteria andShipAddressIsNotNull() {
            addCriterion("ship_address is not null");
            return (Criteria) this;
        }

        public Criteria andShipAddressEqualTo(String value) {
            addCriterion("ship_address =", value, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipAddressNotEqualTo(String value) {
            addCriterion("ship_address <>", value, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipAddressGreaterThan(String value) {
            addCriterion("ship_address >", value, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ship_address >=", value, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipAddressLessThan(String value) {
            addCriterion("ship_address <", value, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipAddressLessThanOrEqualTo(String value) {
            addCriterion("ship_address <=", value, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipAddressLike(String value) {
            addCriterion("ship_address like", value, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipAddressNotLike(String value) {
            addCriterion("ship_address not like", value, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipAddressIn(List<String> values) {
            addCriterion("ship_address in", values, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipAddressNotIn(List<String> values) {
            addCriterion("ship_address not in", values, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipAddressBetween(String value1, String value2) {
            addCriterion("ship_address between", value1, value2, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipAddressNotBetween(String value1, String value2) {
            addCriterion("ship_address not between", value1, value2, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipAreaIsNull() {
            addCriterion("ship_area is null");
            return (Criteria) this;
        }

        public Criteria andShipAreaIsNotNull() {
            addCriterion("ship_area is not null");
            return (Criteria) this;
        }

        public Criteria andShipAreaEqualTo(String value) {
            addCriterion("ship_area =", value, "shipArea");
            return (Criteria) this;
        }

        public Criteria andShipAreaNotEqualTo(String value) {
            addCriterion("ship_area <>", value, "shipArea");
            return (Criteria) this;
        }

        public Criteria andShipAreaGreaterThan(String value) {
            addCriterion("ship_area >", value, "shipArea");
            return (Criteria) this;
        }

        public Criteria andShipAreaGreaterThanOrEqualTo(String value) {
            addCriterion("ship_area >=", value, "shipArea");
            return (Criteria) this;
        }

        public Criteria andShipAreaLessThan(String value) {
            addCriterion("ship_area <", value, "shipArea");
            return (Criteria) this;
        }

        public Criteria andShipAreaLessThanOrEqualTo(String value) {
            addCriterion("ship_area <=", value, "shipArea");
            return (Criteria) this;
        }

        public Criteria andShipAreaLike(String value) {
            addCriterion("ship_area like", value, "shipArea");
            return (Criteria) this;
        }

        public Criteria andShipAreaNotLike(String value) {
            addCriterion("ship_area not like", value, "shipArea");
            return (Criteria) this;
        }

        public Criteria andShipAreaIn(List<String> values) {
            addCriterion("ship_area in", values, "shipArea");
            return (Criteria) this;
        }

        public Criteria andShipAreaNotIn(List<String> values) {
            addCriterion("ship_area not in", values, "shipArea");
            return (Criteria) this;
        }

        public Criteria andShipAreaBetween(String value1, String value2) {
            addCriterion("ship_area between", value1, value2, "shipArea");
            return (Criteria) this;
        }

        public Criteria andShipAreaNotBetween(String value1, String value2) {
            addCriterion("ship_area not between", value1, value2, "shipArea");
            return (Criteria) this;
        }

        public Criteria andShipAreaPathIsNull() {
            addCriterion("ship_area_path is null");
            return (Criteria) this;
        }

        public Criteria andShipAreaPathIsNotNull() {
            addCriterion("ship_area_path is not null");
            return (Criteria) this;
        }

        public Criteria andShipAreaPathEqualTo(String value) {
            addCriterion("ship_area_path =", value, "shipAreaPath");
            return (Criteria) this;
        }

        public Criteria andShipAreaPathNotEqualTo(String value) {
            addCriterion("ship_area_path <>", value, "shipAreaPath");
            return (Criteria) this;
        }

        public Criteria andShipAreaPathGreaterThan(String value) {
            addCriterion("ship_area_path >", value, "shipAreaPath");
            return (Criteria) this;
        }

        public Criteria andShipAreaPathGreaterThanOrEqualTo(String value) {
            addCriterion("ship_area_path >=", value, "shipAreaPath");
            return (Criteria) this;
        }

        public Criteria andShipAreaPathLessThan(String value) {
            addCriterion("ship_area_path <", value, "shipAreaPath");
            return (Criteria) this;
        }

        public Criteria andShipAreaPathLessThanOrEqualTo(String value) {
            addCriterion("ship_area_path <=", value, "shipAreaPath");
            return (Criteria) this;
        }

        public Criteria andShipAreaPathLike(String value) {
            addCriterion("ship_area_path like", value, "shipAreaPath");
            return (Criteria) this;
        }

        public Criteria andShipAreaPathNotLike(String value) {
            addCriterion("ship_area_path not like", value, "shipAreaPath");
            return (Criteria) this;
        }

        public Criteria andShipAreaPathIn(List<String> values) {
            addCriterion("ship_area_path in", values, "shipAreaPath");
            return (Criteria) this;
        }

        public Criteria andShipAreaPathNotIn(List<String> values) {
            addCriterion("ship_area_path not in", values, "shipAreaPath");
            return (Criteria) this;
        }

        public Criteria andShipAreaPathBetween(String value1, String value2) {
            addCriterion("ship_area_path between", value1, value2, "shipAreaPath");
            return (Criteria) this;
        }

        public Criteria andShipAreaPathNotBetween(String value1, String value2) {
            addCriterion("ship_area_path not between", value1, value2, "shipAreaPath");
            return (Criteria) this;
        }

        public Criteria andShipMobileIsNull() {
            addCriterion("ship_mobile is null");
            return (Criteria) this;
        }

        public Criteria andShipMobileIsNotNull() {
            addCriterion("ship_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andShipMobileEqualTo(String value) {
            addCriterion("ship_mobile =", value, "shipMobile");
            return (Criteria) this;
        }

        public Criteria andShipMobileNotEqualTo(String value) {
            addCriterion("ship_mobile <>", value, "shipMobile");
            return (Criteria) this;
        }

        public Criteria andShipMobileGreaterThan(String value) {
            addCriterion("ship_mobile >", value, "shipMobile");
            return (Criteria) this;
        }

        public Criteria andShipMobileGreaterThanOrEqualTo(String value) {
            addCriterion("ship_mobile >=", value, "shipMobile");
            return (Criteria) this;
        }

        public Criteria andShipMobileLessThan(String value) {
            addCriterion("ship_mobile <", value, "shipMobile");
            return (Criteria) this;
        }

        public Criteria andShipMobileLessThanOrEqualTo(String value) {
            addCriterion("ship_mobile <=", value, "shipMobile");
            return (Criteria) this;
        }

        public Criteria andShipMobileLike(String value) {
            addCriterion("ship_mobile like", value, "shipMobile");
            return (Criteria) this;
        }

        public Criteria andShipMobileNotLike(String value) {
            addCriterion("ship_mobile not like", value, "shipMobile");
            return (Criteria) this;
        }

        public Criteria andShipMobileIn(List<String> values) {
            addCriterion("ship_mobile in", values, "shipMobile");
            return (Criteria) this;
        }

        public Criteria andShipMobileNotIn(List<String> values) {
            addCriterion("ship_mobile not in", values, "shipMobile");
            return (Criteria) this;
        }

        public Criteria andShipMobileBetween(String value1, String value2) {
            addCriterion("ship_mobile between", value1, value2, "shipMobile");
            return (Criteria) this;
        }

        public Criteria andShipMobileNotBetween(String value1, String value2) {
            addCriterion("ship_mobile not between", value1, value2, "shipMobile");
            return (Criteria) this;
        }

        public Criteria andShipNameIsNull() {
            addCriterion("ship_name is null");
            return (Criteria) this;
        }

        public Criteria andShipNameIsNotNull() {
            addCriterion("ship_name is not null");
            return (Criteria) this;
        }

        public Criteria andShipNameEqualTo(String value) {
            addCriterion("ship_name =", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotEqualTo(String value) {
            addCriterion("ship_name <>", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameGreaterThan(String value) {
            addCriterion("ship_name >", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameGreaterThanOrEqualTo(String value) {
            addCriterion("ship_name >=", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLessThan(String value) {
            addCriterion("ship_name <", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLessThanOrEqualTo(String value) {
            addCriterion("ship_name <=", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLike(String value) {
            addCriterion("ship_name like", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotLike(String value) {
            addCriterion("ship_name not like", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameIn(List<String> values) {
            addCriterion("ship_name in", values, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotIn(List<String> values) {
            addCriterion("ship_name not in", values, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameBetween(String value1, String value2) {
            addCriterion("ship_name between", value1, value2, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotBetween(String value1, String value2) {
            addCriterion("ship_name not between", value1, value2, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipPhoneIsNull() {
            addCriterion("ship_phone is null");
            return (Criteria) this;
        }

        public Criteria andShipPhoneIsNotNull() {
            addCriterion("ship_phone is not null");
            return (Criteria) this;
        }

        public Criteria andShipPhoneEqualTo(String value) {
            addCriterion("ship_phone =", value, "shipPhone");
            return (Criteria) this;
        }

        public Criteria andShipPhoneNotEqualTo(String value) {
            addCriterion("ship_phone <>", value, "shipPhone");
            return (Criteria) this;
        }

        public Criteria andShipPhoneGreaterThan(String value) {
            addCriterion("ship_phone >", value, "shipPhone");
            return (Criteria) this;
        }

        public Criteria andShipPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("ship_phone >=", value, "shipPhone");
            return (Criteria) this;
        }

        public Criteria andShipPhoneLessThan(String value) {
            addCriterion("ship_phone <", value, "shipPhone");
            return (Criteria) this;
        }

        public Criteria andShipPhoneLessThanOrEqualTo(String value) {
            addCriterion("ship_phone <=", value, "shipPhone");
            return (Criteria) this;
        }

        public Criteria andShipPhoneLike(String value) {
            addCriterion("ship_phone like", value, "shipPhone");
            return (Criteria) this;
        }

        public Criteria andShipPhoneNotLike(String value) {
            addCriterion("ship_phone not like", value, "shipPhone");
            return (Criteria) this;
        }

        public Criteria andShipPhoneIn(List<String> values) {
            addCriterion("ship_phone in", values, "shipPhone");
            return (Criteria) this;
        }

        public Criteria andShipPhoneNotIn(List<String> values) {
            addCriterion("ship_phone not in", values, "shipPhone");
            return (Criteria) this;
        }

        public Criteria andShipPhoneBetween(String value1, String value2) {
            addCriterion("ship_phone between", value1, value2, "shipPhone");
            return (Criteria) this;
        }

        public Criteria andShipPhoneNotBetween(String value1, String value2) {
            addCriterion("ship_phone not between", value1, value2, "shipPhone");
            return (Criteria) this;
        }

        public Criteria andShipZipCodeIsNull() {
            addCriterion("ship_zip_code is null");
            return (Criteria) this;
        }

        public Criteria andShipZipCodeIsNotNull() {
            addCriterion("ship_zip_code is not null");
            return (Criteria) this;
        }

        public Criteria andShipZipCodeEqualTo(String value) {
            addCriterion("ship_zip_code =", value, "shipZipCode");
            return (Criteria) this;
        }

        public Criteria andShipZipCodeNotEqualTo(String value) {
            addCriterion("ship_zip_code <>", value, "shipZipCode");
            return (Criteria) this;
        }

        public Criteria andShipZipCodeGreaterThan(String value) {
            addCriterion("ship_zip_code >", value, "shipZipCode");
            return (Criteria) this;
        }

        public Criteria andShipZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ship_zip_code >=", value, "shipZipCode");
            return (Criteria) this;
        }

        public Criteria andShipZipCodeLessThan(String value) {
            addCriterion("ship_zip_code <", value, "shipZipCode");
            return (Criteria) this;
        }

        public Criteria andShipZipCodeLessThanOrEqualTo(String value) {
            addCriterion("ship_zip_code <=", value, "shipZipCode");
            return (Criteria) this;
        }

        public Criteria andShipZipCodeLike(String value) {
            addCriterion("ship_zip_code like", value, "shipZipCode");
            return (Criteria) this;
        }

        public Criteria andShipZipCodeNotLike(String value) {
            addCriterion("ship_zip_code not like", value, "shipZipCode");
            return (Criteria) this;
        }

        public Criteria andShipZipCodeIn(List<String> values) {
            addCriterion("ship_zip_code in", values, "shipZipCode");
            return (Criteria) this;
        }

        public Criteria andShipZipCodeNotIn(List<String> values) {
            addCriterion("ship_zip_code not in", values, "shipZipCode");
            return (Criteria) this;
        }

        public Criteria andShipZipCodeBetween(String value1, String value2) {
            addCriterion("ship_zip_code between", value1, value2, "shipZipCode");
            return (Criteria) this;
        }

        public Criteria andShipZipCodeNotBetween(String value1, String value2) {
            addCriterion("ship_zip_code not between", value1, value2, "shipZipCode");
            return (Criteria) this;
        }

        public Criteria andShippingStatusIsNull() {
            addCriterion("shipping_status is null");
            return (Criteria) this;
        }

        public Criteria andShippingStatusIsNotNull() {
            addCriterion("shipping_status is not null");
            return (Criteria) this;
        }

        public Criteria andShippingStatusEqualTo(Integer value) {
            addCriterion("shipping_status =", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusNotEqualTo(Integer value) {
            addCriterion("shipping_status <>", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusGreaterThan(Integer value) {
            addCriterion("shipping_status >", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("shipping_status >=", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusLessThan(Integer value) {
            addCriterion("shipping_status <", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusLessThanOrEqualTo(Integer value) {
            addCriterion("shipping_status <=", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusIn(List<Integer> values) {
            addCriterion("shipping_status in", values, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusNotIn(List<Integer> values) {
            addCriterion("shipping_status not in", values, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusBetween(Integer value1, Integer value2) {
            addCriterion("shipping_status between", value1, value2, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("shipping_status not between", value1, value2, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(BigDecimal value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(BigDecimal value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<BigDecimal> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
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

        public Criteria andDeliveryTypeIdIsNull() {
            addCriterion("delivery_type_id is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIdIsNotNull() {
            addCriterion("delivery_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIdEqualTo(String value) {
            addCriterion("delivery_type_id =", value, "deliveryTypeId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIdNotEqualTo(String value) {
            addCriterion("delivery_type_id <>", value, "deliveryTypeId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIdGreaterThan(String value) {
            addCriterion("delivery_type_id >", value, "deliveryTypeId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_type_id >=", value, "deliveryTypeId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIdLessThan(String value) {
            addCriterion("delivery_type_id <", value, "deliveryTypeId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIdLessThanOrEqualTo(String value) {
            addCriterion("delivery_type_id <=", value, "deliveryTypeId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIdLike(String value) {
            addCriterion("delivery_type_id like", value, "deliveryTypeId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIdNotLike(String value) {
            addCriterion("delivery_type_id not like", value, "deliveryTypeId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIdIn(List<String> values) {
            addCriterion("delivery_type_id in", values, "deliveryTypeId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIdNotIn(List<String> values) {
            addCriterion("delivery_type_id not in", values, "deliveryTypeId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIdBetween(String value1, String value2) {
            addCriterion("delivery_type_id between", value1, value2, "deliveryTypeId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIdNotBetween(String value1, String value2) {
            addCriterion("delivery_type_id not between", value1, value2, "deliveryTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigIdIsNull() {
            addCriterion("payment_config_id is null");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigIdIsNotNull() {
            addCriterion("payment_config_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigIdEqualTo(String value) {
            addCriterion("payment_config_id =", value, "paymentConfigId");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigIdNotEqualTo(String value) {
            addCriterion("payment_config_id <>", value, "paymentConfigId");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigIdGreaterThan(String value) {
            addCriterion("payment_config_id >", value, "paymentConfigId");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigIdGreaterThanOrEqualTo(String value) {
            addCriterion("payment_config_id >=", value, "paymentConfigId");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigIdLessThan(String value) {
            addCriterion("payment_config_id <", value, "paymentConfigId");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigIdLessThanOrEqualTo(String value) {
            addCriterion("payment_config_id <=", value, "paymentConfigId");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigIdLike(String value) {
            addCriterion("payment_config_id like", value, "paymentConfigId");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigIdNotLike(String value) {
            addCriterion("payment_config_id not like", value, "paymentConfigId");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigIdIn(List<String> values) {
            addCriterion("payment_config_id in", values, "paymentConfigId");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigIdNotIn(List<String> values) {
            addCriterion("payment_config_id not in", values, "paymentConfigId");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigIdBetween(String value1, String value2) {
            addCriterion("payment_config_id between", value1, value2, "paymentConfigId");
            return (Criteria) this;
        }

        public Criteria andPaymentConfigIdNotBetween(String value1, String value2) {
            addCriterion("payment_config_id not between", value1, value2, "paymentConfigId");
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