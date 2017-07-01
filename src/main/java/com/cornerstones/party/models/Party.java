/**
 * party entity class
 */
package com.cornerstones.party.models;

/**
 * @author Jim Zhu
 *
 */

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
@Table(name="PARTY")
public class Party implements Serializable  {
	

@Id

@Column(name="PARTY_ID")
private String partyId;
@Column(name="PARTY_TYPE_ID")
private String partyTypeId;
@Column(name="EXTERNAL_ID")
private String externalId;
@Column(name="PREFERRED_CURRENCY_UOM_ID")
private String prefCurrencyUOMId;
@Column(name="DESCRIPTION")
private String description;
@Column(name="STATUS_ID")
private String statusId;
@Column(name="CREATED_DATE")
private Timestamp createdDate;
@Column(name="LAST_MODIFIED_DATE")
private Timestamp lastModDate;
@Column (name="CREATED_BY_USER_LOGIN")
private String createdByUserLogin;
@Column (name="LAST_MODIFIED_BY_USER_LOGIN")
private String lastModByuserLogin;
@Column (name="DATA_SOURCE_ID")
private String dataSourceId;
@Column (name="IS_UNREAD")
private String isUnread;
@Column (name="LAST_UPDATED_STAMP")
private Timestamp lastUpdatedStamp;
@Column(name="LAST_UPDATED_TX_STAMP")
private Timestamp lastUpdatedTXStamp;
@Column (name="CREATED_STAMP")
private Timestamp createdStamp;
@Column (name="CREATED_TX_STAMP")
private Timestamp createdTxStamp;
public String getPartyId() {
	return partyId;
}
public void setPartyId(String partyId) {
	this.partyId = partyId;
}
public String getPartyTypeId() {
	return partyTypeId;
}
public void setPartyTypeId(String partyTypeId) {
	this.partyTypeId = partyTypeId;
}
public String getExternalId() {
	return externalId;
}
public void setExternalId(String externalId) {
	this.externalId = externalId;
}
public String getPrefCurrencyUOMId() {
	return prefCurrencyUOMId;
}
public void setPrefCurrencyUOMId(String prefCurrencyUOMId) {
	this.prefCurrencyUOMId = prefCurrencyUOMId;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getStatusId() {
	return statusId;
}
public void setStatusId(String statusId) {
	this.statusId = statusId;
}
public Timestamp getCreatedDate() {
	return createdDate;
}
public void setCreatedDate(Timestamp createdDate) {
	this.createdDate = createdDate;
}
public String getCreatedByUserLogin() {
	return createdByUserLogin;
}
public void setCreatedByUserLogin(String createdByUserLogin) {
	this.createdByUserLogin = createdByUserLogin;
}
public String getLastModByuserLogin() {
	return lastModByuserLogin;
}


public Timestamp getLastModDate() {
	return lastModDate;
}
public void setLastModDate(Timestamp lastModDate) {
	this.lastModDate = lastModDate;
}
public void setLastModByuserLogin(String lastModByuserLogin) {
	this.lastModByuserLogin = lastModByuserLogin;
}
public String getDataSourceId() {
	return dataSourceId;
}
public void setDataSourceId(String dataSourceId) {
	this.dataSourceId = dataSourceId;
}
public String getIsUnread() {
	return isUnread;
}
public void setIsUnread(String isUnread) {
	this.isUnread = isUnread;
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
