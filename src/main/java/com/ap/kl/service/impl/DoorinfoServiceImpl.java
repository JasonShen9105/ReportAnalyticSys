package com.ap.kl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.ap.kl.mapper.DeviceinfoMapper;
import com.ap.kl.mapper.DoorinfoMapper;
import com.ap.kl.common.Pagination;
import com.ap.kl.entity.Deviceinfo;
import com.ap.kl.entity.Doorinfo;
import com.ap.kl.service.IDoorinfoService;
import com.ap.kl.service.support.BaseServiceImpl;
import com.baomidou.framework.annotations.Log;

/**
 *
 * Doorinfo 表数据服务层接口实现类
 *
 */
@Service
public class DoorinfoServiceImpl extends BaseServiceImpl<DoorinfoMapper, Doorinfo> implements IDoorinfoService {

	@Autowired
	private DeviceinfoMapper deviceInfoMapper;
	
	@Autowired
	protected  JdbcTemplate jdbcTemplate;
	
	@Log("门查询")
	@Override
	public List<Doorinfo> selectAllDoorInfo(int pageSize, int startIndex) {
		String sql =
						"SELECT             "+
						"	ID,             "+
						"	DOOR_ID,        "+
						"	DEVICE_ID,      "+
						"	DOOR_NAME,      "+
						"	DOOR_TYPE,      "+
						"	REF1,           "+
						"	REF2,           "+
						"	REF3,           "+
						"	REF4,           "+
						"	INSERT_TIME,    "+
						"	INSERT_USER,    "+
						"	UPDATE_TIME,    "+
						"	UPDATE_USER,    "+
						"	DEL_FLG,        "+
						"FROM                "+
						"    DOORINFO        ";

		
		Pagination pg = new Pagination(sql,pageSize,startIndex,jdbcTemplate);
		List<Doorinfo> doorList = pg.getResultList();
		
		return doorList;
	}

	@Log("门数查询")
	@Override
	public int selectAllDoorCount() {
		
		String sql ="SELECT            " +
			    "	Count(ID)      " +
				"FROM              " +
				"	DOORINFO     " ;
	int count = jdbcTemplate.queryForObject(sql.toString(),Integer.class);;
	return count;
	} 
	
	
}