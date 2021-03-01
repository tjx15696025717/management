package com.chongqing.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecordExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Long value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Long value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Long value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Long value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Long value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Long value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Long> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Long> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Long value1, Long value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Long value1, Long value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIsNull() {
            addCriterion("record_time is null");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIsNotNull() {
            addCriterion("record_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecordTimeEqualTo(Date value) {
            addCriterion("record_time =", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotEqualTo(Date value) {
            addCriterion("record_time <>", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeGreaterThan(Date value) {
            addCriterion("record_time >", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("record_time >=", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeLessThan(Date value) {
            addCriterion("record_time <", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeLessThanOrEqualTo(Date value) {
            addCriterion("record_time <=", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIn(List<Date> values) {
            addCriterion("record_time in", values, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotIn(List<Date> values) {
            addCriterion("record_time not in", values, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeBetween(Date value1, Date value2) {
            addCriterion("record_time between", value1, value2, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotBetween(Date value1, Date value2) {
            addCriterion("record_time not between", value1, value2, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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

        public Criteria andTempIsNull() {
            addCriterion("temp is null");
            return (Criteria) this;
        }

        public Criteria andTempIsNotNull() {
            addCriterion("temp is not null");
            return (Criteria) this;
        }

        public Criteria andTempEqualTo(String value) {
            addCriterion("temp =", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotEqualTo(String value) {
            addCriterion("temp <>", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempGreaterThan(String value) {
            addCriterion("temp >", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempGreaterThanOrEqualTo(String value) {
            addCriterion("temp >=", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempLessThan(String value) {
            addCriterion("temp <", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempLessThanOrEqualTo(String value) {
            addCriterion("temp <=", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempLike(String value) {
            addCriterion("temp like", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotLike(String value) {
            addCriterion("temp not like", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempIn(List<String> values) {
            addCriterion("temp in", values, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotIn(List<String> values) {
            addCriterion("temp not in", values, "temp");
            return (Criteria) this;
        }

        public Criteria andTempBetween(String value1, String value2) {
            addCriterion("temp between", value1, value2, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotBetween(String value1, String value2) {
            addCriterion("temp not between", value1, value2, "temp");
            return (Criteria) this;
        }

        public Criteria andCase1IsNull() {
            addCriterion("case1 is null");
            return (Criteria) this;
        }

        public Criteria andCase1IsNotNull() {
            addCriterion("case1 is not null");
            return (Criteria) this;
        }

        public Criteria andCase1EqualTo(String value) {
            addCriterion("case1 =", value, "case1");
            return (Criteria) this;
        }

        public Criteria andCase1NotEqualTo(String value) {
            addCriterion("case1 <>", value, "case1");
            return (Criteria) this;
        }

        public Criteria andCase1GreaterThan(String value) {
            addCriterion("case1 >", value, "case1");
            return (Criteria) this;
        }

        public Criteria andCase1GreaterThanOrEqualTo(String value) {
            addCriterion("case1 >=", value, "case1");
            return (Criteria) this;
        }

        public Criteria andCase1LessThan(String value) {
            addCriterion("case1 <", value, "case1");
            return (Criteria) this;
        }

        public Criteria andCase1LessThanOrEqualTo(String value) {
            addCriterion("case1 <=", value, "case1");
            return (Criteria) this;
        }

        public Criteria andCase1Like(String value) {
            addCriterion("case1 like", value, "case1");
            return (Criteria) this;
        }

        public Criteria andCase1NotLike(String value) {
            addCriterion("case1 not like", value, "case1");
            return (Criteria) this;
        }

        public Criteria andCase1In(List<String> values) {
            addCriterion("case1 in", values, "case1");
            return (Criteria) this;
        }

        public Criteria andCase1NotIn(List<String> values) {
            addCriterion("case1 not in", values, "case1");
            return (Criteria) this;
        }

        public Criteria andCase1Between(String value1, String value2) {
            addCriterion("case1 between", value1, value2, "case1");
            return (Criteria) this;
        }

        public Criteria andCase1NotBetween(String value1, String value2) {
            addCriterion("case1 not between", value1, value2, "case1");
            return (Criteria) this;
        }

        public Criteria andCase2IsNull() {
            addCriterion("case2 is null");
            return (Criteria) this;
        }

        public Criteria andCase2IsNotNull() {
            addCriterion("case2 is not null");
            return (Criteria) this;
        }

        public Criteria andCase2EqualTo(String value) {
            addCriterion("case2 =", value, "case2");
            return (Criteria) this;
        }

        public Criteria andCase2NotEqualTo(String value) {
            addCriterion("case2 <>", value, "case2");
            return (Criteria) this;
        }

        public Criteria andCase2GreaterThan(String value) {
            addCriterion("case2 >", value, "case2");
            return (Criteria) this;
        }

        public Criteria andCase2GreaterThanOrEqualTo(String value) {
            addCriterion("case2 >=", value, "case2");
            return (Criteria) this;
        }

        public Criteria andCase2LessThan(String value) {
            addCriterion("case2 <", value, "case2");
            return (Criteria) this;
        }

        public Criteria andCase2LessThanOrEqualTo(String value) {
            addCriterion("case2 <=", value, "case2");
            return (Criteria) this;
        }

        public Criteria andCase2Like(String value) {
            addCriterion("case2 like", value, "case2");
            return (Criteria) this;
        }

        public Criteria andCase2NotLike(String value) {
            addCriterion("case2 not like", value, "case2");
            return (Criteria) this;
        }

        public Criteria andCase2In(List<String> values) {
            addCriterion("case2 in", values, "case2");
            return (Criteria) this;
        }

        public Criteria andCase2NotIn(List<String> values) {
            addCriterion("case2 not in", values, "case2");
            return (Criteria) this;
        }

        public Criteria andCase2Between(String value1, String value2) {
            addCriterion("case2 between", value1, value2, "case2");
            return (Criteria) this;
        }

        public Criteria andCase2NotBetween(String value1, String value2) {
            addCriterion("case2 not between", value1, value2, "case2");
            return (Criteria) this;
        }

        public Criteria andCase3IsNull() {
            addCriterion("case3 is null");
            return (Criteria) this;
        }

        public Criteria andCase3IsNotNull() {
            addCriterion("case3 is not null");
            return (Criteria) this;
        }

        public Criteria andCase3EqualTo(String value) {
            addCriterion("case3 =", value, "case3");
            return (Criteria) this;
        }

        public Criteria andCase3NotEqualTo(String value) {
            addCriterion("case3 <>", value, "case3");
            return (Criteria) this;
        }

        public Criteria andCase3GreaterThan(String value) {
            addCriterion("case3 >", value, "case3");
            return (Criteria) this;
        }

        public Criteria andCase3GreaterThanOrEqualTo(String value) {
            addCriterion("case3 >=", value, "case3");
            return (Criteria) this;
        }

        public Criteria andCase3LessThan(String value) {
            addCriterion("case3 <", value, "case3");
            return (Criteria) this;
        }

        public Criteria andCase3LessThanOrEqualTo(String value) {
            addCriterion("case3 <=", value, "case3");
            return (Criteria) this;
        }

        public Criteria andCase3Like(String value) {
            addCriterion("case3 like", value, "case3");
            return (Criteria) this;
        }

        public Criteria andCase3NotLike(String value) {
            addCriterion("case3 not like", value, "case3");
            return (Criteria) this;
        }

        public Criteria andCase3In(List<String> values) {
            addCriterion("case3 in", values, "case3");
            return (Criteria) this;
        }

        public Criteria andCase3NotIn(List<String> values) {
            addCriterion("case3 not in", values, "case3");
            return (Criteria) this;
        }

        public Criteria andCase3Between(String value1, String value2) {
            addCriterion("case3 between", value1, value2, "case3");
            return (Criteria) this;
        }

        public Criteria andCase3NotBetween(String value1, String value2) {
            addCriterion("case3 not between", value1, value2, "case3");
            return (Criteria) this;
        }

        public Criteria andCase4IsNull() {
            addCriterion("case4 is null");
            return (Criteria) this;
        }

        public Criteria andCase4IsNotNull() {
            addCriterion("case4 is not null");
            return (Criteria) this;
        }

        public Criteria andCase4EqualTo(String value) {
            addCriterion("case4 =", value, "case4");
            return (Criteria) this;
        }

        public Criteria andCase4NotEqualTo(String value) {
            addCriterion("case4 <>", value, "case4");
            return (Criteria) this;
        }

        public Criteria andCase4GreaterThan(String value) {
            addCriterion("case4 >", value, "case4");
            return (Criteria) this;
        }

        public Criteria andCase4GreaterThanOrEqualTo(String value) {
            addCriterion("case4 >=", value, "case4");
            return (Criteria) this;
        }

        public Criteria andCase4LessThan(String value) {
            addCriterion("case4 <", value, "case4");
            return (Criteria) this;
        }

        public Criteria andCase4LessThanOrEqualTo(String value) {
            addCriterion("case4 <=", value, "case4");
            return (Criteria) this;
        }

        public Criteria andCase4Like(String value) {
            addCriterion("case4 like", value, "case4");
            return (Criteria) this;
        }

        public Criteria andCase4NotLike(String value) {
            addCriterion("case4 not like", value, "case4");
            return (Criteria) this;
        }

        public Criteria andCase4In(List<String> values) {
            addCriterion("case4 in", values, "case4");
            return (Criteria) this;
        }

        public Criteria andCase4NotIn(List<String> values) {
            addCriterion("case4 not in", values, "case4");
            return (Criteria) this;
        }

        public Criteria andCase4Between(String value1, String value2) {
            addCriterion("case4 between", value1, value2, "case4");
            return (Criteria) this;
        }

        public Criteria andCase4NotBetween(String value1, String value2) {
            addCriterion("case4 not between", value1, value2, "case4");
            return (Criteria) this;
        }

        public Criteria andCase5IsNull() {
            addCriterion("case5 is null");
            return (Criteria) this;
        }

        public Criteria andCase5IsNotNull() {
            addCriterion("case5 is not null");
            return (Criteria) this;
        }

        public Criteria andCase5EqualTo(String value) {
            addCriterion("case5 =", value, "case5");
            return (Criteria) this;
        }

        public Criteria andCase5NotEqualTo(String value) {
            addCriterion("case5 <>", value, "case5");
            return (Criteria) this;
        }

        public Criteria andCase5GreaterThan(String value) {
            addCriterion("case5 >", value, "case5");
            return (Criteria) this;
        }

        public Criteria andCase5GreaterThanOrEqualTo(String value) {
            addCriterion("case5 >=", value, "case5");
            return (Criteria) this;
        }

        public Criteria andCase5LessThan(String value) {
            addCriterion("case5 <", value, "case5");
            return (Criteria) this;
        }

        public Criteria andCase5LessThanOrEqualTo(String value) {
            addCriterion("case5 <=", value, "case5");
            return (Criteria) this;
        }

        public Criteria andCase5Like(String value) {
            addCriterion("case5 like", value, "case5");
            return (Criteria) this;
        }

        public Criteria andCase5NotLike(String value) {
            addCriterion("case5 not like", value, "case5");
            return (Criteria) this;
        }

        public Criteria andCase5In(List<String> values) {
            addCriterion("case5 in", values, "case5");
            return (Criteria) this;
        }

        public Criteria andCase5NotIn(List<String> values) {
            addCriterion("case5 not in", values, "case5");
            return (Criteria) this;
        }

        public Criteria andCase5Between(String value1, String value2) {
            addCriterion("case5 between", value1, value2, "case5");
            return (Criteria) this;
        }

        public Criteria andCase5NotBetween(String value1, String value2) {
            addCriterion("case5 not between", value1, value2, "case5");
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