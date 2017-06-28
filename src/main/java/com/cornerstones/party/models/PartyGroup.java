/*
 * Party Group Entity Classes
 */
package com.cornerstones.party.models;

/*
 * Author Jim Zhu
 * Date : 6/27/2017
 */


import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.Id;

@Entity
@Table(name="PARTY_GROUP")
public class PartyGroup {
	
@Id
@NotNull
@Column(name="PARTY_ID")
private String partyId;

@Column(name="GROUP_NAME")
private String groupName;

@Column(name="GROUP_NAME_LOCAL")
private String groupNameLocal;

@Column(name="OFFICE_SITE_NAME")
private String officeSiteName;

@Column(name="ANNUAL_REVENUE")
private double annualRevenue;

@Column(name="NUM_EMPLOYEES")
private int numEmployees;

@Column(name="TICKET_SYMBOL")
private String ticketSymbol;

@Column(name="COMMENTS")
private String comments;

@Column(name="LOGO_IMAGE_URL")
private String logoImageURL;

@Column (name="LAST_UPDATED_STAMP")
private Timestamp lastUpdatedStamp;

@Column(name="LAST_UPDATED_TX_STAMP")
private Timestamp lastUpdatedTXStamp;


public String getPartyId() {
	return partyId;
}

public void setPartyId(String partyId) {
	this.partyId = partyId;
}

public String getGroupName() {
	return groupName;
}

public void setGroupName(String groupName) {
	this.groupName = groupName;
}

public String getGroupNameLocal() {
	return groupNameLocal;
}

public void setGroupNameLocal(String groupNameLocal) {
	this.groupNameLocal = groupNameLocal;
}

public String getOfficeSiteName() {
	return officeSiteName;
}

public void setOfficeSiteName(String officeSiteName) {
	this.officeSiteName = officeSiteName;
}

public double getAnnualRevenue() {
	return annualRevenue;
}

public void setAnnualRevenue(double annualRevenue) {
	this.annualRevenue = annualRevenue;
}

public int getNumEmployees() {
	return numEmployees;
}

public void setNumEmployees(int numEmployees) {
	this.numEmployees = numEmployees;
}

public String getTicketSymbol() {
	return ticketSymbol;
}

public void setTicketSymbol(String ticketSymbol) {
	this.ticketSymbol = ticketSymbol;
}

public String getComments() {
	return comments;
}

public void setComments(String comments) {
	this.comments = comments;
}

public String getLogoImageURL() {
	return logoImageURL;
}

public void setLogoImageURL(String logoImageURL) {
	this.logoImageURL = logoImageURL;
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

@Column (name="CREATED_STAMP")
private Timestamp createdStamp;

@Column (name="CREATED_TX_STAMP")
private Timestamp createdTxStamp;


	
}
