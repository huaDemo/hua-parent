package com.hua.app.controller;

import com.hua.app.entity.BaseResult;
import com.hua.dal.entity.Page;
import com.hua.portal.entity.HuaUser;
import com.hua.portal.service.HuaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


/**
* 平台用户控制层服务
*
* @author: hua
* @create: 2018-08-27 23:04:11
*/
@RestController
@RequestMapping("/huaUser")
public class HuaUserController {

    @Resource(name = "huaUserService")
    private HuaUserService huaUserService;

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
            baseResult.setData(huaUserService.getOne(id));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 查询多条
    *
    * @param huaUser
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/getlist", method = RequestMethod.POST)
    public BaseResult getList(@RequestBody HuaUser huaUser) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaUser != null) {
            baseResult.setData(huaUserService.getList(huaUser));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 分页查询
    *
    * @param huaUser
    * @param page
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/getpage", method = RequestMethod.POST)
    public BaseResult getListByPage(@RequestBody HuaUser huaUser, @RequestBody Page page) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaUser != null) {
            baseResult.setData(huaUserService.getList(huaUser, page));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 修改单条
    *
    * @param huaUser
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public BaseResult update(@RequestBody HuaUser huaUser) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaUser != null) {
            baseResult.setData(huaUserService.update(huaUser));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 修改多条
    *
    * @param huaUserList
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/updatelist", method = RequestMethod.POST)
    public BaseResult updateList(@RequestBody List<HuaUser> huaUserList) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaUserList != null && huaUserList.size() > 0) {
            baseResult.setData(huaUserService.updateList(huaUserList));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 删除单条
    *
    * @param huaUser
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public BaseResult delete(@RequestBody HuaUser huaUser) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaUser != null) {
            baseResult.setData(huaUserService.delete(huaUser));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 删除多条
    *
    * @param huaUserList
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/deletelist", method = RequestMethod.POST)
    public BaseResult deletelist(@RequestBody List<HuaUser> huaUserList) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaUserList != null && huaUserList.size() > 0) {
            baseResult.setData(huaUserService.deleteList(huaUserList));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 新增单条
    *
    * @param huaUser
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public BaseResult insert(@RequestBody HuaUser huaUser) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaUser != null) {
            baseResult.setData(huaUserService.insert(huaUser));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 新增多条
    *
    * @param huaUserList
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/insertlist", method = RequestMethod.POST)
    public BaseResult insertList(@RequestBody List<HuaUser> huaUserList) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaUserList != null && huaUserList.size() > 0) {
            baseResult.setData(huaUserService.insertList(huaUserList));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

}
