package com.hua.huacms.service;

import com.hua.huacms.entity.Column;
import com.hua.huacms.entity.Model;
import com.hua.huacms.entity.Table;

import java.util.List;

/**
 * @author: hua
 * @create: 2018-06-06 21:40
 */
public interface CmsService {

    List<Column> test(String tableName) throws Exception;

    /**
     * 智能代码生成实体类服务
     *
     * @param model
     * @param dbType
     * @param url
     * @return
     * @throws Exception
     */
    int createModel(Model model, String dbType, String url) throws Exception;

}
