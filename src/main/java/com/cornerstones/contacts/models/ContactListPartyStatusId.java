package com.cornerstones.contacts.models;
// Generated Jul 1, 2017 4:29:21 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ContactListPartyStatusId generated by hbm2java
 */
@Embeddable
public class ContactListPartyStatusId implements java.io.Serializable {

	private String contactListId;
	private String partyId;
	private Date fromDate;
	private Date statusDate;

	public ContactListPartyStatusId() {
	}

	public ContactListPartyStatusId(String contactListId, String partyId, Date fromDate, Date statusDate) {
		this.contactListId = contactListId;
		this.partyId = partyId;
		this.fromDate = fromDate;
		this.statusDate = statusDate;
	}

	@Column(name = "CONTACT_LIST_ID", nullable = false, length = 20)
	public String getContactListId() {
		return this.contactListId;
	}

	public void setContactListId(String contactListId) {
		this.contactListId = contactListId;
	}

	@Column(name = "PARTY_ID", nullable = false, length = 20)
	public String getPartyId() {
		return this.partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	@Column(name = "FROM_DATE", nullable = false, length = 19)
	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	@Column(name = "STATUS_DATE", nullable = false, length = 19)
	public Date getStatusDate() {
		return this.statusDate;
	}

	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ContactListPartyStatusId))
			return false;
		ContactListPartyStatusId castOther = (ContactListPartyStatusId) other;

		return ((this.getContactListId() == castOther.getContactListId())
				|| (this.getContactListId() != null && castOther.getContactListId() != null
						&& this.getContactListId().equals(castOther.getContactListId())))
				&& ((this.getPartyId() == castOther.getPartyId()) || (this.getPartyId() != null
						&& castOther.getPartyId() != null && this.getPartyId().equals(castOther.getPartyId())))
				&& ((this.getFromDate() == castOther.getFromDate()) || (this.getFromDate() != null
						&& castOther.getFromDate() != null && this.getFromDate().equals(castOther.getFromDate())))
				&& ((this.getStatusDate() == castOther.getStatusDate())
						|| (this.getStatusDate() != null && castOther.getStatusDate() != null
								&& this.getStatusDate().equals(castOther.getStatusDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getContactListId() == null ? 0 : this.getContactListId().hashCode());
		result = 37 * result + (getPartyId() == null ? 0 : this.getPartyId().hashCode());
		result = 37 * result + (getFromDate() == null ? 0 : this.getFromDate().hashCode());
		result = 37 * result + (getStatusDate() == null ? 0 : this.getStatusDate().hashCode());
		return result;
	}

}
