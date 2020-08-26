package cn.maixedu.zsb.model;

import java.util.Date;

public class QuestionBankCollect {
    private Integer id;

    private Integer userid;

    private Integer questionbankid;

    private Date time;

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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}