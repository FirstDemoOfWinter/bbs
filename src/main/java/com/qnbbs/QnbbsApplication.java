package com.qnbbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QnbbsApplication {

    public static void main(String[] args) {
        SpringApplication.run(QnbbsApplication.class, args);

        System.out.printf("进程启动！！！"+"\n");

    }
}
