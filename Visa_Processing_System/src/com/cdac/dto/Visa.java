package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "visa")
public class Visa {
	@Id
	@Column(name = "visa_id")
	@GeneratedValue
	private int visaId;
	@Column(name = "to_country")
	private String toCountry;
	@Column(name = "start_date")
	private String startDate;
	@Column(name = "end_date")
	private String endDate;
	@Column(name = "visa_type")
	private String visaType;
	
	private int userId;
	
	
	private int adminId;
	
	public Visa() {
		
	}
	
	

	public Visa(int visaId) {
		super();
		this.visaId = visaId;
	}



	public int getVisaId() {
		return visaId;
	}

	public void setVisaId(int visaId) {
		this.visaId = visaId;
	}

	public String getToCountry() {
		return toCountry;
	}

	public void setToCountry(String toCountry) {
		this.toCountry = toCountry;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getVisaType() {
		return visaType;
	}

	public void setVisaType(String visaType) {
		this.visaType = visaType;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}



	@Override
	public String toString() {
		return "Visa [visaId=" + visaId + ", toCountry=" + toCountry + ", startDate=" + startDate + ", endDate="
				+ endDate + ", visaType=" + visaType + ", userId=" + userId + ", adminId=" + adminId + "]";
	}

	
	
	
	
}
