package com.hua.huacms.entity;

import java.util.Date;
import java.util.List;

/**
 * 模型类模板实体类
 *
 * @author: hua
 * @create: 2018-06-05 22:06
 */
public class Model {
    private String packageName;//包名
    private String moduleName;//模块名
    private String className;//类名
    private String remark;//注释
    private String author;//作者
    private Date createTime;//创建时间
    private List<Column> columnList;//表字段

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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public List<Column> getColumnList() {
        return columnList;
    }

    public void setColumnList(List<Column> columnList) {
        this.columnList = columnList;
    }
}
