package com.cornerstones.models;
// Generated Jul 1, 2017 4:29:21 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Agreement generated by hbm2java
 */
@Entity
@Table(name = "AGREEMENT", catalog = "ofbiz")
public class Agreement implements java.io.Serializable {

	private String agreementId;
	private String productId;
	private String partyIdFrom;
	private String partyIdTo;
	private String roleTypeIdFrom;
	private String roleTypeIdTo;
	private String agreementTypeId;
	private Date agreementDate;
	private Date fromDate;
	private Date thruDate;
	private String description;
	private String textData;
	private Date lastUpdatedStamp;
	private Date lastUpdatedTxStamp;
	private Date createdStamp;
	private Date createdTxStamp;

	public Agreement() {
	}

	public Agreement(String agreementId) {
		this.agreementId = agreementId;
	}

	public Agreement(String agreementId, String productId, String partyIdFrom, String partyIdTo, String roleTypeIdFrom,
			String roleTypeIdTo, String agreementTypeId, Date agreementDate, Date fromDate, Date thruDate,
			String description, String textData, Date lastUpdatedStamp, Date lastUpdatedTxStamp, Date createdStamp,
			Date createdTxStamp) {
		this.agreementId = agreementId;
		this.productId = productId;
		this.partyIdFrom = partyIdFrom;
		this.partyIdTo = partyIdTo;
		this.roleTypeIdFrom = roleTypeIdFrom;
		this.roleTypeIdTo = roleTypeIdTo;
		this.agreementTypeId = agreementTypeId;
		this.agreementDate = agreementDate;
		this.fromDate = fromDate;
		this.thruDate = thruDate;
		this.description = description;
		this.textData = textData;
		this.lastUpdatedStamp = lastUpdatedStamp;
		this.lastUpdatedTxStamp = lastUpdatedTxStamp;
		this.createdStamp = createdStamp;
		this.createdTxStamp = createdTxStamp;
	}

	@Id

	@Column(name = "AGREEMENT_ID", unique = true, nullable = false, length = 20)
	public String getAgreementId() {
		return this.agreementId;
	}

	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	@Column(name = "PRODUCT_ID", length = 20)
	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	@Column(name = "PARTY_ID_FROM", length = 20)
	public String getPartyIdFrom() {
		return this.partyIdFrom;
	}

	public void setPartyIdFrom(String partyIdFrom) {
		this.partyIdFrom = partyIdFrom;
	}

	@Column(name = "PARTY_ID_TO", length = 20)
	public String getPartyIdTo() {
		return this.partyIdTo;
	}

	public void setPartyIdTo(String partyIdTo) {
		this.partyIdTo = partyIdTo;
	}

	@Column(name = "ROLE_TYPE_ID_FROM", length = 20)
	public String getRoleTypeIdFrom() {
		return this.roleTypeIdFrom;
	}

	public void setRoleTypeIdFrom(String roleTypeIdFrom) {
		this.roleTypeIdFrom = roleTypeIdFrom;
	}

	@Column(name = "ROLE_TYPE_ID_TO", length = 20)
	public String getRoleTypeIdTo() {
		return this.roleTypeIdTo;
	}

	public void setRoleTypeIdTo(String roleTypeIdTo) {
		this.roleTypeIdTo = roleTypeIdTo;
	}

	@Column(name = "AGREEMENT_TYPE_ID", length = 20)
	public String getAgreementTypeId() {
		return this.agreementTypeId;
	}

	public void setAgreementTypeId(String agreementTypeId) {
		this.agreementTypeId = agreementTypeId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "AGREEMENT_DATE", length = 19)
	public Date getAgreementDate() {
		return this.agreementDate;
	}

	public void setAgreementDate(Date agreementDate) {
		this.agreementDate = agreementDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FROM_DATE", length = 19)
	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "THRU_DATE", length = 19)
	public Date getThruDate() {
		return this.thruDate;
	}

	public void setThruDate(Date thruDate) {
		this.thruDate = thruDate;
	}

	@Column(name = "DESCRIPTION")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "TEXT_DATA")
	public String getTextData() {
		return this.textData;
	}

	public void setTextData(String textData) {
		this.textData = textData;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_UPDATED_STAMP", length = 19)
	public Date getLastUpdatedStamp() {
		return this.lastUpdatedStamp;
	}

	public void setLastUpdatedStamp(Date lastUpdatedStamp) {
		this.lastUpdatedStamp = lastUpdatedStamp;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_UPDATED_TX_STAMP", length = 19)
	public Date getLastUpdatedTxStamp() {
		return this.lastUpdatedTxStamp;
	}

	public void setLastUpdatedTxStamp(Date lastUpdatedTxStamp) {
		this.lastUpdatedTxStamp = lastUpdatedTxStamp;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_STAMP", length = 19)
	public Date getCreatedStamp() {
		return this.createdStamp;
	}

	public void setCreatedStamp(Date createdStamp) {
		this.createdStamp = createdStamp;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_TX_STAMP", length = 19)
	public Date getCreatedTxStamp() {
		return this.createdTxStamp;
	}

	public void setCreatedTxStamp(Date createdTxStamp) {
		this.createdTxStamp = createdTxStamp;
	}

}