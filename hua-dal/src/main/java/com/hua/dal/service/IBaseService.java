package com.hua.dal.service;

import com.hua.dal.dao.IBaseDao;
import com.hua.dal.entity.Area;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: hua
 * @create: 2018-05-28 21:30
 */
@Service
public interface IBaseService {

   /* *//**
     * 插入
     * @param method
     * @param parameter
     * @return
     * @throws Exception
     *//*
    int insert(String method, Object parameter) throws Exception;
    *//**
     * 删除
     * @param method
     * @param parameter
     * @return
     * @throws Exception
     *//*
    int delete(String method, Object parameter) throws Exception;
    *//**
     * 查询
     * @param method
     * @param parameter
     * @return
     * @throws Exception
     *//*
    List<?> getList(String method, Object parameter) throws Exception;
    *//**
     * 分页查询
     * @param method
     * @param parameter
     * @param page
     * @return
     * @throws Exception
     *//**//*
    List<?> getList(String method, Object parameter, Page page) throws Exception;*//*
    *//**
     * 修改
     * @param method
     * @param parameter
     * @return
     * @throws Exception
     *//*
    int update(String method, Object parameter) throws Exception;
    *//**
     * 查询一条数据
     * @param method
     * @param parameter
     * @return
     * @throws Exception
     *//*
    Object getObject(String method, Object parameter) throws Exception;*/

    List<Area> getAreaList() throws Exception;

}
