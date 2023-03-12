package com.mengxuegu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = {"com.mengxuegu.springcloud"})
@EnableEurekaClient
@SpringBootApplication
public class ProductConsumerFeign81 {
    public static void main(String[] args) {
        SpringApplication.run(ProductConsumerFeign81.class,args);
    }
}
