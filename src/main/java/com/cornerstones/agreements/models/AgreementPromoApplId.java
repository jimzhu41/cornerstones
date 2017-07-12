package com.cornerstones.agreements.models;
// Generated Jul 1, 2017 4:29:21 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AgreementPromoApplId generated by hbm2java
 */
@Embeddable
public class AgreementPromoApplId implements java.io.Serializable {

	private String agreementId;
	private String agreementItemSeqId;
	private String productPromoId;
	private Date fromDate;

	public AgreementPromoApplId() {
	}

	public AgreementPromoApplId(String agreementId, String agreementItemSeqId, String productPromoId, Date fromDate) {
		this.agreementId = agreementId;
		this.agreementItemSeqId = agreementItemSeqId;
		this.productPromoId = productPromoId;
		this.fromDate = fromDate;
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

	@Column(name = "PRODUCT_PROMO_ID", nullable = false, length = 20)
	public String getProductPromoId() {
		return this.productPromoId;
	}

	public void setProductPromoId(String productPromoId) {
		this.productPromoId = productPromoId;
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
		if (!(other instanceof AgreementPromoApplId))
			return false;
		AgreementPromoApplId castOther = (AgreementPromoApplId) other;

		return ((this.getAgreementId() == castOther.getAgreementId()) || (this.getAgreementId() != null
				&& castOther.getAgreementId() != null && this.getAgreementId().equals(castOther.getAgreementId())))
				&& ((this.getAgreementItemSeqId() == castOther.getAgreementItemSeqId())
						|| (this.getAgreementItemSeqId() != null && castOther.getAgreementItemSeqId() != null
								&& this.getAgreementItemSeqId().equals(castOther.getAgreementItemSeqId())))
				&& ((this.getProductPromoId() == castOther.getProductPromoId())
						|| (this.getProductPromoId() != null && castOther.getProductPromoId() != null
								&& this.getProductPromoId().equals(castOther.getProductPromoId())))
				&& ((this.getFromDate() == castOther.getFromDate()) || (this.getFromDate() != null
						&& castOther.getFromDate() != null && this.getFromDate().equals(castOther.getFromDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAgreementId() == null ? 0 : this.getAgreementId().hashCode());
		result = 37 * result + (getAgreementItemSeqId() == null ? 0 : this.getAgreementItemSeqId().hashCode());
		result = 37 * result + (getProductPromoId() == null ? 0 : this.getProductPromoId().hashCode());
		result = 37 * result + (getFromDate() == null ? 0 : this.getFromDate().hashCode());
		return result;
	}

}