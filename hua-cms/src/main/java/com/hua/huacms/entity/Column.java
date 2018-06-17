package com.hua.huacms.entity;

/**
 * 数据表字段实体类
 *
 * @author: hua
 * @create: 2018-06-06 18:32
 */
public class Column {

    private String columnName;//字段名称
    private String columnType;//字段类型
    private String isNull;//是否为空
    private String remark;//字段注释
    private String tableId;//所属表名称

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public String getIsNull() {
        return isNull;
    }

    public void setIsNull(String isNull) {
        this.isNull = isNull;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }
}
