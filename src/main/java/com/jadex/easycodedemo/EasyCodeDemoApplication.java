package com.jadex.easycodedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EasyCodeDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyCodeDemoApplication.class, args);
        System.out.println("Test");
        System.out.println("ABC");

        // 开发环境写的代码
        System.out.println("这是一段业务代码");
    }

}
