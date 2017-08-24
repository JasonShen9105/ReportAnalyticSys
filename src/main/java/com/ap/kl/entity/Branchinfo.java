package com.ap.kl.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
*
* 案场信息
*
*/
@TableName(value = "BRANCHINFO")
public class Branchinfo {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** 序号 */
	@TableId
	private Integer ID;
	
	/**案场ID */
	@TableId
	private String BRANCH_ID;
	
	/**大区ID */
	@TableId
	private String REGION_ID;
	
	/**案场名称 */
	@TableId
	private String BRANCH_NAME;
	
	/**备考1 */
	@TableId
	private String REF1;
	
	/**备考2*/
	@TableId
	private String REF2;
	
	/**备考3*/
	@TableId
	private String REF3;
	
	/**备考4*/
	@TableId
	private String REF4;
	
	/** 登录时间 */
	@TableField(value = "INSERT_TIME")
	private Date INSERT_TIME;

	/** 登录人 */
	@TableField(value = "INSERT_USER")
	private String INSERT_USER;

	/** 更新时间 */
	@TableField(value = "UPDATE_TIME")
	private Date UPDATE_TIME;

	/** 更新人 */
	@TableField(value = "UPDATE_USER")
	private String UPDATE_USER;

	/** 删除标志 */
	@TableField(value = "DEL_FLG")
	private Integer DEL_FLG;

	/** 大区 */
	@TableField(value = "REGIONTYPE")
	private String REGIONTYPE;
	
	/** 省份城市*/
	@TableField(value = "CITY")
	private String CITY;
	
	/** 区*/
	@TableField(value = "District")
	private String District;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getBRANCH_ID() {
		return BRANCH_ID;
	}

	public void setBRANCH_ID(String bRANCH_ID) {
		BRANCH_ID = bRANCH_ID;
	}

	public String getREGION_ID() {
		return REGION_ID;
	}

	public void setREGION_ID(String rEGION_ID) {
		REGION_ID = rEGION_ID;
	}

	public String getBRANCH_NAME() {
		return BRANCH_NAME;
	}

	public void setBRANCH_NAME(String bRANCH_NAME) {
		BRANCH_NAME = bRANCH_NAME;
	}

	public String getREF1() {
		return REF1;
	}

	public void setREF1(String rEF1) {
		REF1 = rEF1;
	}

	public String getREF2() {
		return REF2;
	}

	public void setREF2(String rEF2) {
		REF2 = rEF2;
	}

	public String getREF3() {
		return REF3;
	}

	public void setREF3(String rEF3) {
		REF3 = rEF3;
	}

	public String getREF4() {
		return REF4;
	}

	public void setREF4(String rEF4) {
		REF4 = rEF4;
	}

	public Date getINSERT_TIME() {
		return INSERT_TIME;
	}

	public void setINSERT_TIME(Date iNSERT_TIME) {
		INSERT_TIME = iNSERT_TIME;
	}

	public String getINSERT_USER() {
		return INSERT_USER;
	}

	public void setINSERT_USER(String iNSERT_USER) {
		INSERT_USER = iNSERT_USER;
	}

	public Date getUPDATE_TIME() {
		return UPDATE_TIME;
	}

	public void setUPDATE_TIME(Date uPDATE_TIME) {
		UPDATE_TIME = uPDATE_TIME;
	}

	public String getUPDATE_USER() {
		return UPDATE_USER;
	}

	public void setUPDATE_USER(String uPDATE_USER) {
		UPDATE_USER = uPDATE_USER;
	}

	public Integer getDEL_FLG() {
		return DEL_FLG;
	}

	public void setDEL_FLG(Integer dEL_FLG) {
		DEL_FLG = dEL_FLG;
	}

	public String getREGIONTYPE() {
		return REGIONTYPE;
	}

	public void setREGIONTYPE(String rEGIONTYPE) {
		REGIONTYPE = rEGIONTYPE;
	}

	public String getCITY() {
		return CITY;
	}

	public void setCITY(String cITY) {
		CITY = cITY;
	}

	public String getDistrict() {
		return District;
	}

	public void setDistrict(String district) {
		District = district;
	}
	
	

}
