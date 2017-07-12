package com.cornerstones.contacts.models;
// Generated Jul 1, 2017 4:29:21 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ContactListCommStatusId generated by hbm2java
 */
@Embeddable
public class ContactListCommStatusId implements java.io.Serializable {

	private String contactListId;
	private String communicationEventId;
	private String contactMechId;

	public ContactListCommStatusId() {
	}

	public ContactListCommStatusId(String contactListId, String communicationEventId, String contactMechId) {
		this.contactListId = contactListId;
		this.communicationEventId = communicationEventId;
		this.contactMechId = contactMechId;
	}

	@Column(name = "CONTACT_LIST_ID", nullable = false, length = 20)
	public String getContactListId() {
		return this.contactListId;
	}

	public void setContactListId(String contactListId) {
		this.contactListId = contactListId;
	}

	@Column(name = "COMMUNICATION_EVENT_ID", nullable = false, length = 20)
	public String getCommunicationEventId() {
		return this.communicationEventId;
	}

	public void setCommunicationEventId(String communicationEventId) {
		this.communicationEventId = communicationEventId;
	}

	@Column(name = "CONTACT_MECH_ID", nullable = false, length = 20)
	public String getContactMechId() {
		return this.contactMechId;
	}

	public void setContactMechId(String contactMechId) {
		this.contactMechId = contactMechId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ContactListCommStatusId))
			return false;
		ContactListCommStatusId castOther = (ContactListCommStatusId) other;

		return ((this.getContactListId() == castOther.getContactListId())
				|| (this.getContactListId() != null && castOther.getContactListId() != null
						&& this.getContactListId().equals(castOther.getContactListId())))
				&& ((this.getCommunicationEventId() == castOther.getCommunicationEventId())
						|| (this.getCommunicationEventId() != null && castOther.getCommunicationEventId() != null
								&& this.getCommunicationEventId().equals(castOther.getCommunicationEventId())))
				&& ((this.getContactMechId() == castOther.getContactMechId())
						|| (this.getContactMechId() != null && castOther.getContactMechId() != null
								&& this.getContactMechId().equals(castOther.getContactMechId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getContactListId() == null ? 0 : this.getContactListId().hashCode());
		result = 37 * result + (getCommunicationEventId() == null ? 0 : this.getCommunicationEventId().hashCode());
		result = 37 * result + (getContactMechId() == null ? 0 : this.getContactMechId().hashCode());
		return result;
	}

}