package ${Model.moduleName}.${Model.packageName};

import java.util.Date;
import java.util.List;

/**
* ${Model.remark}
*
* @author: ${Model.author}
* @create: ${Model.createTime}
*/
public class ${Model.className ?cap_first} {

    <#--成员变量-->
    <#list Model.columnList as item>
    private ${item.columnType} ${item.columnName};//${item.remark!item.columnName}
    </#list>

    <#--get/set-->
    <#list Model.columnList as item>

    public ${item.columnType} get${item.columnName ?cap_first}() {
        return ${item.columnName};
    }

    public void set${item.columnName ?cap_first}(${item.columnType} ${item.columnName}) {
        this.${item.columnName} = ${item.columnName};
    }
    </#list>

}