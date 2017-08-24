package com.ap.kl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ap.kl.entity.Permission;
import com.ap.kl.entity.ViewDayCount;
import com.ap.kl.entity.vo.DataSumVO;
import com.baomidou.mybatisplus.mapper.AutoMapper;

/**
 *
 * ViewDayCount 表数据库控制层接口
 *
 */
public interface ViewDayCountMapper extends AutoMapper<ViewDayCount> {

	DataSumVO select_TodayCount();
}