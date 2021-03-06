package com.cornerstones.models.party;
// Generated Jul 1, 2017 4:29:21 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PartyRateId generated by hbm2java
 */
@Embeddable
public class PartyRateId implements java.io.Serializable {

	private String partyId;
	private String rateTypeId;
	private String currencyUomId;
	private Date fromDate;

	public PartyRateId() {
	}

	public PartyRateId(String partyId, String rateTypeId, String currencyUomId, Date fromDate) {
		this.partyId = partyId;
		this.rateTypeId = rateTypeId;
		this.currencyUomId = currencyUomId;
		this.fromDate = fromDate;
	}

	@Column(name = "PARTY_ID", nullable = false, length = 20)
	public String getPartyId() {
		return this.partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	@Column(name = "RATE_TYPE_ID", nullable = false, length = 20)
	public String getRateTypeId() {
		return this.rateTypeId;
	}

	public void setRateTypeId(String rateTypeId) {
		this.rateTypeId = rateTypeId;
	}

	@Column(name = "CURRENCY_UOM_ID", nullable = false, length = 20)
	public String getCurrencyUomId() {
		return this.currencyUomId;
	}

	public void setCurrencyUomId(String currencyUomId) {
		this.currencyUomId = currencyUomId;
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
		if (!(other instanceof PartyRateId))
			return false;
		PartyRateId castOther = (PartyRateId) other;

		return ((this.getPartyId() == castOther.getPartyId()) || (this.getPartyId() != null
				&& castOther.getPartyId() != null && this.getPartyId().equals(castOther.getPartyId())))
				&& ((this.getRateTypeId() == castOther.getRateTypeId()) || (this.getRateTypeId() != null
						&& castOther.getRateTypeId() != null && this.getRateTypeId().equals(castOther.getRateTypeId())))
				&& ((this.getCurrencyUomId() == castOther.getCurrencyUomId())
						|| (this.getCurrencyUomId() != null && castOther.getCurrencyUomId() != null
								&& this.getCurrencyUomId().equals(castOther.getCurrencyUomId())))
				&& ((this.getFromDate() == castOther.getFromDate()) || (this.getFromDate() != null
						&& castOther.getFromDate() != null && this.getFromDate().equals(castOther.getFromDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getPartyId() == null ? 0 : this.getPartyId().hashCode());
		result = 37 * result + (getRateTypeId() == null ? 0 : this.getRateTypeId().hashCode());
		result = 37 * result + (getCurrencyUomId() == null ? 0 : this.getCurrencyUomId().hashCode());
		result = 37 * result + (getFromDate() == null ? 0 : this.getFromDate().hashCode());
		return result;
	}

}
