/*
 * Security Permission Entity
 */
package com.cornerstones.security.models;

/*
 * Author: Jim Zhu
 */

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
@Table(name="SECURITY_PERMISSION")
public class SecurityPermission {
	@Id
	@Column(name="PERMISSION_ID")
	private String permissionId;
    @Column(name="DESCRIPTION")
    private String description;
    @Column(name="LAST_UPDATED_STAMP")
    private Timestamp lastUpdatedStamp;
    @Column(name="LAST_UPDATED_TX_STAMP")
    private Timestamp lastUpdatedTxStamp;
    @Column(name="CREATED_STAMP")
    private Timestamp createdStamp;
    @Column(name="CREATED_TX_STAMP")
    private Timestamp createdTxStamp;
	public String getPermissionId() {
		return permissionId;
	}
	public void setPermissionId(String permissionId) {
		this.permissionId = permissionId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Timestamp getLastUpdatedStamp() {
		return lastUpdatedStamp;
	}
	public void setLastUpdatedStamp(Timestamp lastUpdatedStamp) {
		this.lastUpdatedStamp = lastUpdatedStamp;
	}
	public Timestamp getLastUpdatedTxStamp() {
		return lastUpdatedTxStamp;
	}
	public void setLastUpdatedTxStamp(Timestamp lastUpdatedTxStamp) {
		this.lastUpdatedTxStamp = lastUpdatedTxStamp;
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
