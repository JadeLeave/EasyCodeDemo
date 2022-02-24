package com.jadex.easycodedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EasyCodeDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyCodeDemoApplication.class, args);
        System.out.println("Test");
        System.out.println("ABC");

        // 这是主分支的代码
        System.out.println("这是我主体框架写的代码");

        // 开发环境：写的代码
        System.out.println("这是一段业务代码");

        // 开发环境：我觉得这里应该是1+1等于2
        System.out.println(1+1);

        // 开发环境：我觉得这里应该是2+2等于4
        System.out.println(2+2);
    }

}
