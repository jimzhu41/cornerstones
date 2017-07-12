package com.cornerstones.models.party;
// Generated Jul 1, 2017 4:29:21 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PartyTaxInfoId generated by hbm2java
 */
@Embeddable
public class PartyTaxInfoId implements java.io.Serializable {

	private String partyId;
	private String geoId;
	private Date fromDate;

	public PartyTaxInfoId() {
	}

	public PartyTaxInfoId(String partyId, String geoId, Date fromDate) {
		this.partyId = partyId;
		this.geoId = geoId;
		this.fromDate = fromDate;
	}

	@Column(name = "PARTY_ID", nullable = false, length = 20)
	public String getPartyId() {
		return this.partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	@Column(name = "GEO_ID", nullable = false, length = 20)
	public String getGeoId() {
		return this.geoId;
	}

	public void setGeoId(String geoId) {
		this.geoId = geoId;
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
		if (!(other instanceof PartyTaxInfoId))
			return false;
		PartyTaxInfoId castOther = (PartyTaxInfoId) other;

		return ((this.getPartyId() == castOther.getPartyId()) || (this.getPartyId() != null
				&& castOther.getPartyId() != null && this.getPartyId().equals(castOther.getPartyId())))
				&& ((this.getGeoId() == castOther.getGeoId()) || (this.getGeoId() != null
						&& castOther.getGeoId() != null && this.getGeoId().equals(castOther.getGeoId())))
				&& ((this.getFromDate() == castOther.getFromDate()) || (this.getFromDate() != null
						&& castOther.getFromDate() != null && this.getFromDate().equals(castOther.getFromDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getPartyId() == null ? 0 : this.getPartyId().hashCode());
		result = 37 * result + (getGeoId() == null ? 0 : this.getGeoId().hashCode());
		result = 37 * result + (getFromDate() == null ? 0 : this.getFromDate().hashCode());
		return result;
	}

}