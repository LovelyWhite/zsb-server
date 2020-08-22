package cn.maixedu.zsb;


public class Questionbankcollect {

  private long id;
  private long userid;
  private long questionbankid;
  private java.sql.Timestamp time;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }


  public long getQuestionbankid() {
    return questionbankid;
  }

  public void setQuestionbankid(long questionbankid) {
    this.questionbankid = questionbankid;
  }


  public java.sql.Timestamp getTime() {
    return time;
  }

  public void setTime(java.sql.Timestamp time) {
    this.time = time;
  }

}
