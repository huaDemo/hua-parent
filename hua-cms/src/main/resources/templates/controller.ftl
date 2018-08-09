package ${Model.moduleName}.${Model.packageName}.controller;

import ${Model.moduleName}.${Model.packageName}.BaseResult;
import ${Model.moduleName}.${Model.packageName}.${Model.className};
import ${Model.moduleName}.${Model.packageName}.entity.Page;
import ${Model.moduleName}.${Model.packageName}.service.${Model.className}Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
* ${Model.remark!}控制层服务
*
* @author: ${Model.author!hua}
* @create: ${Model.createTime?string("yyyy-MM-dd HH:mm:ss")!}
*/
@RestController
@RequestMapping("/${Model.className?uncap_first}")
public class ${Model.className}Controller {

    @Autowired
    private ${Model.className}Service ${Model.className?uncap_first}Service;

    /**
    * 查询单条
    *
    * @param id
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public BaseResult getOne(@PathVariable("id") String id) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (id != null) {
            baseResult.setData(${Model.className?uncap_first}Service.getOne(id));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 查询多条
    *
    * @param ${Model.className?uncap_first}
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/getlist", method = RequestMethod.POST)
    public BaseResult getList(@RequestBody ${Model.className} ${Model.className?uncap_first}) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (${Model.className?uncap_first} != null) {
            baseResult.setData(${Model.className?uncap_first}Service.getList(${Model.className?uncap_first}));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 分页查询
    *
    * @param ${Model.className?uncap_first}
    * @param page
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/getpage", method = RequestMethod.POST)
    public BaseResult getListByPage(@RequestBody ${Model.className} ${Model.className?uncap_first}, @RequestBody Page page) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (${Model.className?uncap_first} != null) {
            baseResult.setData(${Model.className?uncap_first}Service.getList(${Model.className?uncap_first}, page));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 修改单条
    *
    * @param ${Model.className?uncap_first}
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public BaseResult update(@RequestBody ${Model.className} ${Model.className?uncap_first}) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (${Model.className?uncap_first} != null) {
            baseResult.setData(${Model.className?uncap_first}Service.update(${Model.className?uncap_first}));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 修改多条
    *
    * @param ${Model.className?uncap_first}List
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/updatelist", method = RequestMethod.POST)
    public BaseResult updateList(@RequestBody List<${Model.className}> ${Model.className?uncap_first}List) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (${Model.className?uncap_first}List != null && ${Model.className?uncap_first}List.size() > 0) {
            baseResult.setData(${Model.className?uncap_first}Service.updateList(${Model.className?uncap_first}List));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 删除单条
    *
    * @param ${Model.className?uncap_first}
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public BaseResult delete(@RequestBody ${Model.className} ${Model.className?uncap_first}) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (${Model.className?uncap_first} != null) {
            baseResult.setData(${Model.className?uncap_first}Service.delete(${Model.className?uncap_first}));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 删除多条
    *
    * @param ${Model.className?uncap_first}List
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/deletelist", method = RequestMethod.POST)
    public BaseResult deletelist(@RequestBody List<${Model.className}> ${Model.className?uncap_first}List) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (${Model.className?uncap_first}List != null && ${Model.className?uncap_first}List.size() > 0) {
            baseResult.setData(${Model.className?uncap_first}Service.deleteList(${Model.className?uncap_first}List));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 新增单条
    *
    * @param ${Model.className?uncap_first}
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public BaseResult insert(@RequestBody ${Model.className} ${Model.className?uncap_first}) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (${Model.className?uncap_first} != null) {
            baseResult.setData(${Model.className?uncap_first}Service.insert(${Model.className?uncap_first}));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

    /**
    * 新增多条
    *
    * @param ${Model.className?uncap_first}List
    * @return
    * @throws Exception
    */
    @RequestMapping(value = "/insertlist", method = RequestMethod.POST)
    public BaseResult insertList(@RequestBody List<${Model.className}> ${Model.className?uncap_first}List) throws Exception {
        BaseResult baseResult = new BaseResult();
        if (${Model.className?uncap_first}List != null && ${Model.className?uncap_first}List.size() > 0) {
            baseResult.setData(${Model.className?uncap_first}Service.insertList(${Model.className?uncap_first}List));
        } else {
            baseResult.setCode(999);
            baseResult.setMessage("入参不可为空!");
        }
        return baseResult;
    }

}
