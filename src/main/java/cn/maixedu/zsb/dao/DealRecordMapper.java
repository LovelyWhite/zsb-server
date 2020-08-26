package cn.maixedu.zsb.dao;

import cn.maixedu.zsb.model.DealRecord;
import cn.maixedu.zsb.model.DealRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DealRecordMapper {
    long countByExample(DealRecordExample example);

    int deleteByExample(DealRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DealRecord record);

    int insertSelective(DealRecord record);

    List<DealRecord> selectByExample(DealRecordExample example);

    DealRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DealRecord record, @Param("example") DealRecordExample example);

    int updateByExample(@Param("record") DealRecord record, @Param("example") DealRecordExample example);

    int updateByPrimaryKeySelective(DealRecord record);

    int updateByPrimaryKey(DealRecord record);
}