package com.hua.huacms.service.impl;

import com.hua.dal.dao.IBaseDao;
import com.hua.dal.service.IBaseService;
import com.hua.huacms.entity.Column;
import com.hua.huacms.entity.Model;
import com.hua.huacms.entity.Table;
import com.hua.huacms.service.CmsService;
import com.hua.huacms.service.DBService;
import com.hua.huacms.util.PubTools;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: hua
 * @create: 2018-06-06 21:41
 */
@Service("cmsService")
public class CmsServiceImpl implements CmsService {

    @Resource(name = "baseService")
    private IBaseService baseService;

    @Autowired
    private DBService dbService;

    @Override
    public List<Column> test(String tableName) throws Exception {
        Column column = new Column();
        column.setTableId(tableName);
        return (List<Column>) baseService.getList("com.hua.huacms.mapper.oracle.getColumnListByTableName", column);
    }

    @Override
    public int createModel(Model model, String dbType, String url, String ftl) throws Exception {
        try {
            if (model != null) {
                //获取tableName
                String tableName = model.getTableName();
                if (model.getTableId() == null) {
                    //查询主键
                    String tableId = dbService.getTableId(tableName, dbType);
                    model.setTableId(tableId);
                }
                if (model.getColumnList() == null) {
                    //查询某张表中所有字段信息
                    List<Column> columnList = dbService.getColumnList(tableName, dbType);
                    model.setColumnList(columnList);
                }
                //转换字段
                model.setColumnList(dbService.formatColumnList(dbType, model.getColumnList()));
                //创建时间
                if (model.getCreateTime() == null) {
                    model.setCreateTime(new Date());
                }
                //创建模板文件
                this.createFtl(model, url, ftl);
                if (this.createFtl(model, url, ftl) == 1) {
                    return 0;
                } else {
                    return 1;
                }
            }
            return -1;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public <T> int createFtl(T t, String url, String ftl) throws Exception {
        try {
            Configuration cfg = new Configuration();
            // 设定去哪里读取相应的ftl模板文件
            cfg.setClassForTemplateLoading(this.getClass(), "/templates");
            // 在模板文件目录中找到名称为model.ftl的文件
            Template temp = cfg.getTemplate(ftl, "UTF-8");
            FileWriter fileWriter = new FileWriter(new File(url));
            Map<String, Object> map = new HashMap<String, Object>(16);
            map.put("Model", t);
            temp.process(map, fileWriter);
            fileWriter.flush();
            fileWriter.close();
            return 0;
        } catch (Exception e) {
            throw e;
        }
    }

}
