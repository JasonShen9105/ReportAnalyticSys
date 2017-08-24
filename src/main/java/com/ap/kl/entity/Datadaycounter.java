package com.ap.kl.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 数据统计
 *
 */
@TableName(value = "DATADAYCOUNTER")
public class Datadaycounter implements Serializable {

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

	/** 设备 */
	private String DEVICE;

	/** 进入数 */
	@TableField(value = "IN_COUNT")
	private Integer IN_COUNT;

	/** 离开数 */
	@TableField(value = "OUT_COUNT")
	private Integer OUT_COUNT;

	/** 删除标识 */
	private String DELFLG;

	/** 登录时间 */
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

	public String getDELFLG() {
		return this.DELFLG;
	}

	public void setDELFLG(String DELFLG) {
		this.DELFLG = DELFLG;
	}

	public Date getINSERT_TIME() {
		return this.INSERT_TIME;
	}

	public void setINSERT_TIME(Date INSERT_TIME) {
		this.INSERT_TIME = INSERT_TIME;
	}

}
