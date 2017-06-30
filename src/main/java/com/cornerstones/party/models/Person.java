/*
 * Entity Person		
 */
package com.cornerstones.party.models;
/*
 * Author: Jim Zhu
 * Date: 6/29/2017
 */

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name="PERSON")

public class Person {
	
@Id
@NotNull
@Column(name="PARTY_ID")
private String partyId;

@Column(name="SALUTATION")
private String salutation;

@Column(name="FIRST_NAME")
private String firstName;

@Column(name="MIDDLE_NAME")
private String middleName;

@Column(name="LAST_NAME")
private String lastName;

@Column(name="PERSONAL_TITLE")
private String personalTitle;

@Column(name="SUFFIX")
private String suffix;

@Column(name="NICKNAME")
private String nickname;


@Column(name="FIRST_NAME_LOCAL")
private String firstNameLocal;

@Column(name="MIDDLE_NAME_LOCAL")
private String middleNameLocal;

@Column(name="LAST_NAME_LOCAL")
private String lastNameLocal;

@Column(name="OTHER_LOCAL")
private String otherLocal;

@Column(name="MEMBER_ID")
private String memberId;

@Column(name="GENDER")
private Character gender;

@Column(name="BIRTH_DATE")
private Date birthDate;
 

@Column(name="DECEASED_DATE")  
private Date deceasedDate;


@Column(name="HEIGHT")
private double height;

@Column(name="WEIGHT")
private double weight;

 
@Column(name="MOTHERS_MAIDEN_NAME" )
private String motherMaidenName;

@Column(name="MARITAL_STATUS") 
private String martitalStatus;

@Column(name="SOCIAL_SECURITY_NUMBER")
private String ssNumber;

@Column(name="PASSPORT_NUMBER")
private String passportNumber;


@Column(name="PASSPORT_EXPIRE_DATE")   
private Date passpordExpDate;


@Column(name="TOTAL_YEARS_WORK_EXPERIENCE")
private double totalYearsWorkExp;

@Column(name="COMMENTS")
private String comments;

@Column(name="EMPLOYMENT_STATUS_ENUM_ID")
private String empoymentStatusEnumId;


@Column(name="RESIDENCE_STATUS_ENUM_ID")
private String resudenceStatusEnumId;   


@Column(name="OCCUPATION")
private String occupation;

@Column(name="YEARS_WITH_EMPLOYER")
private  double yearsWithEmployer;


@Column(name="MONTHS_WITH_EMPLOYER")    
private double monthsWithEmployer;

@Column(name="EXISTING_CUSTOMER")
private char existingCustomer;

@Column(name="CARD_ID")
private String cardId;

@Column (name="LAST_UPDATED_STAMP")
private Timestamp lastUpdatedStamp;

@Column(name="LAST_UPDATED_TX_STAMP")
private Timestamp lastUpdatedTXStamp;

@Column (name="CREATED_STAMP")
private Timestamp createdStamp;

@Column (name="CREATED_TX_STAMP")
private Timestamp createdTxStamp;

public String getPartyId() {
	return partyId;
}

public void setPartyId(String partyId) {
	this.partyId = partyId;
}

public String getSalutation() {
	return salutation;
}

public void setSalutation(String salutation) {
	this.salutation = salutation;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getMiddleName() {
	return middleName;
}

public void setMiddleName(String middleName) {
	this.middleName = middleName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getPersonalTitle() {
	return personalTitle;
}

public void setPersonalTitle(String personalTitle) {
	this.personalTitle = personalTitle;
}

public String getSuffix() {
	return suffix;
}

public void setSuffix(String suffix) {
	this.suffix = suffix;
}

public String getNickname() {
	return nickname;
}

public void setNickname(String nickname) {
	this.nickname = nickname;
}

public String getFirstNameLocal() {
	return firstNameLocal;
}

public void setFirstNameLocal(String firstNameLocal) {
	this.firstNameLocal = firstNameLocal;
}

public String getMiddleNameLocal() {
	return middleNameLocal;
}

public void setMiddleNameLocal(String middleNameLocal) {
	this.middleNameLocal = middleNameLocal;
}

public String getLastNameLocal() {
	return lastNameLocal;
}

public void setLastNameLocal(String lastNameLocal) {
	this.lastNameLocal = lastNameLocal;
}

public String getOtherLocal() {
	return otherLocal;
}

public void setOtherLocal(String otherLocal) {
	this.otherLocal = otherLocal;
}

public String getMemberId() {
	return memberId;
}

public void setMemberId(String memberId) {
	this.memberId = memberId;
}

public Character getGender() {
	return gender;
}

public void setGender(Character gender) {
	this.gender = gender;
}

public Date getBirthDate() {
	return birthDate;
}

public void setBirthDate(Date birthDate) {
	this.birthDate = birthDate;
}

public Date getDeceasedDate() {
	return deceasedDate;
}

public void setDeceasedDate(Date deceasedDate) {
	this.deceasedDate = deceasedDate;
}

public double getHeight() {
	return height;
}

public void setHeight(double height) {
	this.height = height;
}

public double getWeight() {
	return weight;
}

public void setWeight(double weight) {
	this.weight = weight;
}

public String getMotherMaidenName() {
	return motherMaidenName;
}

public void setMotherMaidenName(String motherMaidenName) {
	this.motherMaidenName = motherMaidenName;
}

public String getMartitalStatus() {
	return martitalStatus;
}

public void setMartitalStatus(String martitalStatus) {
	this.martitalStatus = martitalStatus;
}

public String getSsNumber() {
	return ssNumber;
}

public void setSsNumber(String ssNumber) {
	this.ssNumber = ssNumber;
}

public String getPassportNumber() {
	return passportNumber;
}

public void setPassportNumber(String passportNumber) {
	this.passportNumber = passportNumber;
}

public Date getPasspordExpDate() {
	return passpordExpDate;
}

public void setPasspordExpDate(Date passpordExpDate) {
	this.passpordExpDate = passpordExpDate;
}

public double getTotalYearsWorkExp() {
	return totalYearsWorkExp;
}

public void setTotalYearsWorkExp(double totalYearsWorkExp) {
	this.totalYearsWorkExp = totalYearsWorkExp;
}

public String getComments() {
	return comments;
}

public void setComments(String comments) {
	this.comments = comments;
}

public String getEmpoymentStatusEnumId() {
	return empoymentStatusEnumId;
}

public void setEmpoymentStatusEnumId(String empoymentStatusEnumId) {
	this.empoymentStatusEnumId = empoymentStatusEnumId;
}

public String getResudenceStatusEnumId() {
	return resudenceStatusEnumId;
}

public void setResudenceStatusEnumId(String resudenceStatusEnumId) {
	this.resudenceStatusEnumId = resudenceStatusEnumId;
}

public String getOccupation() {
	return occupation;
}

public void setOccupation(String occupation) {
	this.occupation = occupation;
}

public double getYearsWithEmployer() {
	return yearsWithEmployer;
}

public void setYearsWithEmployer(double yearsWithEmployer) {
	this.yearsWithEmployer = yearsWithEmployer;
}

public double getMonthsWithEmployer() {
	return monthsWithEmployer;
}

public void setMonthsWithEmployer(double monthsWithEmployer) {
	this.monthsWithEmployer = monthsWithEmployer;
}

public char getExistingCustomer() {
	return existingCustomer;
}

public void setExistingCustomer(char existingCustomer) {
	this.existingCustomer = existingCustomer;
}

public String getCardId() {
	return cardId;
}

public void setCardId(String cardId) {
	this.cardId = cardId;
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
