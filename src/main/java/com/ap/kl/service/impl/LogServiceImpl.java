package com.ap.kl.service.impl;

import org.springframework.stereotype.Service;

import com.ap.kl.mapper.LogMapper;
import com.ap.kl.entity.Log;
import com.ap.kl.service.ILogService;
import com.ap.kl.service.support.BaseServiceImpl;

/**
 *
 * Log 表数据服务层接口实现类
 *
 */
@Service
public class LogServiceImpl extends BaseServiceImpl<LogMapper, Log> implements ILogService {


}