package com.hua.portal.service;

import com.hua.portal.entity.HuaRight;
import com.hua.huacommon.Util.Page;

import java.util.List;

/**
* 权限服务接口类
*
* @author: hua
* @create: 2018-09-20 18:33:36
*/
public interface HuaRightService {

    /**
    * 插入
    *
    * @return
    * @throws Exception
    */
    int insert(HuaRight huaRight) throws Exception;

    /**
    * 批量插入
    *
    * @return
    * @throws Exception
    */
    int insertList(List<HuaRight> huaRightList) throws Exception;

    /**
    * 删除
    *
    * @return
    * @throws Exception
    */
    int delete(HuaRight huaRight) throws Exception;

    /**
    * 批量删除
    *
    * @return
    * @throws Exception
    */
    int deleteList(List<HuaRight> huaRightList) throws Exception;

    /**
    * 查询一条数据
    *
    * @return
    * @throws Exception
    */
    HuaRight getOne(String id) throws Exception;

    /**
    * 查询
    *
    * @return
    * @throws Exception
    */
    List<?> getList(HuaRight huaRight) throws Exception;

    /**
    * 分页查询
    *
    * @return
    * @throws Exception
    */
    Page getList(HuaRight huaRight, Page page) throws Exception;

    /**
    * 修改
    *
    * @return
    * @throws Exception
    */
    int update(HuaRight huaRight) throws Exception;

    /**
    * 批量修改
    *
    * @return
    * @throws Exception
    */
    int updateList(List<HuaRight> huaRightList) throws Exception;

}
