package com.cdac.service;

import java.util.List;

import com.cdac.dto.Visa;

public interface VisaService {
	
	void addVisa(Visa visa);
	void removeVisa(int visaId);
	Visa findVisa(int visaId);
	void modifyeVisa(Visa visa);
	List<Visa> selectAll(int userId);
}
