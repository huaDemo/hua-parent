package com.hua.huacms.service.impl;

import com.hua.huacms.entity.Column;
import com.hua.huacms.entity.Model;
import com.hua.huacms.service.CmsService;
import com.hua.huacms.service.DBService;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Autowired
    private DBService dbService;

    @Override
    public void createModel(Model model, String dbType, String url, String ftl) throws Exception {
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
                    if (columnList != null && columnList.size() > 0) {
                        model.setColumnList(columnList);
                    } else {
                        throw new RuntimeException("查询表数据为空");
                    }
                }
                if (model.getCreateTime() == null) {
                    //创建时间
                    model.setCreateTime(new Date());
                }
                //转换字段
                model.setColumnList(dbService.formatColumnList(dbType, model.getColumnList()));
                if (StringUtils.isBlank(ftl)) {
                    //创建实体模板文件
                    this.createFtl(model, url + "/hua/entity", "model.ftl", ".java");
                    //创建映射模板文件
                    this.createFtl(model, url + "/hua/mapper", "mapper.ftl", "Mapper.xml");
                    //创建接口文件
                    this.createFtl(model, url + "/hua/service", "service.ftl", "Service.java");
                    //创建实现文件
                    this.createFtl(model, url + "/hua/service/impl", "impl.ftl", "ServiceImpl.java");
                    //创建控制层文件
                    this.createFtl(model, url + "/hua/controller", "controller.ftl", "Controller.java");
                } else {
                    if ("model".equals(ftl)) {
                        //创建实体模板文件
                        this.createFtl(model, url + "/hua/model", "model.ftl", ".java");
                    } else if ("mapper".equals(ftl)) {
                        //创建映射模板文件
                        this.createFtl(model, url + "/hua/mapper", "mapper.ftl", "Mapper.xml");
                    } else if ("service".equals(ftl)) {
                        //创建接口文件
                        this.createFtl(model, url + "/hua/service", "service.ftl", "Service.java");
                    } else if ("impl".equals(ftl)) {
                        //创建实现文件
                        this.createFtl(model, url + "/hua/service/impl", "impl.ftl", "ServiceImpl.java");
                    } else if ("controller".equals(ftl)) {
                        //创建实现文件
                        this.createFtl(model, url + "/hua/controller", "controller.ftl", "Controller.java");
                    }
                }
            } else {
                throw new RuntimeException("传入model为空!");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public <T> void createFtl(T t, String url, String ftl, String suffix) throws Exception {
        try {
            Configuration cfg = new Configuration();
            // 设定去哪里读取相应的ftl模板文件
            cfg.setClassForTemplateLoading(this.getClass(), "/templates");
            // 在模板文件目录中找到名称为model.ftl的文件
            Template temp = cfg.getTemplate(ftl, "UTF-8");
            //
            File folder = new File(url + File.separatorChar);
            if (!folder.exists()) {
                folder.mkdirs();
            }
            File localFile = new File(url + File.separatorChar + ((Model) t).getClassName() + suffix);
            if (!localFile.exists()) {
                localFile.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(localFile);
            Map<String, Object> map = new HashMap<String, Object>(16);
            map.put("Model", t);
            temp.process(map, fileWriter);
            fileWriter.flush();
            fileWriter.close();
        } catch (Exception e) {
            throw e;
        }
    }

}
