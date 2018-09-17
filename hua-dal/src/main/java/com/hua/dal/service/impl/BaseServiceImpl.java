package com.hua.dal.service.impl;

import com.hua.dal.dao.IBaseDao;
import com.hua.dal.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: hua
 * @create: 2018-05-28 21:34
 */
@Service("baseService")
public class BaseServiceImpl implements IBaseService {

    @Resource(name = "baseDao")
    IBaseDao baseDao;

    @Override
    public List<?> getList(String method, Object parameter) throws Exception {
        return baseDao.getList(method,parameter);
    }
}
