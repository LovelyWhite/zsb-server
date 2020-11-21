package cn.maixedu.zsb.controller;

import cn.maixedu.zsb.model.view.CourseCommentWithDetail;
import cn.maixedu.zsb.service.CourseCommentService;
import cn.maixedu.zsb.utils.Code;
import cn.maixedu.zsb.utils.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author:lw
 * @Date:2020/10/2
 */
@Controller
@RequestMapping("/coursecomment")
public class CourseCommentController {
    @Autowired
    CourseCommentService courseCommentService;

    @ResponseBody
    @RequestMapping("/getbycourseid")
    Return getCourseComment(@RequestParam("courseid") int courseid) {
        List<CourseCommentWithDetail> list  = courseCommentService.getCourseComment(courseid);
        if (list.size() == 0) {
            return new Return(Code.ResponseEmpty, new ArrayList<>(), "数据为空");
        } else
            return new Return(Code.Success,list,"获取成功");
    }
    @ResponseBody
    @RequestMapping("/add")
    Return addCourseComment(@RequestParam("courseid") int courseid,@RequestParam("comment") String comment,@RequestParam("userid") int userid){
        if("".equals(comment)){
            return new Return(Code.RequestEmpty, "", "请输入评论内容");
        }else {
           boolean rs = courseCommentService.insertCourseComment(userid,courseid,comment);
           if(rs){
               return new Return(Code.Success, comment, "发表评论成功");
           }
           else{
               return new Return(Code.Success, comment, "发表评论失败");
           }
        }
    }
}
