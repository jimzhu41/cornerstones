package com.cornerstones.communications.models;
// Generated Jul 1, 2017 4:29:21 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * CommunicationEvent generated by hbm2java
 */
@Entity
@Table(name = "COMMUNICATION_EVENT", catalog = "ofbiz", uniqueConstraints = @UniqueConstraint(columnNames = "MESSAGE_ID") )
public class CommunicationEvent implements java.io.Serializable {

	private String communicationEventId;
	private String communicationEventTypeId;
	private String origCommEventId;
	private String parentCommEventId;
	private String statusId;
	private String contactMechTypeId;
	private String contactMechIdFrom;
	private String contactMechIdTo;
	private String roleTypeIdFrom;
	private String roleTypeIdTo;
	private String partyIdFrom;
	private String partyIdTo;
	private Date entryDate;
	private Date datetimeStarted;
	private Date datetimeEnded;
	private String subject;
	private String contentMimeTypeId;
	private String content;
	private String note;
	private String reasonEnumId;
	private String contactListId;
	private String headerString;
	private String fromString;
	private String toString;
	private String ccString;
	private String bccString;
	private String messageId;
	private Date lastUpdatedStamp;
	private Date lastUpdatedTxStamp;
	private Date createdStamp;
	private Date createdTxStamp;

	public CommunicationEvent() {
	}

	public CommunicationEvent(String communicationEventId) {
		this.communicationEventId = communicationEventId;
	}

	public CommunicationEvent(String communicationEventId, String communicationEventTypeId, String origCommEventId,
			String parentCommEventId, String statusId, String contactMechTypeId, String contactMechIdFrom,
			String contactMechIdTo, String roleTypeIdFrom, String roleTypeIdTo, String partyIdFrom, String partyIdTo,
			Date entryDate, Date datetimeStarted, Date datetimeEnded, String subject, String contentMimeTypeId,
			String content, String note, String reasonEnumId, String contactListId, String headerString,
			String fromString, String toString, String ccString, String bccString, String messageId,
			Date lastUpdatedStamp, Date lastUpdatedTxStamp, Date createdStamp, Date createdTxStamp) {
		this.communicationEventId = communicationEventId;
		this.communicationEventTypeId = communicationEventTypeId;
		this.origCommEventId = origCommEventId;
		this.parentCommEventId = parentCommEventId;
		this.statusId = statusId;
		this.contactMechTypeId = contactMechTypeId;
		this.contactMechIdFrom = contactMechIdFrom;
		this.contactMechIdTo = contactMechIdTo;
		this.roleTypeIdFrom = roleTypeIdFrom;
		this.roleTypeIdTo = roleTypeIdTo;
		this.partyIdFrom = partyIdFrom;
		this.partyIdTo = partyIdTo;
		this.entryDate = entryDate;
		this.datetimeStarted = datetimeStarted;
		this.datetimeEnded = datetimeEnded;
		this.subject = subject;
		this.contentMimeTypeId = contentMimeTypeId;
		this.content = content;
		this.note = note;
		this.reasonEnumId = reasonEnumId;
		this.contactListId = contactListId;
		this.headerString = headerString;
		this.fromString = fromString;
		this.toString = toString;
		this.ccString = ccString;
		this.bccString = bccString;
		this.messageId = messageId;
		this.lastUpdatedStamp = lastUpdatedStamp;
		this.lastUpdatedTxStamp = lastUpdatedTxStamp;
		this.createdStamp = createdStamp;
		this.createdTxStamp = createdTxStamp;
	}

	@Id

	@Column(name = "COMMUNICATION_EVENT_ID", unique = true, nullable = false, length = 20)
	public String getCommunicationEventId() {
		return this.communicationEventId;
	}

	public void setCommunicationEventId(String communicationEventId) {
		this.communicationEventId = communicationEventId;
	}

	@Column(name = "COMMUNICATION_EVENT_TYPE_ID", length = 20)
	public String getCommunicationEventTypeId() {
		return this.communicationEventTypeId;
	}

	public void setCommunicationEventTypeId(String communicationEventTypeId) {
		this.communicationEventTypeId = communicationEventTypeId;
	}

	@Column(name = "ORIG_COMM_EVENT_ID", length = 20)
	public String getOrigCommEventId() {
		return this.origCommEventId;
	}

	public void setOrigCommEventId(String origCommEventId) {
		this.origCommEventId = origCommEventId;
	}

	@Column(name = "PARENT_COMM_EVENT_ID", length = 20)
	public String getParentCommEventId() {
		return this.parentCommEventId;
	}

