package com.kandashan.admin.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andDeleteStatusIsNull() {
            addCriterion("delete_status is null");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIsNotNull() {
            addCriterion("delete_status is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusEqualTo(Integer value) {
            addCriterion("delete_status =", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotEqualTo(Integer value) {
            addCriterion("delete_status <>", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusGreaterThan(Integer value) {
            addCriterion("delete_status >", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("delete_status >=", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusLessThan(Integer value) {
            addCriterion("delete_status <", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusLessThanOrEqualTo(Integer value) {
            addCriterion("delete_status <=", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIn(List<Integer> values) {
            addCriterion("delete_status in", values, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotIn(List<Integer> values) {
            addCriterion("delete_status not in", values, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusBetween(Integer value1, Integer value2) {
            addCriterion("delete_status between", value1, value2, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("delete_status not between", value1, value2, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andIsReadIsNull() {
            addCriterion("is_read is null");
            return (Criteria) this;
        }

        public Criteria andIsReadIsNotNull() {
            addCriterion("is_read is not null");
            return (Criteria) this;
        }

        public Criteria andIsReadEqualTo(Boolean value) {
            addCriterion("is_read =", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadNotEqualTo(Boolean value) {
            addCriterion("is_read <>", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadGreaterThan(Boolean value) {
            addCriterion("is_read >", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_read >=", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadLessThan(Boolean value) {
            addCriterion("is_read <", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadLessThanOrEqualTo(Boolean value) {
            addCriterion("is_read <=", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadIn(List<Boolean> values) {
            addCriterion("is_read in", values, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadNotIn(List<Boolean> values) {
            addCriterion("is_read not in", values, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadBetween(Boolean value1, Boolean value2) {
            addCriterion("is_read between", value1, value2, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_read not between", value1, value2, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsSaveDraftboxIsNull() {
            addCriterion("is_save_draftbox is null");
            return (Criteria) this;
        }

        public Criteria andIsSaveDraftboxIsNotNull() {
            addCriterion("is_save_draftbox is not null");
            return (Criteria) this;
        }

        public Criteria andIsSaveDraftboxEqualTo(Boolean value) {
            addCriterion("is_save_draftbox =", value, "isSaveDraftbox");
            return (Criteria) this;
        }

        public Criteria andIsSaveDraftboxNotEqualTo(Boolean value) {
            addCriterion("is_save_draftbox <>", value, "isSaveDraftbox");
            return (Criteria) this;
        }

        public Criteria andIsSaveDraftboxGreaterThan(Boolean value) {
            addCriterion("is_save_draftbox >", value, "isSaveDraftbox");
            return (Criteria) this;
        }

        public Criteria andIsSaveDraftboxGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_save_draftbox >=", value, "isSaveDraftbox");
            return (Criteria) this;
        }

        public Criteria andIsSaveDraftboxLessThan(Boolean value) {
            addCriterion("is_save_draftbox <", value, "isSaveDraftbox");
            return (Criteria) this;
        }

        public Criteria andIsSaveDraftboxLessThanOrEqualTo(Boolean value) {
            addCriterion("is_save_draftbox <=", value, "isSaveDraftbox");
            return (Criteria) this;
        }

        public Criteria andIsSaveDraftboxIn(List<Boolean> values) {
            addCriterion("is_save_draftbox in", values, "isSaveDraftbox");
            return (Criteria) this;
        }

        public Criteria andIsSaveDraftboxNotIn(List<Boolean> values) {
            addCriterion("is_save_draftbox not in", values, "isSaveDraftbox");
            return (Criteria) this;
        }

        public Criteria andIsSaveDraftboxBetween(Boolean value1, Boolean value2) {
            addCriterion("is_save_draftbox between", value1, value2, "isSaveDraftbox");
            return (Criteria) this;
        }

        public Criteria andIsSaveDraftboxNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_save_draftbox not between", value1, value2, "isSaveDraftbox");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andToMemberIdIsNull() {
            addCriterion("to_member_id is null");
            return (Criteria) this;
        }

        public Criteria andToMemberIdIsNotNull() {
            addCriterion("to_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andToMemberIdEqualTo(String value) {
            addCriterion("to_member_id =", value, "toMemberId");
            return (Criteria) this;
        }

        public Criteria andToMemberIdNotEqualTo(String value) {
            addCriterion("to_member_id <>", value, "toMemberId");
            return (Criteria) this;
        }

        public Criteria andToMemberIdGreaterThan(String value) {
            addCriterion("to_member_id >", value, "toMemberId");
            return (Criteria) this;
        }

        public Criteria andToMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("to_member_id >=", value, "toMemberId");
            return (Criteria) this;
        }

        public Criteria andToMemberIdLessThan(String value) {
            addCriterion("to_member_id <", value, "toMemberId");
            return (Criteria) this;
        }

        public Criteria andToMemberIdLessThanOrEqualTo(String value) {
            addCriterion("to_member_id <=", value, "toMemberId");
            return (Criteria) this;
        }

        public Criteria andToMemberIdLike(String value) {
            addCriterion("to_member_id like", value, "toMemberId");
            return (Criteria) this;
        }

        public Criteria andToMemberIdNotLike(String value) {
            addCriterion("to_member_id not like", value, "toMemberId");
            return (Criteria) this;
        }

        public Criteria andToMemberIdIn(List<String> values) {
            addCriterion("to_member_id in", values, "toMemberId");
            return (Criteria) this;
        }

        public Criteria andToMemberIdNotIn(List<String> values) {
            addCriterion("to_member_id not in", values, "toMemberId");
            return (Criteria) this;
        }

        public Criteria andToMemberIdBetween(String value1, String value2) {
            addCriterion("to_member_id between", value1, value2, "toMemberId");
            return (Criteria) this;
        }

        public Criteria andToMemberIdNotBetween(String value1, String value2) {
            addCriterion("to_member_id not between", value1, value2, "toMemberId");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdIsNull() {
            addCriterion("from_member_id is null");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdIsNotNull() {
            addCriterion("from_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdEqualTo(String value) {
            addCriterion("from_member_id =", value, "fromMemberId");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdNotEqualTo(String value) {
            addCriterion("from_member_id <>", value, "fromMemberId");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdGreaterThan(String value) {
            addCriterion("from_member_id >", value, "fromMemberId");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("from_member_id >=", value, "fromMemberId");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdLessThan(String value) {
            addCriterion("from_member_id <", value, "fromMemberId");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdLessThanOrEqualTo(String value) {
            addCriterion("from_member_id <=", value, "fromMemberId");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdLike(String value) {
            addCriterion("from_member_id like", value, "fromMemberId");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdNotLike(String value) {
            addCriterion("from_member_id not like", value, "fromMemberId");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdIn(List<String> values) {
            addCriterion("from_member_id in", values, "fromMemberId");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdNotIn(List<String> values) {
            addCriterion("from_member_id not in", values, "fromMemberId");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdBetween(String value1, String value2) {
            addCriterion("from_member_id between", value1, value2, "fromMemberId");
            return (Criteria) this;
        }

        public Criteria andFromMemberIdNotBetween(String value1, String value2) {
            addCriterion("from_member_id not between", value1, value2, "fromMemberId");
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