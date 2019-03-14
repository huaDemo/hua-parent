package com.hua.huatime.config;

import com.hua.huatime.entity.QuartzEntity;
import com.hua.huatime.job.JobOne;
import com.hua.huatime.util.QuartzManager;
import com.hua.huatime.util.SpringUtil;
import org.quartz.*;
import org.quartz.impl.StdScheduler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


/**
 * @author: hua
 * @date: 2019/3/13 16:56
 */
@Component
@Configurable
@EnableScheduling
public class MyScheduler {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Scheduler scheduler;

    public void schedulerJob() throws Exception {
        logger.info("初始化测试任务");
        QuartzEntity quartz = new QuartzEntity();
        quartz.setJobName("test01");
        quartz.setJobGroup("test");
        quartz.setDescription("测试任务");
        quartz.setJobClassName("com.hua.huatime.job.JobOne");
        quartz.setCronExpression("0/20 * * * * ?");
        Class cls = Class.forName(quartz.getJobClassName()) ;
        cls.newInstance();
        //构建job信息
        JobDetail job = JobBuilder.newJob(cls).withIdentity(quartz.getJobName(),
                quartz.getJobGroup())
                .withDescription(quartz.getDescription()).build();
        //添加JobDataMap数据
        job.getJobDataMap().put("itstyle", "科帮网欢迎你");
        job.getJobDataMap().put("blog", "https://blog.52itstyle.com");
        job.getJobDataMap().put("data", new String[]{"张三","李四"});
        // 触发时间点
        CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule(quartz.getCronExpression());
        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger"+quartz.getJobName(), quartz.getJobGroup())
                .startNow().withSchedule(cronScheduleBuilder).build();
        //交由Scheduler安排触发
        scheduler.scheduleJob(job, trigger);
        // -----------------------------------------------------------
        QuartzEntity quartz2 = new QuartzEntity();
        quartz2.setJobName("test02");
        quartz2.setJobGroup("test2");
        quartz2.setDescription("测试任务");
        quartz2.setJobClassName("com.hua.huatime.job.JobTwo");
        quartz2.setCronExpression("0/20 * * * * ?");
        Class cls2 = Class.forName(quartz2.getJobClassName()) ;
        cls.newInstance();
        //构建job信息
        JobDetail job2 = JobBuilder.newJob(cls2).withIdentity(quartz2.getJobName(),
                quartz.getJobGroup())
                .withDescription(quartz2.getDescription()).build();
        //添加JobDataMap数据
        job2.getJobDataMap().put("itstyle", "科帮网欢迎你");
        job2.getJobDataMap().put("blog", "https://blog.52itstyle.com");
        job2.getJobDataMap().put("data", new String[]{"张三","李四"});
        // 触发时间点
        CronScheduleBuilder cronScheduleBuilder2 = CronScheduleBuilder.cronSchedule(quartz2.getCronExpression());
        Trigger trigger2 = TriggerBuilder.newTrigger().withIdentity("trigger"+quartz2.getJobName(), quartz2.getJobGroup())
                .startNow().withSchedule(cronScheduleBuilder2).build();
        //交由Scheduler安排触发
        scheduler.scheduleJob(job2, trigger2);
    }

}
