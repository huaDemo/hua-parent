package com.hua.portal.service.impl;

import com.hua.dal.dao.IBaseDao;
import com.hua.huacommon.Util.Page;
import com.hua.portal.constant.PortalMapperEnum;
import com.hua.portal.entity.HuaUserRole;
import com.hua.portal.service.HuaUserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* 用户角色服务实现类
*
* @author: hua
* @create: 2018-09-17 21:23:27
*/
@Service
public class HuaUserRoleServiceImpl implements HuaUserRoleService {

    @Resource(name = "baseDao")
    private IBaseDao baseDao;

    @Override
    public int insert(HuaUserRole huaUserRole) throws Exception {
        return baseDao.insert(PortalMapperEnum.HUAUSERROLE.getUrl() + "insert", huaUserRole);
    }

    @Override
    public int insertList(List<HuaUserRole> huaUserRoleList) throws Exception {
        return baseDao.insertList(PortalMapperEnum.HUAUSERROLE.getUrl() + "insert", huaUserRoleList);
    }

    @Override
    public int delete(HuaUserRole huaUserRole) throws Exception {
        return baseDao.delete(PortalMapperEnum.HUAUSERROLE.getUrl() + "delete", huaUserRole);
    }

    @Override
    public int deleteList(List<HuaUserRole> huaUserRoleList) throws Exception {
        return baseDao.deleteList(PortalMapperEnum.HUAUSERROLE.getUrl() + "delete", huaUserRoleList);
    }

    @Override
    public HuaUserRole getOne(String id) throws Exception {
        return (HuaUserRole) baseDao.getObject(PortalMapperEnum.HUAUSERROLE.getUrl() + "getOne", id);
    }

    @Override
    public List<?> getList(HuaUserRole huaUserRole) throws Exception {
        return baseDao.getList(PortalMapperEnum.HUAUSERROLE.getUrl() + "getList", huaUserRole);
    }

    @Override
    public Page getList(HuaUserRole huaUserRole, Page page) throws Exception {
        return baseDao.getList(PortalMapperEnum.HUAUSERROLE.getUrl() + "getList", huaUserRole, page);
    }

    @Override
    public int update(HuaUserRole huaUserRole) throws Exception {
        return baseDao.update(PortalMapperEnum.HUAUSERROLE.getUrl() + "update", huaUserRole);
    }

    @Override
    public int updateList(List<HuaUserRole> huaUserRoleList) throws Exception {
        return baseDao.updateList(PortalMapperEnum.HUAUSERROLE.getUrl() + "update", huaUserRoleList);
    }

}
