package cn.maixedu.zsb.service;

import cn.maixedu.zsb.dao.BankWithQuestionMapper;
import cn.maixedu.zsb.model.BankWithQuestionExample;
import cn.maixedu.zsb.model.Question;
import cn.maixedu.zsb.model.view.BankWithQuestionDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 题库的题 service
 * @Author:lw
 * @Date:2020/9/9
 */
@Service
public class BankWithQuestionService {
    @Autowired
    BankWithQuestionMapper bankWithQuestionMapper;
    public long countByBankId(int bankId){
        BankWithQuestionExample bankWithQuestionExample = new BankWithQuestionExample();
        BankWithQuestionExample.Criteria criteria =  bankWithQuestionExample.createCriteria();
        criteria.andQuestionbankidEqualTo(bankId);
        return bankWithQuestionMapper.countByExample(bankWithQuestionExample);
    }
    public List<BankWithQuestionDetail> getAllQuestionsByBankId(int bankId){
        BankWithQuestionExample bankWithQuestionExample = new BankWithQuestionExample();
        BankWithQuestionExample.Criteria criteria =  bankWithQuestionExample.createCriteria();
        criteria.andQuestionbankidEqualTo(bankId);
        return bankWithQuestionMapper.selectByExampleWithDetail(bankWithQuestionExample);
    }
}
