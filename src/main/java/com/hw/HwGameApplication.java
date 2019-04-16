package com.hw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 */
@MapperScan(basePackages = {"com.hw.dao"})
@ComponentScan(basePackages = {"com.hw"})
@EnableAutoConfiguration
public class HwGameApplication {

    public static void main(String[] args) {
        SpringApplication.run(HwGameApplication.class, args);
    }
}
