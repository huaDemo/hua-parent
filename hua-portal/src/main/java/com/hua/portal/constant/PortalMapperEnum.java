package com.hua.portal.constant;

/**
 * @author: hua
 * @create: 2018-08-29 21:13
 */
public enum PortalMapperEnum {

    HUAUSER("com.hua.portal.mapper.huaUser."),
    HUARIGHT("com.hua.portal.mapper.huaRight."),
    HUAROLE("com.hua.portal.mapper.huaRole."),
    HUAROLERIGHT("com.hua.portal.mapper.huaRoleRight."),
    HUAUSERROLE("com.hua.portal.mapper.huaUserRole.")
    ;


    String url;//映射地址

    PortalMapperEnum(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

}
