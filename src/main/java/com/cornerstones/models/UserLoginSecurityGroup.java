/** 
 * USER_LOGIN)SECURITY_GROUP ENTITY
 */
package com.cornerstones.models;

/**
 * @author jimzhu
 *
 */

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;

@Entity
@Table(name="USER_LOGIN_SECURITY_GROUP", catalog="ofbiz")
public class UserLoginSecurityGroup {
	
	private UserLoginSecurityGroupId id;
	private Date thruDate;
	private Date lastUpdatedStamp;
	private Date lastUpdatedTxStamp;
	private Date createdStamp;
	private Date createdTxStamp;
	
	
	public UserLoginSecurityGroup() {
		
	}
	
	public UserLoginSecurityGroup(UserLoginSecurityGroupId id) {
		this.id = id;
	}
	
	public UserLoginSecurityGroup(UserLoginSecurityGroupId id, Date thruDate, Date lastUpdatedStamp,
			Date lastUpdatedTxStamp, Date createdStamp, Date createdTxStamp) {
		this.id = id;
		this.thruDate = thruDate;
		this.lastUpdatedStamp = lastUpdatedStamp;
		this.lastUpdatedTxStamp = lastUpdatedTxStamp;
		this.createdStamp = createdStamp;
		this.createdTxStamp = createdTxStamp;
	}


	@EmbeddedId
	
	@AttributeOverrides (
			{
				@AttributeOverride(name="userLoginId",column = @Column(name="USER_LOGIN_ID",nullable=false, unique=true, length=250)),
				@AttributeOverride(name="groupId", column = @Column(name="GROUP_ID", nullable=false, length=20)),
				@AttributeOverride(name="fromDate", column = @Column (name="FROM_DATE", nullable=false, length=19))				
				
			}
			
)
	
	
	public UserLoginSecurityGroupId getId() {
		return this.id;
	}
	
	
	public void setId(UserLoginSecurityGroupId id) {
		this.id = id;
	}
	

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="THRU_DATE",length=19)
	public Date getThruDate() {
		return thruDate;
	}
	public void setThruDate(Date thruDate) {
		this.thruDate = thruDate;
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
	@Column(name="CREATED_STAMP", length=19)
	
	public Date getCreatedStamp() {
		return createdStamp;
	}
	public void setCreatedStamp(Date createdStamp) {
		this.createdStamp = createdStamp;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_TX_STAMP", length=19)
	public Date getCreatedTxStamp() {
		return createdTxStamp;
	}
	public void setCreatedTxStamp(Date createdTxStamp) {
		this.createdTxStamp = createdTxStamp;
	}
	
	

}
