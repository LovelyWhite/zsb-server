package cn.maixedu.zsb.model;

public class NoteLike {
    private Integer id;

    private Integer userid;

    private Integer questionnoteid;

    private String status;

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

    public Integer getQuestionnoteid() {
        return questionnoteid;
    }

    public void setQuestionnoteid(Integer questionnoteid) {
        this.questionnoteid = questionnoteid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}