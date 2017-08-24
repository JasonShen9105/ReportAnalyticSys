package com.ap.kl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.ap.kl.mapper.DatacounterMapper;
import com.ap.kl.entity.Datacounter;
import com.ap.kl.entity.vo.DayCountVO;
import com.ap.kl.service.IDatacounterService;
import com.ap.kl.service.support.BaseServiceImpl;
import com.baomidou.framework.annotations.Log;

/**
 *
 * Datacounter 表数据服务层接口实现类
 *
 */
@Service
public class DatacounterServiceImpl implements IDatacounterService {

	@Autowired
	protected JdbcTemplate jdbcTemplate;

	@Override
	public List<DayCountVO> selectDayInfo() {
		// TODO Auto-generated method stub
		String sql = "";
		sql =     " SELECT                                       "
				+ " 	SUM(IN_COUNT) AS IN_COUNT,                 "
				+ " 	SUM(OUT_COUNT) AS OUT_COUNT,               "
				+ " 	DATE_FORMAT(TIME_END, '%Y-%m-%d') AS DAYS, "
				+ " 	HOUR (TIME_END) AS HOURS                   "
				+ " FROM                                         "
				+ " 	DATACOUNTER                                "
				+ " GROUP BY                                     "
				+ " 	DAYS,                                      "
				+ " 	HOURS;                                     ";
		;
		List<DayCountVO> dsvList = jdbcTemplate.query(sql, new Object[] {},
				new BeanPropertyRowMapper<DayCountVO>(DayCountVO.class));
		return dsvList;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}