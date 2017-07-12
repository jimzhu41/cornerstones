package com.cornerstones.models.party;
// Generated Jul 1, 2017 4:29:21 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PartyDataSourceId generated by hbm2java
 */
@Embeddable
public class PartyDataSourceId implements java.io.Serializable {

	private String partyId;
	private String dataSourceId;
	private Date fromDate;

	public PartyDataSourceId() {
	}

	public PartyDataSourceId(String partyId, String dataSourceId, Date fromDate) {
		this.partyId = partyId;
		this.dataSourceId = dataSourceId;
		this.fromDate = fromDate;
	}

	@Column(name = "PARTY_ID", nullable = false, length = 20)
	public String getPartyId() {
		return this.partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	@Column(name = "DATA_SOURCE_ID", nullable = false, length = 20)
	public String getDataSourceId() {
		return this.dataSourceId;
	}

	public void setDataSourceId(String dataSourceId) {
		this.dataSourceId = dataSourceId;
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
		if (!(other instanceof PartyDataSourceId))
			return false;
		PartyDataSourceId castOther = (PartyDataSourceId) other;

		return ((this.getPartyId() == castOther.getPartyId()) || (this.getPartyId() != null
				&& castOther.getPartyId() != null && this.getPartyId().equals(castOther.getPartyId())))
				&& ((this.getDataSourceId() == castOther.getDataSourceId())
						|| (this.getDataSourceId() != null && castOther.getDataSourceId() != null
								&& this.getDataSourceId().equals(castOther.getDataSourceId())))
				&& ((this.getFromDate() == castOther.getFromDate()) || (this.getFromDate() != null
						&& castOther.getFromDate() != null && this.getFromDate().equals(castOther.getFromDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getPartyId() == null ? 0 : this.getPartyId().hashCode());
		result = 37 * result + (getDataSourceId() == null ? 0 : this.getDataSourceId().hashCode());
		result = 37 * result + (getFromDate() == null ? 0 : this.getFromDate().hashCode());
		return result;
	}

}
