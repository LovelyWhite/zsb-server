package cn.maixedu.zsb.model.view;

import cn.maixedu.zsb.model.Course;
import cn.maixedu.zsb.model.Price;
import cn.maixedu.zsb.model.Teacher;

/**
 * @Description:
 * @Author:lw
 * @Date:2020/10/1
 */
public class CourseWithDetails extends Course {
    Price price;
    Teacher teacher;

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
