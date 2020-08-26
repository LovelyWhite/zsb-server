package cn.maixedu.zsb.model;

public class Teacher {
    private Integer id;

    private String name;

    private byte[] intro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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