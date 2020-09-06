package cn.maixedu.zsb.service;

import cn.maixedu.zsb.dao.SecondSubjectMapper;
import cn.maixedu.zsb.model.view.SubjectDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author:lw
 * @Date:2020/9/6
 */
@Service
public class SubjectService {
    @Autowired
    SecondSubjectMapper secondSubjectMapper;

    public List<SubjectDetail> findSubjectWithName(){
       return secondSubjectMapper.selectByExampleWithName(null);
    }
}
