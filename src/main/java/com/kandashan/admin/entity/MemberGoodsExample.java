package com.kandashan.admin.entity;

import java.util.ArrayList;
import java.util.List;

public class MemberGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberGoodsExample() {
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

        public Criteria andFavoriteMemberSetIdIsNull() {
            addCriterion("favorite_member_set_id is null");
            return (Criteria) this;
        }

        public Criteria andFavoriteMemberSetIdIsNotNull() {
            addCriterion("favorite_member_set_id is not null");
            return (Criteria) this;
        }

        public Criteria andFavoriteMemberSetIdEqualTo(String value) {
            addCriterion("favorite_member_set_id =", value, "favoriteMemberSetId");
            return (Criteria) this;
        }

        public Criteria andFavoriteMemberSetIdNotEqualTo(String value) {
            addCriterion("favorite_member_set_id <>", value, "favoriteMemberSetId");
            return (Criteria) this;
        }

        public Criteria andFavoriteMemberSetIdGreaterThan(String value) {
            addCriterion("favorite_member_set_id >", value, "favoriteMemberSetId");
            return (Criteria) this;
        }

        public Criteria andFavoriteMemberSetIdGreaterThanOrEqualTo(String value) {
            addCriterion("favorite_member_set_id >=", value, "favoriteMemberSetId");
            return (Criteria) this;
        }

        public Criteria andFavoriteMemberSetIdLessThan(String value) {
            addCriterion("favorite_member_set_id <", value, "favoriteMemberSetId");
            return (Criteria) this;
        }

        public Criteria andFavoriteMemberSetIdLessThanOrEqualTo(String value) {
            addCriterion("favorite_member_set_id <=", value, "favoriteMemberSetId");
            return (Criteria) this;
        }

        public Criteria andFavoriteMemberSetIdLike(String value) {
            addCriterion("favorite_member_set_id like", value, "favoriteMemberSetId");
            return (Criteria) this;
        }

        public Criteria andFavoriteMemberSetIdNotLike(String value) {
            addCriterion("favorite_member_set_id not like", value, "favoriteMemberSetId");
            return (Criteria) this;
        }

        public Criteria andFavoriteMemberSetIdIn(List<String> values) {
            addCriterion("favorite_member_set_id in", values, "favoriteMemberSetId");
            return (Criteria) this;
        }

        public Criteria andFavoriteMemberSetIdNotIn(List<String> values) {
            addCriterion("favorite_member_set_id not in", values, "favoriteMemberSetId");
            return (Criteria) this;
        }

        public Criteria andFavoriteMemberSetIdBetween(String value1, String value2) {
            addCriterion("favorite_member_set_id between", value1, value2, "favoriteMemberSetId");
            return (Criteria) this;
        }

        public Criteria andFavoriteMemberSetIdNotBetween(String value1, String value2) {
            addCriterion("favorite_member_set_id not between", value1, value2, "favoriteMemberSetId");
            return (Criteria) this;
        }

        public Criteria andFavoriteGoodsSetIdIsNull() {
            addCriterion("favorite_goods_set_id is null");
            return (Criteria) this;
        }

        public Criteria andFavoriteGoodsSetIdIsNotNull() {
            addCriterion("favorite_goods_set_id is not null");
            return (Criteria) this;
        }

        public Criteria andFavoriteGoodsSetIdEqualTo(String value) {
            addCriterion("favorite_goods_set_id =", value, "favoriteGoodsSetId");
            return (Criteria) this;
        }

        public Criteria andFavoriteGoodsSetIdNotEqualTo(String value) {
            addCriterion("favorite_goods_set_id <>", value, "favoriteGoodsSetId");
            return (Criteria) this;
        }

        public Criteria andFavoriteGoodsSetIdGreaterThan(String value) {
            addCriterion("favorite_goods_set_id >", value, "favoriteGoodsSetId");
            return (Criteria) this;
        }

        public Criteria andFavoriteGoodsSetIdGreaterThanOrEqualTo(String value) {
            addCriterion("favorite_goods_set_id >=", value, "favoriteGoodsSetId");
            return (Criteria) this;
        }

        public Criteria andFavoriteGoodsSetIdLessThan(String value) {
            addCriterion("favorite_goods_set_id <", value, "favoriteGoodsSetId");
            return (Criteria) this;
        }

        public Criteria andFavoriteGoodsSetIdLessThanOrEqualTo(String value) {
            addCriterion("favorite_goods_set_id <=", value, "favoriteGoodsSetId");
            return (Criteria) this;
        }

        public Criteria andFavoriteGoodsSetIdLike(String value) {
            addCriterion("favorite_goods_set_id like", value, "favoriteGoodsSetId");
            return (Criteria) this;
        }

        public Criteria andFavoriteGoodsSetIdNotLike(String value) {
            addCriterion("favorite_goods_set_id not like", value, "favoriteGoodsSetId");
            return (Criteria) this;
        }

        public Criteria andFavoriteGoodsSetIdIn(List<String> values) {
            addCriterion("favorite_goods_set_id in", values, "favoriteGoodsSetId");
            return (Criteria) this;
        }

        public Criteria andFavoriteGoodsSetIdNotIn(List<String> values) {
            addCriterion("favorite_goods_set_id not in", values, "favoriteGoodsSetId");
            return (Criteria) this;
        }

        public Criteria andFavoriteGoodsSetIdBetween(String value1, String value2) {
            addCriterion("favorite_goods_set_id between", value1, value2, "favoriteGoodsSetId");
            return (Criteria) this;
        }

        public Criteria andFavoriteGoodsSetIdNotBetween(String value1, String value2) {
            addCriterion("favorite_goods_set_id not between", value1, value2, "favoriteGoodsSetId");
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