package com.hua.dal.dao.impl;

import com.hua.dal.dao.IBaseDao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: hua
 * @create: 2018-05-28 15:18
 */
@Repository("baseDao")
public class BaseDaoImpl implements IBaseDao {

    @Resource
    SqlSessionTemplate sqlSessionTemplate;

    @Override
    public int insert(String method, Object parameter) throws Exception {
        // TODO Auto-generated method stub
        return sqlSessionTemplate.insert(method, parameter);
    }

    @Override
    public int insertList(String method, List objs) throws Exception {
        return sqlSessionTemplate.insert(method, objs);
    }

    @Override
    public int delete(String method, Object parameter) throws Exception {
        // TODO Auto-generated method stub
        return sqlSessionTemplate.delete(method, parameter);
    }

    @Override
    public int deleteList(String method, List objs) throws Exception {
        return sqlSessionTemplate.delete(method, objs);
    }

    @Override
    public List<?> getList(String method, Object parameter) throws Exception {
        // TODO Auto-generated method stub
        return sqlSessionTemplate.selectList(method, parameter);
    }

    @Override
    public List<?> getList(String method, Object parameter, RowBounds rowBounds) throws Exception {
        return sqlSessionTemplate.selectList(method, parameter, rowBounds);
    }

    @Override
    public int update(String method, Object parameter) throws Exception {
        // TODO Auto-generated method stub
        return sqlSessionTemplate.update(method, parameter);
    }

    @Override
    public int updateList(String method, List objs) throws Exception {
        return sqlSessionTemplate.update(method, objs);
    }

    @Override
    public Object getObject(String method, Object parameter) throws Exception {
        // TODO Auto-generated method stub
        return sqlSessionTemplate.selectOne(method, parameter);
    }
}
