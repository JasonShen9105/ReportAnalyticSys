package com.ap.kl.service.impl;

import java.text.ParseException;

import org.apache.commons.lang.StringUtils;
import org.quartz.SchedulerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ap.kl.jobs.DemoJob;
import com.ap.kl.jobs.GetFileJob;
import com.ap.kl.service.IQuartzService;
import com.baomidou.framework.annotations.Log;
import com.baomidou.framework.quartz.QuartzJobManager;

/**
 * Quartz 测试业务类
 */
@Service
public class QuartzServiceImpl implements IQuartzService {
    private static final Logger LOGGER = LoggerFactory.getLogger(QuartzServiceImpl.class);

    @Autowired
    private QuartzJobManager quartzJobManager;

    @Override
    public boolean addDemoJob(String jobName) throws ParseException, SchedulerException {
        LOGGER.debug("---------- Add Quartz Test BEGIN ---------" + jobName + "---------");

        if(StringUtils.isEmpty(jobName)){
            jobName = "DemoJob";
        }

        // 已经添加过job返回添加失败
        if (quartzJobManager.isJobAdded(jobName, "job_group")) {
            LOGGER.error("名称[" + jobName + "]的任务已存在]");
            return false;
        }

        // 添加一个每分钟执行的任务
        quartzJobManager.addJob(jobName, DemoJob.class, "0 0/1 * * * ?");

        LOGGER.debug("---------- Add Quartz Test END ---------" + jobName + "---------");
        return true;
    }

    @Log("定时任务")
	@Override
	public boolean addGetFileJob(String jobName) throws ParseException,
			SchedulerException {
		// TODO Auto-generated method stub
		LOGGER.debug("---------- Add Quartz addGetFileJob BEGIN ---------" + jobName + "---------");
		if(StringUtils.isEmpty(jobName)){
            jobName = "GetFileJob";
        }

        // 已经添加过job返回添加失败
        if (quartzJobManager.isJobAdded(jobName, "job_group")) {
            LOGGER.error("名称[" + jobName + "]的任务已存在]");
            return false;
        }

        // 添加一个每分钟执行的任务
        quartzJobManager.addJob(jobName, GetFileJob.class, "0 0/1 * * * ?");
		LOGGER.debug("---------- Add Quartz addGetFileJob END ---------" + jobName + "---------");
		return true;
	}    
}