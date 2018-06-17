package com.hua.huacms.constant;

/**
 * 数据库枚举
 *
 * @author: hua
 * @create: 2018-06-15 13:52
 */
public enum DBEnum {

    //oracle
    ORACLE("oracle", "varchar2", "number"),
    //mysql
    MYSQL("mysql", "varchar", "int");

    String dbType;//数据库类型
    String strType;//字符串类型
    String numType;//数字类型

    DBEnum(String dbType, String strType, String numType) {
        this.dbType = dbType;
        this.strType = strType;
        this.numType = numType;
    }

    public String getDbType() {
        return dbType;
    }

    public String getStrType() {
        return strType;
    }

    public String getNumType() {
        return numType;
    }
}
