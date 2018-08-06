package ${Model.moduleName}.${Model.packageName};

import java.util.Date;
import java.util.List;

/**
*
* @author: ${Model.author}
*/
public class ${Model.className ?cap_first} {

    <#--成员变量-->
    <#list Model.columnList as item>
    <#if item.remark?? && item.remark!="">
    <#if item.columnType == "Date">
    @Temporal(TemporalType.DATE)
    </#if>
    @ApiModelProperty(value = "${item.remark}"
        <#if item.columnLength!="">
        ,allowableValues = "range[0,${item.columnLength}]"
        </#if>
        <#if item.isNull=="N">
        , required = true
        </#if>
    )
    <#if item.columnLength!="">
    @Size(min = 0,max = ${item.columnLength})
    </#if>
    <#if item.isNull=="N">
    @NotEmpty
    </#if>
    </#if>
    private ${item.columnType} ${item.columnName};//${item.remark!item.columnName}
    </#list>


}