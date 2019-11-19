package com.woniu.his;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.woniu.his.mapper")
public class HisManager {
    public static void main(String[] args) {
        SpringApplication.run(HisManager.class,args);
    }
}
