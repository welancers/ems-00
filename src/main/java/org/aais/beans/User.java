package org.aais.beans;


public class User {
private String firstName;
private String lastName;
private String landlineNum;
private String MobileNum;
private String otherContactNum;
private String personalEmail;
private String officeEmail;
private String residentialAddr;
private String userType;

public String getMobileNum() {
	return MobileNum;
}
public void setMobileNum(String mobileNum) {
	MobileNum = mobileNum;
}
public String getOtherContactNum() {
	return otherContactNum;
}
public void setOtherContactNum(String otherContactNum) {
	this.otherContactNum = otherContactNum;
}
public String getPersonalEmail() {
	return personalEmail;
}
public void setPersonalEmail(String personalEmail) {
	this.personalEmail = personalEmail;
}
public String getOfficeEmail() {
	return officeEmail;
}
public void setOfficeEmail(String officeEmail) {
	this.officeEmail = officeEmail;
}
public String getResidentialAddr() {
	return residentialAddr;
}
public void setResidentialAddr(String residentialAddr) {
	this.residentialAddr = residentialAddr;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getLandlineNum() {
	return landlineNum;
}
public void setLandlineNum(String landlineNum) {
	this.landlineNum = landlineNum;
}

}
