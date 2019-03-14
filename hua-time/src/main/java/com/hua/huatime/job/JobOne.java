package com.hua.huatime.job;

import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author: hua
 * @date: 2019/3/13 10:55
 */
@Service
public class JobOne extends SchedulerQuartzJob {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    void executeService(JobExecutionContext context) {
        logger.info("开始执行jobone");
        // 取得job详情
        JobDetail jobDetail = context.getJobDetail();
        // 取得job名称
        String jobName = jobDetail.getClass().getName();
        logger.info("Name: " + jobDetail.getClass().getSimpleName());
        // 取得job的类
        logger.info("Job Class: " + jobDetail.getJobClass());
        // 取得job开始时间
        logger.info(jobName + " fired at " + context.getFireTime());
        // 取得job下次触发时间
        logger.info("Next fire time " + context.getNextFireTime());

        JobDataMap dataMap =  jobDetail.getJobDataMap();

        logger.info("itstyle: " + dataMap.getString("itstyle"));
        logger.info("blog: " + dataMap.getString("blog"));
        String[] array = (String[]) dataMap.get("data");
        for(String str:array){
            logger.info("data: " + str);
        }

    }

}
