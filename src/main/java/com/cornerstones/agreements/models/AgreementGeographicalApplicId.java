package com.cornerstones.agreements.models;
// Generated Jul 1, 2017 4:29:21 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AgreementGeographicalApplicId generated by hbm2java
 */
@Embeddable
public class AgreementGeographicalApplicId implements java.io.Serializable {

	private String agreementId;
	private String agreementItemSeqId;
	private String geoId;

	public AgreementGeographicalApplicId() {
	}

	public AgreementGeographicalApplicId(String agreementId, String agreementItemSeqId, String geoId) {
		this.agreementId = agreementId;
		this.agreementItemSeqId = agreementItemSeqId;
		this.geoId = geoId;
	}

	@Column(name = "AGREEMENT_ID", nullable = false, length = 20)
	public String getAgreementId() {
		return this.agreementId;
	}

	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	@Column(name = "AGREEMENT_ITEM_SEQ_ID", nullable = false, length = 20)
	public String getAgreementItemSeqId() {
		return this.agreementItemSeqId;
	}

	public void setAgreementItemSeqId(String agreementItemSeqId) {
		this.agreementItemSeqId = agreementItemSeqId;
	}

	@Column(name = "GEO_ID", nullable = false, length = 20)
	public String getGeoId() {
		return this.geoId;
	}

	public void setGeoId(String geoId) {
		this.geoId = geoId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AgreementGeographicalApplicId))
			return false;
		AgreementGeographicalApplicId castOther = (AgreementGeographicalApplicId) other;

		return ((this.getAgreementId() == castOther.getAgreementId()) || (this.getAgreementId() != null
				&& castOther.getAgreementId() != null && this.getAgreementId().equals(castOther.getAgreementId())))
				&& ((this.getAgreementItemSeqId() == castOther.getAgreementItemSeqId())
						|| (this.getAgreementItemSeqId() != null && castOther.getAgreementItemSeqId() != null
								&& this.getAgreementItemSeqId().equals(castOther.getAgreementItemSeqId())))
				&& ((this.getGeoId() == castOther.getGeoId()) || (this.getGeoId() != null
						&& castOther.getGeoId() != null && this.getGeoId().equals(castOther.getGeoId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAgreementId() == null ? 0 : this.getAgreementId().hashCode());
		result = 37 * result + (getAgreementItemSeqId() == null ? 0 : this.getAgreementItemSeqId().hashCode());
		result = 37 * result + (getGeoId() == null ? 0 : this.getGeoId().hashCode());
		return result;
	}

}