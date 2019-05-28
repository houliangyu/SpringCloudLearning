package com.ymhd.feign.service;

import com.ymhd.feign.service.failure.EurekaFeignServiceFailure;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: EurekaFeignService
 * @Description: 服务消费者，调用服务提供者提供的服务，实现业务
 * @Author: hly
 * @Date: 2019/5/28 0028
 * @Version V1.0
 **/

@FeignClient(value = "eureka-client", fallback = EurekaFeignServiceFailure.class)
public interface EurekaFeignService {

    @RequestMapping(value = "/info")
    String getInfo();
}
