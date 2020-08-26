package cn.maixedu.zsb.model;

public class Question {
    private Integer id;

    private String type;

    private String typename;

    private Integer difficulty;

    private Integer righttime;

    private Integer wrongtime;

    private String video;

    private String testcentre;

    private String keyword;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public Integer getRighttime() {
        return righttime;
    }

    public void setRighttime(Integer righttime) {
        this.righttime = righttime;
    }

    public Integer getWrongtime() {
        return wrongtime;
    }

    public void setWrongtime(Integer wrongtime) {
        this.wrongtime = wrongtime;
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