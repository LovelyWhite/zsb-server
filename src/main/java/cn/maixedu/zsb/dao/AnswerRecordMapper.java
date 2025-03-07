package cn.maixedu.zsb.dao;

import cn.maixedu.zsb.model.AnswerRecord;
import cn.maixedu.zsb.model.AnswerRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnswerRecordMapper {
    long countByExample(AnswerRecordExample example);

    int deleteByExample(AnswerRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AnswerRecord record);

    int insertSelective(AnswerRecord record);

    List<AnswerRecord> selectByExample(AnswerRecordExample example);

    AnswerRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AnswerRecord record, @Param("example") AnswerRecordExample example);

    int updateByExample(@Param("record") AnswerRecord record, @Param("example") AnswerRecordExample example);

    int updateByPrimaryKeySelective(AnswerRecord record);

    int updateByPrimaryKey(AnswerRecord record);
}