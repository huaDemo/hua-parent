package com.hua.huashiro.vo;

import com.hua.huashiro.entity.HuaUser;

import java.util.List;

/**
 * @author: hua
 * @date: 2019/3/20 10:10
 */
public class UserVO extends HuaUser {

    //令牌
    private String token;

    /**
     * 权限列表
     */
    private List<String> permissions;

    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
