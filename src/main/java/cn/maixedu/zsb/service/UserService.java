package cn.maixedu.zsb.service;

import cn.maixedu.zsb.dao.UserMapper;
import cn.maixedu.zsb.model.User;
import cn.maixedu.zsb.model.UserExample;
import cn.maixedu.zsb.utils.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public int addUser(User record){
        String _acc =  record.getAccount();
        String _psw = record.getPassword();
        if(_acc==null || "".equals(_acc) || _psw == null || "".equals(_psw))
            return  Code.EMPTYBODY;
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andAccountEqualTo(record.getAccount());
        if(userMapper.countByExample(userExample)>0){
            return Code.EXIST;
        }
        else {
            int res = userMapper.insertSelective(record);
            if(res == 1)
            {
                return Code.SUCCESS;
            }
            else {
                return Code.FAIL;
            }
        }
    }
}
