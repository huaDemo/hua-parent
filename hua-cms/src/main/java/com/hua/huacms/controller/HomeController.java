package com.hua.huacms.controller;

import com.hua.huacms.entity.Column;
import com.hua.huacms.entity.Model;
import com.hua.huacms.service.CmsService;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: hua
 * @create: 2018-06-04 21:36
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @Resource(name = "cmsService")
    CmsService cmsService;

    /**
     * freemarker:(跳转到 freemarker.ftl).
     *
     * @param map
     * @return
     * @author Joe
     * Date:2017年11月6日下午4:52:19
     */
    @RequestMapping("/freemarker")
    public String freemarker(Map<String, Object> map) {
        map.put("name", "Joe");
        //sex:性别，1：男；0：女；
        map.put("sex", 1);
        // 模拟数据
        List<Map<String, Object>> friends = new ArrayList<Map<String, Object>>();
        Map<String, Object> friend = new HashMap<String, Object>();
        friend.put("name", "xbq");
        friend.put("age", 22);
        friends.add(friend);
        friend = new HashMap<String, Object>();
        friend.put("name", "July");
        friend.put("age", 18);
        friends.add(friend);
        map.put("friends", friends);
        return "index";
    }


    /*@RequestMapping("/test02")
    public void test02() throws Exception {
        // 通过FreeMarker的Configuration读取相应的ftl
        Configuration cfg = new Configuration();
        // 设定去哪里读取相应的ftl模板文件
        cfg.setClassForTemplateLoading(this.getClass(), "/templates");
        // 在模板文件目录中找到名称为name的文件
        String className = "Prptmain";
        Template temp = cfg.getTemplate("model.ftl", "UTF-8");
        FileWriter fileWriter = new FileWriter(new File("f://" + className + ".java"));

        List<Column> columnList = cmsService.test("PRPTMAIN");
        Model model = new Model();
        model.setAuthor("hua");
        model.setClassName(className);
        model.setModuleName("com.bocins.springcloud.carlistquery");
        model.setPackageName("vo");
        model.setColumnList(columnList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("Model", model);
        temp.process(map, fileWriter);
        fileWriter.flush();
        fileWriter.close();

    }*/
}
