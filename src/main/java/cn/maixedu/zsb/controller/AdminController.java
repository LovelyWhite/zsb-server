package cn.maixedu.zsb.controller;

import cn.maixedu.zsb.service.AdminService;
import cn.maixedu.zsb.utils.Code;
import cn.maixedu.zsb.utils.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description:
 * @Author:lw
 * @Date:2020/10/2
 */
@Controller
public class AdminController {
    @Autowired
    AdminService adminService;

    Return checkAdmin(@RequestParam("account") String account, @RequestParam("password") String password){
       boolean is =  adminService.checkAdmin(account,password);
       return new Return(Code.Success,is,"");
    }

}
