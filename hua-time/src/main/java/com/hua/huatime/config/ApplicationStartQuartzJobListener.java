package com.hua.huatime.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author: hua
 * @date: 2019/3/13 16:16
 */
@Configuration
public class ApplicationStartQuartzJobListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    MyScheduler myScheduler;

    /**
     * 初始启动quartz
     */
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        try {
            myScheduler.schedulerJob();
            System.out.println("任务已经启动...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
