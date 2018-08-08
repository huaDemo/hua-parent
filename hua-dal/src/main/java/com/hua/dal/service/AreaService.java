package com.hua.dal.service;

import com.hua.dal.entity.Area;
import com.hua.dal.entity.Page;

import java.util.List;

/**
 * @author: hua
 * @create: 2018-08-08 16:48
 */
public interface AreaService {

    /**
     * 插入
     *
     * @return
     * @throws Exception
     */
    int insert(Area area) throws Exception;

    /**
     * 批量插入
     *
     * @return
     * @throws Exception
     */
    int insertList(List<Area> areaList) throws Exception;

    /**
     * 删除
     *
     * @return
     * @throws Exception
     */
    int delete(Area area) throws Exception;

    /**
     * 批量删除
     *
     * @return
     * @throws Exception
     */
    int deleteList(List<Area> areaList) throws Exception;

    /**
     * 查询一条数据
     *
     * @return
     * @throws Exception
     */
    Area getOne(String id) throws Exception;

    /**
     * 查询
     *
     * @return
     * @throws Exception
     */
    List<?> getList(Area area) throws Exception;

    /**
     * 分页查询
     *
     * @return
     * @throws Exception
     */
    Page getList(Area area, Page page) throws Exception;

    /**
     * 修改
     *
     * @return
     * @throws Exception
     */
    int update(Area area) throws Exception;

    /**
     * 批量修改
     *
     * @return
     * @throws Exception
     */
    int updateList(List<Area> areaList) throws Exception;

}
