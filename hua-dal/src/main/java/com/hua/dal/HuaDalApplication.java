package com.hua.dal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement//开启事务
@MapperScan("com.hua.dal.dao")//动态扫描dao层将其作为bean
@SpringBootApplication
public class HuaDalApplication {

	public static void main(String[] args) {
		SpringApplication.run(HuaDalApplication.class, args);
	}
}
