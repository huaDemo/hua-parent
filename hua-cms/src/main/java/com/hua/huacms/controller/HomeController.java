package com.hua.huacms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: hua
 * @create: 2018-06-04 21:36
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    /**
     * freemarker:(跳转到 freemarker.ftl).
     * @author Joe
     * Date:2017年11月6日下午4:52:19
     *
     * @param map
     * @return
     */
    @RequestMapping("/freemarker")
    public String freemarker(Map<String, Object> map){
        map.put("name", "Joe");
        //sex:性别，1：男；0：女；
        map.put("sex", 1);
        // 模拟数据
        List<Map<String, Object>> friends = new ArrayList<Map<String, Object>>();
        Map<String, Object> friend = new HashMap<String, Object>();
        friend.put("name", "xbq");
        friend.put("age", 22);
        friends.add(friend);
        friend = new HashMap<String, Object>();
        friend.put("name", "July");
        friend.put("age", 18);
        friends.add(friend);
        map.put("friends", friends);
        return "index";
    }
}
