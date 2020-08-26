package cn.maixedu.zsb.model;

import java.util.Date;

public class DealRecord {
    private Integer id;

    private Integer userid;

    private String type;

    private Double money;

    private Date time;

    private String note;

    private Integer historymoney;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getHistorymoney() {
        return historymoney;
    }

    public void setHistorymoney(Integer historymoney) {
        this.historymoney = historymoney;
    }
}