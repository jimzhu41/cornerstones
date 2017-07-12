package com.cornerstones.agreements.models;
// Generated Jul 1, 2017 4:29:21 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AgreementItemAttribute generated by hbm2java
 */
@Entity
@Table(name = "AGREEMENT_ITEM_ATTRIBUTE", catalog = "ofbiz")
public class AgreementItemAttribute implements java.io.Serializable {

	private AgreementItemAttributeId id;
	private String attrValue;
	private Date lastUpdatedStamp;
	private Date lastUpdatedTxStamp;
	private Date createdStamp;
	private Date createdTxStamp;

	public AgreementItemAttribute() {
	}

	public AgreementItemAttribute(AgreementItemAttributeId id) {
		this.id = id;
	}

	public AgreementItemAttribute(AgreementItemAttributeId id, String attrValue, Date lastUpdatedStamp,
			Date lastUpdatedTxStamp, Date createdStamp, Date createdTxStamp) {
		this.id = id;
		this.attrValue = attrValue;
		this.lastUpdatedStamp = lastUpdatedStamp;
		this.lastUpdatedTxStamp = lastUpdatedTxStamp;
		this.createdStamp = createdStamp;
		this.createdTxStamp = createdTxStamp;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "agreementId", column = @Column(name = "AGREEMENT_ID", nullable = false, length = 20) ),
			@AttributeOverride(name = "agreementItemSeqId", column = @Column(name = "AGREEMENT_ITEM_SEQ_ID", nullable = false, length = 20) ),
			@AttributeOverride(name = "attrName", column = @Column(name = "ATTR_NAME", nullable = false, length = 60) ) })
	public AgreementItemAttributeId getId() {
		return this.id;
	}

	public void setId(AgreementItemAttributeId id) {
		this.id = id;
	}

	@Column(name = "ATTR_VALUE")
	public String getAttrValue() {
		return this.attrValue;
	}

	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
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
