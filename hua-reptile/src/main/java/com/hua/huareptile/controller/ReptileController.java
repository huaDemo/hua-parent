package com.hua.huareptile.controller;

import com.hua.huacommon.Util.BaseResult;
import com.hua.huareptile.service.ReptileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @auther: hua
 * @date: 2018/11/24 19:32
 */
@RestController
@RequestMapping("/reptile")
public class ReptileController {

    @Autowired
    private ReptileService reptileService;

    @RequestMapping(value = "/getzhihu", method = RequestMethod.GET)
    public BaseResult getZhiHu() throws Exception{
        BaseResult baseResult = new BaseResult();
        try {
            baseResult.setData(reptileService.reptileZhiHu());
        } catch (Exception e) {
            e.printStackTrace();
            baseResult.setCode(999);
            baseResult.setMessage(e.getMessage());
        }
        return baseResult;
    }

}
