/*
 * USER_LOGIN ENTITY
 */
package com.cornerstones.models;

/*
 * @author Jim ZHu
 * July 3 2017
 */

import java.util.Date;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="USER_LOGIN", catalog ="ofbiz")

public class UserLogins implements Serializable {

	private String userLoginId;
	private String currentPassword;
	private String passwordHint;
	private Character isSystem;
	private Character enabled;
	private Character hasLoggedOut;
	private Character requirePasswordChange;
	private String lastCurrencyUom;
	private String lastLocale;
	private String lastTimeZone;
	private Date disabledDateTime;
	private BigDecimal successiveFailedLogins;
	private String externalAuthId;
	private String userLdapDn;
	private Date lastUpdatedStamp;
	private Date lastUpdatedTxStamp;
	private Date createdTxStamp;
	private Date createdStamp;
	private String partyId;
	
	public UserLogins(){
	}
	
	public UserLogins(String userLoginId)
	{
		this.userLoginId = userLoginId;
	}
	

	public UserLogins(String userLoginId, String currentPassword, String passwordHint, Character isSystem,
			Character enabled, Character hasLoggedOut, Character requirePasswordChange, String lastCurrencyUom,
			String lastLocale, String lastTimeZone, Date disabledDateTime, BigDecimal successiveFailedLogins,
			String externalAuthId, String userLdapDn, Date lastUpdatedStamp, Date lastUpdatedTxStamp, Date createdStamp,
			Date createdTxStamp, String partyId) {
		this.userLoginId = userLoginId;
		this.currentPassword = currentPassword;
		this.passwordHint = passwordHint;
		this.isSystem = isSystem;
		this.enabled = enabled;
		this.hasLoggedOut = hasLoggedOut;
		this.requirePasswordChange = requirePasswordChange;
		this.lastCurrencyUom = lastCurrencyUom;
		this.lastLocale = lastLocale;
		this.lastTimeZone = lastTimeZone;
		this.disabledDateTime = disabledDateTime;
		this.successiveFailedLogins = successiveFailedLogins;
		this.externalAuthId = externalAuthId;
		this.userLdapDn = userLdapDn;
		this.lastUpdatedStamp = lastUpdatedStamp;
		this.lastUpdatedTxStamp = lastUpdatedTxStamp;
		this.createdStamp = createdStamp;
		this.createdTxStamp = createdTxStamp;
		this.partyId = partyId;
	}
	
	@Id
	@Column(name="USER_LOGIN_ID", nullable=false, length=250, unique = true)
   public String getUserLoginId() {
		return userLoginId;
	}
	public void setUserLoginId(String userLoginId) {
		this.userLoginId = userLoginId;
	}

	@Column(name="CURRENT_PASSWORD",nullable=false,length=60)
	public String getCurrentPassword() {
		return currentPassword;
	}

	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}

	 
	@Column(name="PASSWORD_HINT", length=255)
	public String getPasswordHint() {
		return passwordHint;
	}

	public void setPasswordHint(String passwordHint) {
		this.passwordHint = passwordHint;
	}

	@Column(name="IS_SYSTEM", length=1)
	public Character getIsSystem() {
		return isSystem;
	}

	public void setIsSystem(Character isSystem) {
		this.isSystem = isSystem;
	}

	@Column(name="ENABLED", length=1)
	public Character getEnabled() {
		return enabled;
	}

	public void setEnabled(Character enabled) {
		this.enabled = enabled;
	}

	@Column(name="HAS_LOGGED_OUT", length=1)
	public Character getHasLoggedOut() {
		return hasLoggedOut;
	}

	public void setHasLoggedOut(Character hasLoggedOut) {
		this.hasLoggedOut = hasLoggedOut;
	}

	@Column(name = "REQUIRE_PASSWORD_CHANGE", length = 1)
	public Character getRequirePasswordChange() {
		return requirePasswordChange;
	}

	public void setRequirePasswordChange(Character requirePasswordChange) {
		this.requirePasswordChange = requirePasswordChange;
	}


	@Column(name = "LAST_CURRENCY_UOM", length = 20)
	public String getLastCurrencyUom() {
		return lastCurrencyUom;
	}

	public void setLastCurrencyUom(String lastCurrencyUom) {
		this.lastCurrencyUom = lastCurrencyUom;
	}

	@Column(name = "LAST_LOCALE", length = 10)
	public String getLastLocale() {
		return lastLocale;
	}

	 
	public void setLastLocale(String lastLocale) {
		this.lastLocale = lastLocale;
	}
	
	@Column(name = "LAST_TIME_ZONE", length = 60)
	public String getLastTimeZone() {
		return lastTimeZone;
	}

	public void setLastTimeZone(String lastTimeZone) {
		this.lastTimeZone = lastTimeZone;
	}

	@Temporal(TemporalType.TIMESTAMP)
    @Column(name="DISABLED_DATE_TIME", length = 19)
	public Date getDisabledDateTime() {
		return disabledDateTime;
	}

	public void setDisabledDateTime(Date disabledDateTime) {
		this.disabledDateTime = disabledDateTime;
	}

	@Column(name="UCCESSIVE_FAILED_LOGINS", precision=20, scale=0)
	public BigDecimal getSuccessiveFailedLogins() {
		return successiveFailedLogins;
	}

	public void setSuccessiveFailedLogins(BigDecimal successiveFailedLogins) {
		this.successiveFailedLogins = successiveFailedLogins;
	}


	@Column(name = "EXTERNAL_AUTH_ID", length = 250)
	public String getExternalAuthId() {
		return externalAuthId;
	}

	public void setExternalAuthId(String externalAuthId) {
		this.externalAuthId = externalAuthId;
	}

	@Column(name = "USER_LDAP_DN", length = 250)
	public String getUserLdapDn() {
		return userLdapDn;
	}

	public void setUserLdapDn(String userLdapDn) {
		this.userLdapDn = userLdapDn;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_UPDATED_STAMP", length = 19)
	public Date getLastUpdatedStamp() {
		return lastUpdatedStamp;
	}

	public void setLastUpdatedStamp(Date lastUpdatedStamp) {
		this.lastUpdatedStamp = lastUpdatedStamp;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_UPDATED_TX_STAMP", length = 19)
	public Date getLastUpdatedTxStamp() {
		return lastUpdatedTxStamp;
	}

	public void setLastUpdatedTxStamp(Date lastUpdatedTxStamp) {
		this.lastUpdatedTxStamp = lastUpdatedTxStamp;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_TX_STAMP", length = 19)
	public Date getCreatedTxStamp() {
		return createdTxStamp;
	}

	public void setCreatedTxStamp(Date createdTxStamp) {
		this.createdTxStamp = createdTxStamp;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_STAMP", length = 19)
	public Date getCreatedStamp() {
		return createdStamp;
	}

	public void setCreatedStamp(Date createdStamp) {
		this.createdStamp = createdStamp;
	}

	@Column(name="PARTY_ID",nullable=false , length=20)
	public String getPartyId() {
		return partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}
	
	
}
