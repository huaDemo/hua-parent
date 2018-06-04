package com.hua.dal.dao;

import com.hua.dal.constant.EDBType;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * @author: hua
 * @create: 2018-05-28 14:54
 */
public interface IBaseDao {
    /**
     * 插入
     *
     * @param method    mapper映射方法全路径
     * @param parameter
     * @return
     * @throws Exception
     */
    int insert(String method, Object parameter) throws Exception;

    /**
     * 批量插入
     *
     * @param method
     * @param objs
     * @return
     * @throws Exception
     */
    int insertList(String method, List objs) throws Exception;

    /**
     * 删除
     *
     * @param method
     * @param parameter
     * @return
     * @throws Exception
     */
    int delete(String method, Object parameter) throws Exception;

    /**
     * 批量删除
     *
     * @param method
     * @param objs
     * @return
     * @throws Exception
     */
    int deleteList(String method, List objs) throws Exception;

    /**
     * 查询
     *
     * @param method
     * @param parameter
     * @return
     * @throws Exception
     */
    List<?> getList(String method, Object parameter) throws Exception;

    /**
     * 分页查询
     *
     * @param method
     * @param parameter
     * @param rowBounds
     * @return
     * @throws Exception
     */
    List<?> getList(String method, Object parameter, RowBounds rowBounds) throws Exception;

    /**
     * 修改
     *
     * @param method
     * @param parameter
     * @return
     * @throws Exception
     */
    int update(String method, Object parameter) throws Exception;

    /**
     * 批量修改
     *
     * @param method
     * @param objs
     * @return
     * @throws Exception
     */
    int updateList(String method, List objs) throws Exception;

    /**
     * 查询一条数据
     *
     * @param method
     * @param parameter
     * @return
     * @throws Exception
     */
    Object getObject(String method, Object parameter) throws Exception;
}
