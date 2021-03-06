package com.cornerstones.contacts.models;
// Generated Jul 1, 2017 4:29:21 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ContactMechLinkId generated by hbm2java
 */
@Embeddable
public class ContactMechLinkId implements java.io.Serializable {

	private String contactMechIdFrom;
	private String contactMechIdTo;

	public ContactMechLinkId() {
	}

	public ContactMechLinkId(String contactMechIdFrom, String contactMechIdTo) {
		this.contactMechIdFrom = contactMechIdFrom;
		this.contactMechIdTo = contactMechIdTo;
	}

	@Column(name = "CONTACT_MECH_ID_FROM", nullable = false, length = 20)
	public String getContactMechIdFrom() {
		return this.contactMechIdFrom;
	}

	public void setContactMechIdFrom(String contactMechIdFrom) {
		this.contactMechIdFrom = contactMechIdFrom;
	}

	@Column(name = "CONTACT_MECH_ID_TO", nullable = false, length = 20)
	public String getContactMechIdTo() {
		return this.contactMechIdTo;
	}

	public void setContactMechIdTo(String contactMechIdTo) {
		this.contactMechIdTo = contactMechIdTo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ContactMechLinkId))
			return false;
		ContactMechLinkId castOther = (ContactMechLinkId) other;

		return ((this.getContactMechIdFrom() == castOther.getContactMechIdFrom())
				|| (this.getContactMechIdFrom() != null && castOther.getContactMechIdFrom() != null
						&& this.getContactMechIdFrom().equals(castOther.getContactMechIdFrom())))
				&& ((this.getContactMechIdTo() == castOther.getContactMechIdTo())
						|| (this.getContactMechIdTo() != null && castOther.getContactMechIdTo() != null
								&& this.getContactMechIdTo().equals(castOther.getContactMechIdTo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getContactMechIdFrom() == null ? 0 : this.getContactMechIdFrom().hashCode());
		result = 37 * result + (getContactMechIdTo() == null ? 0 : this.getContactMechIdTo().hashCode());
		return result;
	}

}
