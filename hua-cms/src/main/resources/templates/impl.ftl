package ${Model.moduleName}.${Model.packageName}.service.impl;

import ${Model.moduleName}.${Model.packageName}.IBaseDao;
import ${Model.moduleName}.${Model.packageName}.${Model.className};
import ${Model.moduleName}.${Model.packageName}.entity.Page;
import ${Model.moduleName}.${Model.packageName}.service.${Model.className}Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* ${Model.remark!}服务实现类
*
* @author: ${Model.author!hua}
* @create: ${Model.createTime?string("yyyy-MM-dd HH:mm:ss")!}
*/
@Service
public class ${Model.className}ServiceImpl implements ${Model.className}Service {

    @Resource(name = "baseDao")
    private IBaseDao baseDao;

    @Override
    public int insert(${Model.className} ${Model.className?uncap_first}) throws Exception {
        return baseDao.insert(MapperEnum.${Model.className?upper_case}.getUrl() + "insert", ${Model.className?uncap_first});
    }

    @Override
    public int insertList(List<${Model.className}> ${Model.className?uncap_first}List) throws Exception {
        return baseDao.insertList(MapperEnum.${Model.className?upper_case}.getUrl() + "insert", ${Model.className?uncap_first}List);
    }

    @Override
    public int delete(${Model.className} ${Model.className?uncap_first}) throws Exception {
        return baseDao.delete(MapperEnum.${Model.className?upper_case}.getUrl() + "delete", ${Model.className?uncap_first});
    }

    @Override
    public int deleteList(List<${Model.className}> ${Model.className?uncap_first}List) throws Exception {
        return baseDao.deleteList(MapperEnum.${Model.className?upper_case}.getUrl() + "delete", ${Model.className?uncap_first}List);
    }

    @Override
    public ${Model.className} getOne(String id) throws Exception {
        return (${Model.className}) baseDao.getObject(MapperEnum.${Model.className?upper_case}.getUrl() + "getOne", id);
    }

    @Override
    public List<?> getList(${Model.className} ${Model.className?uncap_first}) throws Exception {
        return baseDao.getList(MapperEnum.${Model.className?upper_case}.getUrl() + "getList", ${Model.className?uncap_first});
    }

    @Override
    public Page getList(${Model.className} ${Model.className?uncap_first}, Page page) throws Exception {
        return baseDao.getList(MapperEnum.${Model.className?upper_case}.getUrl() + "getList", ${Model.className?uncap_first}, page);
    }

    @Override
    public int update(${Model.className} ${Model.className?uncap_first}) throws Exception {
        return baseDao.update(MapperEnum.${Model.className?upper_case}.getUrl() + "update", ${Model.className?uncap_first});
    }

    @Override
    public int updateList(List<${Model.className}> ${Model.className?uncap_first}List) throws Exception {
        return baseDao.updateList(MapperEnum.${Model.className?upper_case}.getUrl() + "update", ${Model.className?uncap_first}List);
    }

}
