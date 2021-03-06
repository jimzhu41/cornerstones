package com.cornerstones.models.party;
// Generated Jul 1, 2017 4:29:21 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PartyQualId generated by hbm2java
 */
@Embeddable
public class PartyQualId implements java.io.Serializable {

	private String partyId;
	private String partyQualTypeId;
	private Date fromDate;

	public PartyQualId() {
	}

	public PartyQualId(String partyId, String partyQualTypeId, Date fromDate) {
		this.partyId = partyId;
		this.partyQualTypeId = partyQualTypeId;
		this.fromDate = fromDate;
	}

	@Column(name = "PARTY_ID", nullable = false, length = 20)
	public String getPartyId() {
		return this.partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	@Column(name = "PARTY_QUAL_TYPE_ID", nullable = false, length = 20)
	public String getPartyQualTypeId() {
		return this.partyQualTypeId;
	}

	public void setPartyQualTypeId(String partyQualTypeId) {
		this.partyQualTypeId = partyQualTypeId;
	}

	@Column(name = "FROM_DATE", nullable = false, length = 19)
	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PartyQualId))
			return false;
		PartyQualId castOther = (PartyQualId) other;

		return ((this.getPartyId() == castOther.getPartyId()) || (this.getPartyId() != null
				&& castOther.getPartyId() != null && this.getPartyId().equals(castOther.getPartyId())))
				&& ((this.getPartyQualTypeId() == castOther.getPartyQualTypeId())
						|| (this.getPartyQualTypeId() != null && castOther.getPartyQualTypeId() != null
								&& this.getPartyQualTypeId().equals(castOther.getPartyQualTypeId())))
				&& ((this.getFromDate() == castOther.getFromDate()) || (this.getFromDate() != null
						&& castOther.getFromDate() != null && this.getFromDate().equals(castOther.getFromDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getPartyId() == null ? 0 : this.getPartyId().hashCode());
		result = 37 * result + (getPartyQualTypeId() == null ? 0 : this.getPartyQualTypeId().hashCode());
		result = 37 * result + (getFromDate() == null ? 0 : this.getFromDate().hashCode());
		return result;
	}

}
