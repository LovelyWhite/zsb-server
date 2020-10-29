package cn.maixedu.zsb.controller;

import cn.maixedu.zsb.model.AnswerRecord;
import cn.maixedu.zsb.service.AnswerRecordService;
import cn.maixedu.zsb.utils.Code;
import cn.maixedu.zsb.utils.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description:
 * @Author:lw
 * @Date:2020/10/1
 */
@Controller
@RequestMapping("/answerrecord")
public class AnswerRecordController {
    @Autowired
    AnswerRecordService answerRecordService;

    @ResponseBody
    @RequestMapping("/insert")
    Return insertRecord(@RequestBody AnswerRecord record){
        boolean rs =  answerRecordService.insertRecord(record);
        if(rs){
            return new Return(Code.Success,record,"添加成功");
        }
        else {
            return new Return(Code.Fail,record,"添加失败");
        }

    }

}
