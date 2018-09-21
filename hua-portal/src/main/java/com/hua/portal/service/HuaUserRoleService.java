package com.hua.portal.service;

import com.hua.portal.entity.HuaUserRole;
import com.hua.huacommon.Util.Page;

import java.util.List;

/**
* 用户角色服务接口类
*
* @author: hua
* @create: 2018-09-17 21:23:27
*/
public interface HuaUserRoleService {

    /**
    * 插入
    *
    * @return
    * @throws Exception
    */
    int insert(HuaUserRole huaUserRole) throws Exception;

    /**
    * 批量插入
    *
    * @return
    * @throws Exception
    */
    int insertList(List<HuaUserRole> huaUserRoleList) throws Exception;

    /**
    * 删除
    *
    * @return
    * @throws Exception
    */
    int delete(HuaUserRole huaUserRole) throws Exception;

    /**
    * 批量删除
    *
    * @return
    * @throws Exception
    */
    int deleteList(List<HuaUserRole> huaUserRoleList) throws Exception;

    /**
    * 查询一条数据
    *
    * @return
    * @throws Exception
    */
    HuaUserRole getOne(String id) throws Exception;

    /**
    * 查询
    *
    * @return
    * @throws Exception
    */
    List<?> getList(HuaUserRole huaUserRole) throws Exception;

    /**
    * 分页查询
    *
    * @return
    * @throws Exception
    */
    Page getList(HuaUserRole huaUserRole, Page page) throws Exception;

    /**
    * 修改
    *
    * @return
    * @throws Exception
    */
    int update(HuaUserRole huaUserRole) throws Exception;

    /**
    * 批量修改
    *
    * @return
    * @throws Exception
    */
    int updateList(List<HuaUserRole> huaUserRoleList) throws Exception;

}
