package cn.maixedu.zsb.service;

import cn.maixedu.zsb.dao.QuestionBankMapper;
import cn.maixedu.zsb.dao.QuestionBankTypeMapper;
import cn.maixedu.zsb.model.QuestionBank;
import cn.maixedu.zsb.model.QuestionBankExample;
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
    @Autowired
    QuestionBankMapper questionBankMapper;

    public List<QuestionBankType> getAllQuestionBankType(){
       return questionBankTypeMapper.selectByExample(null);
    }
    public List<QuestionBank> findQuestionBankByAny(int typeId,String city,int ssid){
        QuestionBankExample questionBankExample = new QuestionBankExample();
        QuestionBankExample.Criteria criteria = questionBankExample.createCriteria();
        if(!"".equals(city)){
            criteria.andCityEqualTo(city);
        }
        criteria.andSsubjectidEqualTo(ssid);
        criteria.andQuestionbanktypeidEqualTo(typeId);
       return questionBankMapper.selectByExample(questionBankExample);
    }
}
