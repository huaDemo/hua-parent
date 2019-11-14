package com.hua.huashiro.service.impl;

import org.springframework.beans.BeanUtils;
import com.hua.dal.dao.IBaseDao;
import com.hua.huashiro.constant.ShiroMapperEnum;
import com.hua.huashiro.entity.HuaUser;
import com.hua.huashiro.service.LoginService;
import com.hua.huashiro.vo.UserVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: hua
 * @date: 2019/3/20 10:15
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Resource(name = "baseDao")
    private IBaseDao baseDao;

    @Override
    public UserVO getUser(String username, String password) throws Exception{
        HuaUser huaUser = (HuaUser) baseDao.getObject(ShiroMapperEnum.HUAUSER.getUrl() + "getOne", username);
        UserVO userVO = null;
        if(huaUser != null){
            BeanUtils.copyProperties(huaUser,userVO);
        }
        return null;
    }

}
