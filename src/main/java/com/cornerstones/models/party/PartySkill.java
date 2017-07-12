package com.cornerstones.models.party;
// Generated Jul 1, 2017 4:29:21 PM by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
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
 * PartySkill generated by hbm2java
 */
@Entity
@Table(name = "PARTY_SKILL", catalog = "ofbiz")
public class PartySkill implements java.io.Serializable {

	private PartySkillId id;
	private BigDecimal yearsExperience;
	private BigDecimal rating;
	private BigDecimal skillLevel;
	private Date startedUsingDate;
	private Date lastUpdatedStamp;
	private Date lastUpdatedTxStamp;
	private Date createdStamp;
	private Date createdTxStamp;

	public PartySkill() {
	}

	public PartySkill(PartySkillId id) {
		this.id = id;
	}

	public PartySkill(PartySkillId id, BigDecimal yearsExperience, BigDecimal rating, BigDecimal skillLevel,
			Date startedUsingDate, Date lastUpdatedStamp, Date lastUpdatedTxStamp, Date createdStamp,
			Date createdTxStamp) {
		this.id = id;
		this.yearsExperience = yearsExperience;
		this.rating = rating;
		this.skillLevel = skillLevel;
		this.startedUsingDate = startedUsingDate;
		this.lastUpdatedStamp = lastUpdatedStamp;
		this.lastUpdatedTxStamp = lastUpdatedTxStamp;
		this.createdStamp = createdStamp;
		this.createdTxStamp = createdTxStamp;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "partyId", column = @Column(name = "PARTY_ID", nullable = false, length = 20) ),
			@AttributeOverride(name = "skillTypeId", column = @Column(name = "SKILL_TYPE_ID", nullable = false, length = 20) ) })
	public PartySkillId getId() {
		return this.id;
	}

	public void setId(PartySkillId id) {
		this.id = id;
	}

	@Column(name = "YEARS_EXPERIENCE", precision = 20, scale = 0)
	public BigDecimal getYearsExperience() {
		return this.yearsExperience;
	}

	public void setYearsExperience(BigDecimal yearsExperience) {
		this.yearsExperience = yearsExperience;
	}

	@Column(name = "RATING", precision = 20, scale = 0)
	public BigDecimal getRating() {
		return this.rating;
	}

	public void setRating(BigDecimal rating) {
		this.rating = rating;
	}

	@Column(name = "SKILL_LEVEL", precision = 20, scale = 0)
	public BigDecimal getSkillLevel() {
		return this.skillLevel;
	}

	public void setSkillLevel(BigDecimal skillLevel) {
		this.skillLevel = skillLevel;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "STARTED_USING_DATE", length = 19)
	public Date getStartedUsingDate() {
		return this.startedUsingDate;
	}

	public void setStartedUsingDate(Date startedUsingDate) {
		this.startedUsingDate = startedUsingDate;
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