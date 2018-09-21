package com.hua.portal.controller;

import com.hua.huacommon.Util.BaseResult;
import com.hua.huacommon.Util.Page;
import com.hua.portal.entity.HuaRole;
import com.hua.portal.service.HuaRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
* 角色控制层服务
*
* @author: hua
* @create: 2018-09-17 21:13:01
*/
@RestController
@RequestMapping("/huaRole")
public class HuaRoleController {

    @Autowired
    private HuaRoleService huaRoleService;

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
            baseResult.setData(huaRoleService.getOne(id));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 查询多条
    *
    * @param huaRole
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/getlist", method = RequestMethod.POST)
    public BaseResult getList(HuaRole huaRole) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaRole != null) {
            baseResult.setData(huaRoleService.getList(huaRole));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 分页查询
    *
    * @param huaRole
    * @param page
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/getpage", method = RequestMethod.POST)
    public BaseResult getListByPage(HuaRole huaRole, Page page) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaRole != null) {
            baseResult.setData(huaRoleService.getList(huaRole, page));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 修改单条
    *
    * @param huaRole
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public BaseResult update(HuaRole huaRole) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaRole != null) {
            baseResult.setData(huaRoleService.update(huaRole));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 修改多条
    *
    * @param huaRoleList
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/updatelist", method = RequestMethod.POST)
    public BaseResult updateList(List<HuaRole> huaRoleList) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaRoleList != null && huaRoleList.size() > 0) {
            baseResult.setData(huaRoleService.updateList(huaRoleList));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 删除单条
    *
    * @param huaRole
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public BaseResult delete(HuaRole huaRole) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaRole != null) {
            baseResult.setData(huaRoleService.delete(huaRole));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 删除多条
    *
    * @param huaRoleList
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/deletelist", method = RequestMethod.POST)
    public BaseResult deletelist(List<HuaRole> huaRoleList) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaRoleList != null && huaRoleList.size() > 0) {
            baseResult.setData(huaRoleService.deleteList(huaRoleList));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 新增单条
    *
    * @param huaRole
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public BaseResult insert(HuaRole huaRole) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaRole != null) {
            baseResult.setData(huaRoleService.insert(huaRole));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 新增多条
    *
    * @param huaRoleList
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/insertlist", method = RequestMethod.POST)
    public BaseResult insertList(List<HuaRole> huaRoleList) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaRoleList != null && huaRoleList.size() > 0) {
            baseResult.setData(huaRoleService.insertList(huaRoleList));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

}
