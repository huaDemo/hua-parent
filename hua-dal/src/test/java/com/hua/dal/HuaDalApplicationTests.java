package com.hua.dal;

import com.hua.dal.dao.IBaseDao;
import com.hua.dal.entity.Page;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HuaDalApplicationTests {

    @Resource(name = "baseDao")
    private IBaseDao baseDao;

    @Test
    public void contextLoads() throws Exception {
        List<String> list = new ArrayList<String>();
        list.add("4");
        list.add("8");
        int i = baseDao.delete("com.hua.dal.mapper.area.deleteArea", "4");
    }

    @Test
    public void pageTest() throws Exception {
        List<String> list = new ArrayList<>();
        list.add("4");
        list.add("");
        Page page = new Page();
        page.setPageSize(2);
        RowBounds rowBounds = new RowBounds(page.getCurrentPage(), page.getPageSize());

    }

    /*@Test
    public void test() throws Exception {
        *//*String method = "com.hua.dal.mapper.area.getList";
        int lastIndex = method.lastIndexOf(".");
        String str = method.substring(0,lastIndex);*//*
        Page page = new Page();
        page.setPageSize(2);
        Page areas = (Page) baseDao.getList("com.hua.dal.mapper.area.getList", new Area(), page);
    }*/

}
