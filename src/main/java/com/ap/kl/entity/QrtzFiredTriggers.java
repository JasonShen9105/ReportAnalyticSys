package com.ap.kl.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 
 *
 */
@TableName(value = "qrtz_fired_triggers")
public class QrtzFiredTriggers implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId(value = "SCHED_NAME")
	private String SCHED_NAME;

	/**  */
	@TableId(value = "ENTRY_ID")
	private String ENTRY_ID;

	/**  */
	@TableField(value = "TRIGGER_NAME")
	private String TRIGGER_NAME;

	/**  */
	@TableField(value = "TRIGGER_GROUP")
	private String TRIGGER_GROUP;

	/**  */
	@TableField(value = "INSTANCE_NAME")
	private String INSTANCE_NAME;

	/**  */
	@TableField(value = "FIRED_TIME")
	private Long FIRED_TIME;

	/**  */
	@TableField(value = "SCHED_TIME")
	private Long SCHED_TIME;

	/**  */
	private Integer PRIORITY;

	/**  */
	private String STATE;

	/**  */
	@TableField(value = "JOB_NAME")
	private String JOB_NAME;

	/**  */
	@TableField(value = "JOB_GROUP")
	private String JOB_GROUP;

	/**  */
	@TableField(value = "IS_NONCONCURRENT")
	private String IS_NONCONCURRENT;

	/**  */
	@TableField(value = "REQUESTS_RECOVERY")
	private String REQUESTS_RECOVERY;

	public String getSCHED_NAME() {
		return this.SCHED_NAME;
	}

	public void setSCHED_NAME(String SCHED_NAME) {
		this.SCHED_NAME = SCHED_NAME;
	}

	public String getENTRY_ID() {
		return this.ENTRY_ID;
	}

	public void setENTRY_ID(String ENTRY_ID) {
		this.ENTRY_ID = ENTRY_ID;
	}

	public String getTRIGGER_NAME() {
		return this.TRIGGER_NAME;
	}

	public void setTRIGGER_NAME(String TRIGGER_NAME) {
		this.TRIGGER_NAME = TRIGGER_NAME;
	}

	public String getTRIGGER_GROUP() {
		return this.TRIGGER_GROUP;
	}

	public void setTRIGGER_GROUP(String TRIGGER_GROUP) {
		this.TRIGGER_GROUP = TRIGGER_GROUP;
	}

	public String getINSTANCE_NAME() {
		return this.INSTANCE_NAME;
	}

	public void setINSTANCE_NAME(String INSTANCE_NAME) {
		this.INSTANCE_NAME = INSTANCE_NAME;
	}

	public Long getFIRED_TIME() {
		return this.FIRED_TIME;
	}

	public void setFIRED_TIME(Long FIRED_TIME) {
		this.FIRED_TIME = FIRED_TIME;
	}

	public Long getSCHED_TIME() {
		return this.SCHED_TIME;
	}

	public void setSCHED_TIME(Long SCHED_TIME) {
		this.SCHED_TIME = SCHED_TIME;
	}

	public Integer getPRIORITY() {
		return this.PRIORITY;
	}

	public void setPRIORITY(Integer PRIORITY) {
		this.PRIORITY = PRIORITY;
	}

	public String getSTATE() {
		return this.STATE;
	}

	public void setSTATE(String STATE) {
		this.STATE = STATE;
	}

	public String getJOB_NAME() {
		return this.JOB_NAME;
	}

	public void setJOB_NAME(String JOB_NAME) {
		this.JOB_NAME = JOB_NAME;
	}

	public String getJOB_GROUP() {
		return this.JOB_GROUP;
	}

	public void setJOB_GROUP(String JOB_GROUP) {
		this.JOB_GROUP = JOB_GROUP;
	}

	public String getIS_NONCONCURRENT() {
		return this.IS_NONCONCURRENT;
	}

	public void setIS_NONCONCURRENT(String IS_NONCONCURRENT) {
		this.IS_NONCONCURRENT = IS_NONCONCURRENT;
	}

	public String getREQUESTS_RECOVERY() {
		return this.REQUESTS_RECOVERY;
	}

	public void setREQUESTS_RECOVERY(String REQUESTS_RECOVERY) {
		this.REQUESTS_RECOVERY = REQUESTS_RECOVERY;
	}

}
