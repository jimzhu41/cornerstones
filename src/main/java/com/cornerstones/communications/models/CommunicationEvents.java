/**
  * COMMUNICATION ENVET Entity
 * 
 */
package com.cornerstones.communications.models;

/**
 * @author jimzhu
 * @Since June-29-2017
 */

import java.io.Serializable;
import java.util.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table(name="COMMUNICATION_EVENT")
public class CommunicationEvents {
	
	@Id
	@Column(name="COMMUNICATION_EVENT_ID",nullable=false)
	private String commEventId;
	
	@Column(name="COMMUNICATION_EVENT_TYPE_ID")
	private String commEventTypeId;
	
	@Column(name="ORIG_COMM_EVENT_ID")
	private String origCOuuEventId;
	
	@Column(name="PARENT_COMM_EVENT_ID")
	private String parentCommEventId;
	
	@Column(name="STATUS_ID")
	private String statusId;
	
	@Column(name="CONTACT_MECH_TYPE_ID")
	private String contactMechTypeId;
	
	@Column(name="CONTACT_MECH_ID_FROM")
	private String contactmechIdFrom;
	
	@Column(name="CONTACT_MECH_ID_TO")
	private String contactmechIdTo;
	
	@Column(name="ROLE_TYPE_ID_FROM")
	private String roleTypeIdFrom;
	
	@Column(name="ROLE_TYPE_ID_TO")
	private String roleTypeIdTo;
	
	
	
	@Column(name="PARTY_ID_FROM")
	private String partyIdFrom;
	
	@Column(name="PARTY_ID_TO")
	private String partyIdTo;
	
	@Column(name="ENTRY_DATE")
	private Date entryDate;
	
	@Column(name="DATETIME_STARTED")
	private Date dateTimeStarted;
	
	@Column(name="DATETIME_ENDED")
	private Date dateTimeEnded;
	
	@Column(name="SUBJECT")
	private String subject;
	
	@Column(name="CONTENT_MIME_TYPE_ID")
	private String contentMimeTypeId;
	
	@Column(name="CONTENT")             
	private String content;
	
	@Column(name="NOTE")
	private String note;
	
	@Column(name="REASON_ENUM_ID")
	private String reasonEnumId;
	
	
	@Column(name="CONTACT_LIST_ID")
	private String contactListId;
	
	
	@Column(name="HEADER_STRING")
	private String headerString;
	
	@Column(name="FROM_STRING")
	private String fromString;
	
	@Column(name="TO_STRING")
	private String toString;
	

	@Column(name="CC_STRING")
	private String ccString;
	
	@Column(name="BCC_STRING")
	private String bccString;
	
	@Column(name="MESSAGE_ID")
	private String messageId;

	public String getCommEventId() {
		return commEventId;
	}

	public void setCommEventId(String commEventId) {
		this.commEventId = commEventId;
	}

	public String getCommEventTypeId() {
		return commEventTypeId;
	}

	public void setCommEventTypeId(String commEventTypeId) {
		this.commEventTypeId = commEventTypeId;
	}

	public String getOrigCOuuEventId() {
		return origCOuuEventId;
	}

	public void setOrigCOuuEventId(String origCOuuEventId) {
		this.origCOuuEventId = origCOuuEventId;
	}

	public String getParentCommEventId() {
		return parentCommEventId;
	}

	public void setParentCommEventId(String parentCommEventId) {
		this.parentCommEventId = parentCommEventId;
	}

	public String getStatusId() {
		return statusId;
	}

	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}

	public String getContactMechTypeId() {
		return contactMechTypeId;
	}

	public void setContactMechTypeId(String contactMechTypeId) {
		this.contactMechTypeId = contactMechTypeId;
	}

	public String getContactmechIdFrom() {
		return contactmechIdFrom;
	}

	public void setContactmechIdFrom(String contactmechIdFrom) {
		this.contactmechIdFrom = contactmechIdFrom;
	}

	public String getContactmechIdTo() {
		return contactmechIdTo;
	}

	public void setContactmechIdTo(String contactmechIdTo) {
		this.contactmechIdTo = contactmechIdTo;
	}

	public String getRoleTypeIdFrom() {
		return roleTypeIdFrom;
	}

	public void setRoleTypeIdFrom(String roleTypeIdFrom) {
		this.roleTypeIdFrom = roleTypeIdFrom;
	}

	public String getRoleTypeIdTo() {
		return roleTypeIdTo;
	}

	public void setRoleTypeIdTo(String roleTypeIdTo) {
		this.roleTypeIdTo = roleTypeIdTo;
	}

	public String getPartyIdFrom() {
		return partyIdFrom;
	}

	public void setPartyIdFrom(String partyIdFrom) {
		this.partyIdFrom = partyIdFrom;
	}

	public String getPartyIdTo() {
		return partyIdTo;
	}

	public void setPartyIdTo(String partyIdTo) {
		this.partyIdTo = partyIdTo;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public Date getDateTimeStarted() {
		return dateTimeStarted;
	}

	public void setDateTimeStarted(Date dateTimeStarted) {
		this.dateTimeStarted = dateTimeStarted;
	}

	public Date getDateTimeEnded() {
		return dateTimeEnded;
	}

	public void setDateTimeEnded(Date dateTimeEnded) {
		this.dateTimeEnded = dateTimeEnded;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContentMimeTypeId() {
		return contentMimeTypeId;
	}

	public void setContentMimeTypeId(String contentMimeTypeId) {
		this.contentMimeTypeId = contentMimeTypeId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getReasonEnumId() {
		return reasonEnumId;
	}

	public void setReasonEnumId(String reasonEnumId) {
		this.reasonEnumId = reasonEnumId;
	}

	public String getContactListId() {
		return contactListId;
	}

	public void setContactListId(String contactListId) {
		this.contactListId = contactListId;
	}

	public String getHeaderString() {
		return headerString;
	}

	public void setHeaderString(String headerString) {
		this.headerString = headerString;
	}

	public String getFromString() {
		return fromString;
	}

	public void setFromString(String fromString) {
		this.fromString = fromString;
	}

	public String getToString() {
		return toString;
	}

	public void setToString(String toString) {
		this.toString = toString;
	}

	public String getCcString() {
		return ccString;
	}

	public void setCcString(String ccString) {
		this.ccString = ccString;
	}

	public String getBccString() {
		return bccString;
	}

	public void setBccString(String bccString) {
		this.bccString = bccString;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	
	
	

}
