package com.hua.huashiro.shiro;

import com.hua.dal.dao.IBaseDao;
import com.hua.huashiro.constant.ShiroMapperEnum;
import com.hua.huashiro.entity.HuaRight;
import com.hua.huashiro.entity.HuaUser;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

/**
 * @author: hua
 * @date: 2019/3/19 21:47
 */
public class MyShiroRealm extends AuthorizingRealm {

    private static final Logger logger = LoggerFactory.getLogger(MyShiroRealm.class);

    @Resource(name = "baseDao")
    private IBaseDao baseDao;

    /**
     * 角色权限和对应权限添加
     *
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取登录用户名
        String name = (String) principalCollection.getPrimaryPrincipal();
        logger.info("AuthenticationInfo 开始认证-》:{}", name);
        //添加角色和权限
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        //添加角色
        try {
            HuaUser huaUser1 = (HuaUser) baseDao.getObject(ShiroMapperEnum.HUAUSER.getUrl() + "getOne", name);

            HuaRight huaRight = new HuaRight();
            huaRight.setParentRight();
            baseDao.getList(ShiroMapperEnum.HUARIGHT.getUrl() + "getList", huaRight);
            simpleAuthorizationInfo.addRole("admin");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //添加权限
        simpleAuthorizationInfo.addStringPermission("create");
        return simpleAuthorizationInfo;
    }

    /**
     * 用户认证
     *
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String name = token.getUsername();
        if (name == null) {
            return null;
        }
        try {
            HuaUser huaUser1 = (HuaUser) baseDao.getObject(ShiroMapperEnum.HUAUSER.getUrl() + "getOne", name);
            //这里验证authenticationToken和simpleAuthenticationInfo的信息
            SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(huaUser1, huaUser1.getPassword(), getName());
            return simpleAuthenticationInfo;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
