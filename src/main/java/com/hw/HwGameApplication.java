package com.hw;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.hw.biz.dao")
public class HwGameApplication {

    public static void main(String[] args) {
        SpringApplication.run(HwGameApplication.class, args);
    }
}
