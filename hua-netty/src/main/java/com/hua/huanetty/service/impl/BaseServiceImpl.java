package com.hua.huanetty.service.impl;

import com.hua.huanetty.service.BaseService;
import org.springframework.stereotype.Service;

/**
 * @author: hua
 * @date: 2019/3/18 13:56
 */
@Service
public class BaseServiceImpl implements BaseService {

    @Override
    public void test() {
        System.out.println("调用service服务");
    }

}
