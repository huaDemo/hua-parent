package com.hua.portal.service;

import com.hua.portal.entity.HuaRoleRight;
import com.hua.huacommon.Util.Page;

import java.util.List;

/**
* 角色权限服务接口类
*
* @author: hua
* @create: 2018-09-17 21:20:24
*/
public interface HuaRoleRightService {

    /**
    * 插入
    *
    * @return
    * @throws Exception
    */
    int insert(HuaRoleRight huaRoleRight) throws Exception;

    /**
    * 批量插入
    *
    * @return
    * @throws Exception
    */
    int insertList(List<HuaRoleRight> huaRoleRightList) throws Exception;

    /**
    * 删除
    *
    * @return
    * @throws Exception
    */
    int delete(HuaRoleRight huaRoleRight) throws Exception;

    /**
    * 批量删除
    *
    * @return
    * @throws Exception
    */
    int deleteList(List<HuaRoleRight> huaRoleRightList) throws Exception;

    /**
    * 查询一条数据
    *
    * @return
    * @throws Exception
    */
    HuaRoleRight getOne(String id) throws Exception;

    /**
    * 查询
    *
    * @return
    * @throws Exception
    */
    List<?> getList(HuaRoleRight huaRoleRight) throws Exception;

    /**
    * 分页查询
    *
    * @return
    * @throws Exception
    */
    Page getList(HuaRoleRight huaRoleRight, Page page) throws Exception;

    /**
    * 修改
    *
    * @return
    * @throws Exception
    */
    int update(HuaRoleRight huaRoleRight) throws Exception;

    /**
    * 批量修改
    *
    * @return
    * @throws Exception
    */
    int updateList(List<HuaRoleRight> huaRoleRightList) throws Exception;

}
