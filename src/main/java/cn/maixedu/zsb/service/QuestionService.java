
package cn.maixedu.zsb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.maixedu.zsb.dao.QuestionMapper;
import cn.maixedu.zsb.model.Question;

import java.util.ArrayList;
import java.util.List;


/**
 * @Description: 题库的service
 * @Author:Lee
 * @Date:2020/9/3
 */
@Service
public class QuestionService {
    @Autowired
    QuestionMapper questionMapper;

    public List<Question> addAllQuestion(){
      //  return questionMapper.insert();
        return new ArrayList<>();
    }
}

