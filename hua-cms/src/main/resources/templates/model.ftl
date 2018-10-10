package ${Model.moduleName}.${Model.packageName};

import java.util.Date;
import java.util.List;
<#--import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;-->

/**
* ${Model.remark!}
*
* @author: ${Model.author!hua}
* @create: ${Model.createTime?string("yyyy-MM-dd HH:mm:ss")}
*/
public class ${Model.className ?cap_first} {

    <#--成员变量-->
    <#list Model.columnList as item>
    <#--@ApiModelProperty(value = "${item.remark}"
        <#if item.columnLength!="">
        ,allowableValues = "range[0,${item.columnLength}]"
        </#if>
        <#if item.isNull=="N">
        , required = true
        </#if>
    )-->
    private ${item.columnType} ${item.formateColumnName};//${item.remark!item.columnName}
    </#list>

    <#--get/set-->
    <#list Model.columnList as item>

    public ${item.columnType} get${item.formateColumnName ?cap_first}() {
        return ${item.formateColumnName};
    }

    public void set${item.formateColumnName ?cap_first}(${item.columnType} ${item.formateColumnName}) {
        this.${item.formateColumnName} = ${item.formateColumnName};
    }
    </#list>

}