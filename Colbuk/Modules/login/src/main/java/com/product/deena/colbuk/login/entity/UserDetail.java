package com.product.deena.colbuk.login.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.product.deena.colbuk.login.utility.BaseDetails;
import com.product.deena.colbuk.login.utility.GenderEnum;

@Entity
@Table(name="USER_DETAILS")
@NamedQueries({
	@NamedQuery(name="findAllUsers", query="from UserDetail")
})
public class UserDetail extends BaseDetails{
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="USER_FIRST_NAME")
	private String userFirstName;
	
	@Column(name="USER_LAST_NAME")
	private String userLastName;
	
	@Column(name="EMAIL_ID")
	private String eMailId;
	
	@Column(name="MOBILE_NUMBER")
	private String mobileNumber;
	
	@Column(name="GENDER")
	private String gender;
	
	public UserDetail() {
		super();
	}
	
	public UserDetail(Long id, String userFirstName, String userLastName, String eMailId, String mobileNumber,
			String gender) {
		super();
		this.id = id;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.eMailId = eMailId;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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