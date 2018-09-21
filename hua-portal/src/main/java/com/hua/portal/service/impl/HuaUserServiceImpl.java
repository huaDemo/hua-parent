package com.hua.portal.service.impl;

import com.hua.dal.dao.IBaseDao;
import com.hua.huacommon.Util.Page;
import com.hua.portal.constant.PortalMapperEnum;
import com.hua.portal.entity.HuaUser;
import com.hua.portal.service.HuaUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* 平台用户服务实现类
*
* @author: hua
* @create: 2018-08-27 23:04:11
*/
@Service("huaUserService")
public class HuaUserServiceImpl implements HuaUserService {

    @Resource(name = "baseDao")
    private IBaseDao baseDao;

    @Override
    public int insert(HuaUser huaUser) throws Exception {
        return baseDao.insert(PortalMapperEnum.HUAUSER.getUrl() + "insert", huaUser);
    }

    @Override
    public int insertList(List<HuaUser> huaUserList) throws Exception {
        return baseDao.insertList(PortalMapperEnum.HUAUSER.getUrl() + "insert", huaUserList);
    }

    @Override
    public int delete(HuaUser huaUser) throws Exception {
        return baseDao.delete(PortalMapperEnum.HUAUSER.getUrl() + "delete", huaUser);
    }

    @Override
    public int deleteList(List<HuaUser> huaUserList) throws Exception {
        return baseDao.deleteList(PortalMapperEnum.HUAUSER.getUrl() + "delete", huaUserList);
    }

    @Override
    public HuaUser getOne(String id) throws Exception {
        return (HuaUser) baseDao.getObject(PortalMapperEnum.HUAUSER.getUrl() + "getOne", id);
    }

    @Override
    public List<?> getList(HuaUser huaUser) throws Exception {
        return baseDao.getList(PortalMapperEnum.HUAUSER.getUrl() + "getList", huaUser);
    }

    @Override
    public Page getList(HuaUser huaUser, Page page) throws Exception {
        return baseDao.getList(PortalMapperEnum.HUAUSER.getUrl() + "getList", huaUser, page);
    }

    @Override
    public int update(HuaUser huaUser) throws Exception {
        return baseDao.update(PortalMapperEnum.HUAUSER.getUrl() + "update", huaUser);
    }

    @Override
    public int updateList(List<HuaUser> huaUserList) throws Exception {
        return baseDao.updateList(PortalMapperEnum.HUAUSER.getUrl() + "update", huaUserList);
    }

}
