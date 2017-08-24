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
@TableName(value = "qrtz_blob_triggers")
public class QrtzBlobTriggers implements Serializable {

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
	@TableField(value = "BLOB_DATA")
	private byte[] BLOB_DATA;

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

	public byte[] getBLOB_DATA() {
		return this.BLOB_DATA;
	}

	public void setBLOB_DATA(byte[] BLOB_DATA) {
		this.BLOB_DATA = BLOB_DATA;
	}

}
