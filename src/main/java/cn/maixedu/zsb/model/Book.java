package cn.maixedu.zsb;


public class Book {

  private long id;
  private long bookkindid;
  private long priceid;
  private String name;
  private String press;
  private String isbn;
  private String poster;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getBookkindid() {
    return bookkindid;
  }

  public void setBookkindid(long bookkindid) {
    this.bookkindid = bookkindid;
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


  public String getPress() {
    return press;
  }

  public void setPress(String press) {
    this.press = press;
  }


  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }


  public String getPoster() {
    return poster;
  }

  public void setPoster(String poster) {
    this.poster = poster;
  }

}
