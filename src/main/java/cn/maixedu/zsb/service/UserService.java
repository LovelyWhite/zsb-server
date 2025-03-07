package cn.maixedu.zsb.service;

import cn.maixedu.zsb.dao.UserMapper;
import cn.maixedu.zsb.model.User;
import cn.maixedu.zsb.model.UserExample;
import cn.maixedu.zsb.model.view.UserDetail;
import cn.maixedu.zsb.utils.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 用户有关的service
 * @Author:lw
 * @Date:2020/8/29
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public int addUserByOpenid(User user){
        String openid  = user.getOpenid();
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria =  userExample.createCriteria();
        criteria.andOpenidEqualTo(openid);
        if(userMapper.countByExample(userExample)>0){
            return Code.Exist;
        }
        else {
            if(userMapper.insertSelective(user)==1){
                return Code.Success;
            }
            else {
                return Code.Fail;
            }
        }
    }

    public UserDetail findUserByOpenid(String openid) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria =  userExample.createCriteria();
        criteria.andOpenidEqualTo(openid);
        List<UserDetail> userList = userMapper.selectByExampleWithDetail(userExample);
        if(userList.size()>0){
            return userList.get(0);
        }else {
            return null;
        }
    }
    public int updateUserByOpenid(User user){
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria =  userExample.createCriteria();
        criteria.andOpenidEqualTo(user.getOpenid());
        if(userMapper.updateByExampleSelective(user,userExample)>0){
            return Code.Success;
        }
        else {
            return Code.Fail;
        }
    }
}
