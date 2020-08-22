package cn.maixedu.zsb;


public class Questionbankcomment {

  private long id;
  private long userid;
  private long questionbankid;
  private long score;
  private java.sql.Timestamp time;
  private String comment;


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


  public long getScore() {
    return score;
  }

  public void setScore(long score) {
    this.score = score;
  }


  public java.sql.Timestamp getTime() {
    return time;
  }

  public void setTime(java.sql.Timestamp time) {
    this.time = time;
  }


  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

}
