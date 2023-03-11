package com.mengxuegu.springcloud.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.io.Serializable;

@Data
@Value
public class Product implements Serializable {
    private Long id;
    private String productName;
    private String dbSource;

}
