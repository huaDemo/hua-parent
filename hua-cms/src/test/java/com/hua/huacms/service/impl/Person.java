package com.hua.huacms.service.impl;

import org.springframework.stereotype.Component;

/**
 * @author: hua
 * @date: 2019/1/31 09:14
 */
@Component
public class Person {

    private String name;

    public void say(){
        System.out.println(this.name);
    }

    public void setName(String name){
        this.name = name;
    }

}
