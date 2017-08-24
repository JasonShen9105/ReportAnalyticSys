package com.ap.kl.common;

import javax.annotation.Resource;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import sun.jdbc.odbc.ee.DataSource;

public class AbstractDao extends JdbcDaoSupport {
	@Resource(name = "dataSource")
	public void setSuperDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}
}
