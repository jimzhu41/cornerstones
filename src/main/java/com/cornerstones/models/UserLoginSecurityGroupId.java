/**
 * Embedded ID for USER_LOGIN_SECURITY_GROUP
 */
package com.cornerstones.models;

/**
 * @author jimzhu
 *
 */

import java.util.Date;
import javax.persistence.Embeddable;
import javax.persistence.Column;

@Embeddable

public class UserLoginSecurityGroupId implements java.io.Serializable {

	private String userLoginId;
	private String groupId;
	private Date fromDate;
	
	public UserLoginSecurityGroupId() {
		
	}
	
	public UserLoginSecurityGroupId(String userLoginId, String groupId, Date fromDate){
		this.userLoginId= userLoginId;
		this.groupId = groupId;
		this.fromDate = fromDate;
	}
	
	
	
	@Column(name="USER_LOGIN_ID", nullable=false, length=250)
	public String getUserLoginId()
	{
		return this.userLoginId;
	}
	public void setUserLoginId(String userLoginId){
		this.userLoginId = userLoginId;
	}
	
	@Column(name="GROUP_ID",nullable=false, length=20)
	public String getGroupId() {
		return this.groupId;
	}
	
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	
	
	@Column(name="FROM_DATE", nullable=false, length=19)
	public Date getFromDate()
	{
		return this.fromDate;
	}
	
	public void setFromDate(Date fromDate){
		this.fromDate= fromDate;
	}
	
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UserLoginSecurityGroupId))
			return false;
		UserLoginSecurityGroupId castOther = (UserLoginSecurityGroupId) other;

		return ((this.getUserLoginId() == castOther.getUserLoginId()) || (this.getUserLoginId() != null
				&& castOther.getUserLoginId() != null && this.getUserLoginId().equals(castOther.getUserLoginId())))
				&& ((this.getGroupId() == castOther.getGroupId()) || (this.getGroupId() != null
						&& castOther.getGroupId() != null && this.getGroupId().equals(castOther.getGroupId())))
				&& ((this.getFromDate() == castOther.getFromDate()) || (this.getFromDate() != null
						&& castOther.getFromDate() != null && this.getFromDate().equals(castOther.getFromDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUserLoginId() == null ? 0 : this.getUserLoginId().hashCode());
		result = 37 * result + (getGroupId() == null ? 0 : this.getGroupId().hashCode());
		result = 37 * result + (getFromDate() == null ? 0 : this.getFromDate().hashCode());
		return result;
	}

	
}
