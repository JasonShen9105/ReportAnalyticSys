package com.ap.kl.entity;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * VIEW
 *
 */
@TableName(value = "VIEW_DAY_COUNT")
public class ViewDayCount implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	/** 序号 */
	@TableId(value = "DEVICE")
	private String DEVICE;

	/**  */
	@TableField(value = "IN_COUNT")
	private BigDecimal IN_COUNT;

	/**  */
	@TableField(value = "OUT_COUNT")
	private BigDecimal OUT_COUNT;

	/**  */
	@TableField(value = "INSERT_TIME")
	private String INSERT_TIME;

	/**  */
	@TableField(value = "MAX_INSERT_TIME")
	private Date MAX_INSERT_TIME;

	/**  */
	@TableField(value = "SERVER_ID")
	private String SERVER_ID;

	/**  */
	@TableField(value = "SERVER_IP")
	private String SERVER_IP;

	public String getDEVICE() {
		return this.DEVICE;
	}

	public void setDEVICE(String DEVICE) {
		this.DEVICE = DEVICE;
	}

	public BigDecimal getIN_COUNT() {
		return this.IN_COUNT;
	}

	public void setIN_COUNT(BigDecimal IN_COUNT) {
		this.IN_COUNT = IN_COUNT;
	}

	public BigDecimal getOUT_COUNT() {
		return this.OUT_COUNT;
	}

	public void setOUT_COUNT(BigDecimal OUT_COUNT) {
		this.OUT_COUNT = OUT_COUNT;
	}

	public String getINSERT_TIME() {
		return this.INSERT_TIME;
	}

	public void setINSERT_TIME(String INSERT_TIME) {
		this.INSERT_TIME = INSERT_TIME;
	}

	public Date getMAX_INSERT_TIME() {
		return this.MAX_INSERT_TIME;
	}

	public void setMAX_INSERT_TIME(Date MAX_INSERT_TIME) {
		this.MAX_INSERT_TIME = MAX_INSERT_TIME;
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

}
