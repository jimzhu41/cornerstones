/**
 * USER_LOGIN_PASSWORD_HISTORY Entity
 * 
 */
package com.cornerstones.security.models;

/**
 * @author jimzhu  June 29 2017
 *  
 */

import java.io.Serializable;
import java.util.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;


@Entity
@Table(name="USER_LOGIN_PASSWORD_HISTORY")
public class UserLoginPasswordHistory {

	@Id
	@Column(name="USER_LOGIN_IN", nullable=false)
	private String userLoginIn;
	 
	@Column(name="FROM_DATE", nullable=false)
	private Date fromDate;
	
	@Column(name="THRU_DATE")
	private Date thruDate;
	
	@Column(name="CURRENT_PASSWORD")
	private String currentPassword;
  
	 @Column(name="LAST_UPDATED_STAMP")
	 private Timestamp lastUpdatedStamp;
	 @Column(name="LAST_UPDATED_TX_STAMP")
	 private Timestamp lastUpdatedTxStamp;
	 @Column(name="CREATED_STAMP")
	 private Timestamp createdStamp;
	 @Column(name="CREATED_TX_STAMP")
	 private Timestamp createdTxStamp;
	public String getUserLoginIn() {
		return userLoginIn;
	}
	public void setUserLoginIn(String userLoginIn) {
		this.userLoginIn = userLoginIn;
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
	public String getCurrentPassword() {
		return currentPassword;
	}
	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}
	public Timestamp getLastUpdatedStamp() {
		return lastUpdatedStamp;
	}
	public void setLastUpdatedStamp(Timestamp lastUpdatedStamp) {
		this.lastUpdatedStamp = lastUpdatedStamp;
	}
	public Timestamp getLastUpdatedTxStamp() {
		return lastUpdatedTxStamp;
	}
	public void setLastUpdatedTxStamp(Timestamp lastUpdatedTxStamp) {
		this.lastUpdatedTxStamp = lastUpdatedTxStamp;
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
