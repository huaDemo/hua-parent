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
    public int createModel(Model model, String dbType, String url) throws Exception {
        try {
            //转换字段
            model.setColumnList(dbService.formatColumnList(dbType, model.getColumnList()));
            //获取tableId
            String tableId = model.getColumnList().get(0).getTableId();
            //查询某张表中所有字段信息
            List<Column> columnList = dbService.getColumnList(tableId, dbType);
            // 通过FreeMarker的Configuration读取相应的ftl
            Configuration cfg = new Configuration();
            // 设定去哪里读取相应的ftl模板文件
            cfg.setClassForTemplateLoading(this.getClass(), "/templates");
            // 在模板文件目录中找到名称为model.ftl的文件
            Template temp = cfg.getTemplate("model.ftl", "UTF-8");
            //创建Model实体
            model.setClassName(tableId);
            model.setColumnList(columnList);
            model.setCreateTime(new Date());
            FileWriter fileWriter = new FileWriter(new File(url));
            Map<String, Object> map = new HashMap<String, Object>(16);
            map.put("Model", model);
            temp.process(map, fileWriter);
            fileWriter.flush();
            fileWriter.close();
            return 0;
        } catch (Exception e) {
            return -1;
        }
    }

}
