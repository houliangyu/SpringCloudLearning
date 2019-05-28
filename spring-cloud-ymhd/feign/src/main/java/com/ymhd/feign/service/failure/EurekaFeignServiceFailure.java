package com.ymhd.feign.service.failure;

import com.ymhd.feign.service.EurekaFeignService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: EurekaFeignServiceFailure
 * @Description:  服务消费者，调用服务提供者提供的服务失败，回调处理类
 * @Author: hly
 * @Date: 2019/5/28 0028
 * @Version V1.0
 **/
@Service
public class EurekaFeignServiceFailure implements EurekaFeignService {
    @Override
    public String getInfo() {
        return "服务器繁忙，熔断机制";
    }
}
