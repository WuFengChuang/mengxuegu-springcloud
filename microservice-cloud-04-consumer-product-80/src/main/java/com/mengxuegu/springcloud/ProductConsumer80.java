package com.mengxuegu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class ProductConsumer80 {
    public static void main(String[] args) {
        SpringApplication.run(ProductConsumer80.class,args);
    }
}
