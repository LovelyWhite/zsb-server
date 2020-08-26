package cn.maixedu.zsb.model;

public class Course {
    private Integer id;

    private Integer teacherid;

    private Integer priceid;

    private String name;

    private byte[] intro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Integer teacherid) {
        this.teacherid = teacherid;
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

    public byte[] getIntro() {
        return intro;
    }

    public void setIntro(byte[] intro) {
        this.intro = intro;
    }
}