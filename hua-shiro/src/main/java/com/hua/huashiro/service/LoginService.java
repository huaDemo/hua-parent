package com.hua.huashiro.service;

import com.hua.huashiro.vo.UserVO;

/**
 * @author: hua
 * @date: 2019/3/20 10:14
 */
public interface LoginService {

    /**
     * 获取用户信息
     *
     * @param username 用户名
     * @param password 密码
     * @return
     */
    UserVO getUser(String username, String password) throws Exception;

}
