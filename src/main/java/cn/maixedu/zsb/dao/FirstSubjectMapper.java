package cn.maixedu.zsb.dao;

import cn.maixedu.zsb.model.FirstSubject;
import cn.maixedu.zsb.model.FirstSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FirstSubjectMapper {
    long countByExample(FirstSubjectExample example);

    int deleteByExample(FirstSubjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FirstSubject record);

    int insertSelective(FirstSubject record);

    List<FirstSubject> selectByExample(FirstSubjectExample example);

    FirstSubject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FirstSubject record, @Param("example") FirstSubjectExample example);

    int updateByExample(@Param("record") FirstSubject record, @Param("example") FirstSubjectExample example);

    int updateByPrimaryKeySelective(FirstSubject record);

    int updateByPrimaryKey(FirstSubject record);
}