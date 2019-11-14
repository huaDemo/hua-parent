package com.hua.app.controller;

import com.hua.app.entity.CmsReqDO;
import com.hua.app.websocket.MyWebSocket;
import com.hua.huacms.entity.Model;
import com.hua.huacms.service.CmsService;
import com.hua.huacms.service.DBService;
import com.hua.huacommon.Util.BaseResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 智能代码生成控制层
 *
 * @author: hua
 * @create: 2018-08-15 21:41
 */
@RestController
@RequestMapping("/cms")
public class CmsController {

    @Value("${cms.dbname}")
    private String dbName;

    @Value("${cms.dbtype}")
    private String dbType;

    @Resource(name = "cmsService")
    private CmsService cmsService;

    @Resource(name = "dbService")
    private DBService dbService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public BaseResult createController(CmsReqDO cmsReqDO) throws Exception {
        BaseResult baseResult = new BaseResult();
        try {
            Model model = new Model();
            model.setTableName(cmsReqDO.getTableName());
            model.setModuleName(cmsReqDO.getModuleName());
            model.setPackageName(cmsReqDO.getPackageName());
            model.setAuthor(cmsReqDO.getAuthor());
            model.setRemark(cmsReqDO.getRemark());
            cmsService.createModel(model, this.dbType, cmsReqDO.getUrl(), cmsReqDO.getFtlName());
        } catch (Exception e) {
            baseResult.setCode(999);
            baseResult.setMessage(e.getMessage());
        }
        return baseResult;
    }

    @RequestMapping(value = "/getdb", method = RequestMethod.GET)
    public BaseResult getDBController() throws Exception {
        BaseResult baseResult = new BaseResult();
        try {
            baseResult.setData(dbService.getTableList(this.dbName, this.dbType));
        } catch (Exception e) {
            e.printStackTrace();
            baseResult.setCode(999);
            baseResult.setMessage(e.getMessage());
        }
        return baseResult;
    }

    @RequestMapping(value = "/socket/push", method = {RequestMethod.GET, RequestMethod.POST})
    public Object test(String cid, String message, HttpServletRequest request) {
        BaseResult baseResult = new BaseResult();
        try {
            MyWebSocket.sendInfo(message,cid);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return baseResult;
    }
}
