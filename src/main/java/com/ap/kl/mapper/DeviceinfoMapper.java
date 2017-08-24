package com.ap.kl.mapper;

import com.ap.kl.entity.Deviceinfo;
import com.baomidou.mybatisplus.mapper.AutoMapper;

/**
 *
 * Deviceinfo 表数据库控制层接口
 *
 */
public interface DeviceinfoMapper extends AutoMapper<Deviceinfo> {

	Deviceinfo selectAllDeviceInfo();

}