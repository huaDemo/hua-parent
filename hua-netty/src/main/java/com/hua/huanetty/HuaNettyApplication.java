package com.hua.huanetty;

import com.hua.huanetty.netty.DiscardServer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class HuaNettyApplication implements CommandLineRunner {

    @Resource
    private DiscardServer discardServer;

    public static void main(String[] args) {
        SpringApplication.run(HuaNettyApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        discardServer.run(8081);
    }

}
