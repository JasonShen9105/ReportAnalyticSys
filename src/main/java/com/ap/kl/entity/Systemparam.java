package com.ap.kl.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 系统参数设定
 *
 */
@TableName(value = "SYSTEMPARAM")
public class Systemparam implements Serializable {

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

	/**  */
	@TableField(value = "FILE_TYPE")
	private String FILE_TYPE;

	/** 路径 */
	@TableField(value = "DATA_PATH")
	private String DATA_PATH;

	/** 时间间隔 */
	@TableField(value = "TIME_INTERVAL")
	private Integer TIME_INTERVAL;

	/** 设备数量 */
	@TableField(value = "DEVICE_COUNT")
	private Integer DEVICE_COUNT;

	/** 登陆时间 */
	@TableField(value = "INSERT_TIME")
	private Date INSERT_TIME;

	/**  */
	@TableField(value = "UPDATE_TIME")
	private Date UPDATE_TIME;

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

	public String getFILE_TYPE() {
		return this.FILE_TYPE;
	}

	public void setFILE_TYPE(String FILE_TYPE) {
		this.FILE_TYPE = FILE_TYPE;
	}

	public String getDATA_PATH() {
		return this.DATA_PATH;
	}

	public void setDATA_PATH(String DATA_PATH) {
		this.DATA_PATH = DATA_PATH;
	}

	public Integer getTIME_INTERVAL() {
		return this.TIME_INTERVAL;
	}

	public void setTIME_INTERVAL(Integer TIME_INTERVAL) {
		this.TIME_INTERVAL = TIME_INTERVAL;
	}

	public Integer getDEVICE_COUNT() {
		return this.DEVICE_COUNT;
	}

	public void setDEVICE_COUNT(Integer DEVICE_COUNT) {
		this.DEVICE_COUNT = DEVICE_COUNT;
	}

	public Date getINSERT_TIME() {
		return this.INSERT_TIME;
	}

	public void setINSERT_TIME(Date INSERT_TIME) {
		this.INSERT_TIME = INSERT_TIME;
	}

	public Date getUPDATE_TIME() {
		return this.UPDATE_TIME;
	}

	public void setUPDATE_TIME(Date UPDATE_TIME) {
		this.UPDATE_TIME = UPDATE_TIME;
	}

}
