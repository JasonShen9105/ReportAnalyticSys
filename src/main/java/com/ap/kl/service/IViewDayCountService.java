package com.ap.kl.service;

import java.util.List;

import com.ap.kl.entity.ViewDayCount;
import com.ap.kl.entity.vo.DataSumVO;
import com.baomidou.framework.service.ISuperService;

/**
 *
 * ViewDayCount 表数据服务层接口
 *
 */
public interface IViewDayCountService {
	List<DataSumVO>  select_TodayCount(int pageSize,int startIndex);
	
	int select_TotalCount();
}