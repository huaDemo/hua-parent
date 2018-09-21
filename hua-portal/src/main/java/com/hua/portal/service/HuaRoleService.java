package com.hua.portal.service;

import com.hua.portal.entity.HuaRole;
import com.hua.huacommon.Util.Page;

import java.util.List;

/**
* 角色服务接口类
*
* @author: hua
* @create: 2018-09-18 16:04:45
*/
public interface HuaRoleService {

    /**
    * 插入
    *
    * @return
    * @throws Exception
    */
    int insert(HuaRole huaRole) throws Exception;

    /**
    * 批量插入
    *
    * @return
    * @throws Exception
    */
    int insertList(List<HuaRole> huaRoleList) throws Exception;

    /**
    * 删除
    *
    * @return
    * @throws Exception
    */
    int delete(HuaRole huaRole) throws Exception;

    /**
    * 批量删除
    *
    * @return
    * @throws Exception
    */
    int deleteList(List<HuaRole> huaRoleList) throws Exception;

    /**
    * 查询一条数据
    *
    * @return
    * @throws Exception
    */
    HuaRole getOne(String id) throws Exception;

    /**
    * 查询
    *
    * @return
    * @throws Exception
    */
    List<?> getList(HuaRole huaRole) throws Exception;

    /**
    * 分页查询
    *
    * @return
    * @throws Exception
    */
    Page getList(HuaRole huaRole, Page page) throws Exception;

    /**
    * 修改
    *
    * @return
    * @throws Exception
    */
    int update(HuaRole huaRole) throws Exception;

    /**
    * 批量修改
    *
    * @return
    * @throws Exception
    */
    int updateList(List<HuaRole> huaRoleList) throws Exception;

}
