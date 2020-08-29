package cn.maixedu.zsb.controller;

import cn.maixedu.zsb.model.User;
import cn.maixedu.zsb.service.UserService;
import cn.maixedu.zsb.utils.Code;
import cn.maixedu.zsb.utils.JWT;
import cn.maixedu.zsb.utils.Return;
import cn.maixedu.zsb.utils.WechatLogSuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: 用户相关的controller
 * @Author:lw
 * @Date:2020/8/29
 */
@RequestMapping("/user")
@Controller
public class UserController {
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/addbyopenid")
    public Return addUserByOpenid(@RequestParam("user") User user){
        if(user.getOpenid() == null || "".equals(user.getOpenid())){
            return new Return(Code.RequestEmpty,user,"请求参数错误");
        }
        else {
           int code =  userService.addUserByOpenid(user);
           if(code == Code.Exist){
               return new Return(code,user,"用户已存在");
           }else if(code == Code.Fail){
               return new Return(code,user,"添加数据库失败");
           }
           else{
               return new Return(code,user,"添加成功");
            }
        }
    }
    @ResponseBody
    @RequestMapping("/finduserbyopenid")
    public Return findUserByOpenid(@RequestParam("openid") String openid){
        if("".equals(openid)){
            return new Return(Code.RequestEmpty,openid,"请求参数错误");
        }
        else {
            User user =  userService.findUserByOpenid(openid);
            if(user == null){
                return new Return(Code.ResponseEmpty,openid,"无此用户");
            }
            else {
                String token = JWT.sign(user, 60L* 1000L*30L);
                return new Return(Code.Success, new WechatLogSuccessResult(user,token),"验证登录成功");
            }
        }
    }
}
