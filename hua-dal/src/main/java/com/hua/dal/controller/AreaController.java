package com.hua.dal.controller;

import com.hua.dal.entity.Area;
import com.hua.dal.entity.BaseResult;
import com.hua.dal.entity.Page;
import com.hua.dal.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author: hua
 * @create: 2018-05-28 22:12
 */
@RestController
@RequestMapping("/area")
public class AreaController {

    @Autowired
    private AreaService areaService;

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
            baseResult.setData(areaService.getOne(id));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
     * 查询多条
     *
     * @param area
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/getlist", method = RequestMethod.POST)
    public BaseResult getList(@RequestBody Area area) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (area != null) {
            baseResult.setData(areaService.getList(area));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
     * 分页查询
     *
     * @param area
     * @param page
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/getpage", method = RequestMethod.POST)
    public BaseResult getListByPage(@RequestBody Area area, @RequestBody Page page) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (area != null) {
            baseResult.setData(areaService.getList(area, page));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
     * 修改单条
     *
     * @param area
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public BaseResult update(@RequestBody Area area) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (area != null) {
            baseResult.setData(areaService.update(area));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
     * 修改多条
     *
     * @param areaList
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/updatelist", method = RequestMethod.POST)
    public BaseResult updateList(@RequestBody List<Area> areaList) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (areaList != null && areaList.size() > 0) {
            baseResult.setData(areaService.updateList(areaList));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
     * 删除单条
     *
     * @param area
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public BaseResult delete(@RequestBody Area area) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (area != null) {
            baseResult.setData(areaService.delete(area));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
     * 删除多条
     *
     * @param areaList
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/deletelist", method = RequestMethod.POST)
    public BaseResult deletelist(@RequestBody List<Area> areaList) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (areaList != null && areaList.size() > 0) {
            baseResult.setData(areaService.deleteList(areaList));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
     * 新增单条
     *
     * @param area
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public BaseResult insert(@RequestBody Area area) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (area != null) {
            baseResult.setData(areaService.insert(area));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
     * 新增多条
     *
     * @param areaList
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/insertlist", method = RequestMethod.POST)
    public BaseResult insertList(@RequestBody List<Area> areaList) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (areaList != null && areaList.size() > 0) {
            baseResult.setData(areaService.insertList(areaList));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

}
