package com.hua.huacms.service.impl;

import com.hua.huacms.entity.Column;
import com.hua.huacms.entity.Model;
import com.hua.huacms.entity.Table;
import com.hua.huacms.service.CmsService;
import com.hua.huacms.service.DBService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author: hua
 * @create: 2018-06-15 15:11
 */
/*@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.hua.dal.dao")//动态扫描dao层将其作为bean*/
public class DBServiceImplTest {

    @Autowired
    private DBService dbService;

    @Autowired
    private CmsService cmsService;

    @Test
    public void getTableList() throws Exception {
        List<Table> tableList = dbService.getTableList("demo", "mysql");
    }

    @Test
    public void getColumnList() throws Exception {
        List<Column> columnList = dbService.getColumnList("tb_area", "mysql");
    }

    @Test
    public void cmsServiceTest() throws Exception {
        String className = "tb_area";//
        Model model = new Model();
        model.setAuthor("hua");
        model.setTableName(className);
        model.setModuleName("com.bocins.springcloud");
        model.setPackageName("vo");
        cmsService.createModel(model, "mysql", "", "");
    }

    @Test
    public void test() throws Exception {
        String[] arr = {"1", "2", "3", "4", "5", "6"};
        People people = null;
        for (int i = 0; i < arr.length; i++) {
            test1(people);
            /*people = new People();
            people.setName("lisi");*/
            System.out.println(people);
        }
    }

    public void test1(People people) throws Exception{
        people = new People();
        people.setName("lisi");
    }

}