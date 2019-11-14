package com.hua.huashiro.constant;

/**
 * @author: hua
 * @date: 2019/3/20 09:09
 */
public enum ShiroMapperEnum {

    HUAUSER("com.hua.huashiro.mapper.huaUser."),
    HUARIGHT("com.hua.huashiro.mapper.huaRight."),
    HUAROLE("com.hua.huashiro.mapper.huaRole."),
    HUAROLERIGHT("com.hua.huashiro.mapper.huaRoleRight."),
    HUAUSERROLE("com.hua.huashiro.mapper.huaUserRole.")
            ;
    String url;//映射地址

    ShiroMapperEnum(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

}
