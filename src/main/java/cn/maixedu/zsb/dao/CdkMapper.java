package cn.maixedu.zsb.dao;

import cn.maixedu.zsb.model.Cdk;
import cn.maixedu.zsb.model.CdkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CdkMapper {
    long countByExample(CdkExample example);

    int deleteByExample(CdkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cdk record);

    int insertSelective(Cdk record);

    List<Cdk> selectByExample(CdkExample example);

    Cdk selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cdk record, @Param("example") CdkExample example);

    int updateByExample(@Param("record") Cdk record, @Param("example") CdkExample example);

    int updateByPrimaryKeySelective(Cdk record);

    int updateByPrimaryKey(Cdk record);
}