
/**
 * CONTACT_MECH Entity
 *  
 */
package com.cornerstones.party.models;

/**
 * @author jimzhu
 * @since June 29 2017
 */

import java.util.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table(name="CONTACT_MECH")
public class ContactMech {

	@Id
	@Column(name="CONTACT_MECH_ID", nullable=false)
	private String contactMechId;
	
	@Column(name="CONTACT_MECH_TYPE_ID", nullable=true)
	private String contactMechTypeId;
	
	@Column(name="INFO_SESSION")
	private String infoSession;
	
	@Column (name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTXStamp;

	@Column (name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column (name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	public String getContactMechId() {
		return contactMechId;
	}

	public void setContactMechId(String contactMechId) {
		this.contactMechId = contactMechId;
	}

	public String getContactMechTypeId() {
		return contactMechTypeId;
	}

	public void setContactMechTypeId(String contactMechTypeId) {
		this.contactMechTypeId = contactMechTypeId;
	}

	public String getInfoSession() {
		return infoSession;
	}

	public void setInfoSession(String infoSession) {
		this.infoSession = infoSession;
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
