package cn.maixedu.zsb.service;

import cn.maixedu.zsb.dao.AnswerRecordMapper;
import cn.maixedu.zsb.model.AnswerRecord;
import cn.maixedu.zsb.model.AnswerRecordExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author:lw
 * @Date:2020/9/7
 */
@Service
public class AnswerRecordService {
    @Autowired
    AnswerRecordMapper answerRecordMapper;

    public long recordNum(int quesBankId) {
        AnswerRecordExample example = new AnswerRecordExample();
        AnswerRecordExample.Criteria criteria = example.createCriteria();
        criteria.andQuestionbankidEqualTo(quesBankId);
        return answerRecordMapper.countByExample(example);
    }

    public boolean insertRecord(AnswerRecord answerRecord) {
        return 1 == answerRecordMapper.insert(answerRecord);
    }
}
