package cn.maixedu.zsb.dao;

import cn.maixedu.zsb.model.QuestionBankComment;
import cn.maixedu.zsb.model.QuestionBankCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionBankCommentMapper {
    long countByExample(QuestionBankCommentExample example);

    int deleteByExample(QuestionBankCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QuestionBankComment record);

    int insertSelective(QuestionBankComment record);

    List<QuestionBankComment> selectByExample(QuestionBankCommentExample example);

    QuestionBankComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QuestionBankComment record, @Param("example") QuestionBankCommentExample example);

    int updateByExample(@Param("record") QuestionBankComment record, @Param("example") QuestionBankCommentExample example);

    int updateByPrimaryKeySelective(QuestionBankComment record);

    int updateByPrimaryKey(QuestionBankComment record);
}