package cn.maixedu.zsb.service;

import cn.maixedu.zsb.dao.QuestionBankTypeMapper;
import cn.maixedu.zsb.model.QuestionBankType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @Description: 题库service层
 * @Author:lw
 * @Date:2020/8/28
 */
@Service
public class QuestionBankService {
    @Autowired
    QuestionBankTypeMapper questionBankTypeMapper;

    public List<QuestionBankType>  getType(){
       List<QuestionBankType> res = questionBankTypeMapper.selectByExample(null);
       return res;
    }
}
