package com.hua.huacms.service.impl;

import com.hua.dal.dao.IBaseDao;
import com.hua.huacms.constant.DBEnum;
import com.hua.huacms.constant.MapperEnum;
import com.hua.huacms.entity.Column;
import com.hua.huacms.entity.Table;
import com.hua.huacms.service.DBService;
import com.hua.huacms.util.PubTools;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 数据库操作服务实现
 *
 * @author: hua
 * @create: 2018-06-14 18:19
 */
@Service
public class DBServiceImpl implements DBService {

    @Resource(name = "baseDao")
    private IBaseDao baseDao;

    @Override
    public List<Table> getTableList(String dbName, String dbType) throws Exception {
        if (StringUtils.isNotBlank(dbType)) {
            if (DBEnum.ORACLE.getDbType().equals(dbType)) {

            } else if (DBEnum.MYSQL.getDbType().equals(dbType)) {
                Table table = new Table();
                table.setTableSchema(dbName);
                return (List<Table>) baseDao.getList(MapperEnum.MYSQL.getUrl() + ".getTableList", table);
            }
        }
        return null;
    }

    @Override
    public List<Column> getColumnList(String tableId, String dbType) throws Exception {
        if (StringUtils.isNotBlank(dbType)) {
            if (DBEnum.ORACLE.getDbType().equals(dbType)) {

            } else if (DBEnum.MYSQL.getDbType().equals(dbType)) {
                Column column = new Column();
                column.setTableId(tableId);
                return (List<Column>) baseDao.getList(MapperEnum.MYSQL.getUrl() + ".getColumnList", column);
            }
        }
        return null;
    }

    @Override
    public List<Column> formatColumnList(String dbType, List<Column> columnList) throws Exception {
        for (Column column : columnList) {
            if (DBEnum.ORACLE.getDbType().equals(dbType)) {
                //oracle
                if ("VARCHAR2".equals(column.getColumnType()) || "DATE".equals(column.getColumnType())) {
                    column.setColumnType("String");
                } else if ("NUMBER".equals(column.getColumnType())) {
                    column.setColumnType("Double");
                }
            }
            //mysql
            else if (DBEnum.MYSQL.getDbType().equals(dbType)) {
                if ("VARCHAR".equals(column.getColumnType()) || "DATE".equals(column.getColumnType())) {
                    column.setColumnType("String");
                } else if ("int".equals(column.getColumnType())) {
                    column.setColumnType("Double");
                }
            }
            //ColumnName转换成驼峰
            if (column.getColumnName() != null && column.getColumnName().contains("_")) {
                column.setColumnName(PubTools.strformatHump(column.getColumnName()));
            } else {
                column.setColumnName(column.getColumnName().toLowerCase());
            }
            //tableId转换成驼峰
            if (column.getTableId() != null && column.getTableId().contains("_")) {
                column.setTableId(PubTools.strformatHump(column.getTableId()));
            } else {
                column.setTableId(column.getTableId().toLowerCase());
            }
        }
        return columnList;
    }

}
