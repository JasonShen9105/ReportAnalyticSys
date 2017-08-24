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
@TableName(value = "qrtz_calendars")
public class QrtzCalendars implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId(value = "SCHED_NAME")
	private String SCHED_NAME;

	/**  */
	@TableId(value = "CALENDAR_NAME")
	private String CALENDAR_NAME;

	/**  */
	private byte[] CALENDAR;

	public String getSCHED_NAME() {
		return this.SCHED_NAME;
	}

	public void setSCHED_NAME(String SCHED_NAME) {
		this.SCHED_NAME = SCHED_NAME;
	}

	public String getCALENDAR_NAME() {
		return this.CALENDAR_NAME;
	}

	public void setCALENDAR_NAME(String CALENDAR_NAME) {
		this.CALENDAR_NAME = CALENDAR_NAME;
	}

	public byte[] getCALENDAR() {
		return this.CALENDAR;
	}

	public void setCALENDAR(byte[] CALENDAR) {
		this.CALENDAR = CALENDAR;
	}

}
