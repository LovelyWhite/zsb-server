package cn.maixedu.zsb.model;

public class SecondSubject {
    private Integer id;

    private Integer firstsubjectid;

    private String name;

    private String code;

    private String hascity;

    public SecondSubject() {
    }

    public SecondSubject(Integer id, Integer firstsubjectid, String name, String code, String hascity) {
        this.id = id;
        this.firstsubjectid = firstsubjectid;
        this.name = name;
        this.code = code;
        this.hascity = hascity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFirstsubjectid() {
        return firstsubjectid;
    }

    public void setFirstsubjectid(Integer firstsubjectid) {
        this.firstsubjectid = firstsubjectid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getHascity() {
        return hascity;
    }

    public void setHascity(String hascity) {
        this.hascity = hascity;
    }
}