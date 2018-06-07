package com.hua.huacms;

import com.hua.dal.dao.IBaseDao;
import com.hua.huacms.entity.Column;
import com.hua.huacms.entity.Model;
import com.hua.huacms.service.CmsService;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.hua.dal.dao")//动态扫描dao层将其作为bean
public class HuaCmsApplicationTests {

    /**
     * 获取模板
     *
     * @return
     */
    @Test
    public void test() {
        try {
            // 通过FreeMarker的Configuration读取相应的ftl
            Configuration cfg = new Configuration();
            // 设定去哪里读取相应的ftl模板文件
            cfg.setClassForTemplateLoading(this.getClass(), "/templates");
            // 在模板文件目录中找到名称为name的文件
            Template temp = cfg.getTemplate("index.ftl", "UTF-8");
            FileWriter fileWriter = new FileWriter(new File("f://test.html"));
            Map<String, Object> map = new HashMap<String, Object>();
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
            temp.process(map, fileWriter);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }

    /**
     * 输出到控制台
     */
    @Test
    public void print() {
        /*try {
            // 通过Template可以将模板文件输出到相应的流
            Template temp = this.getTemplate(name);
            temp.process(root, new PrintWriter(System.out));
        } catch (TemplateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

    /**
     * 输出到文件
     *
     * @param name
     * @param root
     * @param outFile
     */
    /*@Test
    public void fprint(String name, Map<String, Object> root, String outFile) {
        FileWriter out = null;
        try {
            // 通过一个文件输出流，就可以写到相应的文件中
            try {
                out = new FileWriter(new File(App.class.getResource("/").toURI().getPath() + outFile));
            } catch (URISyntaxException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Template temp = this.getTemplate(name);
            temp.process(root, out);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null)
                    out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }*/

    @Autowired
    private CmsService cmsService;

    @Test
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
        for (Column column : columnList) {
            if ("VARCHAR2".equals(column.getColumnType()) || "DATE".equals(column.getColumnType())) {
                column.setColumnType("String");
            } else if ("NUMBER".equals(column.getColumnType())) {
                column.setColumnType("Double");
            }
            if (column.getColumnName() != null && column.getColumnName().contains("_")) {
                String[] strs = column.getColumnName().split("_");
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < strs.length; i++) {
                    if (i == 0) {
                        //小写
                        sb.append(strs[i].toLowerCase());
                    } else {
                        //从第二个起的单词首字母大写
                        sb.append(strs[i].substring(0, 1).toUpperCase()).append(strs[i].substring(1).toLowerCase());
                    }
                }
                column.setColumnName(sb.toString());
            } else {
                column.setColumnName(column.getColumnName().toLowerCase());
            }
        }
        Model model = new Model();
        model.setAuthor("hua");
        model.setClassName(className);
        model.setModuleName("com.bocins.springcloud.carlistquery");
        model.setPackageName("vo");
        model.setRemark(className + "实体类");
        model.setColumnList(columnList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("Model", model);
        temp.process(map, fileWriter);
        fileWriter.flush();
        fileWriter.close();

    }

}
