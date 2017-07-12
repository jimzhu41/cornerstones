package com.cornerstones.models.party;
// Generated Jul 1, 2017 4:29:21 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PartyFixedAssetAssignmentId generated by hbm2java
 */
@Embeddable
public class PartyFixedAssetAssignmentId implements java.io.Serializable {

	private String partyId;
	private String roleTypeId;
	private String fixedAssetId;
	private Date fromDate;

	public PartyFixedAssetAssignmentId() {
	}

	public PartyFixedAssetAssignmentId(String partyId, String roleTypeId, String fixedAssetId, Date fromDate) {
		this.partyId = partyId;
		this.roleTypeId = roleTypeId;
		this.fixedAssetId = fixedAssetId;
		this.fromDate = fromDate;
	}

	@Column(name = "PARTY_ID", nullable = false, length = 20)
	public String getPartyId() {
		return this.partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	@Column(name = "ROLE_TYPE_ID", nullable = false, length = 20)
	public String getRoleTypeId() {
		return this.roleTypeId;
	}

	public void setRoleTypeId(String roleTypeId) {
		this.roleTypeId = roleTypeId;
	}

	@Column(name = "FIXED_ASSET_ID", nullable = false, length = 20)
	public String getFixedAssetId() {
		return this.fixedAssetId;
	}

	public void setFixedAssetId(String fixedAssetId) {
		this.fixedAssetId = fixedAssetId;
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
		if (!(other instanceof PartyFixedAssetAssignmentId))
			return false;
		PartyFixedAssetAssignmentId castOther = (PartyFixedAssetAssignmentId) other;

		return ((this.getPartyId() == castOther.getPartyId()) || (this.getPartyId() != null
				&& castOther.getPartyId() != null && this.getPartyId().equals(castOther.getPartyId())))
				&& ((this.getRoleTypeId() == castOther.getRoleTypeId()) || (this.getRoleTypeId() != null
						&& castOther.getRoleTypeId() != null && this.getRoleTypeId().equals(castOther.getRoleTypeId())))
				&& ((this.getFixedAssetId() == castOther.getFixedAssetId())
						|| (this.getFixedAssetId() != null && castOther.getFixedAssetId() != null
								&& this.getFixedAssetId().equals(castOther.getFixedAssetId())))
				&& ((this.getFromDate() == castOther.getFromDate()) || (this.getFromDate() != null
						&& castOther.getFromDate() != null && this.getFromDate().equals(castOther.getFromDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getPartyId() == null ? 0 : this.getPartyId().hashCode());
		result = 37 * result + (getRoleTypeId() == null ? 0 : this.getRoleTypeId().hashCode());
		result = 37 * result + (getFixedAssetId() == null ? 0 : this.getFixedAssetId().hashCode());
		result = 37 * result + (getFromDate() == null ? 0 : this.getFromDate().hashCode());
		return result;
	}

}
