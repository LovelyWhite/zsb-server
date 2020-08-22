package cn.maixedu.zsb;


public class Order {

  private long id;
  private long userid;
  private String status;
  private java.sql.Timestamp ordertime;
  private java.sql.Timestamp paytime;
  private String comment;
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


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public java.sql.Timestamp getOrdertime() {
    return ordertime;
  }

  public void setOrdertime(java.sql.Timestamp ordertime) {
    this.ordertime = ordertime;
  }


  public java.sql.Timestamp getPaytime() {
    return paytime;
  }

  public void setPaytime(java.sql.Timestamp paytime) {
    this.paytime = paytime;
  }


  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  public long getSocre() {
    return socre;
  }

  public void setSocre(long socre) {
    this.socre = socre;
  }

}
