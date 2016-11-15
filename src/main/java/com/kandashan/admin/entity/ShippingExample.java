package com.kandashan.admin.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShippingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShippingExample() {
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

        public Criteria andDeliveryCorpNameIsNull() {
            addCriterion("delivery_corp_name is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryCorpNameIsNotNull() {
            addCriterion("delivery_corp_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryCorpNameEqualTo(String value) {
            addCriterion("delivery_corp_name =", value, "deliveryCorpName");
            return (Criteria) this;
        }

        public Criteria andDeliveryCorpNameNotEqualTo(String value) {
            addCriterion("delivery_corp_name <>", value, "deliveryCorpName");
            return (Criteria) this;
        }

        public Criteria andDeliveryCorpNameGreaterThan(String value) {
            addCriterion("delivery_corp_name >", value, "deliveryCorpName");
            return (Criteria) this;
        }

        public Criteria andDeliveryCorpNameGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_corp_name >=", value, "deliveryCorpName");
            return (Criteria) this;
        }

        public Criteria andDeliveryCorpNameLessThan(String value) {
            addCriterion("delivery_corp_name <", value, "deliveryCorpName");
            return (Criteria) this;
        }

        public Criteria andDeliveryCorpNameLessThanOrEqualTo(String value) {
            addCriterion("delivery_corp_name <=", value, "deliveryCorpName");
            return (Criteria) this;
        }

        public Criteria andDeliveryCorpNameLike(String value) {
            addCriterion("delivery_corp_name like", value, "deliveryCorpName");
            return (Criteria) this;
        }

        public Criteria andDeliveryCorpNameNotLike(String value) {
            addCriterion("delivery_corp_name not like", value, "deliveryCorpName");
            return (Criteria) this;
        }

        public Criteria andDeliveryCorpNameIn(List<String> values) {
            addCriterion("delivery_corp_name in", values, "deliveryCorpName");
            return (Criteria) this;
        }

        public Criteria andDeliveryCorpNameNotIn(List<String> values) {
            addCriterion("delivery_corp_name not in", values, "deliveryCorpName");
            return (Criteria) this;
        }

        public Criteria andDeliveryCorpNameBetween(String value1, String value2) {
            addCriterion("delivery_corp_name between", value1, value2, "deliveryCorpName");
            return (Criteria) this;
        }

        public Criteria andDeliveryCorpNameNotBetween(String value1, String value2) {
            addCriterion("delivery_corp_name not between", value1, value2, "deliveryCorpName");
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

        public Criteria andDeliverySnIsNull() {
            addCriterion("delivery_sn is null");
            return (Criteria) this;
        }

        public Criteria andDeliverySnIsNotNull() {
            addCriterion("delivery_sn is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverySnEqualTo(String value) {
            addCriterion("delivery_sn =", value, "deliverySn");
            return (Criteria) this;
        }

        public Criteria andDeliverySnNotEqualTo(String value) {
            addCriterion("delivery_sn <>", value, "deliverySn");
            return (Criteria) this;
        }

        public Criteria andDeliverySnGreaterThan(String value) {
            addCriterion("delivery_sn >", value, "deliverySn");
            return (Criteria) this;
        }

        public Criteria andDeliverySnGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_sn >=", value, "deliverySn");
            return (Criteria) this;
        }

        public Criteria andDeliverySnLessThan(String value) {
            addCriterion("delivery_sn <", value, "deliverySn");
            return (Criteria) this;
        }

        public Criteria andDeliverySnLessThanOrEqualTo(String value) {
            addCriterion("delivery_sn <=", value, "deliverySn");
            return (Criteria) this;
        }

        public Criteria andDeliverySnLike(String value) {
            addCriterion("delivery_sn like", value, "deliverySn");
            return (Criteria) this;
        }

        public Criteria andDeliverySnNotLike(String value) {
            addCriterion("delivery_sn not like", value, "deliverySn");
            return (Criteria) this;
        }

        public Criteria andDeliverySnIn(List<String> values) {
            addCriterion("delivery_sn in", values, "deliverySn");
            return (Criteria) this;
        }

        public Criteria andDeliverySnNotIn(List<String> values) {
            addCriterion("delivery_sn not in", values, "deliverySn");
            return (Criteria) this;
        }

        public Criteria andDeliverySnBetween(String value1, String value2) {
            addCriterion("delivery_sn between", value1, value2, "deliverySn");
            return (Criteria) this;
        }

        public Criteria andDeliverySnNotBetween(String value1, String value2) {
            addCriterion("delivery_sn not between", value1, value2, "deliverySn");
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

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
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

        public Criteria andShippingSnIsNull() {
            addCriterion("shipping_sn is null");
            return (Criteria) this;
        }

        public Criteria andShippingSnIsNotNull() {
            addCriterion("shipping_sn is not null");
            return (Criteria) this;
        }

        public Criteria andShippingSnEqualTo(String value) {
            addCriterion("shipping_sn =", value, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andShippingSnNotEqualTo(String value) {
            addCriterion("shipping_sn <>", value, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andShippingSnGreaterThan(String value) {
            addCriterion("shipping_sn >", value, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andShippingSnGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_sn >=", value, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andShippingSnLessThan(String value) {
            addCriterion("shipping_sn <", value, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andShippingSnLessThanOrEqualTo(String value) {
            addCriterion("shipping_sn <=", value, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andShippingSnLike(String value) {
            addCriterion("shipping_sn like", value, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andShippingSnNotLike(String value) {
            addCriterion("shipping_sn not like", value, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andShippingSnIn(List<String> values) {
            addCriterion("shipping_sn in", values, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andShippingSnNotIn(List<String> values) {
            addCriterion("shipping_sn not in", values, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andShippingSnBetween(String value1, String value2) {
            addCriterion("shipping_sn between", value1, value2, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andShippingSnNotBetween(String value1, String value2) {
            addCriterion("shipping_sn not between", value1, value2, "shippingSn");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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