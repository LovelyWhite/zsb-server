package cn.maixedu.zsb.dao;

import cn.maixedu.zsb.model.QuestionBankType;
import cn.maixedu.zsb.model.QuestionBankTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionBankTypeMapper {
    long countByExample(QuestionBankTypeExample example);

    int deleteByExample(QuestionBankTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QuestionBankType record);

    int insertSelective(QuestionBankType record);

    List<QuestionBankType> selectByExample(QuestionBankTypeExample example);

    QuestionBankType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QuestionBankType record, @Param("example") QuestionBankTypeExample example);

    int updateByExample(@Param("record") QuestionBankType record, @Param("example") QuestionBankTypeExample example);

    int updateByPrimaryKeySelective(QuestionBankType record);

    int updateByPrimaryKey(QuestionBankType record);
}