package com.mengxuegu.springcloud.controller;


import com.mengxuegu.springcloud.entities.Product;
import com.mengxuegu.springcloud.service.ProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: 梦学谷
 */
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Product product) {
        return productService.add(product);
    }

    // HystrixCommand 注解： 当此方法出现异常时，调用对应方法进行处理
    @HystrixCommand(fallbackMethod = "getFallback")
    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    public Product get(@PathVariable("id") Long id) throws Exception {
        if(productService == null){
            System.out.println("productService为空");
        }else{
            System.out.println("id = " + id);
        }
        if (id == 100){
            throw new Exception("查询无效数据");
        }
        return productService.get(id);
    }

    // 当上述方法出现异常时，则会调用此异常处理方法，返回值和参数列表与原方法要保持一直
    public Product getFallback(@PathVariable("id") Long id) {
        System.out.println("get方法执行异常，调用异常处理方法 getFallback");
        return  new Product(id,
                "ID=" + id + "无效--@HystrixCommand",
                "无有效数据库");
    }
    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    public List<Product> list() {
        return productService.list();
    }

}
