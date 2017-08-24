package com.ap.kl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;

import com.ap.kl.common.Pagination;
import com.ap.kl.entity.vo.DataSumVO;
import com.ap.kl.service.IViewDayCountService;

/**
 *
 * ViewDayCount 表数据服务层接口实现类
 *
 */
@Service
public class ViewDayCountServiceImpl  implements IViewDayCountService {
	
	@Autowired
	protected  JdbcTemplate jdbcTemplate; 
	
	//@Autowired
	//protected  JdbcTemplateTool  jdbcTemplateTool;
	
	public List<DataSumVO> select_TodayCount(int pageSize,int startIndex) {
		String sql = "SELECT              " +
				" @rowno:=@rowno+1 AS id," +
				" DEVICE           AS device," +
                " IN_COUNT         AS in_count," +
                " OUT_COUNT        AS out_count," +
                " INSERT_TIME      AS insert_time," +
                " MAX_INSERT_TIME  AS max_insert_time," +
                " SERVER_ID        AS server_id," +
                " SERVER_IP        AS server_ip" +
				" FROM                " +
				"  VIEW_DAY_COUNT  ,(select @rowno:="+ pageSize +") t ";
		//DataSumVO DSV = new DataSumVO();
		//DSV = jdbcTemplate.queryForObject(sql, DataSumVO.class);
		//String jsql = getMySQLPageSQL(sql,pageSize,startIndex);
		//DSV.getIN_COUNT();
		//jdbcTemplate.getMaxRows()
		//List<DataSumVO> dsvList = jdbcTemplateTool.list(sql, null, DataSumVO.class);
		//List<DataSumVO> dsvList = jdbcTemplate.query(jsql, new Object[]{}, new BeanPropertyRowMapper<DataSumVO>(DataSumVO.class));
        /*if(null!=dsvList&&dsvList.size()>0){
        	DSV = dsvList.get(0);
        }*/
		
		Pagination pg = new Pagination(sql,pageSize,startIndex,jdbcTemplate);
		List<DataSumVO> dsvList = pg.getResultList();
		return dsvList;
	}
	
	public String getMySQLPageSQL(String queryString, Integer startIndex, Integer pageSize)
	{
		String result = "";
		if (null != startIndex && null != pageSize)
		{
			result = queryString + " limit " + startIndex + "," + pageSize;
		} else if (null != startIndex && null == pageSize)
		{
			result = queryString + " limit " + startIndex;
		} else
		{
			result = queryString;
		}
		return result;
	}
	public JdbcTemplate getJdbcTemplate() {  
        return jdbcTemplate;  
    }  
  
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
        this.jdbcTemplate = jdbcTemplate;  
    }
    
	@Override
	public int select_TotalCount() {
/*		String sql = "SELECT COUNT(DEVICE) AS COUNT " +
			" FROM                " +
			"  VIEW_DAY_COUNT ";*/
		// TODO Auto-generated method stub
		
/*		StringBuffer totalSQL = new StringBuffer(" SELECT COUNT(DEVICE) AS COUNT FROM VIEW_DAY_COUNT");
	    totalSQL.append(sql);
	    totalSQL.append(" ) totalTable ");
	    int count = getJdbcTemplate().queryForObject(totalSQL.toString(),Integer.class);*/
		//List<DataSumVO> dsvList = jdbcTemplate.query(sql, new Object[]{}, new BeanPropertyRowMapper<DataSumVO>(DataSumVO.class));
		StringBuffer totalSQL = new StringBuffer(" SELECT COUNT(DEVICE) AS COUNT FROM VIEW_DAY_COUNT");
		int count = getJdbcTemplate().queryForObject(totalSQL.toString(),Integer.class);
		//int count = dsvList.size();
		return count;
	}  
}