package com.hua.huatime.job;

import org.quartz.JobExecutionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author: hua
 * @date: 2019/3/13 10:57
 */
@Service
public class JobTwo extends SchedulerQuartzJob {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    void executeService(JobExecutionContext context) {
        logger.info("开始执行jobtwo");
    }
}
