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
@TableName(value = "qrtz_simple_triggers")
public class QrtzSimpleTriggers implements Serializable {

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
	@TableField(value = "REPEAT_COUNT")
	private Long REPEAT_COUNT;

	/**  */
	@TableField(value = "REPEAT_INTERVAL")
	private Long REPEAT_INTERVAL;

	/**  */
	@TableField(value = "TIMES_TRIGGERED")
	private Long TIMES_TRIGGERED;

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

	public Long getREPEAT_COUNT() {
		return this.REPEAT_COUNT;
	}

	public void setREPEAT_COUNT(Long REPEAT_COUNT) {
		this.REPEAT_COUNT = REPEAT_COUNT;
	}

	public Long getREPEAT_INTERVAL() {
		return this.REPEAT_INTERVAL;
	}

	public void setREPEAT_INTERVAL(Long REPEAT_INTERVAL) {
		this.REPEAT_INTERVAL = REPEAT_INTERVAL;
	}

	public Long getTIMES_TRIGGERED() {
		return this.TIMES_TRIGGERED;
	}

	public void setTIMES_TRIGGERED(Long TIMES_TRIGGERED) {
		this.TIMES_TRIGGERED = TIMES_TRIGGERED;
	}

}
