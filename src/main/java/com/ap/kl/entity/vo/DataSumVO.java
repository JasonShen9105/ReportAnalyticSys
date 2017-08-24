package com.ap.kl.entity.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DataSumVO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long id;
	/**  */
	private String device;

	/**  */
	private BigDecimal in_count;

	/**  */
	private BigDecimal out_count;

	/**  */
	private String insert_time;

	/**  */
	private Date max_insert_time;

	/**  */
	private String server_id;

	/**  */
	private String server_ip;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getDevice() {
		return this.device;
	}

	public void setDevice(String device) {
		this.device = device;
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

	public String getInsert_time() {
		return this.insert_time;
	}

	public void setInsert_time(String insert_time) {
		this.insert_time = insert_time;
	}

	public Date getMax_insert_time() {
		return this.max_insert_time;
	}

	public void setMax_insert_time(Date max_insert_time) {
		this.max_insert_time = max_insert_time;
	}

	public String getServer_id() {
		return this.server_id;
	}

	public void setServer_id(String server_id) {
		this.server_id = server_id;
	}

	public String getServer_ip() {
		return this.server_ip;
	}

	public void setServer_ip(String server_ip) {
		this.server_ip = server_ip;
	}
}
