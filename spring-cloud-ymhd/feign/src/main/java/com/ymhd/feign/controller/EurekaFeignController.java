package com.ymhd.feign.controller;

import com.ymhd.feign.service.EurekaFeignService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: EurekaFeignController
 * @Description: 服务消费控制器类，对用户提供服务
 * @Author: hly
 * @Date: 2019/5/28 0028
 * @Version V1.0
 **/
@RestController
public class EurekaFeignController {

    @Resource
    private EurekaFeignService eurekaFeignService;

    @RequestMapping("/feignInfo")
    public String feignInfo() {
        String message = eurekaFeignService.getInfo();
        return "获取到的信息:" + message;
    }
}
