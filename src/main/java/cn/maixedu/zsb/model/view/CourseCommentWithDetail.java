package cn.maixedu.zsb.model.view;

import cn.maixedu.zsb.model.CourseComment;
import cn.maixedu.zsb.model.User;

/**
 * @Description:
 * @Author:lw
 * @Date:2020/10/2
 */
public class CourseCommentWithDetail extends CourseComment {
    User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
