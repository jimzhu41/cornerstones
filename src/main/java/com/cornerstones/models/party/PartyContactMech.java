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
 * PartyContactMech generated by hbm2java
 */
@Entity
@Table(name = "PARTY_CONTACT_MECH", catalog = "ofbiz")
public class PartyContactMech implements java.io.Serializable {

	private PartyContactMechId id;
	private Date thruDate;
	private String roleTypeId;
	private Character allowSolicitation;
	private String extension;
	private Character verified;
	private String comments;
	private BigDecimal yearsWithContactMech;
	private BigDecimal monthsWithContactMech;
	private Date lastUpdatedStamp;
	private Date lastUpdatedTxStamp;
	private Date createdStamp;
	private Date createdTxStamp;

	public PartyContactMech() {
	}

	public PartyContactMech(PartyContactMechId id) {
		this.id = id;
	}

	public PartyContactMech(PartyContactMechId id, Date thruDate, String roleTypeId, Character allowSolicitation,
			String extension, Character verified, String comments, BigDecimal yearsWithContactMech,
			BigDecimal monthsWithContactMech, Date lastUpdatedStamp, Date lastUpdatedTxStamp, Date createdStamp,
			Date createdTxStamp) {
		this.id = id;
		this.thruDate = thruDate;
		this.roleTypeId = roleTypeId;
		this.allowSolicitation = allowSolicitation;
		this.extension = extension;
		this.verified = verified;
		this.comments = comments;
		this.yearsWithContactMech = yearsWithContactMech;
		this.monthsWithContactMech = monthsWithContactMech;
		this.lastUpdatedStamp = lastUpdatedStamp;
		this.lastUpdatedTxStamp = lastUpdatedTxStamp;
		this.createdStamp = createdStamp;
		this.createdTxStamp = createdTxStamp;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "partyId", column = @Column(name = "PARTY_ID", nullable = false, length = 20) ),
			@AttributeOverride(name = "contactMechId", column = @Column(name = "CONTACT_MECH_ID", nullable = false, length = 20) ),
			@AttributeOverride(name = "fromDate", column = @Column(name = "FROM_DATE", nullable = false, length = 19) ) })
	public PartyContactMechId getId() {
		return this.id;
	}

	public void setId(PartyContactMechId id) {
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

	@Column(name = "ROLE_TYPE_ID", length = 20)
	public String getRoleTypeId() {
		return this.roleTypeId;
	}

	public void setRoleTypeId(String roleTypeId) {
		this.roleTypeId = roleTypeId;
	}

	@Column(name = "ALLOW_SOLICITATION", length = 1)
	public Character getAllowSolicitation() {
		return this.allowSolicitation;
	}

	public void setAllowSolicitation(Character allowSolicitation) {
		this.allowSolicitation = allowSolicitation;
	}

	@Column(name = "EXTENSION")
	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	@Column(name = "VERIFIED", length = 1)
	public Character getVerified() {
		return this.verified;
	}

	public void setVerified(Character verified) {
		this.verified = verified;
	}

	@Column(name = "COMMENTS")
	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Column(name = "YEARS_WITH_CONTACT_MECH", precision = 20, scale = 0)
	public BigDecimal getYearsWithContactMech() {
		return this.yearsWithContactMech;
	}

	public void setYearsWithContactMech(BigDecimal yearsWithContactMech) {
		this.yearsWithContactMech = yearsWithContactMech;
	}

	@Column(name = "MONTHS_WITH_CONTACT_MECH", precision = 20, scale = 0)
	public BigDecimal getMonthsWithContactMech() {
		return this.monthsWithContactMech;
	}

	public void setMonthsWithContactMech(BigDecimal monthsWithContactMech) {
		this.monthsWithContactMech = monthsWithContactMech;
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