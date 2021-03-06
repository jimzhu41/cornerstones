package com.cornerstones.models.party;
// Generated Jul 1, 2017 4:29:21 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PartyProfileDefaultId generated by hbm2java
 */
@Embeddable
public class PartyProfileDefaultId implements java.io.Serializable {

	private String partyId;
	private String productStoreId;

	public PartyProfileDefaultId() {
	}

	public PartyProfileDefaultId(String partyId, String productStoreId) {
		this.partyId = partyId;
		this.productStoreId = productStoreId;
	}

	@Column(name = "PARTY_ID", nullable = false, length = 20)
	public String getPartyId() {
		return this.partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	@Column(name = "PRODUCT_STORE_ID", nullable = false, length = 20)
	public String getProductStoreId() {
		return this.productStoreId;
	}

	public void setProductStoreId(String productStoreId) {
		this.productStoreId = productStoreId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PartyProfileDefaultId))
			return false;
		PartyProfileDefaultId castOther = (PartyProfileDefaultId) other;

		return ((this.getPartyId() == castOther.getPartyId()) || (this.getPartyId() != null
				&& castOther.getPartyId() != null && this.getPartyId().equals(castOther.getPartyId())))
				&& ((this.getProductStoreId() == castOther.getProductStoreId())
						|| (this.getProductStoreId() != null && castOther.getProductStoreId() != null
								&& this.getProductStoreId().equals(castOther.getProductStoreId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getPartyId() == null ? 0 : this.getPartyId().hashCode());
		result = 37 * result + (getProductStoreId() == null ? 0 : this.getProductStoreId().hashCode());
		return result;
	}

}
