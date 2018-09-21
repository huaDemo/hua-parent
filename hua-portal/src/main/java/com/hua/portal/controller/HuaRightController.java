package com.hua.portal.controller;

import com.hua.huacommon.Util.BaseResult;
import com.hua.huacommon.Util.Page;
import com.hua.portal.entity.HuaRight;
import com.hua.portal.service.HuaRightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
* 权限控制层服务
*
* @author: hua
* @create: 2018-09-17 18:44:03
*/
@RestController
@RequestMapping("/huaRight")
public class HuaRightController {

    @Autowired
    private HuaRightService huaRightService;

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
            baseResult.setData(huaRightService.getOne(id));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 查询多条
    *
    * @param huaRight
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/getlist", method = RequestMethod.POST)
    public BaseResult getList(HuaRight huaRight) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaRight != null) {
            baseResult.setData(huaRightService.getList(huaRight));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 分页查询
    *
    * @param huaRight
    * @param page
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/getpage", method = RequestMethod.POST)
    public BaseResult getListByPage(HuaRight huaRight, Page page) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaRight != null) {
            baseResult.setData(huaRightService.getList(huaRight, page));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 修改单条
    *
    * @param huaRight
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public BaseResult update(HuaRight huaRight) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaRight != null) {
            baseResult.setData(huaRightService.update(huaRight));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 修改多条
    *
    * @param huaRightList
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/updatelist", method = RequestMethod.POST)
    public BaseResult updateList(List<HuaRight> huaRightList) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaRightList != null && huaRightList.size() > 0) {
            baseResult.setData(huaRightService.updateList(huaRightList));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 删除单条
    *
    * @param huaRight
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public BaseResult delete(HuaRight huaRight) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaRight != null) {
            baseResult.setData(huaRightService.delete(huaRight));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 删除多条
    *
    * @param huaRightList
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/deletelist", method = RequestMethod.POST)
    public BaseResult deletelist(List<HuaRight> huaRightList) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaRightList != null && huaRightList.size() > 0) {
            baseResult.setData(huaRightService.deleteList(huaRightList));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 新增单条
    *
    * @param huaRight
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public BaseResult insert(HuaRight huaRight) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaRight != null) {
            baseResult.setData(huaRightService.insert(huaRight));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 新增多条
    *
    * @param huaRightList
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/insertlist", method = RequestMethod.POST)
    public BaseResult insertList(List<HuaRight> huaRightList) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaRightList != null && huaRightList.size() > 0) {
            baseResult.setData(huaRightService.insertList(huaRightList));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

}
