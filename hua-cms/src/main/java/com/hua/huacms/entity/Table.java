package com.hua.huacms.entity;

import java.util.Date;

/**
 * 表实体对象
 *
 * @author: hua
 * @create: 2018-06-06 19:00
 */
public class Table {

    private String id;//表名(英文名主键)
    private String tableSchema;//数据库名
    private String tableComment;//注释

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    public String getTableComment() {
        return tableComment;
    }

    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }
}
