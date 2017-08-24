package com.ap.kl.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 执行信息
 *
 */
@TableName(value = "PROCESSINFO")
public class Processinfo implements Serializable {

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

	/** 最后一次执行时间 */
	@TableField(value = "LAST_TIME")
	private Date LAST_TIME;

	/** 最大序号 */
	@TableField(value = "MAX_ID")
	private Integer MAX_ID;

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

	public Date getLAST_TIME() {
		return this.LAST_TIME;
	}

	public void setLAST_TIME(Date LAST_TIME) {
		this.LAST_TIME = LAST_TIME;
	}

	public Integer getMAX_ID() {
		return this.MAX_ID;
	}

	public void setMAX_ID(Integer MAX_ID) {
		this.MAX_ID = MAX_ID;
	}

}
