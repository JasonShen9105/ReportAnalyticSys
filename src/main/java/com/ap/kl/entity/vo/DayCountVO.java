package com.ap.kl.entity.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DayCountVO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	/**  */
	private Date days;
	private Integer hours;
	/**  */
	private BigDecimal in_count;

	/**  */
	private BigDecimal out_count;
	
	public Date getDays() {
		return days;
	}

	public void setDays(Date days) {
		this.days = days;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}



	public BigDecimal getIn_count() {
		return this.in_count;
	}

	public void setIn_count(BigDecimal in_count) {
		this.in_count = in_count;
	}

	public BigDecimal getOut_count() {
		return this.out_count;
	}

	public void setOut_count(BigDecimal out_count) {
		this.out_count = out_count;
	}


}
