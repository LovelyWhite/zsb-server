package cn.maixedu.zsb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNull() {
            addCriterion("teacherid is null");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNotNull() {
            addCriterion("teacherid is not null");
            return (Criteria) this;
        }

        public Criteria andTeacheridEqualTo(Integer value) {
            addCriterion("teacherid =", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotEqualTo(Integer value) {
            addCriterion("teacherid <>", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThan(Integer value) {
            addCriterion("teacherid >", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacherid >=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThan(Integer value) {
            addCriterion("teacherid <", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThanOrEqualTo(Integer value) {
            addCriterion("teacherid <=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridIn(List<Integer> values) {
            addCriterion("teacherid in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotIn(List<Integer> values) {
            addCriterion("teacherid not in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridBetween(Integer value1, Integer value2) {
            addCriterion("teacherid between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotBetween(Integer value1, Integer value2) {
            addCriterion("teacherid not between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andPriceidIsNull() {
            addCriterion("priceid is null");
            return (Criteria) this;
        }

        public Criteria andPriceidIsNotNull() {
            addCriterion("priceid is not null");
            return (Criteria) this;
        }

        public Criteria andPriceidEqualTo(Integer value) {
            addCriterion("priceid =", value, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidNotEqualTo(Integer value) {
            addCriterion("priceid <>", value, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidGreaterThan(Integer value) {
            addCriterion("priceid >", value, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("priceid >=", value, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidLessThan(Integer value) {
            addCriterion("priceid <", value, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidLessThanOrEqualTo(Integer value) {
            addCriterion("priceid <=", value, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidIn(List<Integer> values) {
            addCriterion("priceid in", values, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidNotIn(List<Integer> values) {
            addCriterion("priceid not in", values, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidBetween(Integer value1, Integer value2) {
            addCriterion("priceid between", value1, value2, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidNotBetween(Integer value1, Integer value2) {
            addCriterion("priceid not between", value1, value2, "priceid");
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

        public Criteria andPosterIsNull() {
            addCriterion("poster is null");
            return (Criteria) this;
        }

        public Criteria andPosterIsNotNull() {
            addCriterion("poster is not null");
            return (Criteria) this;
        }

        public Criteria andPosterEqualTo(String value) {
            addCriterion("poster =", value, "poster");
            return (Criteria) this;
        }

        public Criteria andPosterNotEqualTo(String value) {
            addCriterion("poster <>", value, "poster");
            return (Criteria) this;
        }

        public Criteria andPosterGreaterThan(String value) {
            addCriterion("poster >", value, "poster");
            return (Criteria) this;
        }

        public Criteria andPosterGreaterThanOrEqualTo(String value) {
            addCriterion("poster >=", value, "poster");
            return (Criteria) this;
        }

        public Criteria andPosterLessThan(String value) {
            addCriterion("poster <", value, "poster");
            return (Criteria) this;
        }

        public Criteria andPosterLessThanOrEqualTo(String value) {
            addCriterion("poster <=", value, "poster");
            return (Criteria) this;
        }

        public Criteria andPosterLike(String value) {
            addCriterion("poster like", value, "poster");
            return (Criteria) this;
        }

        public Criteria andPosterNotLike(String value) {
            addCriterion("poster not like", value, "poster");
            return (Criteria) this;
        }

        public Criteria andPosterIn(List<String> values) {
            addCriterion("poster in", values, "poster");
            return (Criteria) this;
        }

        public Criteria andPosterNotIn(List<String> values) {
            addCriterion("poster not in", values, "poster");
            return (Criteria) this;
        }

        public Criteria andPosterBetween(String value1, String value2) {
            addCriterion("poster between", value1, value2, "poster");
            return (Criteria) this;
        }

        public Criteria andPosterNotBetween(String value1, String value2) {
            addCriterion("poster not between", value1, value2, "poster");
            return (Criteria) this;
        }

        public Criteria andViewsnumIsNull() {
            addCriterion("viewsnum is null");
            return (Criteria) this;
        }

        public Criteria andViewsnumIsNotNull() {
            addCriterion("viewsnum is not null");
            return (Criteria) this;
        }

        public Criteria andViewsnumEqualTo(Integer value) {
            addCriterion("viewsnum =", value, "viewsnum");
            return (Criteria) this;
        }

        public Criteria andViewsnumNotEqualTo(Integer value) {
            addCriterion("viewsnum <>", value, "viewsnum");
            return (Criteria) this;
        }

        public Criteria andViewsnumGreaterThan(Integer value) {
            addCriterion("viewsnum >", value, "viewsnum");
            return (Criteria) this;
        }

        public Criteria andViewsnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("viewsnum >=", value, "viewsnum");
            return (Criteria) this;
        }

        public Criteria andViewsnumLessThan(Integer value) {
            addCriterion("viewsnum <", value, "viewsnum");
            return (Criteria) this;
        }

        public Criteria andViewsnumLessThanOrEqualTo(Integer value) {
            addCriterion("viewsnum <=", value, "viewsnum");
            return (Criteria) this;
        }

        public Criteria andViewsnumIn(List<Integer> values) {
            addCriterion("viewsnum in", values, "viewsnum");
            return (Criteria) this;
        }

        public Criteria andViewsnumNotIn(List<Integer> values) {
            addCriterion("viewsnum not in", values, "viewsnum");
            return (Criteria) this;
        }

        public Criteria andViewsnumBetween(Integer value1, Integer value2) {
            addCriterion("viewsnum between", value1, value2, "viewsnum");
            return (Criteria) this;
        }

        public Criteria andViewsnumNotBetween(Integer value1, Integer value2) {
            addCriterion("viewsnum not between", value1, value2, "viewsnum");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andSecondsubjectidIsNull() {
            addCriterion("secondsubjectid is null");
            return (Criteria) this;
        }

        public Criteria andSecondsubjectidIsNotNull() {
            addCriterion("secondsubjectid is not null");
            return (Criteria) this;
        }

        public Criteria andSecondsubjectidEqualTo(Integer value) {
            addCriterion("secondsubjectid =", value, "secondsubjectid");
            return (Criteria) this;
        }

        public Criteria andSecondsubjectidNotEqualTo(Integer value) {
            addCriterion("secondsubjectid <>", value, "secondsubjectid");
            return (Criteria) this;
        }

        public Criteria andSecondsubjectidGreaterThan(Integer value) {
            addCriterion("secondsubjectid >", value, "secondsubjectid");
            return (Criteria) this;
        }

        public Criteria andSecondsubjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("secondsubjectid >=", value, "secondsubjectid");
            return (Criteria) this;
        }

        public Criteria andSecondsubjectidLessThan(Integer value) {
            addCriterion("secondsubjectid <", value, "secondsubjectid");
            return (Criteria) this;
        }

        public Criteria andSecondsubjectidLessThanOrEqualTo(Integer value) {
            addCriterion("secondsubjectid <=", value, "secondsubjectid");
            return (Criteria) this;
        }

        public Criteria andSecondsubjectidIn(List<Integer> values) {
            addCriterion("secondsubjectid in", values, "secondsubjectid");
            return (Criteria) this;
        }

        public Criteria andSecondsubjectidNotIn(List<Integer> values) {
            addCriterion("secondsubjectid not in", values, "secondsubjectid");
            return (Criteria) this;
        }

        public Criteria andSecondsubjectidBetween(Integer value1, Integer value2) {
            addCriterion("secondsubjectid between", value1, value2, "secondsubjectid");
            return (Criteria) this;
        }

        public Criteria andSecondsubjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("secondsubjectid not between", value1, value2, "secondsubjectid");
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