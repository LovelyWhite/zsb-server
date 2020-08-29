package cn.maixedu.zsb.service;

import cn.maixedu.zsb.dao.QuestionBankTypeMapper;
import cn.maixedu.zsb.model.QuestionBankType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 题库的service
 * @Author:lw
 * @Date:2020/8/29
 */
@Service
public class QuestionBankService {
    @Autowired
    QuestionBankTypeMapper questionBankTypeMapper;

    public List<QuestionBankType> getAllQuestionBankType(){
       return questionBankTypeMapper.selectByExample(null);
    }

}
