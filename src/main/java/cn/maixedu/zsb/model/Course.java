package cn.maixedu.zsb.model;

import java.util.Date;

public class Course {
    private Integer id;

    private Integer teacherid;

    private Integer priceid;

    private String name;

    private String poster;

    private Integer viewsnum;

    private Date updatetime;

    private Integer secondsubjectid;

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

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public Integer getViewsnum() {
        return viewsnum;
    }

    public void setViewsnum(Integer viewsnum) {
        this.viewsnum = viewsnum;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getSecondsubjectid() {
        return secondsubjectid;
    }

    public void setSecondsubjectid(Integer secondsubjectid) {
        this.secondsubjectid = secondsubjectid;
    }

    public byte[] getIntro() {
        return intro;
    }

    public void setIntro(byte[] intro) {
        this.intro = intro;
    }
}