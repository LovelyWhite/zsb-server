package cn.maixedu.zsb.controller;

import cn.maixedu.zsb.model.FirstSubject;
import cn.maixedu.zsb.model.SecondSubject;
import cn.maixedu.zsb.model.view.SubjectDetail;
import cn.maixedu.zsb.service.SubjectService;
import cn.maixedu.zsb.utils.Code;
import cn.maixedu.zsb.utils.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author:lw
 * @Date:2020/9/6
 */
@RequestMapping("/subject")
@Controller
public class SubjectController {

    @Autowired
    SubjectService subjectService;

    @ResponseBody
    @RequestMapping("/getall")
    public Return getAllSubject()
    {
        class SbjObj1{
            String name;
            List<SecondSubject> list;

            public SbjObj1() {
                list = new ArrayList<>();
            }

            public SbjObj1(String name) {
                this.name = name;
                list = new ArrayList<>();
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<SecondSubject> getList() {
                return list;
            }

            public void setList(List<SecondSubject> list) {
                this.list = list;
            }
        }
        Map<Integer,SbjObj1> lists = new HashMap<>();
        List<SubjectDetail> subjectDetailList =  subjectService.findSubjectWithName();
        if(subjectDetailList.size()==0){
            return new Return(Code.ResponseEmpty,null,"内容为空");
        }
        else {
            subjectDetailList.forEach(e->{
                lists.put(e.getFirstsubjectid(),new SbjObj1(e.getFirstname()));
            });
            subjectDetailList.forEach(e->{
               SbjObj1 sbjObj1 =  lists.get(e.getFirstsubjectid());
               SecondSubject secondSubject = new SecondSubject(e.getId(),e.getFirstsubjectid(),e.getSecondname(),e.getCode(),e.getHascity());
               sbjObj1.getList().add(secondSubject);
            });
            List<Object> obj = new ArrayList<>();
            lists.forEach((k,v)->{
                obj.add(v);
            });
            return new Return(Code.Success,obj,"获取成功");
        }
    }
}
