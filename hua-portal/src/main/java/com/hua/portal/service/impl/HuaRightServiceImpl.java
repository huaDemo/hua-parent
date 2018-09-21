package com.hua.portal.service.impl;

import com.hua.dal.dao.IBaseDao;
import com.hua.huacommon.Util.Page;
import com.hua.portal.constant.PortalMapperEnum;
import com.hua.portal.entity.HuaRight;
import com.hua.portal.service.HuaRightService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* 权限服务实现类
*
* @author: hua
* @create: 2018-09-20 18:33:36
*/
@Service
public class HuaRightServiceImpl implements HuaRightService {

    @Resource(name = "baseDao")
    private IBaseDao baseDao;

    @Override
    public int insert(HuaRight huaRight) throws Exception {
        return baseDao.insert(PortalMapperEnum.HUARIGHT.getUrl() + "insert", huaRight);
    }

    @Override
    public int insertList(List<HuaRight> huaRightList) throws Exception {
        return baseDao.insertList(PortalMapperEnum.HUARIGHT.getUrl() + "insert", huaRightList);
    }

    @Override
    public int delete(HuaRight huaRight) throws Exception {
        return baseDao.delete(PortalMapperEnum.HUARIGHT.getUrl() + "delete", huaRight);
    }

    @Override
    public int deleteList(List<HuaRight> huaRightList) throws Exception {
        return baseDao.deleteList(PortalMapperEnum.HUARIGHT.getUrl() + "delete", huaRightList);
    }

    @Override
    public HuaRight getOne(String id) throws Exception {
        return (HuaRight) baseDao.getObject(PortalMapperEnum.HUARIGHT.getUrl() + "getOne", id);
    }

    @Override
    public List<?> getList(HuaRight huaRight) throws Exception {
        return baseDao.getList(PortalMapperEnum.HUARIGHT.getUrl() + "getList", huaRight);
    }

    @Override
    public Page getList(HuaRight huaRight, Page page) throws Exception {
        return baseDao.getList(PortalMapperEnum.HUARIGHT.getUrl() + "getList", huaRight, page);
    }

    @Override
    public int update(HuaRight huaRight) throws Exception {
        return baseDao.update(PortalMapperEnum.HUARIGHT.getUrl() + "update", huaRight);
    }

    @Override
    public int updateList(List<HuaRight> huaRightList) throws Exception {
        return baseDao.updateList(PortalMapperEnum.HUARIGHT.getUrl() + "update", huaRightList);
    }

}
