/*
 * PARTY_RILE Entity
 */
package com.cornerstones.party.models;

/*
 * Author: Jim Zhu
 * Date: 06-26-2017
 */

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="PARTY_ROLE")

public class PartyRole {

	@Id
	@NotNull
	@Column(name="PARTY_ID")
	private String partyId;
	
	@Column(name="ROLE_TYPE_ID")
	private String rolePartyId;
	
	@Column (name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;
	
	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTXStamp;
	
	@Column (name="CREATED_STAMP")
	private Timestamp createdStamp;
	
	@Column (name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	public String getPartyId() {
		return partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	public String getRolePartyId() {
		return rolePartyId;
	}

	public void setRolePartyId(String rolePartyId) {
		this.rolePartyId = rolePartyId;
	}

	public Timestamp getLastUpdatedStamp() {
		return lastUpdatedStamp;
	}

	public void setLastUpdatedStamp(Timestamp lastUpdatedStamp) {
		this.lastUpdatedStamp = lastUpdatedStamp;
	}

	public Timestamp getLastUpdatedTXStamp() {
		return lastUpdatedTXStamp;
	}

	public void setLastUpdatedTXStamp(Timestamp lastUpdatedTXStamp) {
		this.lastUpdatedTXStamp = lastUpdatedTXStamp;
	}

	public Timestamp getCreatedStamp() {
		return createdStamp;
	}

	public void setCreatedStamp(Timestamp createdStamp) {
		this.createdStamp = createdStamp;
	}

	public Timestamp getCreatedTxStamp() {
		return createdTxStamp;
	}

	public void setCreatedTxStamp(Timestamp createdTxStamp) {
		this.createdTxStamp = createdTxStamp;
	}

	
}
