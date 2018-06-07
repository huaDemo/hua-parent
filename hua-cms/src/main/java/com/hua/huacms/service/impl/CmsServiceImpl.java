package com.hua.huacms.service.impl;

import com.hua.dal.dao.IBaseDao;
import com.hua.dal.service.IBaseService;
import com.hua.huacms.entity.Column;
import com.hua.huacms.service.CmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: hua
 * @create: 2018-06-06 21:41
 */
@Service("cmsService")
public class CmsServiceImpl implements CmsService {

    @Resource(name = "baseService")
    private IBaseService baseService;

    @Override
    public List<Column> test(String tableName) throws Exception {
        Column column = new Column();
        column.setTableId(tableName);
        return (List<Column>) baseService.getList("com.hua.huacms.mapper.oracle.getColumnListByTableName", column);
    }
}
