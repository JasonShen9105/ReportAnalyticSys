package com.ap.kl.service;

import java.util.List;

import com.ap.kl.entity.Datacounter;
import com.ap.kl.entity.vo.DayCountVO;
import com.baomidou.framework.service.ISuperService;

/**
 *
 * Datacounter 表数据服务层接口
 *
 */
public interface IDatacounterService {

	List<DayCountVO> selectDayInfo();
}