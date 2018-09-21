package com.hua.portal.entity;

import java.util.Date;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
* 角色权限
*
* @author: hua
* @create: 2018-09-17 21:20:24
*/
public class HuaRoleRight {

    @ApiModelProperty(value = "角色权限主键"
        ,allowableValues = "range[0,20]"
    )
    private String id;//角色权限主键
    @ApiModelProperty(value = "角色主键"
        ,allowableValues = "range[0,20]"
    )
    private String roleId;//角色主键
    @ApiModelProperty(value = "权限主键"
        ,allowableValues = "range[0,20]"
    )
    private String rightId;//权限主键


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRightId() {
        return rightId;
    }

    public void setRightId(String rightId) {
        this.rightId = rightId;
    }

}