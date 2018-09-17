package com.hua.dal.service;

import com.hua.dal.dao.IBaseDao;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: hua
 * @create: 2018-05-28 21:30
 */
public interface IBaseService {

    /**
     * 查询
     *
     * @param method
     * @param parameter
     * @return
     * @throws Exception
     */
    List<?> getList(String method, Object parameter) throws Exception;

}
