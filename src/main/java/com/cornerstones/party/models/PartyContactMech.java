package com.cornerstones.party.models;
/**
 *  PARTY_CONTACT_MECH Entity
 */

/**
 * @author jimzhu
 * Date : -6-27-2017
 */


import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.Column;
import javax.persistence.Id;


@Entity
@Table(name="PARTY_CONTACT_MECH")
public class PartyContactMech {
	
	@Id
	@Column(name="PARTY_ID", nullable=false)
	private String partyId;
	
	@Column(name="CONTACT_MECH_ID", nullable=false)
	private String contactMechId;
	
	@Column(name="FROM_DATE", nullable=false)
	private Date fromDate;
	
	@Column(name="THRU_DATE")
	private Date thruDate;
	
	@Column(name="ROLE_TYPE_ID")
	private String roleTypeId;
	
	@Column(name="ALLOW_SOLICITATION")
	private char allowSolicitation;
	
	@Column(name="EXTENSION")
	private String extension;
	
	@Column(name="VERIFIED")
	private char verfied;
	
	@Column(name="COMMENTS")
	private String comments;
	
	@Column(name="YEARS_WITH_CONTACT_MECH")
	private double yearsWithComtactMech;
	
	@Column(name="MONTHS_WITH_CONTACT_MECH")
	private double monthesWithContactMech;
	
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

	public String getContactMechId() {
		return contactMechId;
	}

	public void setContactMechId(String contactMechId) {
		this.contactMechId = contactMechId;
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

	public String getRoleTypeId() {
		return roleTypeId;
	}

	public void setRoleTypeId(String roleTypeId) {
		this.roleTypeId = roleTypeId;
	}

	public char getAllowSolicitation() {
		return allowSolicitation;
	}

	public void setAllowSolicitation(char allowSolicitation) {
		this.allowSolicitation = allowSolicitation;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public char getVerfied() {
		return verfied;
	}

	public void setVerfied(char verfied) {
		this.verfied = verfied;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public double getYearsWithComtactMech() {
		return yearsWithComtactMech;
	}

	public void setYearsWithComtactMech(double yearsWithComtactMech) {
		this.yearsWithComtactMech = yearsWithComtactMech;
	}

	public double getMonthesWithContactMech() {
		return monthesWithContactMech;
	}

	public void setMonthesWithContactMech(double monthesWithContactMech) {
		this.monthesWithContactMech = monthesWithContactMech;
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
