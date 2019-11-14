package com.hua.huashiro.entity;

import io.swagger.annotations.ApiModelProperty;

/**
* 用户角色
*
* @author: hua
* @create: 2018-09-17 21:23:27
*/
public class HuaUserRole {

    @ApiModelProperty(value = "用户角色主键"
        ,allowableValues = "range[0,20]"
    )
    private String id;//用户角色主键
    @ApiModelProperty(value = "用户主键"
        ,allowableValues = "range[0,20]"
    )
    private String userId;//用户主键
    @ApiModelProperty(value = "角色主键"
        ,allowableValues = "range[0,20]"
    )
    private String roleId;//角色主键


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

}