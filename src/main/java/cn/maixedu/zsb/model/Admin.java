package cn.maixedu.zsb.model;


public class Admin {

  private long id;
  private String account;
  private String password;
  private String type;


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


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

}
