package com.mengxuegu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
// hystrix 注解开启服务监控
@EnableHystrixDashboard
@SpringBootApplication
public class HtstrixDashboard9001 {
    public static void main(String[] args) {
        SpringApplication.run(HtstrixDashboard9001.class,args);
    }
}
