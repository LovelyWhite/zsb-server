package cn.maixedu.zsb.test;

import cn.maixedu.zsb.dao.AdminMapper;
import cn.maixedu.zsb.dao.UserMapper;
import cn.maixedu.zsb.model.Admin;
import cn.maixedu.zsb.model.UserExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {
    @Autowired
    UserMapper userMapper;
    @Test
    public void textCURD(){
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andAccountEqualTo("1234");
        System.out.println(userMapper.countByExample(userExample));
    }
}
