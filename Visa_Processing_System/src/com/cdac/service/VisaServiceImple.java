package com.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.VisaDao;
import com.cdac.dto.Visa;

@Service
public class VisaServiceImple implements VisaService{
	
	@Autowired
	private VisaDao visaDao;
	
	@Override
	public void addVisa(Visa visa) {
		
		visaDao.insertVisa(visa);
	}

	@Override
	public void removeVisa(int visaId) {
		
		visaDao.deleteVisa(visaId);
	}

	@Override
	public Visa findVisa(int visaId) {
		return visaDao.selectVisa(visaId);
	}

	@Override
	public void modifyeVisa(Visa visa) {
		visaDao.updateVisa(visa);
	}

	@Override
	public List<Visa> selectAll(int userId) {
		
		return visaDao.selectAllUser(userId);
	}

}
