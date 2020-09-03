
package cn.maixedu.zsb.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import cn.maixedu.zsb.service.QuestionService;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("/add")
    @ResponseBody
    public String add(){
        return  "";
    }


}


