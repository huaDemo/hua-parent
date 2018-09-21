package com.hua.portal.service;

import com.hua.huacommon.Util.Page;
import com.hua.portal.entity.HuaUser;

import java.util.List;

/**
* 平台用户服务接口类
*
* @author: hua
* @create: 2018-08-27 23:04:11
*/
public interface HuaUserService {

    /**
    * 插入
    *
    * @return
    * @throws Exception
    */
    int insert(HuaUser huaUser) throws Exception;

    /**
    * 批量插入
    *
    * @return
    * @throws Exception
    */
    int insertList(List<HuaUser> huaUserList) throws Exception;

    /**
    * 删除
    *
    * @return
    * @throws Exception
    */
    int delete(HuaUser huaUser) throws Exception;

    /**
    * 批量删除
    *
    * @return
    * @throws Exception
    */
    int deleteList(List<HuaUser> huaUserList) throws Exception;

    /**
    * 查询一条数据
    *
    * @return
    * @throws Exception
    */
    HuaUser getOne(String id) throws Exception;

    /**
    * 查询
    *
    * @return
    * @throws Exception
    */
    List<?> getList(HuaUser huaUser) throws Exception;

    /**
    * 分页查询
    *
    * @return
    * @throws Exception
    */
    Page getList(HuaUser huaUser, Page page) throws Exception;

    /**
    * 修改
    *
    * @return
    * @throws Exception
    */
    int update(HuaUser huaUser) throws Exception;

    /**
    * 批量修改
    *
    * @return
    * @throws Exception
    */
    int updateList(List<HuaUser> huaUserList) throws Exception;

}
