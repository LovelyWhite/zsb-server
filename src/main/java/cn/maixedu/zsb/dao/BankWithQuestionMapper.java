package cn.maixedu.zsb.dao;

import cn.maixedu.zsb.model.BankWithQuestion;
import cn.maixedu.zsb.model.BankWithQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankWithQuestionMapper {
    long countByExample(BankWithQuestionExample example);

    int deleteByExample(BankWithQuestionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BankWithQuestion record);

    int insertSelective(BankWithQuestion record);

    List<BankWithQuestion> selectByExample(BankWithQuestionExample example);

    BankWithQuestion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BankWithQuestion record, @Param("example") BankWithQuestionExample example);

    int updateByExample(@Param("record") BankWithQuestion record, @Param("example") BankWithQuestionExample example);

    int updateByPrimaryKeySelective(BankWithQuestion record);

    int updateByPrimaryKey(BankWithQuestion record);
}