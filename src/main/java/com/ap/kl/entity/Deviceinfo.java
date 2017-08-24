package com.ap.kl.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 设备信息
 *
 */
@TableName(value = "DEVICEINFO")
public class Deviceinfo implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	private Integer ROWID;

	/** 序号 */
	@TableId
	private Integer ID;

	/** 采集器ID */
	@TableField(value = "SERVER_ID")
	private String SERVER_ID;

	/** 采集器IP */
	@TableField(value = "SERVER_IP")
	private String SERVER_IP;

	/** 设备ID */
	@TableField(value = "DEVICE_ID")
	private String DEVICE_ID;

	/** 设备制造商 */
	@TableField(value = "DEVICE_ODM")
	private String DEVICE_ODM;

	/** 设备安装位置 */
	@TableField(value = "DEVICE_PLACE")
	private String DEVICE_PLACE;
	
	/** 门ID */
	@TableField(value = "DOOR_ID")
	private String DOOR_ID;

	/** 登录时间 */
	@TableField(value = "INSERT_TIME")
	private Date INSERT_TIME;

	/** 登录人 */
	@TableField(value = "INSERT_USER")
	private String INSERT_USER;

	/** 更新时间 */
	@TableField(value = "UPDATE_TIME")
	private Date UPDATE_TIME;

	/** 更新人 */
	@TableField(value = "UPDATE_USER")
	private String UPDATE_USER;

	/** 删除标志 */
	@TableField(value = "DEL_FLG")
	private Integer DEL_FLG;

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

	public String getDEVICE_ID() {
		return this.DEVICE_ID;
	}

	public void setDEVICE_ID(String DEVICE_ID) {
		this.DEVICE_ID = DEVICE_ID;
	}

	public String getDEVICE_ODM() {
		return this.DEVICE_ODM;
	}

	public void setDEVICE_ODM(String DEVICE_ODM) {
		this.DEVICE_ODM = DEVICE_ODM;
	}

	public String getDEVICE_PLACE() {
		return this.DEVICE_PLACE;
	}

	public void setDEVICE_PLACE(String DEVICE_PLACE) {
		this.DEVICE_PLACE = DEVICE_PLACE;
	}

	
	public String getDOOR_ID() {
		return DOOR_ID;
	}

	public void setDOOR_ID(String dOOR_ID) {
		DOOR_ID = dOOR_ID;
	}

	public Date getINSERT_TIME() {
		return this.INSERT_TIME;
	}

	public void setINSERT_TIME(Date INSERT_TIME) {
		this.INSERT_TIME = INSERT_TIME;
	}

	public String getINSERT_USER() {
		return this.INSERT_USER;
	}

	public void setINSERT_USER(String INSERT_USER) {
		this.INSERT_USER = INSERT_USER;
	}

	public Date getUPDATE_TIME() {
		return this.UPDATE_TIME;
	}

	public void setUPDATE_TIME(Date UPDATE_TIME) {
		this.UPDATE_TIME = UPDATE_TIME;
	}

	public String getUPDATE_USER() {
		return this.UPDATE_USER;
	}

	public void setUPDATE_USER(String UPDATE_USER) {
		this.UPDATE_USER = UPDATE_USER;
	}

	public Integer getDEL_FLG() {
		return this.DEL_FLG;
	}

	public void setDEL_FLG(Integer DEL_FLG) {
		this.DEL_FLG = DEL_FLG;
	}

	
	public Integer getROWID() {
		return ROWID;
	}

	public void setROWID(Integer rOWID) {
		ROWID = rOWID;
	}
}
