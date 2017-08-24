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
@TableName(value = "DATACOUNTER")
public class Datacounter implements Serializable {

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

	/** Mdb序号 */
	@TableField(value = "MDB_ID")
	private String MDB_ID;

	/** 开始时间 */
	@TableField(value = "TIME_START")
	private Date TIME_START;

	/** 结束时间 */
	@TableField(value = "TIME_END")
	private Date TIME_END;

	/** 设备 */
	private String DEVICE;

	/** 进入数 */
	@TableField(value = "IN_COUNT")
	private Integer IN_COUNT;

	/** 离开数 */
	@TableField(value = "OUT_COUNT")
	private Integer OUT_COUNT;

	/**  */
	@TableField(value = "DEVICE_SUB1")
	private String DEVICE_SUB1;

	/**  */
	private String DST;
	
	private String HOUR;

	/**  */
	@TableField(value = "INSERT_TIME")
	private Date INSERT_TIME;

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

	public String getMDB_ID() {
		return this.MDB_ID;
	}

	public void setMDB_ID(String MDB_ID) {
		this.MDB_ID = MDB_ID;
	}

	public Date getTIME_START() {
		return this.TIME_START;
	}

	public void setTIME_START(Date TIME_START) {
		this.TIME_START = TIME_START;
	}

	public Date getTIME_END() {
		return this.TIME_END;
	}

	public void setTIME_END(Date TIME_END) {
		this.TIME_END = TIME_END;
	}

	public String getDEVICE() {
		return this.DEVICE;
	}

	public void setDEVICE(String DEVICE) {
		this.DEVICE = DEVICE;
	}

	public Integer getIN_COUNT() {
		return this.IN_COUNT;
	}

	public void setIN_COUNT(Integer IN_COUNT) {
		this.IN_COUNT = IN_COUNT;
	}

	public Integer getOUT_COUNT() {
		return this.OUT_COUNT;
	}

	public void setOUT_COUNT(Integer OUT_COUNT) {
		this.OUT_COUNT = OUT_COUNT;
	}

	public String getDEVICE_SUB1() {
		return this.DEVICE_SUB1;
	}

	public void setDEVICE_SUB1(String DEVICE_SUB1) {
		this.DEVICE_SUB1 = DEVICE_SUB1;
	}

	public String getDST() {
		return this.DST;
	}

	public void setDST(String DST) {
		this.DST = DST;
	}

	public Date getINSERT_TIME() {
		return this.INSERT_TIME;
	}

	public void setINSERT_TIME(Date INSERT_TIME) {
		this.INSERT_TIME = INSERT_TIME;
	}

	public String getHOUR() {
		return HOUR;
	}

	public void setHOUR(String hOUR) {
		HOUR = hOUR;
	}
}
