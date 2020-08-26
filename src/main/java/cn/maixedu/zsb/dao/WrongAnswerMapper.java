package cn.maixedu.zsb.dao;

import cn.maixedu.zsb.model.WrongAnswer;
import cn.maixedu.zsb.model.WrongAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WrongAnswerMapper {
    long countByExample(WrongAnswerExample example);

    int deleteByExample(WrongAnswerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WrongAnswer record);

    int insertSelective(WrongAnswer record);

    List<WrongAnswer> selectByExample(WrongAnswerExample example);

    WrongAnswer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WrongAnswer record, @Param("example") WrongAnswerExample example);

    int updateByExample(@Param("record") WrongAnswer record, @Param("example") WrongAnswerExample example);

    int updateByPrimaryKeySelective(WrongAnswer record);

    int updateByPrimaryKey(WrongAnswer record);
}