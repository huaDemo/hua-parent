package com.hua.dal.service.impl;

import com.hua.dal.dao.IBaseDao;
import com.hua.dal.entity.Area;
import com.hua.dal.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: hua
 * @create: 2018-05-28 21:34
 */
@Service
public class BaseServiceImpl implements IBaseService{

    @Autowired
    private IBaseDao baseDao;

    @Override
    public List<Area> getAreaList() throws Exception {
        return (List<Area>) baseDao.getList("com.hua.dal.dao.IBaseDao.getList", "");
    }
}
