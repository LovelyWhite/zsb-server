package cn.maixedu.zsb.model.view;

import cn.maixedu.zsb.model.SecondSubject;
import cn.maixedu.zsb.model.User;
import cn.maixedu.zsb.model.UserType;


/**
 * @Description: 用户详细视图
 * @Author:lw
 * @Date:2020/9/6
 */
public class UserDetail extends User {

    private UserType usertype;
    private SecondSubject secondsubject;

    public UserType getUsertype() {
        return usertype;
    }

    public void setUsertype(UserType usertype) {
        this.usertype = usertype;
    }

    public SecondSubject getSecondsubject() {
        return secondsubject;
    }

    public void setSecondsubject(SecondSubject secondsubject) {
        this.secondsubject = secondsubject;
    }

}
