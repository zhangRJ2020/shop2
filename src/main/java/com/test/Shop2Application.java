package com.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.test.mapper")
public class Shop2Application {

    public static void main(String[] args) {
        SpringApplication.run(Shop2Application.class, args);
    }

}
