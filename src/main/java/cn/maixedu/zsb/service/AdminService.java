package cn.maixedu.zsb.service;

import cn.maixedu.zsb.dao.AdminMapper;
import cn.maixedu.zsb.model.AdminExample;
import cn.maixedu.zsb.utils.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description:
 * @Author:lw
 * @Date:2020/10/2
 */
@Service
public class AdminService {
    @Autowired
    AdminMapper adminMapper;

    @ResponseBody
    public boolean checkAdmin(String account, String password) {
        AdminExample example = new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria();
        criteria.andAccountEqualTo(account);
        criteria.andPasswordEqualTo(password);
        return 1 == adminMapper.countByExample(example);
    }
}
