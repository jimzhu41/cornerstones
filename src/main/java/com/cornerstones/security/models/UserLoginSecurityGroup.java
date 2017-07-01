/**
 * USER_LOGIN_SECURITY_GROUP ENTITY
 */
package com.cornerstones.security.models;

/**
 * @author jimzhu
 * @Date 06-29-2017
 */

import java.util.Date;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table(name="USER_LOGIN_SECURITY_GROUP")

public class UserLoginSecurityGroup {

	@Id
	@Column(name="USER_LOGIN_ID", unique=true)
    private String userLoginId;
	
	@Column(name="GROUP_ID", nullable=false)
	private String groupId;
	
	@Column(name="FROM_DATE", nullable=false)
	private Date fromDate;
	
	@Column(name="THRU_DATE", nullable=true)
	private Date thruDate;
	
	@Column (name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;
	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTXStamp;
	@Column (name="CREATED_STAMP")
	private Timestamp createdStamp;
	@Column (name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;
	public String getUserLoginId() {
		return userLoginId;
	}
	public void setUserLoginId(String userLoginId) {
		this.userLoginId = userLoginId;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getThruDate() {
		return thruDate;
	}
	public void setThruDate(Date thruDate) {
		this.thruDate = thruDate;
	}
	public Timestamp getLastUpdatedStamp() {
		return lastUpdatedStamp;
	}
	public void setLastUpdatedStamp(Timestamp lastUpdatedStamp) {
		this.lastUpdatedStamp = lastUpdatedStamp;
	}
	public Timestamp getLastUpdatedTXStamp() {
		return lastUpdatedTXStamp;
	}
	public void setLastUpdatedTXStamp(Timestamp lastUpdatedTXStamp) {
		this.lastUpdatedTXStamp = lastUpdatedTXStamp;
	}
	public Timestamp getCreatedStamp() {
		return createdStamp;
	}
	public void setCreatedStamp(Timestamp createdStamp) {
		this.createdStamp = createdStamp;
	}
	public Timestamp getCreatedTxStamp() {
		return createdTxStamp;
	}
	public void setCreatedTxStamp(Timestamp createdTxStamp) {
		this.createdTxStamp = createdTxStamp;
	}
	
	
	
}
