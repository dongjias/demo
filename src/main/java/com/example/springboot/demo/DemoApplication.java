package com.example.springboot.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//扫描mapper接口所在的包
@MapperScan("com.example.springboot.demo.mapper")
public class DemoApplication {
    //启动项目的开始窗口
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}