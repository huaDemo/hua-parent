package com.hua.huacms.util;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.IOException;

/**
 * Freemarker工具包
 *
 * @author: hua
 * @create: 2018-06-04 22:41
 */
public class FreemarkerUtil {

    /**
     * 获取模板
     *
     * @param name
     * @return
     */
    public Template getTemplate(String name) {
        try {
            // 通过FreeMarker的Configuration读取相应的ftl
            Configuration cfg = new Configuration();
            // 设定去哪里读取相应的ftl模板文件
            cfg.setClassForTemplateLoading(this.getClass(), "/templates");
            // 在模板文件目录中找到名称为name的文件
            Template temp = cfg.getTemplate(name);
            return temp;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
