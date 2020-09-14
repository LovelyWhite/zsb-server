
package cn.maixedu.zsb.service;


import cn.maixedu.zsb.model.QuestionExample;
import cn.maixedu.zsb.model.QuestionWithBLOBs;
import cn.maixedu.zsb.utils.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.maixedu.zsb.dao.QuestionMapper;

import java.util.List;

/**
 * @Description: 题库的service
 * @Author:Lee
 * @Date:2020/9/3
 */
@Service
public class QuestionService {
    @Autowired
    QuestionMapper questionMapper;

    public int addQuestion(QuestionWithBLOBs record) {
        if (questionMapper.insertSelective(record) > 0 ) {
            return Code.Success;
        }
        else {
            return Code.Fail;
        }
    }

    public int deleteQuestionById(Integer id){
        if(questionMapper.deleteByPrimaryKey(id) > 0){
            return Code.Success;
        }
        else{
            return Code.Fail;
        }
    }

    public int updateQuestionById(QuestionWithBLOBs record){
        if(questionMapper.updateByPrimaryKeySelective(record)>0){
            return Code.Success;
        }
        else{
            return Code.Fail;
        }
    }
}

