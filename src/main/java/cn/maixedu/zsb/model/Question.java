package cn.maixedu.zsb.model;


public class Question {

  private long id;
  private String type;
  private String typename;
  private String title;
  private String cqans;
  private String jqans;
  private String fbans;
  private String saand;
  private String options;
  private long difficulty;
  private long righttime;
  private long wrongtime;
  private String analysis;
  private String video;
  private String testcentre;
  private String keyword;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public String getTypename() {
    return typename;
  }

  public void setTypename(String typename) {
    this.typename = typename;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getCqans() {
    return cqans;
  }

  public void setCqans(String cqans) {
    this.cqans = cqans;
  }


  public String getJqans() {
    return jqans;
  }

  public void setJqans(String jqans) {
    this.jqans = jqans;
  }


  public String getFbans() {
    return fbans;
  }

  public void setFbans(String fbans) {
    this.fbans = fbans;
  }


  public String getSaand() {
    return saand;
  }

  public void setSaand(String saand) {
    this.saand = saand;
  }


  public String getOptions() {
    return options;
  }

  public void setOptions(String options) {
    this.options = options;
  }


  public long getDifficulty() {
    return difficulty;
  }

  public void setDifficulty(long difficulty) {
    this.difficulty = difficulty;
  }


  public long getRighttime() {
    return righttime;
  }

  public void setRighttime(long righttime) {
    this.righttime = righttime;
  }


  public long getWrongtime() {
    return wrongtime;
  }

  public void setWrongtime(long wrongtime) {
    this.wrongtime = wrongtime;
  }


  public String getAnalysis() {
    return analysis;
  }

  public void setAnalysis(String analysis) {
    this.analysis = analysis;
  }


  public String getVideo() {
    return video;
  }

  public void setVideo(String video) {
    this.video = video;
  }


  public String getTestcentre() {
    return testcentre;
  }

  public void setTestcentre(String testcentre) {
    this.testcentre = testcentre;
  }


  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

}
