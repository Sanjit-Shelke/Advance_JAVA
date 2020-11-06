package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private int userId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	
	private String gender;
	private String country;
	@Column(name = "address")
	private String addr;
	
	@Column(name = "email_id",unique=true)
	private String emailId;
	@Column(name = "contact_no")
	private String contactNo;
	@Column(name = "date_Of_birth")
	private String dateOfBirth;
	@Column(name = "passport_no",unique=true)
	private String passportNo;
	@Column(name = "date_of_issue")
	private String dateOfIssue;
	@Column(name = "valid_upto")
	private String validUpto;
	private String password;
	
	
	
	public User() {
		
		
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public String getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(String dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public String getValidUpto() {
		return validUpto;
	}

	public void setValidUpto(String validUpto) {
		this.validUpto = validUpto;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", country=" + country + ", addr=" + addr + ", emailId=" + emailId + ", contactNo=" + contactNo
				+ ", dateOfBirth=" + dateOfBirth + ", passportNo=" + passportNo + ", dateOfIssue=" + dateOfIssue
				+ ", validUpto=" + validUpto + ", password=" + password + "]";
	}
			
}
