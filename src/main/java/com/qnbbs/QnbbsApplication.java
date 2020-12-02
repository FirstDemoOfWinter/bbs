package com.qnbbs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.qnbbs.service")
@SpringBootApplication
public class QnbbsApplication {

    public static void main(String[] args) {
        SpringApplication.run(QnbbsApplication.class, args);

        System.out.printf("进程启动！！！"+"\n");

    }
}
