package com.mengxuegu.springcloud.controller;

import com.mengxuegu.springcloud.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Auther: 梦学谷
 */
@RestController
public class ProductControllerConsumer {
    // 修改为Eureka注册中心的地址
    //具体名字，在另一个服务的application.yml中spring-application-name配置
    private static final String REST_URL_PREFIX = "http://microservice-product";
    //private static final String REST_URL_PREFIX = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

//    ProductControllerConsumer() {
//        if (restTemplate == null) {
//            System.out.println("restTemplate为空");
//            restTemplate = new RestTemplate();
//        }
//    }

    @RequestMapping(value = "/consumer/product/add")
    public boolean add(Product product) {
        if (restTemplate == null) {
            System.out.println("restTemplate为空");
        } else {
            System.out.println("restTemplate = " + product.toString());
        }
        return restTemplate.postForObject(REST_URL_PREFIX + "/product/add", product, Boolean.class);
    }

    @RequestMapping(value = "/consumer/product/get/{id}")
    public Product get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/product/get/" + id, Product.class);
    }

    @RequestMapping(value = "/consumer/product/list")
    public List<Product> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/product/list", List.class);
    }


}

