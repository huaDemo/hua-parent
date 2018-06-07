package com.hua.dal.controller;

import com.hua.dal.entity.Area;
import com.hua.dal.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: hua
 * @create: 2018-05-28 22:12
 */
@RestController
public class AreaController {

    @Autowired
    private IBaseService baseService;

    @RequestMapping(value = "getlist")
    public Map getList() throws Exception {
        Map<String, Object> modelMap = new HashMap<String, Object>(16);
        List<Area> list = (List<Area>) baseService.getList("com.hua.dal.mapper.area.getList", "");
        modelMap.put("areaList", list);
        return modelMap;
    }
}
