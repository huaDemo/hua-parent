package com.hua.dal.dao.impl;

import com.hua.dal.dao.IBaseDao;
import com.hua.huacommon.Util.Page;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public int insertList(String method, List objs) throws Exception {
        int result = 0;
        if (objs != null && objs.size() > 0) {
            for (Object o : objs) {
                int i = this.insert(method, o);
                if (i == 1) {
                    result++;
                }
            }
        }
        return result;
    }

    @Override
    public int delete(String method, Object parameter) throws Exception {
        // TODO Auto-generated method stub
        return sqlSessionTemplate.delete(method, parameter);
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public int deleteList(String method, List objs) throws Exception {
        int result = 0;
        if (objs != null && objs.size() > 0) {
            for (Object o : objs) {
                int i = this.delete(method, o);
                if (i == 1) {
                    result++;
                }
            }
        }
        return result;
    }

    @Override
    public List<?> getList(String method, Object parameter) throws Exception {
        // TODO Auto-generated method stub
        return sqlSessionTemplate.selectList(method, parameter);
    }

    @Override
    public Page getList(String method, Object parameter, Page page) throws Exception {
        if (method != null && page != null) {
            //截取映射namespace
            String str = method.substring(0, method.lastIndexOf(".") + 1);
            //查询总记录数
            Integer totalRecord = (Integer) this.getObject(str + "countList", parameter);
            if (totalRecord != null && totalRecord != 0) {
                //offset:起始行 limit:当前页显示多少条数据
                RowBounds rowBounds = new RowBounds(page.getCurrentPage() - 1, page.getPageSize());
                List<Object> objects = sqlSessionTemplate.selectList(method, parameter, rowBounds);
                page.setTotalRecord(totalRecord);
                page.setTotalPage((totalRecord - 1) / page.getPageSize() + 1);
                page.setData(objects);
                return page;
            }
        }
        return null;
    }

    @Override
    public int update(String method, Object parameter) throws Exception {
        // TODO Auto-generated method stub
        return sqlSessionTemplate.update(method, parameter);
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public int updateList(String method, List objs) throws Exception {
        int result = 0;
        if (objs != null && objs.size() > 0) {
            for (Object o : objs) {
                int i = this.update(method, o);
                if (i == 1) {
                    result++;
                }
            }
        }
        return result;
    }

    @Override
    public Object getObject(String method, Object parameter) throws Exception {
        // TODO Auto-generated method stub
        return sqlSessionTemplate.selectOne(method, parameter);
    }

}
