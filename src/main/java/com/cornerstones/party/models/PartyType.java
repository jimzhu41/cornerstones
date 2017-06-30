/*
 * Party_Type Entity
 */
		
package com.cornerstones.party.models;

/*
 * Author: Jim Zhu
 * Date : 06-29-2017
 */

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table(name="PARTY_TYPE")
public class PartyType {
	
	@Id
	@NotNull
	@Column(name="PARTY_TYPE_ID")    
    private String partyTypeId;
	
   @Column(name="PARENT_TYPE_ID")
   private String parentTypeId;
   
   
   	@Column(name="HAS_TABLE")   
   	private char hasTable;
   	
   	
	@Column(name="DESCRIPTION")
	private String description;

	@Column (name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTXStamp;

	@Column (name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column (name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	public String getPartyTypeId() {
		return partyTypeId;
	}

	public void setPartyTypeId(String partyTypeId) {
		this.partyTypeId = partyTypeId;
	}

	public String getParentTypeId() {
		return parentTypeId;
	}

	public void setParentTypeId(String parentTypeId) {
		this.parentTypeId = parentTypeId;
	}

	public char getHasTable() {
		return hasTable;
	}

	public void setHasTable(char hasTable) {
		this.hasTable = hasTable;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
