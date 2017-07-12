/**
 * PARTY_ATTRIBUTE ENTITY
 */
package com.cornerstones.models.party;

/**
 * @author jimzhu
 *
 */

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
 

import javax.persistence.EmbeddedId;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;

import java.util.Date;

@Entity
@Table(name="PARTY_ATTRIBUTE", catalog="ofbiz")
public class PartyAttribute {
  
	private PartyAttributeId id;
    private String attrValue;
    private Date lastUpdatedStamp;
	private Date lastUpdatedTxStamp;
	private Date createdStamp;
	private Date createdTxStamp;
	
	
	public PartyAttribute(PartyAttributeId id) {
		this.id = id;
	}

	public PartyAttribute(PartyAttributeId id, String attrValue, Date lastUpdatedStamp, Date lastUpdatedTxStamp,
			Date createdStamp, Date createdTxStamp) {
		this.id = id;
		this.attrValue = attrValue;
		this.lastUpdatedStamp = lastUpdatedStamp;
		this.lastUpdatedTxStamp = lastUpdatedTxStamp;
		this.createdStamp = createdStamp;
		this.createdTxStamp = createdTxStamp;
	}
	
	
	@EmbeddedId
	
	@AttributeOverrides (
			{
			@AttributeOverride(name="partyId" ,column=@Column(name="PARTY_ID",nullable=false, length=20)),
			@AttributeOverride(name="attrName", column=@Column(name="ATTR_NAME", nullable=false,length=60))
	}
			)
	public PartyAttributeId getPartyAttributeId() {
		return id;
	}
	public void setPartyAttributeId(PartyAttributeId partyAttributeId) {
		this.id = partyAttributeId;
	}
	
	@Column(name="ATTR_VAKUE",nullable=true, length=255)
	public String getAttrValue() {
		return attrValue;
	}
	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_UPDATED_STAMP", length = 19)
	public Date getLastUpdatedStamp() {
		return lastUpdatedStamp;
	}
	public void setLastUpdatedStamp(Date lastUpdatedStamp) {
		this.lastUpdatedStamp = lastUpdatedStamp;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_UPDATED_TX_STAMP", length = 19)
	public Date getLastUpdatedTxStamp() {
		return lastUpdatedTxStamp;
	}
	
	public void setLastUpdatedTxStamp(Date lastUpdatedTxStamp) {
		this.lastUpdatedTxStamp = lastUpdatedTxStamp;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_STAMP", length = 19)
	public Date getCreatedStamp() {
		return createdStamp;
	}
	public void setCreatedStamp(Date createdStamp) {
		this.createdStamp = createdStamp;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_TX_STAMP", length = 19)
	public Date getCreatedTxStamp() {
		return createdTxStamp;
	}
	public void setCreatedTxStamp(Date createdTxStamp) {
		this.createdTxStamp = createdTxStamp;
	}
	
	
	
	
    
}
