/*
 * USER_LOGIN entity
 */
package com.cornerstones.security.models;
/*
 * Author: Jim Zhu
 * Entity for User Login
 */


 
import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

 

@Entity
@Table(name="USER_LOGIN")

public class UserLogin implements Serializable {

@Id
@Column(name="USER_LOGIN_ID")
private String userLoginId;
@Column(name="CURRENT_PASSWORD")
private String currentPwd;
@Column(name="PASSWORD_HINT")
private String pwdHint;
@Column(name="IS_SYSTEM")
private Character isSYstem;
@Column(name="ENABLED")
private Character enabled;
@Column(name="HAS_LOGGED_OUT")
private Character hasLoggedOut;
@Column(name="REQUIRE_PASSWORD_CHANGE")
private Character reqPwdChg;
@Column(name="LAST_CURRENCY_UOM")
private String lastCurrentUOM;
@Column(name="LAST_LOCALE")
private String lastLocale;
@Column(name="LAST_TIME_ZONE")
private String lastTimeZone;
@Column(name="DISABLED_DATE_TIME")
private Timestamp disabledDateTime;
@Column(name="SUCCESSIVE_FAILED_LOGINS")
private int succFailedLog;
@Column(name="EXTERNAL_AUTH_ID")
private String externalAuthId;
@Column(name="USER_LDAP_DN")
private String userLDAPDN;
@Column(name="LAST_UPDATED_STAMP")
private Timestamp lastUpdatedStamp;
@Column(name="LAST_UPDATED_TX_STAMP")
private Timestamp lastUpdatedTxStamp;
@Column(name="CREATED_STAMP")
private Timestamp createdStamp;
@Column(name="CREATED_TX_STAMP")
private Timestamp createdTxStamp;
@Column(name="PARTY_ID")
private String partyId;
public String getUserLoginId() {
	return userLoginId;
}
public void setUserLoginId(String userLoginId) {
	this.userLoginId = userLoginId;
}
public String getCurrentPwd() {
	return currentPwd;
}
public void setCurrentPwd(String currentPwd) {
	this.currentPwd = currentPwd;
}
public String getPwdHint() {
	return pwdHint;
}
public void setPwdHint(String pwdHint) {
	this.pwdHint = pwdHint;
}
public Character getIsSYstem() {
	return isSYstem;
}
public void setIsSYstem(Character isSYstem) {
	this.isSYstem = isSYstem;
}
public Character getEnabled() {
	return enabled;
}
public void setEnabled(Character enabled) {
	this.enabled = enabled;
}
public Character getHasLoggedOut() {
	return hasLoggedOut;
}
public void setHasLoggedOut(Character hasLoggedOut) {
	this.hasLoggedOut = hasLoggedOut;
}
public Character getReqPwdChg() {
	return reqPwdChg;
}
public void setReqPwdChg(Character reqPwdChg) {
	this.reqPwdChg = reqPwdChg;
}
public String getLastCurrentUOM() {
	return lastCurrentUOM;
}
public void setLastCurrentUOM(String lastCurrentUOM) {
	this.lastCurrentUOM = lastCurrentUOM;
}
public String getLastLocale() {
	return lastLocale;
}
public void setLastLocale(String lastLocale) {
	this.lastLocale = lastLocale;
}
public String getLastTimeZone() {
	return lastTimeZone;
}
public void setLastTimeZone(String lastTimeZone) {
	this.lastTimeZone = lastTimeZone;
}
public Timestamp getDisabledDateTime() {
	return disabledDateTime;
}
public void setDisabledDateTime(Timestamp disabledDateTime) {
	this.disabledDateTime = disabledDateTime;
}
public int getSuccFailedLog() {
	return succFailedLog;
}
public void setSuccFailedLog(int succFailedLog) {
	this.succFailedLog = succFailedLog;
}
public String getExternalAuthId() {
	return externalAuthId;
}
public void setExternalAuthId(String externalAuthId) {
	this.externalAuthId = externalAuthId;
}
public String getUserLDAPDN() {
	return userLDAPDN;
}
public void setUserLDAPDN(String userLDAPDN) {
	this.userLDAPDN = userLDAPDN;
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
public String getPartyId() {
	return partyId;
}
public void setPartyId(String partyId) {
	this.partyId = partyId;
}
	
	
}
