package cn.maixedu.zsb.dao;

import cn.maixedu.zsb.model.QuestionBankCollect;
import cn.maixedu.zsb.model.QuestionBankCollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionBankCollectMapper {
    long countByExample(QuestionBankCollectExample example);

    int deleteByExample(QuestionBankCollectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QuestionBankCollect record);

    int insertSelective(QuestionBankCollect record);

    List<QuestionBankCollect> selectByExample(QuestionBankCollectExample example);

    QuestionBankCollect selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QuestionBankCollect record, @Param("example") QuestionBankCollectExample example);

    int updateByExample(@Param("record") QuestionBankCollect record, @Param("example") QuestionBankCollectExample example);

    int updateByPrimaryKeySelective(QuestionBankCollect record);

    int updateByPrimaryKey(QuestionBankCollect record);
}