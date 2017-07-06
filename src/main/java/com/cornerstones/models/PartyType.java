/** PARTY_TPYE ENTITY
 * 
 */
package com.cornerstones.models;

/**
 * @author jim zhu
 *
 */

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="PARTY_TYPE", catalog="ofbiz")

public class PartyType {

	private String partyTypeId;
    private String parentTypeId;
    private Character hasTable;
    private String description;
    private Date lastUpdatedStamp;
	private Date lastUpdatedTxStamp;
	private Date createdStamp;
	private Date createdTxStamp;
	
	public PartyType(){
		
	}
	
	
	public PartyType(String partyTypeId)
	{
		this.partyTypeId = partyTypeId;
	}
	
	
	public PartyType(String partyTypeId, String parentTypeId, Character hasTable, String description,
			Date lastUpdatedStamp, Date lastUpdatedTxStamp, Date createdStamp, Date createdTxStamp) {
		this.partyTypeId = partyTypeId;
		this.parentTypeId = parentTypeId;
		this.hasTable = hasTable;
		this.description = description;
		this.lastUpdatedStamp = lastUpdatedStamp;
		this.lastUpdatedTxStamp = lastUpdatedTxStamp;
		this.createdStamp = createdStamp;
		this.createdTxStamp = createdTxStamp;
	}

	@Id
	@Column(name="PARTY_TYPE_ID", length=20, nullable=false,unique=true)
	public String getPartyTypeId() {
		return partyTypeId;
	}
	public void setPartyTypeId(String partyTypeId) {
		this.partyTypeId = partyTypeId;
	}
	
	
	@Column(name="PARENT_TYPE_ID", length=20)
	public String getParentTypeId() {
		return parentTypeId;
	}
	public void setParentTypeId(String parentTypeId) {
		this.parentTypeId = parentTypeId;
	}
	
	@Column(name="HAS_TABLE", length=1)
	public Character getHasTable() {
		return hasTable;
	}
	public void setHasTable(Character hasTable) {
		this.hasTable = hasTable;
	}
	
	@Column(name="DESCRIPTION", length=255)
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_UPDATED_STAMP",length=19)
	public Date getLastUpdatedStamp() {
		return lastUpdatedStamp;
	}
	public void setLastUpdatedStamp(Date lastUpdatedStamp) {
		this.lastUpdatedStamp = lastUpdatedStamp;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_UPDATED_TX_STAMP",length=19)
	public Date getLastUpdatedTxStamp() {
		return lastUpdatedTxStamp;
	}
	public void setLastUpdatedTxStamp(Date lastUpdatedTxStamp) {
		this.lastUpdatedTxStamp = lastUpdatedTxStamp;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_STAMP",length=19)
	public Date getCreatedStamp() {
		return createdStamp;
	}
	public void setCreatedStamp(Date createdStamp) {
		this.createdStamp = createdStamp;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_TX_STAMP",length=19)
	public Date getCreatedTxStamp() {
		return createdTxStamp;
	}
	public void setCreatedTxStamp(Date createdTxStamp) {
		this.createdTxStamp = createdTxStamp;
	}


}
