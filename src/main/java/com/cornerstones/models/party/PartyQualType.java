package com.cornerstones.models.party;
// Generated Jul 1, 2017 4:29:21 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PartyQualType generated by hbm2java
 */
@Entity
@Table(name = "PARTY_QUAL_TYPE", catalog = "ofbiz")
public class PartyQualType implements java.io.Serializable {

	private String partyQualTypeId;
	private String parentTypeId;
	private Character hasTable;
	private String description;
	private Date lastUpdatedStamp;
	private Date lastUpdatedTxStamp;
	private Date createdStamp;
	private Date createdTxStamp;

	public PartyQualType() {
	}

	public PartyQualType(String partyQualTypeId) {
		this.partyQualTypeId = partyQualTypeId;
	}

	public PartyQualType(String partyQualTypeId, String parentTypeId, Character hasTable, String description,
			Date lastUpdatedStamp, Date lastUpdatedTxStamp, Date createdStamp, Date createdTxStamp) {
		this.partyQualTypeId = partyQualTypeId;
		this.parentTypeId = parentTypeId;
		this.hasTable = hasTable;
		this.description = description;
		this.lastUpdatedStamp = lastUpdatedStamp;
		this.lastUpdatedTxStamp = lastUpdatedTxStamp;
		this.createdStamp = createdStamp;
		this.createdTxStamp = createdTxStamp;
	}

	@Id

	@Column(name = "PARTY_QUAL_TYPE_ID", unique = true, nullable = false, length = 20)
	public String getPartyQualTypeId() {
		return this.partyQualTypeId;
	}

	public void setPartyQualTypeId(String partyQualTypeId) {
		this.partyQualTypeId = partyQualTypeId;
	}

	@Column(name = "PARENT_TYPE_ID", length = 20)
	public String getParentTypeId() {
		return this.parentTypeId;
	}

	public void setParentTypeId(String parentTypeId) {
		this.parentTypeId = parentTypeId;
	}

	@Column(name = "HAS_TABLE", length = 1)
	public Character getHasTable() {
		return this.hasTable;
	}

	public void setHasTable(Character hasTable) {
		this.hasTable = hasTable;
	}

	@Column(name = "DESCRIPTION")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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
