package com.mengxuegu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
// hystrix 注解开启服务监控
@SpringBootApplication
public class ZuulServer7001 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServer7001.class,args);
    }
}
