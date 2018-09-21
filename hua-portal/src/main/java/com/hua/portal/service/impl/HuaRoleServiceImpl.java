package com.hua.portal.service.impl;

import com.hua.dal.dao.IBaseDao;
import com.hua.huacommon.Util.Page;
import com.hua.portal.constant.PortalMapperEnum;
import com.hua.portal.entity.HuaRole;
import com.hua.portal.service.HuaRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* 角色服务实现类
*
* @author: hua
* @create: 2018-09-18 16:04:45
*/
@Service
public class HuaRoleServiceImpl implements HuaRoleService {

    @Resource(name = "baseDao")
    private IBaseDao baseDao;

    @Override
    public int insert(HuaRole huaRole) throws Exception {
        return baseDao.insert(PortalMapperEnum.HUAROLE.getUrl() + "insert", huaRole);
    }

    @Override
    public int insertList(List<HuaRole> huaRoleList) throws Exception {
        return baseDao.insertList(PortalMapperEnum.HUAROLE.getUrl() + "insert", huaRoleList);
    }

    @Override
    public int delete(HuaRole huaRole) throws Exception {
        return baseDao.delete(PortalMapperEnum.HUAROLE.getUrl() + "delete", huaRole);
    }

    @Override
    public int deleteList(List<HuaRole> huaRoleList) throws Exception {
        return baseDao.deleteList(PortalMapperEnum.HUAROLE.getUrl() + "delete", huaRoleList);
    }

    @Override
    public HuaRole getOne(String id) throws Exception {
        return (HuaRole) baseDao.getObject(PortalMapperEnum.HUAROLE.getUrl() + "getOne", id);
    }

    @Override
    public List<?> getList(HuaRole huaRole) throws Exception {
        return baseDao.getList(PortalMapperEnum.HUAROLE.getUrl() + "getList", huaRole);
    }

    @Override
    public Page getList(HuaRole huaRole, Page page) throws Exception {
        return baseDao.getList(PortalMapperEnum.HUAROLE.getUrl() + "getList", huaRole, page);
    }

    @Override
    public int update(HuaRole huaRole) throws Exception {
        return baseDao.update(PortalMapperEnum.HUAROLE.getUrl() + "update", huaRole);
    }

    @Override
    public int updateList(List<HuaRole> huaRoleList) throws Exception {
        return baseDao.updateList(PortalMapperEnum.HUAROLE.getUrl() + "update", huaRoleList);
    }

}
