package cn.maixedu.zsb.controller;

import cn.maixedu.zsb.model.QuestionBank;
import cn.maixedu.zsb.model.QuestionBankType;
import cn.maixedu.zsb.model.User;
import cn.maixedu.zsb.service.QuestionBankService;
import cn.maixedu.zsb.service.UserService;
import cn.maixedu.zsb.utils.Code;
import cn.maixedu.zsb.utils.ReturnFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/questionbank")
public class QuestionBankController {
    @Autowired
    QuestionBankService questionBankService;
    @RequestMapping("/gettype")
    public String getType(){
       List<QuestionBankType> res = questionBankService.getType();
        System.out.println(res.size());
        return "";
    }
}
