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
 * PartyFixedAssetAssignment generated by hbm2java
 */
@Entity
@Table(name = "PARTY_FIXED_ASSET_ASSIGNMENT", catalog = "ofbiz")
public class PartyFixedAssetAssignment implements java.io.Serializable {

	private PartyFixedAssetAssignmentId id;
	private Date thruDate;
	private Date allocatedDate;
	private String statusId;
	private String comments;
	private Date lastUpdatedStamp;
	private Date lastUpdatedTxStamp;
	private Date createdStamp;
	private Date createdTxStamp;

	public PartyFixedAssetAssignment() {
	}

	public PartyFixedAssetAssignment(PartyFixedAssetAssignmentId id) {
		this.id = id;
	}

	public PartyFixedAssetAssignment(PartyFixedAssetAssignmentId id, Date thruDate, Date allocatedDate, String statusId,
			String comments, Date lastUpdatedStamp, Date lastUpdatedTxStamp, Date createdStamp, Date createdTxStamp) {
		this.id = id;
		this.thruDate = thruDate;
		this.allocatedDate = allocatedDate;
		this.statusId = statusId;
		this.comments = comments;
		this.lastUpdatedStamp = lastUpdatedStamp;
		this.lastUpdatedTxStamp = lastUpdatedTxStamp;
		this.createdStamp = createdStamp;
		this.createdTxStamp = createdTxStamp;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "partyId", column = @Column(name = "PARTY_ID", nullable = false, length = 20) ),
			@AttributeOverride(name = "roleTypeId", column = @Column(name = "ROLE_TYPE_ID", nullable = false, length = 20) ),
			@AttributeOverride(name = "fixedAssetId", column = @Column(name = "FIXED_ASSET_ID", nullable = false, length = 20) ),
			@AttributeOverride(name = "fromDate", column = @Column(name = "FROM_DATE", nullable = false, length = 19) ) })
	public PartyFixedAssetAssignmentId getId() {
		return this.id;
	}

	public void setId(PartyFixedAssetAssignmentId id) {
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALLOCATED_DATE", length = 19)
	public Date getAllocatedDate() {
		return this.allocatedDate;
	}

	public void setAllocatedDate(Date allocatedDate) {
		this.allocatedDate = allocatedDate;
	}

	@Column(name = "STATUS_ID", length = 20)
	public String getStatusId() {
		return this.statusId;
	}

	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}

	@Column(name = "COMMENTS")
	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
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
