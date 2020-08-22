package cn.maixedu.zsb;


public class Questionbank {

  private long id;
  private long questionbanktypeid;
  private long fsubjectid;
  private long ssubjectid;
  private long priceid;
  private String name;
  private java.sql.Timestamp anticipatetime;
  private java.sql.Timestamp updatetime;
  private long prefectscore;
  private long passscore;
  private String intro;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getQuestionbanktypeid() {
    return questionbanktypeid;
  }

  public void setQuestionbanktypeid(long questionbanktypeid) {
    this.questionbanktypeid = questionbanktypeid;
  }


  public long getFsubjectid() {
    return fsubjectid;
  }

  public void setFsubjectid(long fsubjectid) {
    this.fsubjectid = fsubjectid;
  }


  public long getSsubjectid() {
    return ssubjectid;
  }

  public void setSsubjectid(long ssubjectid) {
    this.ssubjectid = ssubjectid;
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


  public java.sql.Timestamp getAnticipatetime() {
    return anticipatetime;
  }

  public void setAnticipatetime(java.sql.Timestamp anticipatetime) {
    this.anticipatetime = anticipatetime;
  }


  public java.sql.Timestamp getUpdatetime() {
    return updatetime;
  }

  public void setUpdatetime(java.sql.Timestamp updatetime) {
    this.updatetime = updatetime;
  }


  public long getPrefectscore() {
    return prefectscore;
  }

  public void setPrefectscore(long prefectscore) {
    this.prefectscore = prefectscore;
  }


  public long getPassscore() {
    return passscore;
  }

  public void setPassscore(long passscore) {
    this.passscore = passscore;
  }


  public String getIntro() {
    return intro;
  }

  public void setIntro(String intro) {
    this.intro = intro;
  }

}
