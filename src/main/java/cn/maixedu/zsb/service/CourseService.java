package cn.maixedu.zsb.service;

import cn.maixedu.zsb.dao.CourseMapper;
import cn.maixedu.zsb.model.Course;
import cn.maixedu.zsb.model.CourseDetail;
import cn.maixedu.zsb.model.CourseExample;
import cn.maixedu.zsb.model.view.CourseWithDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author:lw
 * @Date:2020/10/1
 */
@Service
public class CourseService {
    @Autowired
    CourseMapper courseMapper;

    public List<CourseWithDetails> getCourse(int secondsubjectid) {
        CourseExample example = new CourseExample();
        CourseExample.Criteria criteria = example.createCriteria();
        criteria.andSecondsubjectidEqualTo(secondsubjectid);
        return courseMapper.selectByExampleWithBLOBsAndDetails(example);
    }
}
