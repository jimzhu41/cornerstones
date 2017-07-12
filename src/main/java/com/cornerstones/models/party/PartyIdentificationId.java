package com.cornerstones.models.party;
// Generated Jul 1, 2017 4:29:21 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PartyIdentificationId generated by hbm2java
 */
@Embeddable
public class PartyIdentificationId implements java.io.Serializable {

	private String partyId;
	private String partyIdentificationTypeId;

	public PartyIdentificationId() {
	}

	public PartyIdentificationId(String partyId, String partyIdentificationTypeId) {
		this.partyId = partyId;
		this.partyIdentificationTypeId = partyIdentificationTypeId;
	}

	@Column(name = "PARTY_ID", nullable = false, length = 20)
	public String getPartyId() {
		return this.partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	@Column(name = "PARTY_IDENTIFICATION_TYPE_ID", nullable = false, length = 20)
	public String getPartyIdentificationTypeId() {
		return this.partyIdentificationTypeId;
	}

	public void setPartyIdentificationTypeId(String partyIdentificationTypeId) {
		this.partyIdentificationTypeId = partyIdentificationTypeId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PartyIdentificationId))
			return false;
		PartyIdentificationId castOther = (PartyIdentificationId) other;

		return ((this.getPartyId() == castOther.getPartyId()) || (this.getPartyId() != null
				&& castOther.getPartyId() != null && this.getPartyId().equals(castOther.getPartyId())))
				&& ((this.getPartyIdentificationTypeId() == castOther.getPartyIdentificationTypeId())
						|| (this.getPartyIdentificationTypeId() != null
								&& castOther.getPartyIdentificationTypeId() != null
								&& this.getPartyIdentificationTypeId()
										.equals(castOther.getPartyIdentificationTypeId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getPartyId() == null ? 0 : this.getPartyId().hashCode());
		result = 37 * result
				+ (getPartyIdentificationTypeId() == null ? 0 : this.getPartyIdentificationTypeId().hashCode());
		return result;
	}

}
