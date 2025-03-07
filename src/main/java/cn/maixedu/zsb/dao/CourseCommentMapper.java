package cn.maixedu.zsb.dao;

import cn.maixedu.zsb.model.CourseComment;
import cn.maixedu.zsb.model.CourseCommentExample;
import java.util.List;

import cn.maixedu.zsb.model.view.CourseCommentWithDetail;
import org.apache.ibatis.annotations.Param;

public interface CourseCommentMapper {
    long countByExample(CourseCommentExample example);

    int deleteByExample(CourseCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseComment record);

    int insertSelective(CourseComment record);

    List<CourseComment> selectByExample(CourseCommentExample example);

    List<CourseCommentWithDetail> selectByExampleWithDetail (CourseCommentExample example);

    CourseComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseComment record, @Param("example") CourseCommentExample example);

    int updateByExample(@Param("record") CourseComment record, @Param("example") CourseCommentExample example);

    int updateByPrimaryKeySelective(CourseComment record);

    int updateByPrimaryKey(CourseComment record);
}