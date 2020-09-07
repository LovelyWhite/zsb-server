package cn.maixedu.zsb.model;

import java.util.Date;

public class QuestionBank {
    private Integer id;

    private Integer questionbanktypeid;

    private Integer fsubjectid;

    private Integer ssubjectid;

    private String city;

    private Integer priceid;

    private String name;

    private Date anticipatetime;

    private Date updatetime;

    private Integer prefectscore;

    private Integer passscore;

    private String intro;

    public QuestionBank() {
    }
    public QuestionBank(QuestionBank questionBank) {
        this.id = questionBank.id;
        this.questionbanktypeid = questionBank.questionbanktypeid;
        this.fsubjectid = questionBank.fsubjectid;
        this.ssubjectid = questionBank.ssubjectid;
        this.city = questionBank.city;
        this.priceid = questionBank.priceid;
        this.name = questionBank.name;
        this.anticipatetime = questionBank.anticipatetime;
        this.updatetime = questionBank.updatetime;
        this.prefectscore = questionBank.prefectscore;
        this.passscore = questionBank.passscore;
        this.intro = questionBank.intro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuestionbanktypeid() {
        return questionbanktypeid;
    }

    public void setQuestionbanktypeid(Integer questionbanktypeid) {
        this.questionbanktypeid = questionbanktypeid;
    }

    public Integer getFsubjectid() {
        return fsubjectid;
    }

    public void setFsubjectid(Integer fsubjectid) {
        this.fsubjectid = fsubjectid;
    }

    public Integer getSsubjectid() {
        return ssubjectid;
    }

    public void setSsubjectid(Integer ssubjectid) {
        this.ssubjectid = ssubjectid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPriceid() {
        return priceid;
    }

    public void setPriceid(Integer priceid) {
        this.priceid = priceid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getAnticipatetime() {
        return anticipatetime;
    }

    public void setAnticipatetime(Date anticipatetime) {
        this.anticipatetime = anticipatetime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getPrefectscore() {
        return prefectscore;
    }

    public void setPrefectscore(Integer prefectscore) {
        this.prefectscore = prefectscore;
    }

    public Integer getPassscore() {
        return passscore;
    }

    public void setPassscore(Integer passscore) {
        this.passscore = passscore;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }
}