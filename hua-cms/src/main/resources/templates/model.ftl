package ${Model.moduleName}.${Model.packageName};

import java.util.Date;
import java.util.List;

/**
* ${Model.remark}
*
* @author: ${Model.author}
*/
public class ${Model.className} {

    <#--变量-->
    <#list Model.columnList as item>
    private ${item.columnType} ${item.columnName};//${item.remark!item.columnName}
    </#list>


}