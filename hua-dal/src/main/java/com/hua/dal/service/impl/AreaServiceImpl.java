package com.hua.dal.service.impl;

import com.hua.dal.constant.DalMapperEnum;
import com.hua.dal.dao.IBaseDao;
import com.hua.dal.entity.Area;
import com.hua.dal.entity.Page;
import com.hua.dal.service.AreaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: hua
 * @create: 2018-08-08 16:56
 */
@Service
public class AreaServiceImpl implements AreaService {

    @Resource(name = "baseDao")
    private IBaseDao baseDao;

    @Override
    public int insert(Area area) throws Exception {
        return baseDao.insert(DalMapperEnum.AREA.getUrl() + "insert", area);
    }

    @Override
    public int insertList(List<Area> areaList) throws Exception {
        return baseDao.insertList(DalMapperEnum.AREA.getUrl() + "insert", areaList);
    }

    @Override
    public int delete(Area area) throws Exception {
        return baseDao.delete(DalMapperEnum.AREA.getUrl() + "delete", area);
    }

    @Override
    public int deleteList(List<Area> areaList) throws Exception {
        return baseDao.deleteList(DalMapperEnum.AREA.getUrl() + "delete", areaList);
    }

    @Override
    public Area getOne(String id) throws Exception {
        return (Area) baseDao.getObject(DalMapperEnum.AREA.getUrl() + "getOne", id);
    }

    @Override
    public List<?> getList(Area area) throws Exception {
        return baseDao.getList(DalMapperEnum.AREA.getUrl() + "getList", area);
    }

    @Override
    public Page getList(Area area, Page page) throws Exception {
        return baseDao.getList(DalMapperEnum.AREA.getUrl() + "getList", area, page);
    }

    @Override
    public int update(Area area) throws Exception {
        return baseDao.update(DalMapperEnum.AREA.getUrl() + "update", area);
    }

    @Override
    public int updateList(List<Area> areaList) throws Exception {
        return baseDao.updateList(DalMapperEnum.AREA.getUrl() + "update", areaList);
    }
}
