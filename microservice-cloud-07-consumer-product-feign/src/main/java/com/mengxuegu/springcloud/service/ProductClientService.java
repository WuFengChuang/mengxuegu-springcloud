package com.mengxuegu.springcloud.service;

import com.mengxuegu.springcloud.entities.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "microservice-product")
public interface ProductClientService {

    @RequestMapping(value = "/product/get/(id}",method = RequestMethod.GET)
    Product get(Long id);

    @RequestMapping(value = "/product/list",method = RequestMethod.GET)
    List<Product> list();

    @RequestMapping(value = "/product/add",method = RequestMethod.GET)
    boolean add(Product product);

}
