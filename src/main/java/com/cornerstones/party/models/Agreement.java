/**
 * Agreement Entity
 */
package com.cornerstones.party.models;

/**
 * @author jimzhu
 *@since June-29-2017
 */

import java.io.Serializable;
import java.util.Date;
import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table(name="AGREEMENT")

public class Agreement {

	@Id
	@Column(name="AGREEMENT_ID",nullable=false)
	private String aggreement;
	
	@Column(name="PRODUCT_ID")
	private String productId;
	
	@Column(name="PARTY_ID_FROM")
	private String partyIdFrom;
	
	
	@Column(name="PARTY_ID_TO")
	private String partyIdTo;
	
	@Column(name="ROLE_TYPE_ID_FROM")
	private String roleTypeIdFrom;
	
	@Column(name="ROLE_TYPE_ID_TO")
	private String roleTypeIdTo;
	
	@Column(name="AGREEMENT_TYPE_ID")
	private String agreementTypeId;
	
	@Column(name="AGREEMENT_DATE")
	private Date aggrementDate;
	
	@Column(name="FROM_DATE")
	private Date fromDate;
	
	@Column(name="THRU_DATE")
	private Date thruDate;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="TEXT_DATA")
	private String textData;
	
	@Column (name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTXStamp;

	@Column (name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column (name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	public String getAggreement() {
		return aggreement;
	}

	public void setAggreement(String aggreement) {
		this.aggreement = aggreement;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getPartyIdFrom() {
		return partyIdFrom;
	}

	public void setPartyIdFrom(String partyIdFrom) {
		this.partyIdFrom = partyIdFrom;
	}

	public String getPartyIdTo() {
		return partyIdTo;
	}

	public void setPartyIdTo(String partyIdTo) {
		this.partyIdTo = partyIdTo;
	}

	public String getRoleTypeIdFrom() {
		return roleTypeIdFrom;
	}

	public void setRoleTypeIdFrom(String roleTypeIdFrom) {
		this.roleTypeIdFrom = roleTypeIdFrom;
	}

	public String getRoleTypeIdTo() {
		return roleTypeIdTo;
	}

	public void setRoleTypeIdTo(String roleTypeIdTo) {
		this.roleTypeIdTo = roleTypeIdTo;
	}

	public String getAgreementTypeId() {
		return agreementTypeId;
	}

	public void setAgreementTypeId(String agreementTypeId) {
		this.agreementTypeId = agreementTypeId;
	}

	public Date getAggrementDate() {
		return aggrementDate;
	}

	public void setAggrementDate(Date aggrementDate) {
		this.aggrementDate = aggrementDate;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getThruDate() {
		return thruDate;
	}

	public void setThruDate(Date thruDate) {
		this.thruDate = thruDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTextData() {
		return textData;
	}

	public void setTextData(String textData) {
		this.textData = textData;
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
