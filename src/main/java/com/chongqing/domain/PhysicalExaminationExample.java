package com.chongqing.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PhysicalExaminationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PhysicalExaminationExample() {
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

        public Criteria andDiastolicPressureIsNull() {
            addCriterion("diastolic_pressure is null");
            return (Criteria) this;
        }

        public Criteria andDiastolicPressureIsNotNull() {
            addCriterion("diastolic_pressure is not null");
            return (Criteria) this;
        }

        public Criteria andDiastolicPressureEqualTo(String value) {
            addCriterion("diastolic_pressure =", value, "diastolicPressure");
            return (Criteria) this;
        }

        public Criteria andDiastolicPressureNotEqualTo(String value) {
            addCriterion("diastolic_pressure <>", value, "diastolicPressure");
            return (Criteria) this;
        }

        public Criteria andDiastolicPressureGreaterThan(String value) {
            addCriterion("diastolic_pressure >", value, "diastolicPressure");
            return (Criteria) this;
        }

        public Criteria andDiastolicPressureGreaterThanOrEqualTo(String value) {
            addCriterion("diastolic_pressure >=", value, "diastolicPressure");
            return (Criteria) this;
        }

        public Criteria andDiastolicPressureLessThan(String value) {
            addCriterion("diastolic_pressure <", value, "diastolicPressure");
            return (Criteria) this;
        }

        public Criteria andDiastolicPressureLessThanOrEqualTo(String value) {
            addCriterion("diastolic_pressure <=", value, "diastolicPressure");
            return (Criteria) this;
        }

        public Criteria andDiastolicPressureLike(String value) {
            addCriterion("diastolic_pressure like", value, "diastolicPressure");
            return (Criteria) this;
        }

        public Criteria andDiastolicPressureNotLike(String value) {
            addCriterion("diastolic_pressure not like", value, "diastolicPressure");
            return (Criteria) this;
        }

        public Criteria andDiastolicPressureIn(List<String> values) {
            addCriterion("diastolic_pressure in", values, "diastolicPressure");
            return (Criteria) this;
        }

        public Criteria andDiastolicPressureNotIn(List<String> values) {
            addCriterion("diastolic_pressure not in", values, "diastolicPressure");
            return (Criteria) this;
        }

        public Criteria andDiastolicPressureBetween(String value1, String value2) {
            addCriterion("diastolic_pressure between", value1, value2, "diastolicPressure");
            return (Criteria) this;
        }

        public Criteria andDiastolicPressureNotBetween(String value1, String value2) {
            addCriterion("diastolic_pressure not between", value1, value2, "diastolicPressure");
            return (Criteria) this;
        }

        public Criteria andSystolicPressureIsNull() {
            addCriterion("systolic_pressure is null");
            return (Criteria) this;
        }

        public Criteria andSystolicPressureIsNotNull() {
            addCriterion("systolic_pressure is not null");
            return (Criteria) this;
        }

        public Criteria andSystolicPressureEqualTo(String value) {
            addCriterion("systolic_pressure =", value, "systolicPressure");
            return (Criteria) this;
        }

        public Criteria andSystolicPressureNotEqualTo(String value) {
            addCriterion("systolic_pressure <>", value, "systolicPressure");
            return (Criteria) this;
        }

        public Criteria andSystolicPressureGreaterThan(String value) {
            addCriterion("systolic_pressure >", value, "systolicPressure");
            return (Criteria) this;
        }

        public Criteria andSystolicPressureGreaterThanOrEqualTo(String value) {
            addCriterion("systolic_pressure >=", value, "systolicPressure");
            return (Criteria) this;
        }

        public Criteria andSystolicPressureLessThan(String value) {
            addCriterion("systolic_pressure <", value, "systolicPressure");
            return (Criteria) this;
        }

        public Criteria andSystolicPressureLessThanOrEqualTo(String value) {
            addCriterion("systolic_pressure <=", value, "systolicPressure");
            return (Criteria) this;
        }

        public Criteria andSystolicPressureLike(String value) {
            addCriterion("systolic_pressure like", value, "systolicPressure");
            return (Criteria) this;
        }

        public Criteria andSystolicPressureNotLike(String value) {
            addCriterion("systolic_pressure not like", value, "systolicPressure");
            return (Criteria) this;
        }

        public Criteria andSystolicPressureIn(List<String> values) {
            addCriterion("systolic_pressure in", values, "systolicPressure");
            return (Criteria) this;
        }

        public Criteria andSystolicPressureNotIn(List<String> values) {
            addCriterion("systolic_pressure not in", values, "systolicPressure");
            return (Criteria) this;
        }

        public Criteria andSystolicPressureBetween(String value1, String value2) {
            addCriterion("systolic_pressure between", value1, value2, "systolicPressure");
            return (Criteria) this;
        }

        public Criteria andSystolicPressureNotBetween(String value1, String value2) {
            addCriterion("systolic_pressure not between", value1, value2, "systolicPressure");
            return (Criteria) this;
        }

        public Criteria andBodyWeightIsNull() {
            addCriterion("body_weight is null");
            return (Criteria) this;
        }

        public Criteria andBodyWeightIsNotNull() {
            addCriterion("body_weight is not null");
            return (Criteria) this;
        }

        public Criteria andBodyWeightEqualTo(String value) {
            addCriterion("body_weight =", value, "bodyWeight");
            return (Criteria) this;
        }

        public Criteria andBodyWeightNotEqualTo(String value) {
            addCriterion("body_weight <>", value, "bodyWeight");
            return (Criteria) this;
        }

        public Criteria andBodyWeightGreaterThan(String value) {
            addCriterion("body_weight >", value, "bodyWeight");
            return (Criteria) this;
        }

        public Criteria andBodyWeightGreaterThanOrEqualTo(String value) {
            addCriterion("body_weight >=", value, "bodyWeight");
            return (Criteria) this;
        }

        public Criteria andBodyWeightLessThan(String value) {
            addCriterion("body_weight <", value, "bodyWeight");
            return (Criteria) this;
        }

        public Criteria andBodyWeightLessThanOrEqualTo(String value) {
            addCriterion("body_weight <=", value, "bodyWeight");
            return (Criteria) this;
        }

        public Criteria andBodyWeightLike(String value) {
            addCriterion("body_weight like", value, "bodyWeight");
            return (Criteria) this;
        }

        public Criteria andBodyWeightNotLike(String value) {
            addCriterion("body_weight not like", value, "bodyWeight");
            return (Criteria) this;
        }

        public Criteria andBodyWeightIn(List<String> values) {
            addCriterion("body_weight in", values, "bodyWeight");
            return (Criteria) this;
        }

        public Criteria andBodyWeightNotIn(List<String> values) {
            addCriterion("body_weight not in", values, "bodyWeight");
            return (Criteria) this;
        }

        public Criteria andBodyWeightBetween(String value1, String value2) {
            addCriterion("body_weight between", value1, value2, "bodyWeight");
            return (Criteria) this;
        }

        public Criteria andBodyWeightNotBetween(String value1, String value2) {
            addCriterion("body_weight not between", value1, value2, "bodyWeight");
            return (Criteria) this;
        }

        public Criteria andWaistHipIsNull() {
            addCriterion("waist_hip is null");
            return (Criteria) this;
        }

        public Criteria andWaistHipIsNotNull() {
            addCriterion("waist_hip is not null");
            return (Criteria) this;
        }

        public Criteria andWaistHipEqualTo(String value) {
            addCriterion("waist_hip =", value, "waistHip");
            return (Criteria) this;
        }

        public Criteria andWaistHipNotEqualTo(String value) {
            addCriterion("waist_hip <>", value, "waistHip");
            return (Criteria) this;
        }

        public Criteria andWaistHipGreaterThan(String value) {
            addCriterion("waist_hip >", value, "waistHip");
            return (Criteria) this;
        }

        public Criteria andWaistHipGreaterThanOrEqualTo(String value) {
            addCriterion("waist_hip >=", value, "waistHip");
            return (Criteria) this;
        }

        public Criteria andWaistHipLessThan(String value) {
            addCriterion("waist_hip <", value, "waistHip");
            return (Criteria) this;
        }

        public Criteria andWaistHipLessThanOrEqualTo(String value) {
            addCriterion("waist_hip <=", value, "waistHip");
            return (Criteria) this;
        }

        public Criteria andWaistHipLike(String value) {
            addCriterion("waist_hip like", value, "waistHip");
            return (Criteria) this;
        }

        public Criteria andWaistHipNotLike(String value) {
            addCriterion("waist_hip not like", value, "waistHip");
            return (Criteria) this;
        }

        public Criteria andWaistHipIn(List<String> values) {
            addCriterion("waist_hip in", values, "waistHip");
            return (Criteria) this;
        }

        public Criteria andWaistHipNotIn(List<String> values) {
            addCriterion("waist_hip not in", values, "waistHip");
            return (Criteria) this;
        }

        public Criteria andWaistHipBetween(String value1, String value2) {
            addCriterion("waist_hip between", value1, value2, "waistHip");
            return (Criteria) this;
        }

        public Criteria andWaistHipNotBetween(String value1, String value2) {
            addCriterion("waist_hip not between", value1, value2, "waistHip");
            return (Criteria) this;
        }

        public Criteria andUreaIsNull() {
            addCriterion("urea is null");
            return (Criteria) this;
        }

        public Criteria andUreaIsNotNull() {
            addCriterion("urea is not null");
            return (Criteria) this;
        }

        public Criteria andUreaEqualTo(String value) {
            addCriterion("urea =", value, "urea");
            return (Criteria) this;
        }

        public Criteria andUreaNotEqualTo(String value) {
            addCriterion("urea <>", value, "urea");
            return (Criteria) this;
        }

        public Criteria andUreaGreaterThan(String value) {
            addCriterion("urea >", value, "urea");
            return (Criteria) this;
        }

        public Criteria andUreaGreaterThanOrEqualTo(String value) {
            addCriterion("urea >=", value, "urea");
            return (Criteria) this;
        }

        public Criteria andUreaLessThan(String value) {
            addCriterion("urea <", value, "urea");
            return (Criteria) this;
        }

        public Criteria andUreaLessThanOrEqualTo(String value) {
            addCriterion("urea <=", value, "urea");
            return (Criteria) this;
        }

        public Criteria andUreaLike(String value) {
            addCriterion("urea like", value, "urea");
            return (Criteria) this;
        }

        public Criteria andUreaNotLike(String value) {
            addCriterion("urea not like", value, "urea");
            return (Criteria) this;
        }

        public Criteria andUreaIn(List<String> values) {
            addCriterion("urea in", values, "urea");
            return (Criteria) this;
        }

        public Criteria andUreaNotIn(List<String> values) {
            addCriterion("urea not in", values, "urea");
            return (Criteria) this;
        }

        public Criteria andUreaBetween(String value1, String value2) {
            addCriterion("urea between", value1, value2, "urea");
            return (Criteria) this;
        }

        public Criteria andUreaNotBetween(String value1, String value2) {
            addCriterion("urea not between", value1, value2, "urea");
            return (Criteria) this;
        }

        public Criteria andUricAcidIsNull() {
            addCriterion("uric_acid is null");
            return (Criteria) this;
        }

        public Criteria andUricAcidIsNotNull() {
            addCriterion("uric_acid is not null");
            return (Criteria) this;
        }

        public Criteria andUricAcidEqualTo(String value) {
            addCriterion("uric_acid =", value, "uricAcid");
            return (Criteria) this;
        }

        public Criteria andUricAcidNotEqualTo(String value) {
            addCriterion("uric_acid <>", value, "uricAcid");
            return (Criteria) this;
        }

        public Criteria andUricAcidGreaterThan(String value) {
            addCriterion("uric_acid >", value, "uricAcid");
            return (Criteria) this;
        }

        public Criteria andUricAcidGreaterThanOrEqualTo(String value) {
            addCriterion("uric_acid >=", value, "uricAcid");
            return (Criteria) this;
        }

        public Criteria andUricAcidLessThan(String value) {
            addCriterion("uric_acid <", value, "uricAcid");
            return (Criteria) this;
        }

        public Criteria andUricAcidLessThanOrEqualTo(String value) {
            addCriterion("uric_acid <=", value, "uricAcid");
            return (Criteria) this;
        }

        public Criteria andUricAcidLike(String value) {
            addCriterion("uric_acid like", value, "uricAcid");
            return (Criteria) this;
        }

        public Criteria andUricAcidNotLike(String value) {
            addCriterion("uric_acid not like", value, "uricAcid");
            return (Criteria) this;
        }

        public Criteria andUricAcidIn(List<String> values) {
            addCriterion("uric_acid in", values, "uricAcid");
            return (Criteria) this;
        }

        public Criteria andUricAcidNotIn(List<String> values) {
            addCriterion("uric_acid not in", values, "uricAcid");
            return (Criteria) this;
        }

        public Criteria andUricAcidBetween(String value1, String value2) {
            addCriterion("uric_acid between", value1, value2, "uricAcid");
            return (Criteria) this;
        }

        public Criteria andUricAcidNotBetween(String value1, String value2) {
            addCriterion("uric_acid not between", value1, value2, "uricAcid");
            return (Criteria) this;
        }

        public Criteria andGlycerolGlycolIsNull() {
            addCriterion("\"glycerol glycol\" is null");
            return (Criteria) this;
        }

        public Criteria andGlycerolGlycolIsNotNull() {
            addCriterion("\"glycerol glycol\" is not null");
            return (Criteria) this;
        }

        public Criteria andGlycerolGlycolEqualTo(String value) {
            addCriterion("\"glycerol glycol\" =", value, "glycerolGlycol");
            return (Criteria) this;
        }

        public Criteria andGlycerolGlycolNotEqualTo(String value) {
            addCriterion("\"glycerol glycol\" <>", value, "glycerolGlycol");
            return (Criteria) this;
        }

        public Criteria andGlycerolGlycolGreaterThan(String value) {
            addCriterion("\"glycerol glycol\" >", value, "glycerolGlycol");
            return (Criteria) this;
        }

        public Criteria andGlycerolGlycolGreaterThanOrEqualTo(String value) {
            addCriterion("\"glycerol glycol\" >=", value, "glycerolGlycol");
            return (Criteria) this;
        }

        public Criteria andGlycerolGlycolLessThan(String value) {
            addCriterion("\"glycerol glycol\" <", value, "glycerolGlycol");
            return (Criteria) this;
        }

        public Criteria andGlycerolGlycolLessThanOrEqualTo(String value) {
            addCriterion("\"glycerol glycol\" <=", value, "glycerolGlycol");
            return (Criteria) this;
        }

        public Criteria andGlycerolGlycolLike(String value) {
            addCriterion("\"glycerol glycol\" like", value, "glycerolGlycol");
            return (Criteria) this;
        }

        public Criteria andGlycerolGlycolNotLike(String value) {
            addCriterion("\"glycerol glycol\" not like", value, "glycerolGlycol");
            return (Criteria) this;
        }

        public Criteria andGlycerolGlycolIn(List<String> values) {
            addCriterion("\"glycerol glycol\" in", values, "glycerolGlycol");
            return (Criteria) this;
        }

        public Criteria andGlycerolGlycolNotIn(List<String> values) {
            addCriterion("\"glycerol glycol\" not in", values, "glycerolGlycol");
            return (Criteria) this;
        }

        public Criteria andGlycerolGlycolBetween(String value1, String value2) {
            addCriterion("\"glycerol glycol\" between", value1, value2, "glycerolGlycol");
            return (Criteria) this;
        }

        public Criteria andGlycerolGlycolNotBetween(String value1, String value2) {
            addCriterion("\"glycerol glycol\" not between", value1, value2, "glycerolGlycol");
            return (Criteria) this;
        }

        public Criteria andCholesterolIsNull() {
            addCriterion("cholesterol is null");
            return (Criteria) this;
        }

        public Criteria andCholesterolIsNotNull() {
            addCriterion("cholesterol is not null");
            return (Criteria) this;
        }

        public Criteria andCholesterolEqualTo(String value) {
            addCriterion("cholesterol =", value, "cholesterol");
            return (Criteria) this;
        }

        public Criteria andCholesterolNotEqualTo(String value) {
            addCriterion("cholesterol <>", value, "cholesterol");
            return (Criteria) this;
        }

        public Criteria andCholesterolGreaterThan(String value) {
            addCriterion("cholesterol >", value, "cholesterol");
            return (Criteria) this;
        }

        public Criteria andCholesterolGreaterThanOrEqualTo(String value) {
            addCriterion("cholesterol >=", value, "cholesterol");
            return (Criteria) this;
        }

        public Criteria andCholesterolLessThan(String value) {
            addCriterion("cholesterol <", value, "cholesterol");
            return (Criteria) this;
        }

        public Criteria andCholesterolLessThanOrEqualTo(String value) {
            addCriterion("cholesterol <=", value, "cholesterol");
            return (Criteria) this;
        }

        public Criteria andCholesterolLike(String value) {
            addCriterion("cholesterol like", value, "cholesterol");
            return (Criteria) this;
        }

        public Criteria andCholesterolNotLike(String value) {
            addCriterion("cholesterol not like", value, "cholesterol");
            return (Criteria) this;
        }

        public Criteria andCholesterolIn(List<String> values) {
            addCriterion("cholesterol in", values, "cholesterol");
            return (Criteria) this;
        }

        public Criteria andCholesterolNotIn(List<String> values) {
            addCriterion("cholesterol not in", values, "cholesterol");
            return (Criteria) this;
        }

        public Criteria andCholesterolBetween(String value1, String value2) {
            addCriterion("cholesterol between", value1, value2, "cholesterol");
            return (Criteria) this;
        }

        public Criteria andCholesterolNotBetween(String value1, String value2) {
            addCriterion("cholesterol not between", value1, value2, "cholesterol");
            return (Criteria) this;
        }

        public Criteria andGlucoseIsNull() {
            addCriterion("glucose is null");
            return (Criteria) this;
        }

        public Criteria andGlucoseIsNotNull() {
            addCriterion("glucose is not null");
            return (Criteria) this;
        }

        public Criteria andGlucoseEqualTo(String value) {
            addCriterion("glucose =", value, "glucose");
            return (Criteria) this;
        }

        public Criteria andGlucoseNotEqualTo(String value) {
            addCriterion("glucose <>", value, "glucose");
            return (Criteria) this;
        }

        public Criteria andGlucoseGreaterThan(String value) {
            addCriterion("glucose >", value, "glucose");
            return (Criteria) this;
        }

        public Criteria andGlucoseGreaterThanOrEqualTo(String value) {
            addCriterion("glucose >=", value, "glucose");
            return (Criteria) this;
        }

        public Criteria andGlucoseLessThan(String value) {
            addCriterion("glucose <", value, "glucose");
            return (Criteria) this;
        }

        public Criteria andGlucoseLessThanOrEqualTo(String value) {
            addCriterion("glucose <=", value, "glucose");
            return (Criteria) this;
        }

        public Criteria andGlucoseLike(String value) {
            addCriterion("glucose like", value, "glucose");
            return (Criteria) this;
        }

        public Criteria andGlucoseNotLike(String value) {
            addCriterion("glucose not like", value, "glucose");
            return (Criteria) this;
        }

        public Criteria andGlucoseIn(List<String> values) {
            addCriterion("glucose in", values, "glucose");
            return (Criteria) this;
        }

        public Criteria andGlucoseNotIn(List<String> values) {
            addCriterion("glucose not in", values, "glucose");
            return (Criteria) this;
        }

        public Criteria andGlucoseBetween(String value1, String value2) {
            addCriterion("glucose between", value1, value2, "glucose");
            return (Criteria) this;
        }

        public Criteria andGlucoseNotBetween(String value1, String value2) {
            addCriterion("glucose not between", value1, value2, "glucose");
            return (Criteria) this;
        }

        public Criteria andProteinIsNull() {
            addCriterion("protein is null");
            return (Criteria) this;
        }

        public Criteria andProteinIsNotNull() {
            addCriterion("protein is not null");
            return (Criteria) this;
        }

        public Criteria andProteinEqualTo(String value) {
            addCriterion("protein =", value, "protein");
            return (Criteria) this;
        }

        public Criteria andProteinNotEqualTo(String value) {
            addCriterion("protein <>", value, "protein");
            return (Criteria) this;
        }

        public Criteria andProteinGreaterThan(String value) {
            addCriterion("protein >", value, "protein");
            return (Criteria) this;
        }

        public Criteria andProteinGreaterThanOrEqualTo(String value) {
            addCriterion("protein >=", value, "protein");
            return (Criteria) this;
        }

        public Criteria andProteinLessThan(String value) {
            addCriterion("protein <", value, "protein");
            return (Criteria) this;
        }

        public Criteria andProteinLessThanOrEqualTo(String value) {
            addCriterion("protein <=", value, "protein");
            return (Criteria) this;
        }

        public Criteria andProteinLike(String value) {
            addCriterion("protein like", value, "protein");
            return (Criteria) this;
        }

        public Criteria andProteinNotLike(String value) {
            addCriterion("protein not like", value, "protein");
            return (Criteria) this;
        }

        public Criteria andProteinIn(List<String> values) {
            addCriterion("protein in", values, "protein");
            return (Criteria) this;
        }

        public Criteria andProteinNotIn(List<String> values) {
            addCriterion("protein not in", values, "protein");
            return (Criteria) this;
        }

        public Criteria andProteinBetween(String value1, String value2) {
            addCriterion("protein between", value1, value2, "protein");
            return (Criteria) this;
        }

        public Criteria andProteinNotBetween(String value1, String value2) {
            addCriterion("protein not between", value1, value2, "protein");
            return (Criteria) this;
        }

        public Criteria andMetricsIsNull() {
            addCriterion("metrics is null");
            return (Criteria) this;
        }

        public Criteria andMetricsIsNotNull() {
            addCriterion("metrics is not null");
            return (Criteria) this;
        }

        public Criteria andMetricsEqualTo(String value) {
            addCriterion("metrics =", value, "metrics");
            return (Criteria) this;
        }

        public Criteria andMetricsNotEqualTo(String value) {
            addCriterion("metrics <>", value, "metrics");
            return (Criteria) this;
        }

        public Criteria andMetricsGreaterThan(String value) {
            addCriterion("metrics >", value, "metrics");
            return (Criteria) this;
        }

        public Criteria andMetricsGreaterThanOrEqualTo(String value) {
            addCriterion("metrics >=", value, "metrics");
            return (Criteria) this;
        }

        public Criteria andMetricsLessThan(String value) {
            addCriterion("metrics <", value, "metrics");
            return (Criteria) this;
        }

        public Criteria andMetricsLessThanOrEqualTo(String value) {
            addCriterion("metrics <=", value, "metrics");
            return (Criteria) this;
        }

        public Criteria andMetricsLike(String value) {
            addCriterion("metrics like", value, "metrics");
            return (Criteria) this;
        }

        public Criteria andMetricsNotLike(String value) {
            addCriterion("metrics not like", value, "metrics");
            return (Criteria) this;
        }

        public Criteria andMetricsIn(List<String> values) {
            addCriterion("metrics in", values, "metrics");
            return (Criteria) this;
        }

        public Criteria andMetricsNotIn(List<String> values) {
            addCriterion("metrics not in", values, "metrics");
            return (Criteria) this;
        }

        public Criteria andMetricsBetween(String value1, String value2) {
            addCriterion("metrics between", value1, value2, "metrics");
            return (Criteria) this;
        }

        public Criteria andMetricsNotBetween(String value1, String value2) {
            addCriterion("metrics not between", value1, value2, "metrics");
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