	public void setParentCommEventId(String parentCommEventId) {
		this.parentCommEventId = parentCommEventId;
	}

	@Column(name = "STATUS_ID", length = 20)
	public String getStatusId() {
		return this.statusId;
	}

	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}

	@Column(name = "CONTACT_MECH_TYPE_ID", length = 20)
	public String getContactMechTypeId() {
		return this.contactMechTypeId;
	}

	public void setContactMechTypeId(String contactMechTypeId) {
		this.contactMechTypeId = contactMechTypeId;
	}

	@Column(name = "CONTACT_MECH_ID_FROM", length = 20)
	public String getContactMechIdFrom() {
		return this.contactMechIdFrom;
	}

	public void setContactMechIdFrom(String contactMechIdFrom) {
		this.contactMechIdFrom = contactMechIdFrom;
	}

	@Column(name = "CONTACT_MECH_ID_TO", length = 20)
	public String getContactMechIdTo() {
		return this.contactMechIdTo;
	}

	public void setContactMechIdTo(String contactMechIdTo) {
		this.contactMechIdTo = contactMechIdTo;
	}

	@Column(name = "ROLE_TYPE_ID_FROM", length = 20)
	public String getRoleTypeIdFrom() {
		return this.roleTypeIdFrom;
	}

	public void setRoleTypeIdFrom(String roleTypeIdFrom) {
		this.roleTypeIdFrom = roleTypeIdFrom;
	}

	@Column(name = "ROLE_TYPE_ID_TO", length = 20)
	public String getRoleTypeIdTo() {
		return this.roleTypeIdTo;
	}

	public void setRoleTypeIdTo(String roleTypeIdTo) {
		this.roleTypeIdTo = roleTypeIdTo;
	}

	@Column(name = "PARTY_ID_FROM", length = 20)
	public String getPartyIdFrom() {
		return this.partyIdFrom;
	}

	public void setPartyIdFrom(String partyIdFrom) {
		this.partyIdFrom = partyIdFrom;
	}

	@Column(name = "PARTY_ID_TO", length = 20)
	public String getPartyIdTo() {
		return this.partyIdTo;
	}

	public void setPartyIdTo(String partyIdTo) {
		this.partyIdTo = partyIdTo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ENTRY_DATE", length = 19)
	public Date getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATETIME_STARTED", length = 19)
	public Date getDatetimeStarted() {
		return this.datetimeStarted;
	}

	public void setDatetimeStarted(Date datetimeStarted) {
		this.datetimeStarted = datetimeStarted;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATETIME_ENDED", length = 19)
	public Date getDatetimeEnded() {
		return this.datetimeEnded;
	}

	public void setDatetimeEnded(Date datetimeEnded) {
		this.datetimeEnded = datetimeEnded;
	}

	@Column(name = "SUBJECT")
	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Column(name = "CONTENT_MIME_TYPE_ID", length = 250)
	public String getContentMimeTypeId() {
		return this.contentMimeTypeId;
	}

	public void setContentMimeTypeId(String contentMimeTypeId) {
		this.contentMimeTypeId = contentMimeTypeId;
	}

	@Column(name = "CONTENT")
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "NOTE")
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Column(name = "REASON_ENUM_ID", length = 20)
	public String getReasonEnumId() {
		return this.reasonEnumId;
	}

	public void setReasonEnumId(String reasonEnumId) {
		this.reasonEnumId = reasonEnumId;
	}

	@Column(name = "CONTACT_LIST_ID", length = 20)
	public String getContactListId() {
		return this.contactListId;
	}

	public void setContactListId(String contactListId) {
		this.contactListId = contactListId;
	}

	@Column(name = "HEADER_STRING")
	public String getHeaderString() {
		return this.headerString;
	}

	public void setHeaderString(String headerString) {
		this.headerString = headerString;
	}

	@Column(name = "FROM_STRING")
	public String getFromString() {
		return this.fromString;
	}

	public void setFromString(String fromString) {
		this.fromString = fromString;
	}

	@Column(name = "TO_STRING")
	public String getToString() {
		return this.toString;
	}

	public void setToString(String toString) {
		this.toString = toString;
	}

	@Column(name = "CC_STRING")
	public String getCcString() {
		return this.ccString;
	}

	public void setCcString(String ccString) {
		this.ccString = ccString;
	}

	@Column(name = "BCC_STRING")
	public String getBccString() {
		return this.bccString;
	}

	public void setBccString(String bccString) {
		this.bccString = bccString;
	}

	@Column(name = "MESSAGE_ID", unique = true)
	public String getMessageId() {
		return this.messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
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
