/**
* USER_LOGIN_SESSION Entity
 * 
 */
package com.cornerstones.security.models;

/**
 * @author jimzhu
 * June 29 2017
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
@Table(name="USER_LOGIN_SESSION")

public class UserLoginSessions {

	@Id
	@Column(name="USER_LOGIN_ID", nullable=false)
	private String userLoginId;
	
	@Column(name="SAVED_DATE")
	private Date savedDate;
	
	@Column(name="SESSION_DATA")
	private String sessionData;
	
	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;
	
	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;
	
	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;
	
	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	public String getUserLoginId() {
		return userLoginId;
	}

	public void setUserLoginId(String userLoginId) {
		this.userLoginId = userLoginId;
	}

	public Date getSavedDate() {
		return savedDate;
	}

	public void setSavedDate(Date savedDate) {
		this.savedDate = savedDate;
	}

	public String getSessionData() {
		return sessionData;
	}

	public void setSessionData(String sessionData) {
		this.sessionData = sessionData;
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
