package com.summerwar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SummerWarApplication {

    public static void main(String[] args) {
        SpringApplication.run(SummerWarApplication.class, args);

        System.out.printf("进程启动！！！");

    }
}
