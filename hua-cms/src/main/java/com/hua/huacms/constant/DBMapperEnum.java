package com.hua.huacms.constant;

/**
 * 映射地址枚举
 *
 * @author: hua
 * @create: 2018-06-15 14:37
 */
public enum DBMapperEnum {

    //oracle
    ORACLE("com.hua.huacms.mapper.oracle"),
    //mysql
    MYSQL("com.hua.huacms.mapper.mysql");

    String url;//映射地址

    DBMapperEnum(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
