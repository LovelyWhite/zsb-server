package cn.maixedu.zsb;


public class User {

  private long id;
  private String account;
  private String password;
  private String sex;
  private String avater;
  private long age;
  private String nickname;
  private long usertypeid;
  private java.sql.Timestamp regtime;
  private java.sql.Timestamp updatetime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public String getAvater() {
    return avater;
  }

  public void setAvater(String avater) {
    this.avater = avater;
  }


  public long getAge() {
    return age;
  }

  public void setAge(long age) {
    this.age = age;
  }


  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public long getUsertypeid() {
    return usertypeid;
  }

  public void setUsertypeid(long usertypeid) {
    this.usertypeid = usertypeid;
  }


  public java.sql.Timestamp getRegtime() {
    return regtime;
  }

  public void setRegtime(java.sql.Timestamp regtime) {
    this.regtime = regtime;
  }


  public java.sql.Timestamp getUpdatetime() {
    return updatetime;
  }

  public void setUpdatetime(java.sql.Timestamp updatetime) {
    this.updatetime = updatetime;
  }

}
