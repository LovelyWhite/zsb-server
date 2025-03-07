package cn.maixedu.zsb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuestionBankExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionBankExample() {
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

        public Criteria andQuestionbanktypeidIsNull() {
            addCriterion("questionbanktypeid is null");
            return (Criteria) this;
        }

        public Criteria andQuestionbanktypeidIsNotNull() {
            addCriterion("questionbanktypeid is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionbanktypeidEqualTo(Integer value) {
            addCriterion("questionbanktypeid =", value, "questionbanktypeid");
            return (Criteria) this;
        }

        public Criteria andQuestionbanktypeidNotEqualTo(Integer value) {
            addCriterion("questionbanktypeid <>", value, "questionbanktypeid");
            return (Criteria) this;
        }

        public Criteria andQuestionbanktypeidGreaterThan(Integer value) {
            addCriterion("questionbanktypeid >", value, "questionbanktypeid");
            return (Criteria) this;
        }

        public Criteria andQuestionbanktypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("questionbanktypeid >=", value, "questionbanktypeid");
            return (Criteria) this;
        }

        public Criteria andQuestionbanktypeidLessThan(Integer value) {
            addCriterion("questionbanktypeid <", value, "questionbanktypeid");
            return (Criteria) this;
        }

        public Criteria andQuestionbanktypeidLessThanOrEqualTo(Integer value) {
            addCriterion("questionbanktypeid <=", value, "questionbanktypeid");
            return (Criteria) this;
        }

        public Criteria andQuestionbanktypeidIn(List<Integer> values) {
            addCriterion("questionbanktypeid in", values, "questionbanktypeid");
            return (Criteria) this;
        }

        public Criteria andQuestionbanktypeidNotIn(List<Integer> values) {
            addCriterion("questionbanktypeid not in", values, "questionbanktypeid");
            return (Criteria) this;
        }

        public Criteria andQuestionbanktypeidBetween(Integer value1, Integer value2) {
            addCriterion("questionbanktypeid between", value1, value2, "questionbanktypeid");
            return (Criteria) this;
        }

        public Criteria andQuestionbanktypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("questionbanktypeid not between", value1, value2, "questionbanktypeid");
            return (Criteria) this;
        }

        public Criteria andFsubjectidIsNull() {
            addCriterion("fsubjectid is null");
            return (Criteria) this;
        }

        public Criteria andFsubjectidIsNotNull() {
            addCriterion("fsubjectid is not null");
            return (Criteria) this;
        }

        public Criteria andFsubjectidEqualTo(Integer value) {
            addCriterion("fsubjectid =", value, "fsubjectid");
            return (Criteria) this;
        }

        public Criteria andFsubjectidNotEqualTo(Integer value) {
            addCriterion("fsubjectid <>", value, "fsubjectid");
            return (Criteria) this;
        }

        public Criteria andFsubjectidGreaterThan(Integer value) {
            addCriterion("fsubjectid >", value, "fsubjectid");
            return (Criteria) this;
        }

        public Criteria andFsubjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fsubjectid >=", value, "fsubjectid");
            return (Criteria) this;
        }

        public Criteria andFsubjectidLessThan(Integer value) {
            addCriterion("fsubjectid <", value, "fsubjectid");
            return (Criteria) this;
        }

        public Criteria andFsubjectidLessThanOrEqualTo(Integer value) {
            addCriterion("fsubjectid <=", value, "fsubjectid");
            return (Criteria) this;
        }

        public Criteria andFsubjectidIn(List<Integer> values) {
            addCriterion("fsubjectid in", values, "fsubjectid");
            return (Criteria) this;
        }

        public Criteria andFsubjectidNotIn(List<Integer> values) {
            addCriterion("fsubjectid not in", values, "fsubjectid");
            return (Criteria) this;
        }

        public Criteria andFsubjectidBetween(Integer value1, Integer value2) {
            addCriterion("fsubjectid between", value1, value2, "fsubjectid");
            return (Criteria) this;
        }

        public Criteria andFsubjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("fsubjectid not between", value1, value2, "fsubjectid");
            return (Criteria) this;
        }

        public Criteria andSsubjectidIsNull() {
            addCriterion("ssubjectid is null");
            return (Criteria) this;
        }

        public Criteria andSsubjectidIsNotNull() {
            addCriterion("ssubjectid is not null");
            return (Criteria) this;
        }

        public Criteria andSsubjectidEqualTo(Integer value) {
            addCriterion("ssubjectid =", value, "ssubjectid");
            return (Criteria) this;
        }

        public Criteria andSsubjectidNotEqualTo(Integer value) {
            addCriterion("ssubjectid <>", value, "ssubjectid");
            return (Criteria) this;
        }

        public Criteria andSsubjectidGreaterThan(Integer value) {
            addCriterion("ssubjectid >", value, "ssubjectid");
            return (Criteria) this;
        }

        public Criteria andSsubjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ssubjectid >=", value, "ssubjectid");
            return (Criteria) this;
        }

        public Criteria andSsubjectidLessThan(Integer value) {
            addCriterion("ssubjectid <", value, "ssubjectid");
            return (Criteria) this;
        }

        public Criteria andSsubjectidLessThanOrEqualTo(Integer value) {
            addCriterion("ssubjectid <=", value, "ssubjectid");
            return (Criteria) this;
        }

        public Criteria andSsubjectidIn(List<Integer> values) {
            addCriterion("ssubjectid in", values, "ssubjectid");
            return (Criteria) this;
        }

        public Criteria andSsubjectidNotIn(List<Integer> values) {
            addCriterion("ssubjectid not in", values, "ssubjectid");
            return (Criteria) this;
        }

        public Criteria andSsubjectidBetween(Integer value1, Integer value2) {
            addCriterion("ssubjectid between", value1, value2, "ssubjectid");
            return (Criteria) this;
        }

        public Criteria andSsubjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("ssubjectid not between", value1, value2, "ssubjectid");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
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

        public Criteria andAnticipatetimeIsNull() {
            addCriterion("anticipatetime is null");
            return (Criteria) this;
        }

        public Criteria andAnticipatetimeIsNotNull() {
            addCriterion("anticipatetime is not null");
            return (Criteria) this;
        }

        public Criteria andAnticipatetimeEqualTo(Date value) {
            addCriterion("anticipatetime =", value, "anticipatetime");
            return (Criteria) this;
        }

        public Criteria andAnticipatetimeNotEqualTo(Date value) {
            addCriterion("anticipatetime <>", value, "anticipatetime");
            return (Criteria) this;
        }

        public Criteria andAnticipatetimeGreaterThan(Date value) {
            addCriterion("anticipatetime >", value, "anticipatetime");
            return (Criteria) this;
        }

        public Criteria andAnticipatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("anticipatetime >=", value, "anticipatetime");
            return (Criteria) this;
        }

        public Criteria andAnticipatetimeLessThan(Date value) {
            addCriterion("anticipatetime <", value, "anticipatetime");
            return (Criteria) this;
        }

        public Criteria andAnticipatetimeLessThanOrEqualTo(Date value) {
            addCriterion("anticipatetime <=", value, "anticipatetime");
            return (Criteria) this;
        }

        public Criteria andAnticipatetimeIn(List<Date> values) {
            addCriterion("anticipatetime in", values, "anticipatetime");
            return (Criteria) this;
        }

        public Criteria andAnticipatetimeNotIn(List<Date> values) {
            addCriterion("anticipatetime not in", values, "anticipatetime");
            return (Criteria) this;
        }

        public Criteria andAnticipatetimeBetween(Date value1, Date value2) {
            addCriterion("anticipatetime between", value1, value2, "anticipatetime");
            return (Criteria) this;
        }

        public Criteria andAnticipatetimeNotBetween(Date value1, Date value2) {
            addCriterion("anticipatetime not between", value1, value2, "anticipatetime");
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

        public Criteria andPrefectscoreIsNull() {
            addCriterion("prefectscore is null");
            return (Criteria) this;
        }

        public Criteria andPrefectscoreIsNotNull() {
            addCriterion("prefectscore is not null");
            return (Criteria) this;
        }

        public Criteria andPrefectscoreEqualTo(Integer value) {
            addCriterion("prefectscore =", value, "prefectscore");
            return (Criteria) this;
        }

        public Criteria andPrefectscoreNotEqualTo(Integer value) {
            addCriterion("prefectscore <>", value, "prefectscore");
            return (Criteria) this;
        }

        public Criteria andPrefectscoreGreaterThan(Integer value) {
            addCriterion("prefectscore >", value, "prefectscore");
            return (Criteria) this;
        }

        public Criteria andPrefectscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("prefectscore >=", value, "prefectscore");
            return (Criteria) this;
        }

        public Criteria andPrefectscoreLessThan(Integer value) {
            addCriterion("prefectscore <", value, "prefectscore");
            return (Criteria) this;
        }

        public Criteria andPrefectscoreLessThanOrEqualTo(Integer value) {
            addCriterion("prefectscore <=", value, "prefectscore");
            return (Criteria) this;
        }

        public Criteria andPrefectscoreIn(List<Integer> values) {
            addCriterion("prefectscore in", values, "prefectscore");
            return (Criteria) this;
        }

        public Criteria andPrefectscoreNotIn(List<Integer> values) {
            addCriterion("prefectscore not in", values, "prefectscore");
            return (Criteria) this;
        }

        public Criteria andPrefectscoreBetween(Integer value1, Integer value2) {
            addCriterion("prefectscore between", value1, value2, "prefectscore");
            return (Criteria) this;
        }

        public Criteria andPrefectscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("prefectscore not between", value1, value2, "prefectscore");
            return (Criteria) this;
        }

        public Criteria andPassscoreIsNull() {
            addCriterion("passscore is null");
            return (Criteria) this;
        }

        public Criteria andPassscoreIsNotNull() {
            addCriterion("passscore is not null");
            return (Criteria) this;
        }

        public Criteria andPassscoreEqualTo(Integer value) {
            addCriterion("passscore =", value, "passscore");
            return (Criteria) this;
        }

        public Criteria andPassscoreNotEqualTo(Integer value) {
            addCriterion("passscore <>", value, "passscore");
            return (Criteria) this;
        }

        public Criteria andPassscoreGreaterThan(Integer value) {
            addCriterion("passscore >", value, "passscore");
            return (Criteria) this;
        }

        public Criteria andPassscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("passscore >=", value, "passscore");
            return (Criteria) this;
        }

        public Criteria andPassscoreLessThan(Integer value) {
            addCriterion("passscore <", value, "passscore");
            return (Criteria) this;
        }

        public Criteria andPassscoreLessThanOrEqualTo(Integer value) {
            addCriterion("passscore <=", value, "passscore");
            return (Criteria) this;
        }

        public Criteria andPassscoreIn(List<Integer> values) {
            addCriterion("passscore in", values, "passscore");
            return (Criteria) this;
        }

        public Criteria andPassscoreNotIn(List<Integer> values) {
            addCriterion("passscore not in", values, "passscore");
            return (Criteria) this;
        }

        public Criteria andPassscoreBetween(Integer value1, Integer value2) {
            addCriterion("passscore between", value1, value2, "passscore");
            return (Criteria) this;
        }

        public Criteria andPassscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("passscore not between", value1, value2, "passscore");
            return (Criteria) this;
        }

        public Criteria andIntroIsNull() {
            addCriterion("intro is null");
            return (Criteria) this;
        }

        public Criteria andIntroIsNotNull() {
            addCriterion("intro is not null");
            return (Criteria) this;
        }

        public Criteria andIntroEqualTo(String value) {
            addCriterion("intro =", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotEqualTo(String value) {
            addCriterion("intro <>", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroGreaterThan(String value) {
            addCriterion("intro >", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroGreaterThanOrEqualTo(String value) {
            addCriterion("intro >=", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLessThan(String value) {
            addCriterion("intro <", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLessThanOrEqualTo(String value) {
            addCriterion("intro <=", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLike(String value) {
            addCriterion("intro like", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotLike(String value) {
            addCriterion("intro not like", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroIn(List<String> values) {
            addCriterion("intro in", values, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotIn(List<String> values) {
            addCriterion("intro not in", values, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroBetween(String value1, String value2) {
            addCriterion("intro between", value1, value2, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotBetween(String value1, String value2) {
            addCriterion("intro not between", value1, value2, "intro");
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