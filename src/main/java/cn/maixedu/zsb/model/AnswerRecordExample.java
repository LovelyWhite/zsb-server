package cn.maixedu.zsb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AnswerRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnswerRecordExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andQuestionbankidIsNull() {
            addCriterion("questionbankid is null");
            return (Criteria) this;
        }

        public Criteria andQuestionbankidIsNotNull() {
            addCriterion("questionbankid is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionbankidEqualTo(Integer value) {
            addCriterion("questionbankid =", value, "questionbankid");
            return (Criteria) this;
        }

        public Criteria andQuestionbankidNotEqualTo(Integer value) {
            addCriterion("questionbankid <>", value, "questionbankid");
            return (Criteria) this;
        }

        public Criteria andQuestionbankidGreaterThan(Integer value) {
            addCriterion("questionbankid >", value, "questionbankid");
            return (Criteria) this;
        }

        public Criteria andQuestionbankidGreaterThanOrEqualTo(Integer value) {
            addCriterion("questionbankid >=", value, "questionbankid");
            return (Criteria) this;
        }

        public Criteria andQuestionbankidLessThan(Integer value) {
            addCriterion("questionbankid <", value, "questionbankid");
            return (Criteria) this;
        }

        public Criteria andQuestionbankidLessThanOrEqualTo(Integer value) {
            addCriterion("questionbankid <=", value, "questionbankid");
            return (Criteria) this;
        }

        public Criteria andQuestionbankidIn(List<Integer> values) {
            addCriterion("questionbankid in", values, "questionbankid");
            return (Criteria) this;
        }

        public Criteria andQuestionbankidNotIn(List<Integer> values) {
            addCriterion("questionbankid not in", values, "questionbankid");
            return (Criteria) this;
        }

        public Criteria andQuestionbankidBetween(Integer value1, Integer value2) {
            addCriterion("questionbankid between", value1, value2, "questionbankid");
            return (Criteria) this;
        }

        public Criteria andQuestionbankidNotBetween(Integer value1, Integer value2) {
            addCriterion("questionbankid not between", value1, value2, "questionbankid");
            return (Criteria) this;
        }

        public Criteria andCosttimeIsNull() {
            addCriterion("costtime is null");
            return (Criteria) this;
        }

        public Criteria andCosttimeIsNotNull() {
            addCriterion("costtime is not null");
            return (Criteria) this;
        }

        public Criteria andCosttimeEqualTo(Integer value) {
            addCriterion("costtime =", value, "costtime");
            return (Criteria) this;
        }

        public Criteria andCosttimeNotEqualTo(Integer value) {
            addCriterion("costtime <>", value, "costtime");
            return (Criteria) this;
        }

        public Criteria andCosttimeGreaterThan(Integer value) {
            addCriterion("costtime >", value, "costtime");
            return (Criteria) this;
        }

        public Criteria andCosttimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("costtime >=", value, "costtime");
            return (Criteria) this;
        }

        public Criteria andCosttimeLessThan(Integer value) {
            addCriterion("costtime <", value, "costtime");
            return (Criteria) this;
        }

        public Criteria andCosttimeLessThanOrEqualTo(Integer value) {
            addCriterion("costtime <=", value, "costtime");
            return (Criteria) this;
        }

        public Criteria andCosttimeIn(List<Integer> values) {
            addCriterion("costtime in", values, "costtime");
            return (Criteria) this;
        }

        public Criteria andCosttimeNotIn(List<Integer> values) {
            addCriterion("costtime not in", values, "costtime");
            return (Criteria) this;
        }

        public Criteria andCosttimeBetween(Integer value1, Integer value2) {
            addCriterion("costtime between", value1, value2, "costtime");
            return (Criteria) this;
        }

        public Criteria andCosttimeNotBetween(Integer value1, Integer value2) {
            addCriterion("costtime not between", value1, value2, "costtime");
            return (Criteria) this;
        }

        public Criteria andAnswertimeIsNull() {
            addCriterion("answertime is null");
            return (Criteria) this;
        }

        public Criteria andAnswertimeIsNotNull() {
            addCriterion("answertime is not null");
            return (Criteria) this;
        }

        public Criteria andAnswertimeEqualTo(Date value) {
            addCriterion("answertime =", value, "answertime");
            return (Criteria) this;
        }

        public Criteria andAnswertimeNotEqualTo(Date value) {
            addCriterion("answertime <>", value, "answertime");
            return (Criteria) this;
        }

        public Criteria andAnswertimeGreaterThan(Date value) {
            addCriterion("answertime >", value, "answertime");
            return (Criteria) this;
        }

        public Criteria andAnswertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("answertime >=", value, "answertime");
            return (Criteria) this;
        }

        public Criteria andAnswertimeLessThan(Date value) {
            addCriterion("answertime <", value, "answertime");
            return (Criteria) this;
        }

        public Criteria andAnswertimeLessThanOrEqualTo(Date value) {
            addCriterion("answertime <=", value, "answertime");
            return (Criteria) this;
        }

        public Criteria andAnswertimeIn(List<Date> values) {
            addCriterion("answertime in", values, "answertime");
            return (Criteria) this;
        }

        public Criteria andAnswertimeNotIn(List<Date> values) {
            addCriterion("answertime not in", values, "answertime");
            return (Criteria) this;
        }

        public Criteria andAnswertimeBetween(Date value1, Date value2) {
            addCriterion("answertime between", value1, value2, "answertime");
            return (Criteria) this;
        }

        public Criteria andAnswertimeNotBetween(Date value1, Date value2) {
            addCriterion("answertime not between", value1, value2, "answertime");
            return (Criteria) this;
        }

        public Criteria andGotscoreIsNull() {
            addCriterion("gotscore is null");
            return (Criteria) this;
        }

        public Criteria andGotscoreIsNotNull() {
            addCriterion("gotscore is not null");
            return (Criteria) this;
        }

        public Criteria andGotscoreEqualTo(Integer value) {
            addCriterion("gotscore =", value, "gotscore");
            return (Criteria) this;
        }

        public Criteria andGotscoreNotEqualTo(Integer value) {
            addCriterion("gotscore <>", value, "gotscore");
            return (Criteria) this;
        }

        public Criteria andGotscoreGreaterThan(Integer value) {
            addCriterion("gotscore >", value, "gotscore");
            return (Criteria) this;
        }

        public Criteria andGotscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("gotscore >=", value, "gotscore");
            return (Criteria) this;
        }

        public Criteria andGotscoreLessThan(Integer value) {
            addCriterion("gotscore <", value, "gotscore");
            return (Criteria) this;
        }

        public Criteria andGotscoreLessThanOrEqualTo(Integer value) {
            addCriterion("gotscore <=", value, "gotscore");
            return (Criteria) this;
        }

        public Criteria andGotscoreIn(List<Integer> values) {
            addCriterion("gotscore in", values, "gotscore");
            return (Criteria) this;
        }

        public Criteria andGotscoreNotIn(List<Integer> values) {
            addCriterion("gotscore not in", values, "gotscore");
            return (Criteria) this;
        }

        public Criteria andGotscoreBetween(Integer value1, Integer value2) {
            addCriterion("gotscore between", value1, value2, "gotscore");
            return (Criteria) this;
        }

        public Criteria andGotscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("gotscore not between", value1, value2, "gotscore");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
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