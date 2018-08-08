package com.hua.dal.controller;

import com.hua.dal.entity.Area;
import com.hua.dal.entity.BaseResult;
import com.hua.dal.entity.Page;
import com.hua.dal.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author: hua
 * @create: 2018-05-28 22:12
 */
@RestController
public class AreaController {

    @Autowired
    private AreaService areaService;

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

    @RequestMapping(value = "/getarea", method = RequestMethod.POST)
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

    @RequestMapping(value = "/getarea/page", method = RequestMethod.POST)
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


}
