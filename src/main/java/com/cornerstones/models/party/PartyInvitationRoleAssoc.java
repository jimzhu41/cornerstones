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
 * PartyInvitationRoleAssoc generated by hbm2java
 */
@Entity
@Table(name = "PARTY_INVITATION_ROLE_ASSOC", catalog = "ofbiz")
public class PartyInvitationRoleAssoc implements java.io.Serializable {

	private PartyInvitationRoleAssocId id;
	private Date lastUpdatedStamp;
	private Date lastUpdatedTxStamp;
	private Date createdStamp;
	private Date createdTxStamp;

	public PartyInvitationRoleAssoc() {
	}

	public PartyInvitationRoleAssoc(PartyInvitationRoleAssocId id) {
		this.id = id;
	}

	public PartyInvitationRoleAssoc(PartyInvitationRoleAssocId id, Date lastUpdatedStamp, Date lastUpdatedTxStamp,
			Date createdStamp, Date createdTxStamp) {
		this.id = id;
		this.lastUpdatedStamp = lastUpdatedStamp;
		this.lastUpdatedTxStamp = lastUpdatedTxStamp;
		this.createdStamp = createdStamp;
		this.createdTxStamp = createdTxStamp;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "partyInvitationId", column = @Column(name = "PARTY_INVITATION_ID", nullable = false, length = 20) ),
			@AttributeOverride(name = "roleTypeId", column = @Column(name = "ROLE_TYPE_ID", nullable = false, length = 20) ) })
	public PartyInvitationRoleAssocId getId() {
		return this.id;
	}

	public void setId(PartyInvitationRoleAssocId id) {
		this.id = id;
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
