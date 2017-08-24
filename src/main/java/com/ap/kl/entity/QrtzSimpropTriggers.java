package com.ap.kl.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 
 *
 */
@TableName(value = "qrtz_simprop_triggers")
public class QrtzSimpropTriggers implements Serializable {

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
	@TableField(value = "STR_PROP_1")
	private String STR_PROP_1;

	/**  */
	@TableField(value = "STR_PROP_2")
	private String STR_PROP_2;

	/**  */
	@TableField(value = "STR_PROP_3")
	private String STR_PROP_3;

	/**  */
	@TableField(value = "INT_PROP_1")
	private Integer INT_PROP_1;

	/**  */
	@TableField(value = "INT_PROP_2")
	private Integer INT_PROP_2;

	/**  */
	@TableField(value = "LONG_PROP_1")
	private Long LONG_PROP_1;

	/**  */
	@TableField(value = "LONG_PROP_2")
	private Long LONG_PROP_2;

	/**  */
	@TableField(value = "DEC_PROP_1")
	private BigDecimal DEC_PROP_1;

	/**  */
	@TableField(value = "DEC_PROP_2")
	private BigDecimal DEC_PROP_2;

	/**  */
	@TableField(value = "BOOL_PROP_1")
	private String BOOL_PROP_1;

	/**  */
	@TableField(value = "BOOL_PROP_2")
	private String BOOL_PROP_2;

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

	public String getSTR_PROP_1() {
		return this.STR_PROP_1;
	}

	public void setSTR_PROP_1(String STR_PROP_1) {
		this.STR_PROP_1 = STR_PROP_1;
	}

	public String getSTR_PROP_2() {
		return this.STR_PROP_2;
	}

	public void setSTR_PROP_2(String STR_PROP_2) {
		this.STR_PROP_2 = STR_PROP_2;
	}

	public String getSTR_PROP_3() {
		return this.STR_PROP_3;
	}

	public void setSTR_PROP_3(String STR_PROP_3) {
		this.STR_PROP_3 = STR_PROP_3;
	}

	public Integer getINT_PROP_1() {
		return this.INT_PROP_1;
	}

	public void setINT_PROP_1(Integer INT_PROP_1) {
		this.INT_PROP_1 = INT_PROP_1;
	}

	public Integer getINT_PROP_2() {
		return this.INT_PROP_2;
	}

	public void setINT_PROP_2(Integer INT_PROP_2) {
		this.INT_PROP_2 = INT_PROP_2;
	}

	public Long getLONG_PROP_1() {
		return this.LONG_PROP_1;
	}

	public void setLONG_PROP_1(Long LONG_PROP_1) {
		this.LONG_PROP_1 = LONG_PROP_1;
	}

	public Long getLONG_PROP_2() {
		return this.LONG_PROP_2;
	}

	public void setLONG_PROP_2(Long LONG_PROP_2) {
		this.LONG_PROP_2 = LONG_PROP_2;
	}

	public BigDecimal getDEC_PROP_1() {
		return this.DEC_PROP_1;
	}

	public void setDEC_PROP_1(BigDecimal DEC_PROP_1) {
		this.DEC_PROP_1 = DEC_PROP_1;
	}

	public BigDecimal getDEC_PROP_2() {
		return this.DEC_PROP_2;
	}

	public void setDEC_PROP_2(BigDecimal DEC_PROP_2) {
		this.DEC_PROP_2 = DEC_PROP_2;
	}

	public String getBOOL_PROP_1() {
		return this.BOOL_PROP_1;
	}

	public void setBOOL_PROP_1(String BOOL_PROP_1) {
		this.BOOL_PROP_1 = BOOL_PROP_1;
	}

	public String getBOOL_PROP_2() {
		return this.BOOL_PROP_2;
	}

	public void setBOOL_PROP_2(String BOOL_PROP_2) {
		this.BOOL_PROP_2 = BOOL_PROP_2;
	}

}
