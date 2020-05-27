package com.hxsj.analyse;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan({"com.hxsj.analyse.dao"})
@SpringBootApplication
public class AnalyseApplication {

    public static void main(String[] args) {
        System.err.printf("start application...");
        SpringApplication.run(AnalyseApplication.class, args);
        System.err.printf("run application success...");
    }

}
