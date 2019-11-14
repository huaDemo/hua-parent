package com.hua.huacms.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: hua
 * @date: 2019/1/31 09:36
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.hua.dal.dao")
public class PersonTests {

    @Autowired(required=true)
    private Person person;

    @Autowired(required=true)
    private Person person2;

    @Test
    public void test(){
        person.say();
        person.setName("aa");
        person2.say();
    }

}
