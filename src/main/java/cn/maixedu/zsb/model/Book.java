package cn.maixedu.zsb.model;

public class Book {
    private Integer id;

    private Integer bookkindid;

    private Integer priceid;

    private String name;

    private String press;

    private String isbn;

    private String poster;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBookkindid() {
        return bookkindid;
    }

    public void setBookkindid(Integer bookkindid) {
        this.bookkindid = bookkindid;
    }

    public Integer getPriceid() {
        return priceid;
    }

    public void setPriceid(Integer priceid) {
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