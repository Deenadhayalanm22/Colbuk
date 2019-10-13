package com.product.deena.colbuk.login.dto;

import com.product.deena.colbuk.login.utility.GenderEnum;

public class UserDetailDto {
	
	private String userFirstName;
	
	private String userLastName;
	
	private String eMailId;
	
	private String mobileNumber;
	
	private String gender;
	
	public UserDetailDto() {
		super();
	}
	
	public UserDetailDto(String userFirstName, String userLastName, String eMailId, String mobileNumber,
			String gender) {
		super();
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.eMailId = eMailId;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
	}

	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String geteMailId() {
		return eMailId;
	}
	public void seteMailId(String eMailId) {
		this.eMailId = eMailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}


}
