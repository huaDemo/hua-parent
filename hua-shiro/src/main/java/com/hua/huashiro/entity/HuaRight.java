package com.hua.huashiro.entity;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
* 权限
*
* @author: hua
* @create: 2018-09-20 18:33:36
*/
public class HuaRight {

    @ApiModelProperty(value = "权限主键"
        ,allowableValues = "range[0,20]"
    )
    private String id;//权限主键
    @ApiModelProperty(value = "权限名称"
        ,allowableValues = "range[0,20]"
    )
    private String name;//权限名称
    @ApiModelProperty(value = "权限描述"
        ,allowableValues = "range[0,20]"
    )
    private String description;//权限描述
    @ApiModelProperty(value = "创建时间"
    )
    private Date createTime;//创建时间
    @ApiModelProperty(value = "父级权限"
        ,allowableValues = "range[0,20]"
    )
    private String parentRight;//父级权限
    @ApiModelProperty(value = "权限图标"
        ,allowableValues = "range[0,20]"
    )
    private String picture;//权限图标
    @ApiModelProperty(value = "跳转地址"
        ,allowableValues = "range[0,20]"
    )
    private String url;//跳转地址


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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getParentRight() {
        return parentRight;
    }

    public void setParentRight(String parentRight) {
        this.parentRight = parentRight;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}