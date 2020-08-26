package cn.maixedu.zsb.dao;

import cn.maixedu.zsb.model.BookComment;
import cn.maixedu.zsb.model.BookCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookCommentMapper {
    long countByExample(BookCommentExample example);

    int deleteByExample(BookCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BookComment record);

    int insertSelective(BookComment record);

    List<BookComment> selectByExample(BookCommentExample example);

    BookComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BookComment record, @Param("example") BookCommentExample example);

    int updateByExample(@Param("record") BookComment record, @Param("example") BookCommentExample example);

    int updateByPrimaryKeySelective(BookComment record);

    int updateByPrimaryKey(BookComment record);
}