package com.hua.portal.controller;

import com.hua.huacommon.Util.BaseResult;
import com.hua.huacommon.Util.Page;
import com.hua.portal.entity.*;
import com.hua.portal.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 用户表控制层服务
 *
 * @author: hua
 * @create: 2018-09-07 13:39:58
 */
@RestController
@RequestMapping("/huaUser")
public class HuaUserController {

    @Autowired
    private HuaUserService huaUserService;

    @Autowired
    private HuaUserRoleService huaUserRoleService;

    @Autowired
    private HuaRoleService huaRoleService;

    @Autowired
    private HuaRightService huaRightService;

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
    public BaseResult getList(HuaUser huaUser) throws Exception {
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
    public BaseResult getListByPage(HuaUser huaUser, Page page) throws Exception {
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
    public BaseResult update(HuaUser huaUser) throws Exception {
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
    public BaseResult updateList(List<HuaUser> huaUserList) throws Exception {
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
    public BaseResult delete(HuaUser huaUser) throws Exception {
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
    public BaseResult deletelist(List<HuaUser> huaUserList) throws Exception {
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
    public BaseResult insert(HuaUser huaUser) throws Exception {
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
    public BaseResult insertList(List<HuaUser> huaUserList) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaUserList != null && huaUserList.size() > 0) {
            baseResult.setData(huaUserService.insertList(huaUserList));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
     * 登录
     *
     * @param huaUser
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public BaseResult login(HuaUser huaUser, HttpServletRequest request) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (huaUser != null) {
            HuaUser user = huaUserService.getOne(huaUser.getId());
            if (user != null) {
                if (huaUser.getPassword().equals(user.getPassword())) {
                    request.getSession().setAttribute("user", user);
                } else {
                    baseResult.setCode(999);
                    baseResult.setMessage("用户密码错误!");
                }
            } else {
                baseResult.setCode(999);
                baseResult.setMessage("用户不存在!");
            }
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
     * 加载左侧权限按钮
     *
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/loadmenu", method = RequestMethod.POST)
    public BaseResult loadMenu(HttpServletRequest request) throws Exception {
        BaseResult baseResult = new BaseResult();
        //获取用户信息
        HuaUser user = (HuaUser) request.getSession().getAttribute("user");
        if (user != null) {
            //获取用户角色
            HuaUserRole huaUserRole = new HuaUserRole();
            huaUserRole.setUserId(user.getId());
            List<HuaUserRole> huaUserRoleList = (List<HuaUserRole>) huaUserRoleService.getList(huaUserRole);
            if (huaUserRoleList != null && huaUserRoleList.size() > 0) {
                HuaRole huaRole = huaRoleService.getOne(huaUserRoleList.get(0).getRoleId());
                //获取用户权限
                HuaRoleRight huaRoleRight = new HuaRoleRight();
                huaRoleRight.setRoleId(huaRole.getId());
                List<HuaRoleRight> huaRoleRightList = (List<HuaRoleRight>) huaRoleRightService.getList(huaRoleRight);
                if (huaRoleRightList != null && huaRoleRightList.size() > 0) {
                    Map<String, List<HuaRight>> childMap = new HashMap<String, List<HuaRight>>();
                    for (HuaRoleRight huaRoleRight1 : huaRoleRightList) {
                        HuaRight huaRight = huaRightService.getOne(huaRoleRight1.getRightId());
                        if (childMap.containsKey(huaRight.getParentRight())) {
                            childMap.get(huaRight.getParentRight()).add(huaRight);
                        } else {
                            List<HuaRight> list = new ArrayList<HuaRight>();
                            list.add(huaRight);
                            childMap.put(huaRight.getParentRight(), list);
                        }
                    }
                    baseResult.setData(childMap);
                    return baseResult;
                }
            }
        }
        baseResult.setCode(999);
        baseResult.setMessage("加载左侧权限按钮失败!");
        return baseResult;
    }

}
