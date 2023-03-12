package com.mengxuegu.springcloud.controller;

import com.mengxuegu.springcloud.service.ProductClientService;
import com.mengxuegu.springcloud.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductControllerFeign {
    @Autowired
    private ProductClientService productClientService;
//    ProductControllerFeign(){
//        if(productClientService == null){
//            System.out.println("productClientService 为空");
//            productClientService = new ProductClientService();
//        }
//    }
    @RequestMapping(value = "/consumer/product/add")
    public boolean add(Product product) {
        return productClientService.add(product);
    }
    @RequestMapping(value = "/consumer/product/get/{id}")
    public Product get(@PathVariable("id") Long id) {
        return productClientService.get(id);
    }
    @RequestMapping(value = "/consumer/product/list")
    public List<Product> list() {
        return productClientService.list();
    }

}
