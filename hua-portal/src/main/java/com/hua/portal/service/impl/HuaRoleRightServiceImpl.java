package com.hua.portal.service.impl;

import com.hua.dal.dao.IBaseDao;
import com.hua.huacommon.Util.Page;
import com.hua.portal.constant.PortalMapperEnum;
import com.hua.portal.entity.HuaRoleRight;
import com.hua.portal.service.HuaRoleRightService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* 角色权限服务实现类
*
* @author: hua
* @create: 2018-09-17 21:20:24
*/
@Service
public class HuaRoleRightServiceImpl implements HuaRoleRightService {

    @Resource(name = "baseDao")
    private IBaseDao baseDao;

    @Override
    public int insert(HuaRoleRight huaRoleRight) throws Exception {
        return baseDao.insert(PortalMapperEnum.HUAROLERIGHT.getUrl() + "insert", huaRoleRight);
    }

    @Override
    public int insertList(List<HuaRoleRight> huaRoleRightList) throws Exception {
        return baseDao.insertList(PortalMapperEnum.HUAROLERIGHT.getUrl() + "insert", huaRoleRightList);
    }

    @Override
    public int delete(HuaRoleRight huaRoleRight) throws Exception {
        return baseDao.delete(PortalMapperEnum.HUAROLERIGHT.getUrl() + "delete", huaRoleRight);
    }

    @Override
    public int deleteList(List<HuaRoleRight> huaRoleRightList) throws Exception {
        return baseDao.deleteList(PortalMapperEnum.HUAROLERIGHT.getUrl() + "delete", huaRoleRightList);
    }

    @Override
    public HuaRoleRight getOne(String id) throws Exception {
        return (HuaRoleRight) baseDao.getObject(PortalMapperEnum.HUAROLERIGHT.getUrl() + "getOne", id);
    }

    @Override
    public List<?> getList(HuaRoleRight huaRoleRight) throws Exception {
        return baseDao.getList(PortalMapperEnum.HUAROLERIGHT.getUrl() + "getList", huaRoleRight);
    }

    @Override
    public Page getList(HuaRoleRight huaRoleRight, Page page) throws Exception {
        return baseDao.getList(PortalMapperEnum.HUAROLERIGHT.getUrl() + "getList", huaRoleRight, page);
    }

    @Override
    public int update(HuaRoleRight huaRoleRight) throws Exception {
        return baseDao.update(PortalMapperEnum.HUAROLERIGHT.getUrl() + "update", huaRoleRight);
    }

    @Override
    public int updateList(List<HuaRoleRight> huaRoleRightList) throws Exception {
        return baseDao.updateList(PortalMapperEnum.HUAROLERIGHT.getUrl() + "update", huaRoleRightList);
    }

}
