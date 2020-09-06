package cn.maixedu.zsb.model.view;

import cn.maixedu.zsb.model.SecondSubject;

import java.util.List;

/**
 * @Description: 科目视图
 * @Author:lw
 * @Date:2020/9/6
 */
public class SubjectDetail {
    private Integer id;

    private Integer firstsubjectid;

    private String firstname;

    private String secondname;

    private String code;

    private String hascity;

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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
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
