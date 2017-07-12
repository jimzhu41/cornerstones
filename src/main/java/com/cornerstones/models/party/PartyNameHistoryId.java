package com.cornerstones.models.party;
// Generated Jul 1, 2017 4:29:21 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PartyNameHistoryId generated by hbm2java
 */
@Embeddable
public class PartyNameHistoryId implements java.io.Serializable {

	private String partyId;
	private Date changeDate;

	public PartyNameHistoryId() {
	}

	public PartyNameHistoryId(String partyId, Date changeDate) {
		this.partyId = partyId;
		this.changeDate = changeDate;
	}

	@Column(name = "PARTY_ID", nullable = false, length = 20)
	public String getPartyId() {
		return this.partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	@Column(name = "CHANGE_DATE", nullable = false, length = 19)
	public Date getChangeDate() {
		return this.changeDate;
	}

	public void setChangeDate(Date changeDate) {
		this.changeDate = changeDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PartyNameHistoryId))
			return false;
		PartyNameHistoryId castOther = (PartyNameHistoryId) other;

		return ((this.getPartyId() == castOther.getPartyId()) || (this.getPartyId() != null
				&& castOther.getPartyId() != null && this.getPartyId().equals(castOther.getPartyId())))
				&& ((this.getChangeDate() == castOther.getChangeDate())
						|| (this.getChangeDate() != null && castOther.getChangeDate() != null
								&& this.getChangeDate().equals(castOther.getChangeDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getPartyId() == null ? 0 : this.getPartyId().hashCode());
		result = 37 * result + (getChangeDate() == null ? 0 : this.getChangeDate().hashCode());
		return result;
	}

}