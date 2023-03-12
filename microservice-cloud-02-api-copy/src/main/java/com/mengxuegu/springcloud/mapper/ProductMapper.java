package com.mengxuegu.springcloud.mapper;

import com.mengxuegu.springcloud.entities.Product;

import java.util.List;

public interface ProductMapper
{
    Product FindByDb(Long id);
    List<Product> findAll();

    boolean addProduct(Product product);

}
