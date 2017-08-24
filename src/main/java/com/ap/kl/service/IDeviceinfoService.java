package com.ap.kl.service;

import java.util.List;

import com.ap.kl.entity.Deviceinfo;
import com.baomidou.framework.service.ISuperService;

/**
 *
 * Deviceinfo 表数据服务层接口
 *
 */
public interface IDeviceinfoService {

	List<Deviceinfo> selectAllDeviceInfo(int pageSize,int startIndex) ;
	
	int selecAllDeviceCount();

}