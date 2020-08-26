package cn.maixedu.zsb.model;


public class Course {

  private long id;
  private long teacherid;
  private long priceid;
  private String name;
  private String intro;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getTeacherid() {
    return teacherid;
  }

  public void setTeacherid(long teacherid) {
    this.teacherid = teacherid;
  }


  public long getPriceid() {
    return priceid;
  }

  public void setPriceid(long priceid) {
    this.priceid = priceid;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getIntro() {
    return intro;
  }

  public void setIntro(String intro) {
    this.intro = intro;
  }

}
