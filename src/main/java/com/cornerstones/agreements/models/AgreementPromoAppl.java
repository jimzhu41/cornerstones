package com.cornerstones.agreements.models;
// Generated Jul 1, 2017 4:29:21 PM by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
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
 * AgreementPromoAppl generated by hbm2java
 */
@Entity
@Table(name = "AGREEMENT_PROMO_APPL", catalog = "ofbiz")
public class AgreementPromoAppl implements java.io.Serializable {

	private AgreementPromoApplId id;
	private Date thruDate;
	private BigDecimal sequenceNum;
	private Date lastUpdatedStamp;
	private Date lastUpdatedTxStamp;
	private Date createdStamp;
	private Date createdTxStamp;

	public AgreementPromoAppl() {
	}

	public AgreementPromoAppl(AgreementPromoApplId id) {
		this.id = id;
	}

	public AgreementPromoAppl(AgreementPromoApplId id, Date thruDate, BigDecimal sequenceNum, Date lastUpdatedStamp,
			Date lastUpdatedTxStamp, Date createdStamp, Date createdTxStamp) {
		this.id = id;
		this.thruDate = thruDate;
		this.sequenceNum = sequenceNum;
		this.lastUpdatedStamp = lastUpdatedStamp;
		this.lastUpdatedTxStamp = lastUpdatedTxStamp;
		this.createdStamp = createdStamp;
		this.createdTxStamp = createdTxStamp;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "agreementId", column = @Column(name = "AGREEMENT_ID", nullable = false, length = 20) ),
			@AttributeOverride(name = "agreementItemSeqId", column = @Column(name = "AGREEMENT_ITEM_SEQ_ID", nullable = false, length = 20) ),
			@AttributeOverride(name = "productPromoId", column = @Column(name = "PRODUCT_PROMO_ID", nullable = false, length = 20) ),
			@AttributeOverride(name = "fromDate", column = @Column(name = "FROM_DATE", nullable = false, length = 19) ) })
	public AgreementPromoApplId getId() {
		return this.id;
	}

	public void setId(AgreementPromoApplId id) {
		this.id = id;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "THRU_DATE", length = 19)
	public Date getThruDate() {
		return this.thruDate;
	}

	public void setThruDate(Date thruDate) {
		this.thruDate = thruDate;
	}

	@Column(name = "SEQUENCE_NUM", precision = 20, scale = 0)
	public BigDecimal getSequenceNum() {
		return this.sequenceNum;
	}

	public void setSequenceNum(BigDecimal sequenceNum) {
		this.sequenceNum = sequenceNum;
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