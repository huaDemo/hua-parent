package com.hua.huacms.service;

import com.hua.huacms.entity.Column;
import com.hua.huacms.entity.Table;

import java.util.List;

/**
 * 数据库操作服务
 *
 * @author: hua
 * @create: 2018-06-14 18:19
 */
public interface DBService {

    /**
     * 查询数据库中所有表信息
     *
     * @param dbType 数据库类型
     * @return
     * @throws Exception
     */
    List<Table> getTableList(String dbName, String dbType) throws Exception;

    /**
     * 查询某张表中所有字段信息
     *
     * @param tableId 表主键
     * @param dbType  数据库类型
     * @return
     * @throws Exception
     */
    List<Column> getColumnList(String tableId, String dbType) throws Exception;

    /**
     * 查询某张表的主键
     *
     * @param tableName
     * @param dbType
     * @return
     * @throws Exception
     */
    String getTableId(String tableName, String dbType) throws Exception;

    /**
     * 字段名转换为实体类需要类型服务
     *
     * @param tableId
     * @param columnList
     * @return
     * @throws Exception
     */
    List<Column> formatColumnList(String tableId, List<Column> columnList) throws Exception;

}
