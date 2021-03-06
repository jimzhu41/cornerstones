package com.cornerstones.contacts.models;
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
import javax.persistence.UniqueConstraint;

/**
 * ContactListCommStatus generated by hbm2java
 */
@Entity
@Table(name = "CONTACT_LIST_COMM_STATUS", catalog = "ofbiz", uniqueConstraints = @UniqueConstraint(columnNames = "MESSAGE_ID") )
public class ContactListCommStatus implements java.io.Serializable {

	private ContactListCommStatusId id;
	private String partyId;
	private String messageId;
	private String statusId;
	private Date lastUpdatedStamp;
	private Date lastUpdatedTxStamp;
	private Date createdStamp;
	private Date createdTxStamp;

	public ContactListCommStatus() {
	}

	public ContactListCommStatus(ContactListCommStatusId id) {
		this.id = id;
	}

	public ContactListCommStatus(ContactListCommStatusId id, String partyId, String messageId, String statusId,
			Date lastUpdatedStamp, Date lastUpdatedTxStamp, Date createdStamp, Date createdTxStamp) {
		this.id = id;
		this.partyId = partyId;
		this.messageId = messageId;
		this.statusId = statusId;
		this.lastUpdatedStamp = lastUpdatedStamp;
		this.lastUpdatedTxStamp = lastUpdatedTxStamp;
		this.createdStamp = createdStamp;
		this.createdTxStamp = createdTxStamp;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "contactListId", column = @Column(name = "CONTACT_LIST_ID", nullable = false, length = 20) ),
			@AttributeOverride(name = "communicationEventId", column = @Column(name = "COMMUNICATION_EVENT_ID", nullable = false, length = 20) ),
			@AttributeOverride(name = "contactMechId", column = @Column(name = "CONTACT_MECH_ID", nullable = false, length = 20) ) })
	public ContactListCommStatusId getId() {
		return this.id;
	}

	public void setId(ContactListCommStatusId id) {
		this.id = id;
	}

	@Column(name = "PARTY_ID", length = 20)
	public String getPartyId() {
		return this.partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	@Column(name = "MESSAGE_ID", unique = true)
	public String getMessageId() {
		return this.messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	@Column(name = "STATUS_ID", length = 20)
	public String getStatusId() {
		return this.statusId;
	}

	public void setStatusId(String statusId) {
		this.statusId = statusId;
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
