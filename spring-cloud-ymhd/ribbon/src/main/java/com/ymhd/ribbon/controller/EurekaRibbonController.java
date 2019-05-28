package com.ymhd.ribbon.controller;

import com.ymhd.ribbon.service.EurekaRibbonService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: EurekaRibbonController
 * @Description: 服务消费者控制器类，对用户提供服务
 * @Author: hly
 * @Date: 2019/5/28 0028
 * @Version V1.0
 **/
@RestController
public class EurekaRibbonController {
    @Resource
    private EurekaRibbonService eurekaRibbonService;

    @RequestMapping("/ribbonInfo")
    public String ribbonInfo() {
        String message = eurekaRibbonService.getInfo();
        return "获取的信息:" + message;
    }
}
