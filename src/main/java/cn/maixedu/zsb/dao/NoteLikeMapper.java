package cn.maixedu.zsb.dao;

import cn.maixedu.zsb.model.NoteLike;
import cn.maixedu.zsb.model.NoteLikeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NoteLikeMapper {
    long countByExample(NoteLikeExample example);

    int deleteByExample(NoteLikeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NoteLike record);

    int insertSelective(NoteLike record);

    List<NoteLike> selectByExample(NoteLikeExample example);

    NoteLike selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NoteLike record, @Param("example") NoteLikeExample example);

    int updateByExample(@Param("record") NoteLike record, @Param("example") NoteLikeExample example);

    int updateByPrimaryKeySelective(NoteLike record);

    int updateByPrimaryKey(NoteLike record);
}