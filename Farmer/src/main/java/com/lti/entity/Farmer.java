package com.lti.entity;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.lti.entity.crop.FarmerCropSell;

@Entity
@Table(name="Farmer1")
public class Farmer {
	@Id
	@GeneratedValue
	private int id;
   private String fullname;
   private String email;
	private String address;
	private String state;
	private String city;
	private int pincode;
	private int accno;
	private String ifsccode;
	private String password;
	private String confirmpassword;
	private String certificate;
	private String landArea;
	private String landAddress;
	private String landPincode;
	private String panCard;
	private String aadharCard;
	private int contactNo;
	
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	public String getAadharCard() {
		return aadharCard;
	}
	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}
	@OneToMany(mappedBy="farmer")
	private Set<FarmerCropSell> cropSell;
	
	
	

	public String getCertificate() {
		return certificate;
	}
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	public String getLandArea() {
		return landArea;
	}
	public void setLandArea(String landArea) {
		this.landArea = landArea;
	}
	public String getLandAddress() {
		return landAddress;
	}
	public void setLandAddress(String landAddress) {
		this.landAddress = landAddress;
	}
	public String getLandPincode() {
		return landPincode;
	}
	public void setLandPincode(String landPincode) {
		this.landPincode = landPincode;
	}
	public Set<FarmerCropSell> getCropSell() {
		return cropSell;
	}
	public void setCropSell(Set<FarmerCropSell> cropSell) {
		this.cropSell = cropSell;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
	return fullname;
}
public void setName(String name) {
	this.fullname = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}
public String getIfsccode() {
	return ifsccode;
}
public void setIfsccode(String ifsccode) {
	this.ifsccode = ifsccode;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getConfirmpassword() {
	return confirmpassword;
}
public void setConfirmpassword(String confirmpassword) {
	this.confirmpassword = confirmpassword;
}

	
 
}