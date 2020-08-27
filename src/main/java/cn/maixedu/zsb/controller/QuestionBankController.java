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
import java.util.LinkedList;
import java.util.List;

/**
 * @Description: 题库控制器，用于所有与题库相关的操作
 * @Author:lw
 * @Date:2020/8/28
 */
@Controller
@RequestMapping("/questionbank")
public class QuestionBankController {
    @Autowired
    QuestionBankService questionBankService;

    /**
     * 获取所有的题库类型
     * @return
     */
    @ResponseBody
    @RequestMapping("/gettype")
    public ReturnFormat getType(){
        List<QuestionBankType> res = questionBankService.getType();
        ReturnFormat returnFormat = new ReturnFormat();
        if(res == null)
            res = new LinkedList<>();
        else
            returnFormat.setObject(res);
        if(0 == res.size()){
            returnFormat.setCode(Code.FAIL);
            returnFormat.setMessage("题库类型为空");
        }else {
            returnFormat.setCode(Code.SUCCESS);
            returnFormat.setMessage("获取成功");
        }
        return returnFormat;
    }
}
