package com.example.bys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.bys.mapper")  //扫描mapper包
@SpringBootApplication
public class BysApplication {

    public static void main(String[] args) {
        SpringApplication.run(BysApplication.class, args);
    }

}
