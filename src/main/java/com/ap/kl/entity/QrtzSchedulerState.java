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
@TableName(value = "qrtz_scheduler_state")
public class QrtzSchedulerState implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId(value = "SCHED_NAME")
	private String SCHED_NAME;

	/**  */
	@TableId(value = "INSTANCE_NAME")
	private String INSTANCE_NAME;

	/**  */
	@TableField(value = "LAST_CHECKIN_TIME")
	private Long LAST_CHECKIN_TIME;

	/**  */
	@TableField(value = "CHECKIN_INTERVAL")
	private Long CHECKIN_INTERVAL;

	public String getSCHED_NAME() {
		return this.SCHED_NAME;
	}

	public void setSCHED_NAME(String SCHED_NAME) {
		this.SCHED_NAME = SCHED_NAME;
	}

	public String getINSTANCE_NAME() {
		return this.INSTANCE_NAME;
	}

	public void setINSTANCE_NAME(String INSTANCE_NAME) {
		this.INSTANCE_NAME = INSTANCE_NAME;
	}

	public Long getLAST_CHECKIN_TIME() {
		return this.LAST_CHECKIN_TIME;
	}

	public void setLAST_CHECKIN_TIME(Long LAST_CHECKIN_TIME) {
		this.LAST_CHECKIN_TIME = LAST_CHECKIN_TIME;
	}

	public Long getCHECKIN_INTERVAL() {
		return this.CHECKIN_INTERVAL;
	}

	public void setCHECKIN_INTERVAL(Long CHECKIN_INTERVAL) {
		this.CHECKIN_INTERVAL = CHECKIN_INTERVAL;
	}

}
