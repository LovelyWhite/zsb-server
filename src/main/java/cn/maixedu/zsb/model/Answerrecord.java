package cn.maixedu.zsb.model;


public class Answerrecord {

  private long id;
  private long userid;
  private long questionbankid;
  private long costtime;
  private java.sql.Timestamp ansertime;
  private long gotsocre;
  private long socre;


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


  public long getCosttime() {
    return costtime;
  }

  public void setCosttime(long costtime) {
    this.costtime = costtime;
  }


  public java.sql.Timestamp getAnsertime() {
    return ansertime;
  }

  public void setAnsertime(java.sql.Timestamp ansertime) {
    this.ansertime = ansertime;
  }


  public long getGotsocre() {
    return gotsocre;
  }

  public void setGotsocre(long gotsocre) {
    this.gotsocre = gotsocre;
  }


  public long getSocre() {
    return socre;
  }

  public void setSocre(long socre) {
    this.socre = socre;
  }

}
