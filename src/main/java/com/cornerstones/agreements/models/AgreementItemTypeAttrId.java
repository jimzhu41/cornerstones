package com.cornerstones.agreements.models;
// Generated Jul 1, 2017 4:29:21 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AgreementItemTypeAttrId generated by hbm2java
 */
@Embeddable
public class AgreementItemTypeAttrId implements java.io.Serializable {

	private String agreementItemTypeId;
	private String attrName;

	public AgreementItemTypeAttrId() {
	}

	public AgreementItemTypeAttrId(String agreementItemTypeId, String attrName) {
		this.agreementItemTypeId = agreementItemTypeId;
		this.attrName = attrName;
	}

	@Column(name = "AGREEMENT_ITEM_TYPE_ID", nullable = false, length = 20)
	public String getAgreementItemTypeId() {
		return this.agreementItemTypeId;
	}

	public void setAgreementItemTypeId(String agreementItemTypeId) {
		this.agreementItemTypeId = agreementItemTypeId;
	}

	@Column(name = "ATTR_NAME", nullable = false, length = 60)
	public String getAttrName() {
		return this.attrName;
	}

	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AgreementItemTypeAttrId))
			return false;
		AgreementItemTypeAttrId castOther = (AgreementItemTypeAttrId) other;

		return ((this.getAgreementItemTypeId() == castOther.getAgreementItemTypeId())
				|| (this.getAgreementItemTypeId() != null && castOther.getAgreementItemTypeId() != null
						&& this.getAgreementItemTypeId().equals(castOther.getAgreementItemTypeId())))
				&& ((this.getAttrName() == castOther.getAttrName()) || (this.getAttrName() != null
						&& castOther.getAttrName() != null && this.getAttrName().equals(castOther.getAttrName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAgreementItemTypeId() == null ? 0 : this.getAgreementItemTypeId().hashCode());
		result = 37 * result + (getAttrName() == null ? 0 : this.getAttrName().hashCode());
		return result;
	}

}