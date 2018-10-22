package com.hua.portal.entity;

import java.util.Date;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
* 角色
*
* @author: hua
* @create: 2018-09-17 21:13:01
*/
public class HuaRole {

    @ApiModelProperty(value = "角色id"
        ,allowableValues = "range[0,20]"
    )
    private String id;//角色id
    @ApiModelProperty(value = "权限名称"
        ,allowableValues = "range[0,20]"
    )
    private String name;//权限名称
    @ApiModelProperty(value = "创建时间"
    )
    private String createTime;//创建时间
    @ApiModelProperty(value = "权限描述"
        ,allowableValues = "range[0,20]"
    )
    private String description;//权限描述


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}