package cn.maixedu.zsb.dao;

import cn.maixedu.zsb.model.CourseDetail;
import cn.maixedu.zsb.model.CourseDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseDetailMapper {
    long countByExample(CourseDetailExample example);

    int deleteByExample(CourseDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseDetail record);

    int insertSelective(CourseDetail record);

    List<CourseDetail> selectByExample(CourseDetailExample example);

    CourseDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseDetail record, @Param("example") CourseDetailExample example);

    int updateByExample(@Param("record") CourseDetail record, @Param("example") CourseDetailExample example);

    int updateByPrimaryKeySelective(CourseDetail record);

    int updateByPrimaryKey(CourseDetail record);
}