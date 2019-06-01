package com.ymhd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableDiscoveryClient  // 启用 Eureka 服务发现 相关配置
@EnableHystrixDashboard // 启用 HystrixDashboard 断路器看板 相关配置
@SpringBootApplication
public class EurekaHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaHystrixDashboardApplication.class, args);
	}

}
