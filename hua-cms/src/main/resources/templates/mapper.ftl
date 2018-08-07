<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="${Model.moduleName}.${Model.packageName}.mapper.${Model.className}">
    <!--查询字段信息-->
    <sql id="searchCol">
    <#list Model.columnList as item>
        <#if item_has_next>
            P.${item.columnName} AS "${item.formateColumnName}",
        <#else>
            P.${item.columnName} AS "${item.formateColumnName}"
        </#if>
    </#list>
    </sql>
    <!--关联查询相关sql-->
    <sql id="joinSql">
    </sql>
    <!--查询-->
    <select id="getList" parameterType="${Model.className ?cap_first}" resultType="${Model.className ?cap_first}">
        SELECT
        <include refid="searchCol"></include>
        FROM ${Model.tableName} P
        <include refid="joinSql"></include>
        <where>
        <#list Model.columnList as item>
            <if test="${item.formateColumnName} != null and ${item.formateColumnName} != ''">
                AND P.${item.columnName} = ${"#"}{${item.formateColumnName}},
            </if>
        </#list>
        </where>
    </select>
    <!--统计查询-->
    <select id="countList" parameterType="${Model.className ?cap_first}" resultType="Integer">
        SELECT count(*)
        FROM ${Model.tableName} P
        <include refid="joinSql"></include>
        <where>
        <#list Model.columnList as item>
            <if test="${item.formateColumnName} != null and ${item.formateColumnName} != ''">
                AND P.${item.columnName} = ${"#"}{${item.formateColumnName}},
            </if>
        </#list>
        </where>
    </select>
    <!--新增-->
    <insert id="insert" parameterType="${Model.className ?cap_first}">
        INSERT INTO ${Model.tableName}
        (
    <#list Model.columnList as item>
        <#if item_has_next>
        ${item.columnName},
        <#else>
        ${item.columnName}"
        </#if>
    </#list>
        )
        VALUES
        (
    <#list Model.columnList as item>
        <#if item_has_next>
        ${"#"}{${item.formateColumnName}},
        <#else>
        ${"#"}{${item.formateColumnName}}
        </#if>
    </#list>
        )
    </insert>
    <!--修改-->
    <update id="update" parameterType="${Model.className ?cap_first}">
        update ${Model.tableName}
        <set>
        <#list Model.columnList as item>
            <#if  Model.tableId != item.columnName>
                <if test="${item.formateColumnName} != null and ${item.formateColumnName} != ''">
                    AND ${item.columnName} = ${"#"}{${item.formateColumnName}},
                </if>
            </#if>
        </#list>
        </set>
        WHERE ${Model.tableId!id} = ${"#"}{${Model.className!id}}
    </update>
    <!--删除-->
    <delete id="delete">
        DELETE FROM
        ${Model.tableName}
        WHERE ${Model.tableId!id} = ${"#"}{${Model.className!id}}
    </delete>
</mapper>