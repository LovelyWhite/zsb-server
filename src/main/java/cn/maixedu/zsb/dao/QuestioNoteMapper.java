package cn.maixedu.zsb.dao;

import cn.maixedu.zsb.model.QuestioNote;
import cn.maixedu.zsb.model.QuestioNoteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestioNoteMapper {
    long countByExample(QuestioNoteExample example);

    int deleteByExample(QuestioNoteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QuestioNote record);

    int insertSelective(QuestioNote record);

    List<QuestioNote> selectByExample(QuestioNoteExample example);

    QuestioNote selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QuestioNote record, @Param("example") QuestioNoteExample example);

    int updateByExample(@Param("record") QuestioNote record, @Param("example") QuestioNoteExample example);

    int updateByPrimaryKeySelective(QuestioNote record);

    int updateByPrimaryKey(QuestioNote record);
}