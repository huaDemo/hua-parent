package com.hua.portal.controller;

import com.hua.huacommon.Util.BaseResult;
import com.hua.huacommon.Util.Page;
import com.hua.portal.entity.HuaRoleRight;
import com.hua.portal.service.HuaRoleRightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
* 角色权限控制层服务
*
* @author: hua
* @create: 2018-09-17 21:20:24
*/
@RestController
@RequestMapping("/huaRoleRight")
public class HuaRoleRightController {

    @Autowired
    private HuaRoleRightService huaRoleRightService;

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
            baseResult.setData(huaRoleRightService.getOne(id));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 查询多条
    *
    * @param huaRoleRight
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/getlist", method = RequestMethod.POST)
    public BaseResult getList(HuaRoleRight huaRoleRight) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaRoleRight != null) {
            baseResult.setData(huaRoleRightService.getList(huaRoleRight));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 分页查询
    *
    * @param huaRoleRight
    * @param page
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/getpage", method = RequestMethod.POST)
    public BaseResult getListByPage(HuaRoleRight huaRoleRight, Page page) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaRoleRight != null) {
            baseResult.setData(huaRoleRightService.getList(huaRoleRight, page));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 修改单条
    *
    * @param huaRoleRight
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public BaseResult update(HuaRoleRight huaRoleRight) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaRoleRight != null) {
            baseResult.setData(huaRoleRightService.update(huaRoleRight));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 修改多条
    *
    * @param huaRoleRightList
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/updatelist", method = RequestMethod.POST)
    public BaseResult updateList(List<HuaRoleRight> huaRoleRightList) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaRoleRightList != null && huaRoleRightList.size() > 0) {
            baseResult.setData(huaRoleRightService.updateList(huaRoleRightList));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 删除单条
    *
    * @param huaRoleRight
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public BaseResult delete(HuaRoleRight huaRoleRight) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaRoleRight != null) {
            baseResult.setData(huaRoleRightService.delete(huaRoleRight));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 删除多条
    *
    * @param huaRoleRightList
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/deletelist", method = RequestMethod.POST)
    public BaseResult deletelist(List<HuaRoleRight> huaRoleRightList) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaRoleRightList != null && huaRoleRightList.size() > 0) {
            baseResult.setData(huaRoleRightService.deleteList(huaRoleRightList));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 新增单条
    *
    * @param huaRoleRight
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public BaseResult insert(HuaRoleRight huaRoleRight) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaRoleRight != null) {
            baseResult.setData(huaRoleRightService.insert(huaRoleRight));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 新增多条
    *
    * @param huaRoleRightList
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/insertlist", method = RequestMethod.POST)
    public BaseResult insertList(List<HuaRoleRight> huaRoleRightList) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaRoleRightList != null && huaRoleRightList.size() > 0) {
            baseResult.setData(huaRoleRightService.insertList(huaRoleRightList));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

}
