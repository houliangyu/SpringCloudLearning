package com.ymhd.ribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: EurekaRibbonConfig
 * @Description: 应用配置类，初始化 Bean和配置信息
 * @Author: hly
 * @Date: 2019/5/28 0028
 * @Version V1.0
 **/
@Configuration
public class EurekaRibbonConfig {
    @Bean // 初始化 Bean
    @LoadBalanced // 实现负载均衡
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
