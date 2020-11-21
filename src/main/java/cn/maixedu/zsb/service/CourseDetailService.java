package cn.maixedu.zsb.service;

import cn.maixedu.zsb.dao.CourseDetailMapper;
import cn.maixedu.zsb.model.CourseDetail;
import cn.maixedu.zsb.model.CourseDetailExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author:lw
 * @Date:2020/10/1
 */
@Service
public class CourseDetailService {
    @Autowired
    CourseDetailMapper courseDetailMapper;
    public List<CourseDetail> getCourseDetailByCourseId(int courseId){
        CourseDetailExample example = new CourseDetailExample();
        CourseDetailExample.Criteria criteria = example.createCriteria();
        criteria.andCourseidEqualTo(courseId);
        return courseDetailMapper.selectByExample(example);
    }
}
