package cn.maixedu.zsb.controller;

import cn.maixedu.zsb.service.DealRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author:lw
 * @Date:2020/10/3
 */
@Controller
@RequestMapping("/dealrecord")
public class DealRecordController {
    @Autowired
    DealRecordService dealRecordService;
}
