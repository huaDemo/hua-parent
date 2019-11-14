

private:
    <#--成员变量-->
    <#list Model.columnList as item>
    private ${item.columnType} ${item.formateColumnName};//${item.remark!item.columnName}
    </#list>
public:
    <#--get/set-->
    <#list Model.columnList as item>
    void set${item.formateColumnName ?cap_first}(QString ${item.formateColumnName});
    QString get${item.formateColumnName ?cap_first}();
    </#list>



<#list Model.columnList as item>

    QString ${Model.className ?cap_first}::get${item.formateColumnName ?cap_first}() {
        return ${item.formateColumnName};
    }

    void ${Model.className ?cap_first}::set${item.formateColumnName ?cap_first}(QString ${item.formateColumnName}) {
        this->${item.formateColumnName} = ${item.formateColumnName};
    }
</#list>


<#list Model.columnList as item>
    ${Model.className ?cap_first}.set${item.formateColumnName?cap_first}(query.value("${item.columnName}").toString());
</#list>

<#list Model.columnList as item>
if(obj.get${item.formateColumnName?cap_first}()!= nullptr){
    key += "${item.columnName},";
    value += "'"+obj.get${item.formateColumnName?cap_first}()+"',";
}
</#list>