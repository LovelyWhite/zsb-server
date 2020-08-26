package cn.maixedu.zsb.model;


public class Bookcomment {

  private long id;
  private long userid;
  private long bookid;
  private java.sql.Timestamp time;
  private long score;
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


  public long getBookid() {
    return bookid;
  }

  public void setBookid(long bookid) {
    this.bookid = bookid;
  }


  public java.sql.Timestamp getTime() {
    return time;
  }

  public void setTime(java.sql.Timestamp time) {
    this.time = time;
  }


  public long getScore() {
    return score;
  }

  public void setScore(long score) {
    this.score = score;
  }


  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

}
