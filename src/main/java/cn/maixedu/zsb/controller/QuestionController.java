
package cn.maixedu.zsb.controller;

import cn.maixedu.zsb.model.QuestionWithBLOBs;
import cn.maixedu.zsb.utils.Code;
import cn.maixedu.zsb.utils.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import cn.maixedu.zsb.service.QuestionService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: 题库的controller
 * @Author:Lee
 * @Date:2020/9/3
 */

@Controller
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @ResponseBody
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Return add(@RequestBody QuestionWithBLOBs record){
        int code = questionService.addQuestion(record);
        if(code == Code.Success){
            return new Return(code,record,"添加数据成功");
        }
        else{
            return new Return(code,record,"添加数据失败");
        }
    }
}


