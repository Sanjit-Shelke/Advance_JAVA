package com.cdac.dao;

import java.util.List;

import com.cdac.dto.Visa;

public interface VisaDao {
	void insertVisa(Visa visa);
	void deleteVisa(int visaId);
	Visa selectVisa(int visaId);
	void updateVisa(Visa visa);
	List<Visa> selectAllUser(int userId);
	List<Visa> selectAllAdmin(int adminId);
}
