package cn.maixedu.zsb.model;

public class BankWithQuestion {
    private Integer id;

    private Integer questionbankid;

    private Integer questionid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuestionbankid() {
        return questionbankid;
    }

    public void setQuestionbankid(Integer questionbankid) {
        this.questionbankid = questionbankid;
    }

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }
}