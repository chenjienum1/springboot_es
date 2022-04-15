package com.imooc.demo.springboot.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class SpringbootEsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootEsApplication.class, args);
    }

}
