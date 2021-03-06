package com.cornerstones.agreements.models;
// Generated Jul 1, 2017 4:29:21 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AgreementItemId generated by hbm2java
 */
@Embeddable
public class AgreementItemId implements java.io.Serializable {

	private String agreementId;
	private String agreementItemSeqId;

	public AgreementItemId() {
	}

	public AgreementItemId(String agreementId, String agreementItemSeqId) {
		this.agreementId = agreementId;
		this.agreementItemSeqId = agreementItemSeqId;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AgreementItemId))
			return false;
		AgreementItemId castOther = (AgreementItemId) other;

		return ((this.getAgreementId() == castOther.getAgreementId()) || (this.getAgreementId() != null
				&& castOther.getAgreementId() != null && this.getAgreementId().equals(castOther.getAgreementId())))
				&& ((this.getAgreementItemSeqId() == castOther.getAgreementItemSeqId())
						|| (this.getAgreementItemSeqId() != null && castOther.getAgreementItemSeqId() != null
								&& this.getAgreementItemSeqId().equals(castOther.getAgreementItemSeqId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAgreementId() == null ? 0 : this.getAgreementId().hashCode());
		result = 37 * result + (getAgreementItemSeqId() == null ? 0 : this.getAgreementItemSeqId().hashCode());
		return result;
	}

}
