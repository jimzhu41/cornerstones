/**
 * USER_LOGIN_HISTORY
 * 
 */
package com.cornerstones.security.models;

/**
 * @author jimzhu
 * @Since June 29 2017
 */

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table(name="USER_LOGIN_HISTORY")
public class UserLoginHistory {
	
@Id
@Column(name="USER_LOGIN_ID",nullable=false)
private String userLoginId;

@Column(name="VISIT_ID")
private String visitId;

@Column(name="FROM_DATE")
private Date fromDate;

@Column(name="ThruDate")
private Date thruDate;

@Column(name="PASSWORD_USED")
private String passwordused;
	 
@Column(name="SUCCESSFUL_LOGIN")
private char successfullLogin;

@Column(name="PARTY_ID")
private String partyId;
	 
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
public String getVisitId() {
	return visitId;
}
public void setVisitId(String visitId) {
	this.visitId = visitId;
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
public String getPasswordused() {
	return passwordused;
}
public void setPasswordused(String passwordused) {
	this.passwordused = passwordused;
}
public char getSuccessfullLogin() {
	return successfullLogin;
}
public void setSuccessfullLogin(char successfullLogin) {
	this.successfullLogin = successfullLogin;
}
public String getPartyId() {
	return partyId;
}
public void setPartyId(String partyId) {
	this.partyId = partyId;
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
