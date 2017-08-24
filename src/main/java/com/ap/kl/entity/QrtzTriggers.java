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
@TableName(value = "qrtz_triggers")
public class QrtzTriggers implements Serializable {

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
	@TableField(value = "JOB_NAME")
	private String JOB_NAME;

	/**  */
	@TableField(value = "JOB_GROUP")
	private String JOB_GROUP;

	/**  */
	private String DESCRIPTION;

	/**  */
	@TableField(value = "NEXT_FIRE_TIME")
	private Long NEXT_FIRE_TIME;

	/**  */
	@TableField(value = "PREV_FIRE_TIME")
	private Long PREV_FIRE_TIME;

	/**  */
	private Integer PRIORITY;

	/**  */
	@TableField(value = "TRIGGER_STATE")
	private String TRIGGER_STATE;

	/**  */
	@TableField(value = "TRIGGER_TYPE")
	private String TRIGGER_TYPE;

	/**  */
	@TableField(value = "START_TIME")
	private Long START_TIME;

	/**  */
	@TableField(value = "END_TIME")
	private Long END_TIME;

	/**  */
	@TableField(value = "CALENDAR_NAME")
	private String CALENDAR_NAME;

	/**  */
	@TableField(value = "MISFIRE_INSTR")
	private Integer MISFIRE_INSTR;

	/**  */
	@TableField(value = "JOB_DATA")
	private byte[] JOB_DATA;

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

	public String getDESCRIPTION() {
		return this.DESCRIPTION;
	}

	public void setDESCRIPTION(String DESCRIPTION) {
		this.DESCRIPTION = DESCRIPTION;
	}

	public Long getNEXT_FIRE_TIME() {
		return this.NEXT_FIRE_TIME;
	}

	public void setNEXT_FIRE_TIME(Long NEXT_FIRE_TIME) {
		this.NEXT_FIRE_TIME = NEXT_FIRE_TIME;
	}

	public Long getPREV_FIRE_TIME() {
		return this.PREV_FIRE_TIME;
	}

	public void setPREV_FIRE_TIME(Long PREV_FIRE_TIME) {
		this.PREV_FIRE_TIME = PREV_FIRE_TIME;
	}

	public Integer getPRIORITY() {
		return this.PRIORITY;
	}

	public void setPRIORITY(Integer PRIORITY) {
		this.PRIORITY = PRIORITY;
	}

	public String getTRIGGER_STATE() {
		return this.TRIGGER_STATE;
	}

	public void setTRIGGER_STATE(String TRIGGER_STATE) {
		this.TRIGGER_STATE = TRIGGER_STATE;
	}

	public String getTRIGGER_TYPE() {
		return this.TRIGGER_TYPE;
	}

	public void setTRIGGER_TYPE(String TRIGGER_TYPE) {
		this.TRIGGER_TYPE = TRIGGER_TYPE;
	}

	public Long getSTART_TIME() {
		return this.START_TIME;
	}

	public void setSTART_TIME(Long START_TIME) {
		this.START_TIME = START_TIME;
	}

	public Long getEND_TIME() {
		return this.END_TIME;
	}

	public void setEND_TIME(Long END_TIME) {
		this.END_TIME = END_TIME;
	}

	public String getCALENDAR_NAME() {
		return this.CALENDAR_NAME;
	}

	public void setCALENDAR_NAME(String CALENDAR_NAME) {
		this.CALENDAR_NAME = CALENDAR_NAME;
	}

	public Integer getMISFIRE_INSTR() {
		return this.MISFIRE_INSTR;
	}

	public void setMISFIRE_INSTR(Integer MISFIRE_INSTR) {
		this.MISFIRE_INSTR = MISFIRE_INSTR;
	}

	public byte[] getJOB_DATA() {
		return this.JOB_DATA;
	}

	public void setJOB_DATA(byte[] JOB_DATA) {
		this.JOB_DATA = JOB_DATA;
	}

}
