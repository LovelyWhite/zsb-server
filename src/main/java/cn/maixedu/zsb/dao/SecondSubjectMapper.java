package cn.maixedu.zsb.dao;

import cn.maixedu.zsb.model.SecondSubject;
import cn.maixedu.zsb.model.SecondSubjectExample;
import java.util.List;

import cn.maixedu.zsb.model.view.SubjectDetail;
import org.apache.ibatis.annotations.Param;

public interface SecondSubjectMapper {
    long countByExample(SecondSubjectExample example);

    int deleteByExample(SecondSubjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SecondSubject record);

    int insertSelective(SecondSubject record);

    List<SecondSubject> selectByExample(SecondSubjectExample example);

    List<SubjectDetail> selectByExampleWithName(SecondSubjectExample example);

    SecondSubject selectByPrimaryKey(Integer id);


    int updateByExampleSelective(@Param("record") SecondSubject record, @Param("example") SecondSubjectExample example);

    int updateByExample(@Param("record") SecondSubject record, @Param("example") SecondSubjectExample example);

    int updateByPrimaryKeySelective(SecondSubject record);

    int updateByPrimaryKey(SecondSubject record);
}