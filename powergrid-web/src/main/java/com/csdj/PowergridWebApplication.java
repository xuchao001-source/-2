package com.csdj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.csdj.mapper")
public class PowergridWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PowergridWebApplication.class, args);
    }

}
