package com.mengxuegu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix
@MapperScan("com.mengxuegu.springcloud.mapper")
@EnableEurekaClient
@SpringBootApplication
public class ProductProviderHystrix8003{
    public static void main(String[] args) {
        SpringApplication.run(ProductProviderHystrix8003.class,args);
    }
}
