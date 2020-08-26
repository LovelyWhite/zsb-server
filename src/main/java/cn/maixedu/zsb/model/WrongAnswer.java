package cn.maixedu.zsb.model;

import java.util.Date;

public class WrongAnswer {
    private Integer id;

    private Integer ssubjectid;

    private Integer questionid;

    private Date time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSsubjectid() {
        return ssubjectid;
    }

    public void setSsubjectid(Integer ssubjectid) {
        this.ssubjectid = ssubjectid;
    }

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}