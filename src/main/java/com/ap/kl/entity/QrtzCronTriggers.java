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
@TableName(value = "qrtz_cron_triggers")
public class QrtzCronTriggers implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId(value = "SCHED_NAME")
	private String SCHED_NAME;

	/**  */
	@TableId(value = "TRIGGER_NAME")
	private String TRIGGER_NAME;

	/**  */
	@TableId(value = "TRIGGER_GROUP")
	private String TRIGGER_GROUP;

	/**  */
	@TableField(value = "CRON_EXPRESSION")
	private String CRON_EXPRESSION;

	/**  */
	@TableField(value = "TIME_ZONE_ID")
	private String TIME_ZONE_ID;

	public String getSCHED_NAME() {
		return this.SCHED_NAME;
	}

	public void setSCHED_NAME(String SCHED_NAME) {
		this.SCHED_NAME = SCHED_NAME;
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

	public String getCRON_EXPRESSION() {
		return this.CRON_EXPRESSION;
	}

	public void setCRON_EXPRESSION(String CRON_EXPRESSION) {
		this.CRON_EXPRESSION = CRON_EXPRESSION;
	}

	public String getTIME_ZONE_ID() {
		return this.TIME_ZONE_ID;
	}

	public void setTIME_ZONE_ID(String TIME_ZONE_ID) {
		this.TIME_ZONE_ID = TIME_ZONE_ID;
	}

}
