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
 * PartyRateNew generated by hbm2java
 */
@Entity
@Table(name = "PARTY_RATE_NEW", catalog = "ofbiz")
public class PartyRateNew implements java.io.Serializable {

	private PartyRateNewId id;
	private Character defaultRate;
	private Double percentageUsed;
	private Date thruDate;
	private Date lastUpdatedStamp;
	private Date lastUpdatedTxStamp;
	private Date createdStamp;
	private Date createdTxStamp;

	public PartyRateNew() {
	}

	public PartyRateNew(PartyRateNewId id) {
		this.id = id;
	}

	public PartyRateNew(PartyRateNewId id, Character defaultRate, Double percentageUsed, Date thruDate,
			Date lastUpdatedStamp, Date lastUpdatedTxStamp, Date createdStamp, Date createdTxStamp) {
		this.id = id;
		this.defaultRate = defaultRate;
		this.percentageUsed = percentageUsed;
		this.thruDate = thruDate;
		this.lastUpdatedStamp = lastUpdatedStamp;
		this.lastUpdatedTxStamp = lastUpdatedTxStamp;
		this.createdStamp = createdStamp;
		this.createdTxStamp = createdTxStamp;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "partyId", column = @Column(name = "PARTY_ID", nullable = false, length = 20) ),
			@AttributeOverride(name = "rateTypeId", column = @Column(name = "RATE_TYPE_ID", nullable = false, length = 20) ),
			@AttributeOverride(name = "fromDate", column = @Column(name = "FROM_DATE", nullable = false, length = 19) ) })
	public PartyRateNewId getId() {
		return this.id;
	}

	public void setId(PartyRateNewId id) {
		this.id = id;
	}

	@Column(name = "DEFAULT_RATE", length = 1)
	public Character getDefaultRate() {
		return this.defaultRate;
	}

	public void setDefaultRate(Character defaultRate) {
		this.defaultRate = defaultRate;
	}

	@Column(name = "PERCENTAGE_USED", precision = 22, scale = 0)
	public Double getPercentageUsed() {
		return this.percentageUsed;
	}

	public void setPercentageUsed(Double percentageUsed) {
		this.percentageUsed = percentageUsed;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "THRU_DATE", length = 19)
	public Date getThruDate() {
		return this.thruDate;
	}

	public void setThruDate(Date thruDate) {
		this.thruDate = thruDate;
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
