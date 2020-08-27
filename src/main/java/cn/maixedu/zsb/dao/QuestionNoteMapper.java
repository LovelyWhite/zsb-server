package cn.maixedu.zsb.dao;

import cn.maixedu.zsb.model.QuestionNote;
import cn.maixedu.zsb.model.QuestionNoteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionNoteMapper {
    long countByExample(QuestionNoteExample example);

    int deleteByExample(QuestionNoteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QuestionNote record);

    int insertSelective(QuestionNote record);

    List<QuestionNote> selectByExample(QuestionNoteExample example);

    QuestionNote selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QuestionNote record, @Param("example") QuestionNoteExample example);

    int updateByExample(@Param("record") QuestionNote record, @Param("example") QuestionNoteExample example);

    int updateByPrimaryKeySelective(QuestionNote record);

    int updateByPrimaryKey(QuestionNote record);
}