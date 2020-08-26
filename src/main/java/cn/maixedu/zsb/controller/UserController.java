package cn.maixedu.zsb.controller;

import cn.maixedu.zsb.model.User;
import cn.maixedu.zsb.service.UserService;
import cn.maixedu.zsb.utils.Code;
import cn.maixedu.zsb.utils.ReturnFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addUser(@RequestBody User user){
        user.setRegtime(new Date());
        final int code =  userService.addUser(user);
        ReturnFormat rt =  new ReturnFormat();
        rt.setCode(code);
        switch (code){
            case Code.SUCCESS:rt.setMessage("添加用户成功"); rt.setObject(user);break;
            case Code.FAIL:rt.setMessage("添加用户失败");break;
            case Code.EXIST:rt.setMessage("用户已存在");break;
            case Code.EMPTYBODY:rt.setMessage("账号或者密码为空");break;
        }
        return rt.toString();
    }
}