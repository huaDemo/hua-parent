package com.hua.huatime.job;

import org.quartz.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: hua
 * @date: 2019/3/13 10:50
 */
public abstract class SchedulerQuartzJob implements Job {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("定时开始!");
        executeService(jobExecutionContext);
        logger.info("定时结束!");
    }

    abstract void executeService(JobExecutionContext jobExecutionContext);


}
