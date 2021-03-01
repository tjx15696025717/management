package com.chongqing.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNull() {
            addCriterion("activity_name is null");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNotNull() {
            addCriterion("activity_name is not null");
            return (Criteria) this;
        }

        public Criteria andActivityNameEqualTo(String value) {
            addCriterion("activity_name =", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotEqualTo(String value) {
            addCriterion("activity_name <>", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThan(String value) {
            addCriterion("activity_name >", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThanOrEqualTo(String value) {
            addCriterion("activity_name >=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThan(String value) {
            addCriterion("activity_name <", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThanOrEqualTo(String value) {
            addCriterion("activity_name <=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLike(String value) {
            addCriterion("activity_name like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotLike(String value) {
            addCriterion("activity_name not like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameIn(List<String> values) {
            addCriterion("activity_name in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotIn(List<String> values) {
            addCriterion("activity_name not in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameBetween(String value1, String value2) {
            addCriterion("activity_name between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotBetween(String value1, String value2) {
            addCriterion("activity_name not between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNull() {
            addCriterion("create_name is null");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNotNull() {
            addCriterion("create_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreateNameEqualTo(String value) {
            addCriterion("create_name =", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotEqualTo(String value) {
            addCriterion("create_name <>", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThan(String value) {
            addCriterion("create_name >", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThanOrEqualTo(String value) {
            addCriterion("create_name >=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThan(String value) {
            addCriterion("create_name <", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThanOrEqualTo(String value) {
            addCriterion("create_name <=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLike(String value) {
            addCriterion("create_name like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotLike(String value) {
            addCriterion("create_name not like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameIn(List<String> values) {
            addCriterion("create_name in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotIn(List<String> values) {
            addCriterion("create_name not in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameBetween(String value1, String value2) {
            addCriterion("create_name between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotBetween(String value1, String value2) {
            addCriterion("create_name not between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("create_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(Long value) {
            addCriterion("create_id =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(Long value) {
            addCriterion("create_id <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(Long value) {
            addCriterion("create_id >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("create_id >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(Long value) {
            addCriterion("create_id <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(Long value) {
            addCriterion("create_id <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<Long> values) {
            addCriterion("create_id in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<Long> values) {
            addCriterion("create_id not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(Long value1, Long value2) {
            addCriterion("create_id between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(Long value1, Long value2) {
            addCriterion("create_id not between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andActivityTimeIsNull() {
            addCriterion("activity_time is null");
            return (Criteria) this;
        }

        public Criteria andActivityTimeIsNotNull() {
            addCriterion("activity_time is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTimeEqualTo(Date value) {
            addCriterion("activity_time =", value, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeNotEqualTo(Date value) {
            addCriterion("activity_time <>", value, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeGreaterThan(Date value) {
            addCriterion("activity_time >", value, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("activity_time >=", value, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeLessThan(Date value) {
            addCriterion("activity_time <", value, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeLessThanOrEqualTo(Date value) {
            addCriterion("activity_time <=", value, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeIn(List<Date> values) {
            addCriterion("activity_time in", values, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeNotIn(List<Date> values) {
            addCriterion("activity_time not in", values, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeBetween(Date value1, Date value2) {
            addCriterion("activity_time between", value1, value2, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeNotBetween(Date value1, Date value2) {
            addCriterion("activity_time not between", value1, value2, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityLongIsNull() {
            addCriterion("activity_long is null");
            return (Criteria) this;
        }

        public Criteria andActivityLongIsNotNull() {
            addCriterion("activity_long is not null");
            return (Criteria) this;
        }

        public Criteria andActivityLongEqualTo(String value) {
            addCriterion("activity_long =", value, "activityLong");
            return (Criteria) this;
        }

        public Criteria andActivityLongNotEqualTo(String value) {
            addCriterion("activity_long <>", value, "activityLong");
            return (Criteria) this;
        }

        public Criteria andActivityLongGreaterThan(String value) {
            addCriterion("activity_long >", value, "activityLong");
            return (Criteria) this;
        }

        public Criteria andActivityLongGreaterThanOrEqualTo(String value) {
            addCriterion("activity_long >=", value, "activityLong");
            return (Criteria) this;
        }

        public Criteria andActivityLongLessThan(String value) {
            addCriterion("activity_long <", value, "activityLong");
            return (Criteria) this;
        }

        public Criteria andActivityLongLessThanOrEqualTo(String value) {
            addCriterion("activity_long <=", value, "activityLong");
            return (Criteria) this;
        }

        public Criteria andActivityLongLike(String value) {
            addCriterion("activity_long like", value, "activityLong");
            return (Criteria) this;
        }

        public Criteria andActivityLongNotLike(String value) {
            addCriterion("activity_long not like", value, "activityLong");
            return (Criteria) this;
        }

        public Criteria andActivityLongIn(List<String> values) {
            addCriterion("activity_long in", values, "activityLong");
            return (Criteria) this;
        }

        public Criteria andActivityLongNotIn(List<String> values) {
            addCriterion("activity_long not in", values, "activityLong");
            return (Criteria) this;
        }

        public Criteria andActivityLongBetween(String value1, String value2) {
            addCriterion("activity_long between", value1, value2, "activityLong");
            return (Criteria) this;
        }

        public Criteria andActivityLongNotBetween(String value1, String value2) {
            addCriterion("activity_long not between", value1, value2, "activityLong");
            return (Criteria) this;
        }

        public Criteria andWhereIsNull() {
            addCriterion("where is null");
            return (Criteria) this;
        }

        public Criteria andWhereIsNotNull() {
            addCriterion("where is not null");
            return (Criteria) this;
        }

        public Criteria andWhereEqualTo(String value) {
            addCriterion("where =", value, "where");
            return (Criteria) this;
        }

        public Criteria andWhereNotEqualTo(String value) {
            addCriterion("where <>", value, "where");
            return (Criteria) this;
        }

        public Criteria andWhereGreaterThan(String value) {
            addCriterion("where >", value, "where");
            return (Criteria) this;
        }

        public Criteria andWhereGreaterThanOrEqualTo(String value) {
            addCriterion("where >=", value, "where");
            return (Criteria) this;
        }

        public Criteria andWhereLessThan(String value) {
            addCriterion("where <", value, "where");
            return (Criteria) this;
        }

        public Criteria andWhereLessThanOrEqualTo(String value) {
            addCriterion("where <=", value, "where");
            return (Criteria) this;
        }

        public Criteria andWhereLike(String value) {
            addCriterion("where like", value, "where");
            return (Criteria) this;
        }

        public Criteria andWhereNotLike(String value) {
            addCriterion("where not like", value, "where");
            return (Criteria) this;
        }

        public Criteria andWhereIn(List<String> values) {
            addCriterion("where in", values, "where");
            return (Criteria) this;
        }

        public Criteria andWhereNotIn(List<String> values) {
            addCriterion("where not in", values, "where");
            return (Criteria) this;
        }

        public Criteria andWhereBetween(String value1, String value2) {
            addCriterion("where between", value1, value2, "where");
            return (Criteria) this;
        }

        public Criteria andWhereNotBetween(String value1, String value2) {
            addCriterion("where not between", value1, value2, "where");
            return (Criteria) this;
        }

        public Criteria andAllPersonIsNull() {
            addCriterion("all_person is null");
            return (Criteria) this;
        }

        public Criteria andAllPersonIsNotNull() {
            addCriterion("all_person is not null");
            return (Criteria) this;
        }

        public Criteria andAllPersonEqualTo(Integer value) {
            addCriterion("all_person =", value, "allPerson");
            return (Criteria) this;
        }

        public Criteria andAllPersonNotEqualTo(Integer value) {
            addCriterion("all_person <>", value, "allPerson");
            return (Criteria) this;
        }

        public Criteria andAllPersonGreaterThan(Integer value) {
            addCriterion("all_person >", value, "allPerson");
            return (Criteria) this;
        }

        public Criteria andAllPersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("all_person >=", value, "allPerson");
            return (Criteria) this;
        }

        public Criteria andAllPersonLessThan(Integer value) {
            addCriterion("all_person <", value, "allPerson");
            return (Criteria) this;
        }

        public Criteria andAllPersonLessThanOrEqualTo(Integer value) {
            addCriterion("all_person <=", value, "allPerson");
            return (Criteria) this;
        }

        public Criteria andAllPersonIn(List<Integer> values) {
            addCriterion("all_person in", values, "allPerson");
            return (Criteria) this;
        }

        public Criteria andAllPersonNotIn(List<Integer> values) {
            addCriterion("all_person not in", values, "allPerson");
            return (Criteria) this;
        }

        public Criteria andAllPersonBetween(Integer value1, Integer value2) {
            addCriterion("all_person between", value1, value2, "allPerson");
            return (Criteria) this;
        }

        public Criteria andAllPersonNotBetween(Integer value1, Integer value2) {
            addCriterion("all_person not between", value1, value2, "allPerson");
            return (Criteria) this;
        }

        public Criteria andJoinPersonIsNull() {
            addCriterion("join_person is null");
            return (Criteria) this;
        }

        public Criteria andJoinPersonIsNotNull() {
            addCriterion("join_person is not null");
            return (Criteria) this;
        }

        public Criteria andJoinPersonEqualTo(Integer value) {
            addCriterion("join_person =", value, "joinPerson");
            return (Criteria) this;
        }

        public Criteria andJoinPersonNotEqualTo(Integer value) {
            addCriterion("join_person <>", value, "joinPerson");
            return (Criteria) this;
        }

        public Criteria andJoinPersonGreaterThan(Integer value) {
            addCriterion("join_person >", value, "joinPerson");
            return (Criteria) this;
        }

        public Criteria andJoinPersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("join_person >=", value, "joinPerson");
            return (Criteria) this;
        }

        public Criteria andJoinPersonLessThan(Integer value) {
            addCriterion("join_person <", value, "joinPerson");
            return (Criteria) this;
        }

        public Criteria andJoinPersonLessThanOrEqualTo(Integer value) {
            addCriterion("join_person <=", value, "joinPerson");
            return (Criteria) this;
        }

        public Criteria andJoinPersonIn(List<Integer> values) {
            addCriterion("join_person in", values, "joinPerson");
            return (Criteria) this;
        }

        public Criteria andJoinPersonNotIn(List<Integer> values) {
            addCriterion("join_person not in", values, "joinPerson");
            return (Criteria) this;
        }

        public Criteria andJoinPersonBetween(Integer value1, Integer value2) {
            addCriterion("join_person between", value1, value2, "joinPerson");
            return (Criteria) this;
        }

        public Criteria andJoinPersonNotBetween(Integer value1, Integer value2) {
            addCriterion("join_person not between", value1, value2, "joinPerson");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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