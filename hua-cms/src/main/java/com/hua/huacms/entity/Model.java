package com.hua.huacms.entity;


import com.hua.huacommon.Util.PubTools;

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
    private String tableName;//表名
    private String className;//驼峰转换后的类名
    private String remark;//注释
    private String author;//作者
    private Date createTime;//创建时间
    private String tableId;//表主键
    private String classId;//驼峰转换后的表主键
    private List<Column> columnList;//表字段

    public Model() {

    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
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

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
        //驼峰转换给classId赋值
        if (this.classId == null) {
            if (this.tableId != null && this.tableId.contains("_")) {
                this.classId = PubTools.strformatHump(this.tableId);
            } else {
                this.classId = this.tableId.toLowerCase();
            }
        }
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

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
        //驼峰转换给className赋值
        if (this.className == null) {
            String str = null;
            if (this.tableName != null && this.tableName.contains("_")) {
                str = PubTools.strformatHump(this.tableName);
            } else {
                str = this.tableName.toLowerCase();
            }
            this.className = PubTools.toUpperCaseFirstOne(str);
        }
    }
}
