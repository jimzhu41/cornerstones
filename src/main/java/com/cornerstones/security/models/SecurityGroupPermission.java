/**
 * SECURITY_GROUP_PERMISSION Entity 
 */
package com.cornerstones.security.models;

import java.sql.Timestamp;

import javax.persistence.Column;

/**
 * @author jimzhu
 * @Date 06-29-2017
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
@Table(name="SECURITY_GROUP_PERMISSION")
public class SecurityGroupPermission {

	@Id
	@Column(name="GROUP_ID", nullable=false)
	private String groupId;
	
	@Column(name="PERMISSION_ID", nullable=false)
    private String permissionId;
	
	@Column (name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;
	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTXStamp;
	@Column (name="CREATED_STAMP")
	private Timestamp createdStamp;
	@Column (name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getPermissionId() {
		return permissionId;
	}
	public void setPermissionId(String permissionId) {
		this.permissionId = permissionId;
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
