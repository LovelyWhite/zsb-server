package cn.maixedu.zsb.model.view;

import cn.maixedu.zsb.model.User;

/**
 * @Description: 微信登录完成返回参数
 * @Author:lw
 * @Date:2020/8/29
 */
public class WechatLogSuccessResult {
    User user;
    String token;

    public WechatLogSuccessResult() {
    }

    public WechatLogSuccessResult(User user, String token) {
        this.user = user;
        this.token = token;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
