package com.hua.huacms.entity;


import com.hua.huacommon.Util.PubTools;

/**
 * 数据表字段实体类
 *
 * @author: hua
 * @create: 2018-06-06 18:32
 */
public class Column {

    private String columnName;//字段名称
    private String columnType;//字段类型
    private String columnLength;//字段长度
    private String isNull;//是否为空
    private String remark;//字段注释
    private String tableId;//所属表名称
    private String formateColumnName;//驼峰转换后的字段名称

    public Column() {

    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
        //驼峰转换给formateColumnName赋值
        if (this.formateColumnName == null) {
            if (this.columnName != null && this.columnName.contains("_")) {
                this.formateColumnName = PubTools.strformatHump(this.columnName);
            } else {
                this.formateColumnName = this.columnName.toLowerCase();
            }
        }
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

    public String getColumnLength() {
        return columnLength;
    }

    public void setColumnLength(String columnLength) {
        this.columnLength = columnLength;
    }

    public String getFormateColumnName() {
        return formateColumnName;
    }

    public void setFormateColumnName(String formateColumnName) {
        this.formateColumnName = formateColumnName;
    }
}
