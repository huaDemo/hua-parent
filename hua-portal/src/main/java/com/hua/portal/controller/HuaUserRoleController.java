package com.hua.portal.controller;

import com.hua.huacommon.Util.BaseResult;
import com.hua.huacommon.Util.Page;
import com.hua.portal.entity.HuaUserRole;
import com.hua.portal.service.HuaUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
* 用户角色控制层服务
*
* @author: hua
* @create: 2018-09-17 21:23:27
*/
@RestController
@RequestMapping("/huaUserRole")
public class HuaUserRoleController {

    @Autowired
    private HuaUserRoleService huaUserRoleService;

    /**
    * 查询单条
    *
    * @param id
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public BaseResult getOne(@PathVariable("id") String id) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (id != null) {
            baseResult.setData(huaUserRoleService.getOne(id));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 查询多条
    *
    * @param huaUserRole
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/getlist", method = RequestMethod.POST)
    public BaseResult getList(HuaUserRole huaUserRole) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaUserRole != null) {
            baseResult.setData(huaUserRoleService.getList(huaUserRole));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 分页查询
    *
    * @param huaUserRole
    * @param page
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/getpage", method = RequestMethod.POST)
    public BaseResult getListByPage(HuaUserRole huaUserRole, Page page) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaUserRole != null) {
            baseResult.setData(huaUserRoleService.getList(huaUserRole, page));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 修改单条
    *
    * @param huaUserRole
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public BaseResult update(HuaUserRole huaUserRole) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaUserRole != null) {
            baseResult.setData(huaUserRoleService.update(huaUserRole));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 修改多条
    *
    * @param huaUserRoleList
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/updatelist", method = RequestMethod.POST)
    public BaseResult updateList(List<HuaUserRole> huaUserRoleList) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaUserRoleList != null && huaUserRoleList.size() > 0) {
            baseResult.setData(huaUserRoleService.updateList(huaUserRoleList));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 删除单条
    *
    * @param huaUserRole
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public BaseResult delete(HuaUserRole huaUserRole) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaUserRole != null) {
            baseResult.setData(huaUserRoleService.delete(huaUserRole));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 删除多条
    *
    * @param huaUserRoleList
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/deletelist", method = RequestMethod.POST)
    public BaseResult deletelist(List<HuaUserRole> huaUserRoleList) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaUserRoleList != null && huaUserRoleList.size() > 0) {
            baseResult.setData(huaUserRoleService.deleteList(huaUserRoleList));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 新增单条
    *
    * @param huaUserRole
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public BaseResult insert(HuaUserRole huaUserRole) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaUserRole != null) {
            baseResult.setData(huaUserRoleService.insert(huaUserRole));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 新增多条
    *
    * @param huaUserRoleList
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/insertlist", method = RequestMethod.POST)
    public BaseResult insertList(List<HuaUserRole> huaUserRoleList) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaUserRoleList != null && huaUserRoleList.size() > 0) {
            baseResult.setData(huaUserRoleService.insertList(huaUserRoleList));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

}
