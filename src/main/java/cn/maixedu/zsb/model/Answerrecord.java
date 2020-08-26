package cn.maixedu.zsb.model;

import java.util.Date;

public class AnswerRecord {
    private Integer id;

    private Integer userid;

    private Integer questionbankid;

    private Integer costtime;

    private Date ansertime;

    private Integer gotsocre;

    private Integer socre;

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

    public Date getAnsertime() {
        return ansertime;
    }

    public void setAnsertime(Date ansertime) {
        this.ansertime = ansertime;
    }

    public Integer getGotsocre() {
        return gotsocre;
    }

    public void setGotsocre(Integer gotsocre) {
        this.gotsocre = gotsocre;
    }

    public Integer getSocre() {
        return socre;
    }

    public void setSocre(Integer socre) {
        this.socre = socre;
    }
}