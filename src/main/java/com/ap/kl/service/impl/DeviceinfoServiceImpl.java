package com.ap.kl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.ap.kl.mapper.DeviceinfoMapper;
import com.ap.kl.mapper.UserRoleMapper;
import com.ap.kl.common.Pagination;
import com.ap.kl.entity.Deviceinfo;
import com.ap.kl.entity.RolePermission;
import com.ap.kl.entity.vo.DataSumVO;
import com.ap.kl.service.IDeviceinfoService;
import com.ap.kl.service.support.BaseServiceImpl;
import com.baomidou.framework.annotations.Log;

/**
 *
 * Deviceinfo 表数据服务层接口实现类
 *
 */
@Service
public class DeviceinfoServiceImpl  implements IDeviceinfoService {
	
	@Autowired
	private DeviceinfoMapper deviceInfoMapper;
	
	@Autowired
	protected  JdbcTemplate jdbcTemplate; 
	
	
	@Log("设备查询")
	@Override
	public List<Deviceinfo> selectAllDeviceInfo(int pageSize,int startIndex) 
	{
		String sql ="SELECT                  " +
				    " @rowno:=@rowno+1 AS ROWID," +
				    "	ID,                  " +
					"	SERVER_ID,           " +
					"	SERVER_IP,           " +
					"	DEVICE_ID,           " +
					"	DEVICE_ODM,          " +
					"	DEVICE_PLACE,        " +
					"	INSERT_TIME,         " +
					"	INSERT_USER,         " +
					"	UPDATE_TIME,         " +
					"	UPDATE_USER,         " +
					"	DEL_FLG              " +
					"FROM                    " +
					"	DEVICEINFO    ,(select @rowno:="+ pageSize +") t ";
		//List<Deviceinfo> dsvList = jdbcTemplate.query(sql, new Object[]{}, new BeanPropertyRowMapper<Deviceinfo>(Deviceinfo.class));
		
		Pagination pg = new Pagination(sql,pageSize,startIndex,jdbcTemplate);
		List<Deviceinfo> dsvList = pg.getResultList();
		
		return dsvList;
	}
	
	
	@Log("设备数量查询")
	@Override
	public int selecAllDeviceCount()
	{
		String sql ="SELECT            " +
				    "	Count(ID)      " +
					"FROM              " +
					"	DEVICEINFO     " ;
		

		int count = jdbcTemplate.queryForObject(sql.toString(),Integer.class);;
		return count;
	}

}