package com.guojia.resttemplatedemo.demos;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.guojia.resttemplatedemo.demos.mapper")
public class RestTemplateDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestTemplateDemoApplication.class, args);
        
    }

}
