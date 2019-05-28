package com.ymhd.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: EurekaRibbonService
 * @Description: 服务消费者服务类，调用服务提供者提供的服务，实现业务
 * @Author: hly
 * @Date: 2019/5/28 0028
 * @Version V1.0
 **/
@Service
public class EurekaRibbonService {

    @Autowired
    RestTemplate restTemplate;

    public String getInfo() {
        String message;
        try {
            System.out.println("调用 服务 EUREKA-CLIENT/info");
            message = restTemplate.getForObject("http://EUREKA-CLIENT/info", String.class);
            System.out.println("服务 EUREKA-CLIENT/info 返回信息 : " + message);
            System.out.println("调用 服务 EUREKA-CLIENT/info 成功！");
        } catch (Exception ex) {
            message = ex.getMessage();
        }
        return message;
    }
}