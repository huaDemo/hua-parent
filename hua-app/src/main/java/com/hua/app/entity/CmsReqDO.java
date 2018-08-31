package com.hua.app.entity;

import com.hua.huacms.entity.Model;

/**
 * 智能代码生成外部接受实体
 *
 * @author: hua
 * @create: 2018-08-15 21:54
 */
public class CmsReqDO {

    private String packageName;//包名
    private String moduleName;//模块名
    private String tableName;//表名
    private String remark;//注释
    private String author;//作者
    private String url;
    private String ftlName;
    private String dbType;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFtlName() {
        return ftlName;
    }

    public void setFtlName(String ftlName) {
        this.ftlName = ftlName;
    }

    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
