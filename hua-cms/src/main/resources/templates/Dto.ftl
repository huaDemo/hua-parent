package ${Model.moduleName}.${Model.packageName};

import java.util.Date;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.BeanUtils;

/**
* ${Model.remark!}传输类
*
* @author: ${Model.author!hua}
* @create: ${Model.createTime?string("yyyy-MM-dd HH:mm:ss")}
*/
@ApiModel(value = "${Model.remark!}传输类")
public class ${Model.className ?cap_first}DTO {

<#--成员变量-->
<#list Model.columnList as item>
    @ApiModelProperty(value = "${item.remark}"
        <#if item.columnLength!="">
        ,allowableValues = "range[0,${item.columnLength}]"
        </#if>
        <#if item.isNull=="N">
        , required = true
        </#if>
    )
    private ${item.columnType} ${item.formateColumnName};//${item.remark!item.columnName}
</#list>

    public static  ${Model.className ?cap_first} covertToEntity(${Model.className ?cap_first}DTO dto){
            ${Model.className ?cap_first} entity = new  ${Model.className ?cap_first}();
            if(dto != null){
                BeanUtils.copyProperties(dto, entity);
            }
            return entity;
        }

    public static ${Model.className ?cap_first}DTO covertEntityToDTO(${Model.className ?cap_first} entity){
        ${Model.className ?cap_first}DTO dto = new ${Model.className ?cap_first}DTO();
        if(entity != null){
            BeanUtils.copyProperties(entity, dto);
        }
        return dto;
    }

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