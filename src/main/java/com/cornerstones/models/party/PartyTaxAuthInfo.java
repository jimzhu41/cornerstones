package com.cornerstones.models.party;
// Generated Jul 1, 2017 4:29:21 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PartyTaxAuthInfo generated by hbm2java
 */
@Entity
@Table(name = "PARTY_TAX_AUTH_INFO", catalog = "ofbiz")
public class PartyTaxAuthInfo implements java.io.Serializable {

	private PartyTaxAuthInfoId id;
	private Date thruDate;
	private String partyTaxId;
	private Character isExempt;
	private Character isNexus;
	private Date lastUpdatedStamp;
	private Date lastUpdatedTxStamp;
	private Date createdStamp;
	private Date createdTxStamp;

	public PartyTaxAuthInfo() {
	}

	public PartyTaxAuthInfo(PartyTaxAuthInfoId id) {
		this.id = id;
	}

	public PartyTaxAuthInfo(PartyTaxAuthInfoId id, Date thruDate, String partyTaxId, Character isExempt,
			Character isNexus, Date lastUpdatedStamp, Date lastUpdatedTxStamp, Date createdStamp, Date createdTxStamp) {
		this.id = id;
		this.thruDate = thruDate;
		this.partyTaxId = partyTaxId;
		this.isExempt = isExempt;
		this.isNexus = isNexus;
		this.lastUpdatedStamp = lastUpdatedStamp;
		this.lastUpdatedTxStamp = lastUpdatedTxStamp;
		this.createdStamp = createdStamp;
		this.createdTxStamp = createdTxStamp;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "partyId", column = @Column(name = "PARTY_ID", nullable = false, length = 20) ),
			@AttributeOverride(name = "taxAuthGeoId", column = @Column(name = "TAX_AUTH_GEO_ID", nullable = false, length = 20) ),
			@AttributeOverride(name = "taxAuthPartyId", column = @Column(name = "TAX_AUTH_PARTY_ID", nullable = false, length = 20) ),
			@AttributeOverride(name = "fromDate", column = @Column(name = "FROM_DATE", nullable = false, length = 19) ) })
	public PartyTaxAuthInfoId getId() {
		return this.id;
	}

	public void setId(PartyTaxAuthInfoId id) {
		this.id = id;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "THRU_DATE", length = 19)
	public Date getThruDate() {
		return this.thruDate;
	}

	public void setThruDate(Date thruDate) {
		this.thruDate = thruDate;
	}

	@Column(name = "PARTY_TAX_ID", length = 60)
	public String getPartyTaxId() {
		return this.partyTaxId;
	}

	public void setPartyTaxId(String partyTaxId) {
		this.partyTaxId = partyTaxId;
	}

	@Column(name = "IS_EXEMPT", length = 1)
	public Character getIsExempt() {
		return this.isExempt;
	}

	public void setIsExempt(Character isExempt) {
		this.isExempt = isExempt;
	}

	@Column(name = "IS_NEXUS", length = 1)
	public Character getIsNexus() {
		return this.isNexus;
	}

	public void setIsNexus(Character isNexus) {
		this.isNexus = isNexus;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_UPDATED_STAMP", length = 19)
	public Date getLastUpdatedStamp() {
		return this.lastUpdatedStamp;
	}

	public void setLastUpdatedStamp(Date lastUpdatedStamp) {
		this.lastUpdatedStamp = lastUpdatedStamp;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_UPDATED_TX_STAMP", length = 19)
	public Date getLastUpdatedTxStamp() {
		return this.lastUpdatedTxStamp;
	}

	public void setLastUpdatedTxStamp(Date lastUpdatedTxStamp) {
		this.lastUpdatedTxStamp = lastUpdatedTxStamp;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_STAMP", length = 19)
	public Date getCreatedStamp() {
		return this.createdStamp;
	}

	public void setCreatedStamp(Date createdStamp) {
		this.createdStamp = createdStamp;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_TX_STAMP", length = 19)
	public Date getCreatedTxStamp() {
		return this.createdTxStamp;
	}

	public void setCreatedTxStamp(Date createdTxStamp) {
		this.createdTxStamp = createdTxStamp;
	}

}