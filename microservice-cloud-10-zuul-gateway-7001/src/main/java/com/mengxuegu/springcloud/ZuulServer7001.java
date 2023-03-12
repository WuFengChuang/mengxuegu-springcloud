package com.mengxuegu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

// 开启zuul功能
@EnableZuulProxy
@SpringBootApplication
public class ZuulServer7001 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServer7001.class,args);
    }
}
