package com.hua.huatime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class HuaTimeApplication {

    public static void main(String[] args) {
        SpringApplication.run(HuaTimeApplication.class, args);
    }

    @Bean(name = "testBean")
    public void test(){

    }

}
