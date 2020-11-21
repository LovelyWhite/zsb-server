package cn.maixedu.zsb.controller;

import cn.maixedu.zsb.model.Course;
import cn.maixedu.zsb.model.view.CourseWithDetails;
import cn.maixedu.zsb.service.CourseService;
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
 * @Date:2020/10/1
 */
@RequestMapping("/course")
@Controller
public class CourseController {
    @Autowired
    CourseService courseService;

    @RequestMapping("/get")
    @ResponseBody
    Return getCourse(@RequestParam("secondsubjectid") int secondsubjectid) {
        List<CourseWithDetails> courseList = courseService.getCourse(secondsubjectid);
        if (courseList.size() == 0) {
            return new Return(Code.ResponseEmpty, new ArrayList<>(), "数据为空");
        } else
            return new Return(Code.Success,courseList,"获取成功");
    }
}
