package cn.maixedu.zsb.model;


public class Log {

  private long id;
  private long userid;
  private java.sql.Timestamp time;
  private String log;


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


  public java.sql.Timestamp getTime() {
    return time;
  }

  public void setTime(java.sql.Timestamp time) {
    this.time = time;
  }


  public String getLog() {
    return log;
  }

  public void setLog(String log) {
    this.log = log;
  }

}
