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
@TableName(value = "qrtz_job_details")
public class QrtzJobDetails implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId(value = "SCHED_NAME")
	private String SCHED_NAME;

	/**  */
	@TableId(value = "JOB_NAME")
	private String JOB_NAME;

	/**  */
	@TableId(value = "JOB_GROUP")
	private String JOB_GROUP;

	/**  */
	private String DESCRIPTION;

	/**  */
	@TableField(value = "JOB_CLASS_NAME")
	private String JOB_CLASS_NAME;

	/**  */
	@TableField(value = "IS_DURABLE")
	private String IS_DURABLE;

	/**  */
	@TableField(value = "IS_NONCONCURRENT")
	private String IS_NONCONCURRENT;

	/**  */
	@TableField(value = "IS_UPDATE_DATA")
	private String IS_UPDATE_DATA;

	/**  */
	@TableField(value = "REQUESTS_RECOVERY")
	private String REQUESTS_RECOVERY;

	/**  */
	@TableField(value = "JOB_DATA")
	private byte[] JOB_DATA;

	public String getSCHED_NAME() {
		return this.SCHED_NAME;
	}

	public void setSCHED_NAME(String SCHED_NAME) {
		this.SCHED_NAME = SCHED_NAME;
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

	public String getJOB_CLASS_NAME() {
		return this.JOB_CLASS_NAME;
	}

	public void setJOB_CLASS_NAME(String JOB_CLASS_NAME) {
		this.JOB_CLASS_NAME = JOB_CLASS_NAME;
	}

	public String getIS_DURABLE() {
		return this.IS_DURABLE;
	}

	public void setIS_DURABLE(String IS_DURABLE) {
		this.IS_DURABLE = IS_DURABLE;
	}

	public String getIS_NONCONCURRENT() {
		return this.IS_NONCONCURRENT;
	}

	public void setIS_NONCONCURRENT(String IS_NONCONCURRENT) {
		this.IS_NONCONCURRENT = IS_NONCONCURRENT;
	}

	public String getIS_UPDATE_DATA() {
		return this.IS_UPDATE_DATA;
	}

	public void setIS_UPDATE_DATA(String IS_UPDATE_DATA) {
		this.IS_UPDATE_DATA = IS_UPDATE_DATA;
	}

	public String getREQUESTS_RECOVERY() {
		return this.REQUESTS_RECOVERY;
	}

	public void setREQUESTS_RECOVERY(String REQUESTS_RECOVERY) {
		this.REQUESTS_RECOVERY = REQUESTS_RECOVERY;
	}

	public byte[] getJOB_DATA() {
		return this.JOB_DATA;
	}

	public void setJOB_DATA(byte[] JOB_DATA) {
		this.JOB_DATA = JOB_DATA;
	}

}
