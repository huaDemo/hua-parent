package ${Model.moduleName}.${Model.packageName}.service;

import ${Model.moduleName}.${Model.packageName}.entity.${Model.className};
import com.hua.huacommon.Util.Page;

import java.util.List;

/**
* ${Model.remark!}服务接口类
*
* @author: ${Model.author!hua}
* @create: ${Model.createTime?string("yyyy-MM-dd HH:mm:ss")!}
*/
public interface ${Model.className}Service {

    /**
    * 插入
    *
    * @return
    * @throws Exception
    */
    int insert(${Model.className} ${Model.className?uncap_first}) throws Exception;

    /**
    * 批量插入
    *
    * @return
    * @throws Exception
    */
    int insertList(List<${Model.className}> ${Model.className?uncap_first}List) throws Exception;

    /**
    * 删除
    *
    * @return
    * @throws Exception
    */
    int delete(${Model.className} ${Model.className?uncap_first}) throws Exception;

    /**
    * 批量删除
    *
    * @return
    * @throws Exception
    */
    int deleteList(List<${Model.className}> ${Model.className?uncap_first}List) throws Exception;

    /**
    * 查询一条数据
    *
    * @return
    * @throws Exception
    */
    ${Model.className} getOne(String id) throws Exception;

    /**
    * 查询
    *
    * @return
    * @throws Exception
    */
    List<?> getList(${Model.className} ${Model.className?uncap_first}) throws Exception;

    /**
    * 分页查询
    *
    * @return
    * @throws Exception
    */
    Page getList(${Model.className} ${Model.className?uncap_first}, Page page) throws Exception;

    /**
    * 修改
    *
    * @return
    * @throws Exception
    */
    int update(${Model.className} ${Model.className?uncap_first}) throws Exception;

    /**
    * 批量修改
    *
    * @return
    * @throws Exception
    */
    int updateList(List<${Model.className}> ${Model.className?uncap_first}List) throws Exception;

}
