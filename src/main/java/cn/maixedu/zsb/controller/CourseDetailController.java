package cn.maixedu.zsb.controller;

import cn.maixedu.zsb.model.CourseDetail;
import cn.maixedu.zsb.service.CourseDetailService;
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

@Controller
@RequestMapping("/coursedetail")
public class CourseDetailController {

    @Autowired
    CourseDetailService courseDetailService;

    @ResponseBody
    @RequestMapping("/getbycourseid")
    Return getCourseDetailByCourseId(@RequestParam("courseid") int courseid) {
        List<CourseDetail> courseDetailList = courseDetailService.getCourseDetailByCourseId(courseid);
        if (courseDetailList.size() == 0) {
            return new Return(Code.ResponseEmpty, new ArrayList<>(), "数据为空");
        } else
            return new Return(Code.Success, courseDetailList, "获取成功");
    }
}
