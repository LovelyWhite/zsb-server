package cn.maixedu.zsb.controller;

import cn.maixedu.zsb.model.User;
import cn.maixedu.zsb.model.view.WechatLogSuccessResult;
import cn.maixedu.zsb.model.view.WechatSession;
import cn.maixedu.zsb.model.view.WechatUserInfo;
import cn.maixedu.zsb.model.view.WechatUserInfoDetail;
import cn.maixedu.zsb.service.UserService;
import cn.maixedu.zsb.utils.*;
import com.alibaba.fastjson.JSON;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * @Description: 微信相关的controller
 * @Author:lw
 * @Date:2020/8/29
 */
@RequestMapping("/wechat")
@Controller
public class WechatApiController {

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public Return login(@RequestBody WechatUserInfo userInfo)
    {
        WechatSession wechatSession = code2session(userInfo.getCode());
        if(wechatSession!=null && wechatSession.getErrcode() == 0){
            WechatUserInfoDetail wechatUserInfoDetail =  JSON.parseObject(userInfo.getRawData(),WechatUserInfoDetail.class);
            User u = new User();
            u.setOpenid(wechatSession.getOpenid());
            u.setAvatar(wechatUserInfoDetail.getAvatarUrl());
            u.setSex(wechatUserInfoDetail.getGender()==1?"男":"女");
            u.setNickname(wechatUserInfoDetail.getNickName());
            if(userService.addUserByOpenid(u)!=Code.Fail){
               User uResult = userService.findUserByOpenid(u.getOpenid());
                WechatLogSuccessResult wechatLogSuccessResult = new WechatLogSuccessResult();
                wechatLogSuccessResult.setUser(uResult);
                String token = JWT.sign(uResult, 3600L* 1000L*24L);
                wechatLogSuccessResult.setToken(token);
                return new Return(Code.Success,wechatLogSuccessResult,"登录成功");
            }else {
                return new Return(Code.Fail,null,"写入数据库失败");
            }

        }
        else {
            return new Return(Code.ResponseEmpty,wechatSession==null?null:wechatSession.getErrmsg(),"session获取失败");
        }
    }

    /**
     * APPID: wx04753140ee90a047
     * APPSECRET:45a8c17d7b02c86d66f7b31b06993e92
     * @param code
     * @return WechatSession
     */
    private WechatSession code2session(String code){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.weixin.qq.com/sns/jscode2session?appid=wx04753140ee90a047&secret=45a8c17d7b02c86d66f7b31b06993e92&js_code="+code+"&grant_type=authorization_code")
                .build();
        Response response = null;
        try {
            response = client.newCall(request).execute();
            return JSON.parseObject(response.body().string(),WechatSession.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
