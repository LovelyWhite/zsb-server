
package cn.maixedu.zsb.controller;

import cn.maixedu.zsb.model.QuestionExample;
import cn.maixedu.zsb.model.QuestionWithBLOBs;
import cn.maixedu.zsb.utils.Code;
import cn.maixedu.zsb.utils.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import cn.maixedu.zsb.service.QuestionService;
import org.springframework.web.bind.annotation.*;
import java.util.List;


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
    public Return addQuestion(@RequestBody QuestionWithBLOBs record){
        if(record.getTitle() == null || "".equals(record.getTitle())) {
            return new Return(Code.RequestEmpty, record, "请求参数错误");
        }
        else {
            int code = questionService.addQuestion(record);
            if (code == Code.Fail) {
                return new Return(code, null, "添加数据失败");
            } else {
                return new Return(code, null, "添加数据成功");
            }
        }
    }

    @ResponseBody
    @RequestMapping("/deletebyid")
    public Return deleteQuestionById(@RequestParam("id") Integer id){
        int code = questionService.deleteQuestionById(id);
        if(code == Code.Fail){
            return new Return(code,null,"删除数据失败");
        }
        else{
            return new Return(code,null,"删除数据成功");
        }
    }

    @ResponseBody
    @RequestMapping("/updatebyid")
    public Return updateQuestionById(QuestionWithBLOBs record){
        if(record.getId() == null){
            return new Return(Code.RequestEmpty,record,"请求参数错误");
        }
        else{
            int code = questionService.updateQuestionById(record);
            if(code == Code.Fail){
                return new Return(code,null,"修改成功");
            }
            else{
                return new Return(code,null,"修改失败");
            }
        }
    }

    @ResponseBody
    @RequestMapping("/getallquestion")
    public Return getAllQuestion(){
        List<QuestionWithBLOBs> questionWithBLOBsList = questionService.getAllQuestion();
        if(questionWithBLOBsList.size() == 0){
            return new Return(Code.RequestEmpty,null,"内容为空");
        }
        else{
            return new Return(Code.Success,questionWithBLOBsList,"获取成功");
        }
    }

    @ResponseBody
    @RequestMapping("/findquestionbyid")
    public Return findQuestionById(@RequestParam("id") Integer id){
        QuestionWithBLOBs questionWithBLOBs = questionService.findQuestionById(id);
        if(questionWithBLOBs == null){
            return new Return(Code.RequestEmpty,null,"无此题目");
        }
        else{
            return new Return(Code.Success,questionWithBLOBs,"查找题目成功");
        }
    }
}