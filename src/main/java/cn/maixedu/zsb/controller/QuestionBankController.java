package cn.maixedu.zsb.controller;

import cn.maixedu.zsb.model.QuestionBank;
import cn.maixedu.zsb.model.QuestionBankType;
import cn.maixedu.zsb.model.QuestionWithBLOBs;
import cn.maixedu.zsb.model.view.BankWithQuestionDetail;
import cn.maixedu.zsb.service.AnswerRecordService;
import cn.maixedu.zsb.service.BankWithQuestionService;
import cn.maixedu.zsb.service.QuestionBankService;
import cn.maixedu.zsb.utils.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import cn.maixedu.zsb.utils.Code;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 题库的controller
 * @Author:lw
 * @Date:2020/8/29
 */
@Controller
@RequestMapping("/questionbank")
public class QuestionBankController {
    @Autowired
    QuestionBankService questionBankService;

    @Autowired
    BankWithQuestionService bankWithQuestionService;

    @Autowired
    AnswerRecordService answerRecordService;

    @RequestMapping("/getalltype")
    @ResponseBody
    public Return getAllType(){
       List<QuestionBankType> questionBankTypes =  questionBankService.getAllQuestionBankType();
       if(questionBankTypes.size()==0){
           return new Return(Code.ResponseEmpty,null,"内容为空");
       }
       else {
           return new Return(Code.Success,questionBankTypes,"获取成功");
       }
    }
    @RequestMapping("/findbyany")
    @ResponseBody
    public Return findQuestionBankByAny(@RequestParam("typeid") Integer typeId, @RequestParam(defaultValue = "",value = "city",required = false) String city,@RequestParam("secondsubjectid") Integer ssid)
    {
        List<QuestionBank> questionBanks = questionBankService.findQuestionBankByAny(typeId,city,ssid);
        if(questionBanks.size() == 0){
            return new Return(Code.ResponseEmpty,null,"内容为空");
        }
        else {
            return new Return(Code.Success,questionBanks,"获取成功");
        }
    }
    @RequestMapping("/getdetailbyid")
    @ResponseBody
    public Return getDetailById(@RequestParam("id") int id){
        List<BankWithQuestionDetail> _list =  bankWithQuestionService.getAllQuestionsByBankId(id);
       if(_list.size()==0){
           return new Return(Code.ResponseEmpty,null,"内容为空");
       }
       else {
           class Obj1{
               long done;

               public Obj1() {
               }

               List<QuestionWithBLOBs> list;

               public Obj1(long done, List<QuestionWithBLOBs> list) {
                   this.done = done;
                   this.list = list;
               }

               public long getDone() {
                   return done;
               }

               public void setDone(long done) {
                   this.done = done;
               }

               public List<QuestionWithBLOBs> getList() {
                   return list;
               }

               public void setList(List<QuestionWithBLOBs> list) {
                   this.list = list;
               }
           }
           long done =  answerRecordService.recordNum(id);
           List<QuestionWithBLOBs> list = new ArrayList<>();
          _list.forEach(e->{
               list.add(e.getQuestion());
           });
           Obj1 obj1 = new Obj1(done,list);
           return new Return(Code.Success,obj1,"获取成功");
       }
    }
}
