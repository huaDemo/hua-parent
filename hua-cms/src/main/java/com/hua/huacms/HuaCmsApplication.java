package com.hua.huacms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.hua")
public class HuaCmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HuaCmsApplication.class, args);
	}
}
