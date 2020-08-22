package cn.maixedu.zsb;


public class Questionnote {

  private long id;
  private long userid;
  private long questionid;
  private java.sql.Timestamp time;
  private String note;


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


  public long getQuestionid() {
    return questionid;
  }

  public void setQuestionid(long questionid) {
    this.questionid = questionid;
  }


  public java.sql.Timestamp getTime() {
    return time;
  }

  public void setTime(java.sql.Timestamp time) {
    this.time = time;
  }


  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

}
