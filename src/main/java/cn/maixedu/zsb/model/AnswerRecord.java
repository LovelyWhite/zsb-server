package cn.maixedu.zsb.model;

import java.util.Date;

public class AnswerRecord {
    private Integer id;

    private Integer userid;

    private Integer questionbankid;

    private Integer costtime;

    private Date answertime;

    private Integer gotscore;

    private Integer score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getQuestionbankid() {
        return questionbankid;
    }

    public void setQuestionbankid(Integer questionbankid) {
        this.questionbankid = questionbankid;
    }

    public Integer getCosttime() {
        return costtime;
    }

    public void setCosttime(Integer costtime) {
        this.costtime = costtime;
    }

    public Date getAnswertime() {
        return answertime;
    }

    public void setAnswertime(Date answertime) {
        this.answertime = answertime;
    }

    public Integer getGotscore() {
        return gotscore;
    }

    public void setGotscore(Integer gotscore) {
        this.gotscore = gotscore;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}