package cn.maixedu.zsb.service;

import cn.maixedu.zsb.dao.CourseCommentMapper;
import cn.maixedu.zsb.model.CourseComment;
import cn.maixedu.zsb.model.CourseCommentExample;
import cn.maixedu.zsb.model.view.CourseCommentWithDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Description:
 * @Author:lw
 * @Date:2020/10/2
 */
@Service
public class CourseCommentService {
    @Autowired
    CourseCommentMapper courseCommentMapper;

    public List<CourseCommentWithDetail> getCourseComment(int courseid) {
        CourseCommentExample example = new CourseCommentExample();
        CourseCommentExample.Criteria criteria = example.createCriteria();
        criteria.andCourseidEqualTo(courseid);
        return courseCommentMapper.selectByExampleWithDetail(example);
    }
    public boolean insertCourseComment(int userid,int courseid,String comment){
        CourseComment courseComment = new CourseComment();
        courseComment.setComment(comment);
        courseComment.setCourseid(courseid);
        courseComment.setUserid(userid);
        courseComment.setTime(new Date());
        return 1 == courseCommentMapper.insertSelective(courseComment);
    }
}
