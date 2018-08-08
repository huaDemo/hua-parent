package com.hua.dal.constant;

/**
 * 映射地址枚举
 *
 * @author: hua
 * @create: 2018-06-15 14:37
 */
public enum DalMapperEnum {

    //area
    AREA("com.hua.dal.mapper.area.");

    String url;//映射地址

    DalMapperEnum(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
