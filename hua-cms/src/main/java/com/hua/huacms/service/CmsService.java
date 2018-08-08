package com.hua.huacms.service;

import com.hua.huacms.entity.Model;

/**
 * @author: hua
 * @create: 2018-06-06 21:40
 */
public interface CmsService {

    /**
     * 智能代码生成实体类服务
     *
     * @param model
     * @param dbType
     * @param url
     * @param ftl
     * @return 1成功 0失败
     * @throws Exception
     */
    void createModel(Model model, String dbType, String url, String ftl) throws Exception;

    /**
     * 创建模板文件服务
     *
     * @param t
     * @param url
     * @param ftl
     * @param <T>
     * @return
     * @throws Exception
     */
    <T> void createFtl(T t, String url, String ftl, String suffix) throws Exception;

}
