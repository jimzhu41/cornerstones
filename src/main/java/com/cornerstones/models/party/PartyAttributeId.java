/**
 * PARTY_ATTRIBUTE Primary key 
 * 
 */
package com.cornerstones.models.party;

import java.io.Serializable;

/**
 * @author jimzhu
 *
 */

import javax.persistence.Column;
import javax.persistence.Embeddable;



@SuppressWarnings("serial")
@Embeddable
public class PartyAttributeId implements Serializable {

	private String partyId;
	private String AttrName;
	
	
	public PartyAttributeId() {
		
	}
	
	public PartyAttributeId(String partyId, String attrName)
	{
		this.partyId= partyId;
		this.AttrName=attrName;
	}
	
	
	@Column(name="PARTY_ID", nullable=false, length=20)
	public String getPartyId() {
		return partyId;
	}
	
	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}
	
	@Column(name="ATTR_NAME", nullable=false, length=60)
	public String getAttrName() {
		return AttrName;
	}
	public void setAttrName(String attrName) {
		AttrName = attrName;
	}
	
	

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PartyAttributeId))
			return false;
		PartyAttributeId castOther = (PartyAttributeId) other;

		return ((this.getPartyId() == castOther.getPartyId()) || (this.getPartyId() != null
				&& castOther.getPartyId() != null && this.getPartyId().equals(castOther.getPartyId())))
				&& ((this.getAttrName() == castOther.getAttrName()) || (this.getAttrName() != null
						&& castOther.getAttrName() != null && this.getAttrName().equals(castOther.getAttrName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getPartyId() == null ? 0 : this.getPartyId().hashCode());
		result = 37 * result + (getAttrName() == null ? 0 : this.getAttrName().hashCode());
		return result;
	}

}
