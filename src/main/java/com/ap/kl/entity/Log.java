package com.ap.kl.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 
 *
 */
@TableName(value = "LOG")
public class Log implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** 序号 */
	@TableId
	private Integer ID;

	/** 采集器ID */
	@TableField(value = "SERVER_ID")
	private String SERVER_ID;

	/** 采集器IP */
	@TableField(value = "SERVER_IP")
	private String SERVER_IP;

	/** 日志创建日期 */
	@TableField(value = "LOG_DATE")
	private Date LOG_DATE;

	/** 日志类型 */
	@TableField(value = "LOG_TYPE")
	private String LOG_TYPE;

	/** 日志内容 */
	@TableField(value = "LOG_CONTENT")
	private String LOG_CONTENT;

	/** 上传数量 */
	@TableField(value = "DATA_COUNT")
	private Integer DATA_COUNT;

	public Integer getID() {
		return this.ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}

	public String getSERVER_ID() {
		return this.SERVER_ID;
	}

	public void setSERVER_ID(String SERVER_ID) {
		this.SERVER_ID = SERVER_ID;
	}

	public String getSERVER_IP() {
		return this.SERVER_IP;
	}

	public void setSERVER_IP(String SERVER_IP) {
		this.SERVER_IP = SERVER_IP;
	}

	public Date getLOG_DATE() {
		return this.LOG_DATE;
	}

	public void setLOG_DATE(Date LOG_DATE) {
		this.LOG_DATE = LOG_DATE;
	}

	public String getLOG_TYPE() {
		return this.LOG_TYPE;
	}

	public void setLOG_TYPE(String LOG_TYPE) {
		this.LOG_TYPE = LOG_TYPE;
	}

	public String getLOG_CONTENT() {
		return this.LOG_CONTENT;
	}

	public void setLOG_CONTENT(String LOG_CONTENT) {
		this.LOG_CONTENT = LOG_CONTENT;
	}

	public Integer getDATA_COUNT() {
		return this.DATA_COUNT;
	}

	public void setDATA_COUNT(Integer DATA_COUNT) {
		this.DATA_COUNT = DATA_COUNT;
	}

}
