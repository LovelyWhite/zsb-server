package cn.maixedu.zsb.service;

import cn.maixedu.zsb.dao.DealRecordMapper;
import cn.maixedu.zsb.model.DealRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Description:
 * @Author:lw
 * @Date:2020/10/3
 */
@Service
public class DealRecordService {
    @Autowired
    DealRecordMapper dealRecordMapper;

    public boolean insertRecord(int userid, double money, String note, String tradeno) {
        DealRecord dealRecord = new DealRecord();
        dealRecord.setUserid(userid);
        dealRecord.setMoney(money);
        dealRecord.setTime(new Date());
        dealRecord.setNote(note);
        dealRecord.setIsok("未完成");
        dealRecord.setTradeno(tradeno);
        return 1 == dealRecordMapper.insertSelective(dealRecord);
    }
}
