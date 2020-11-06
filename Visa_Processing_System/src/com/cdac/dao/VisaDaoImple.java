package com.cdac.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cdac.dto.Visa;

@Repository
public class VisaDaoImple implements VisaDao{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void insertVisa(Visa visa) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(visa);
				tr.commit();
				session.flush();
				session.close();
				return null;
				
			}
		});
		
	}

	@Override
	public void deleteVisa(int visaId) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.delete(new Visa(visaId));
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}

	@Override
	public Visa selectVisa(int visaId) {
		Visa visa = hibernateTemplate.execute(new HibernateCallback<Visa>() {

			@Override
			public Visa doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Visa vs = (Visa)session.get(Visa.class, visaId);
				tr.commit();
				session.flush();
				session.close();
				return vs;
			}
		});
		return visa;
	}

	@Override
	public void updateVisa(Visa visa) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Visa vs = (Visa)session.get(Visa.class, visa.getVisaId());
				vs.setToCountry(visa.getToCountry());
				vs.setStartDate(visa.getStartDate());
				vs.setEndDate(visa.getEndDate());
				vs.setVisaType(visa.getVisaType());
				
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
		});
		
		
	}

	@Override
	public List<Visa> selectAllUser(int userId) {
	List<Visa> visaList = 	hibernateTemplate.execute(new HibernateCallback<List<Visa>>() {

			@Override
			public List<Visa> doInHibernate(Session session) throws HibernateException {
				
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Visa where userId = ?");
				q.setInteger(0, userId);
				List<Visa> li = q.list();
				System.out.println(li);
				
				tr.commit();
				session.flush();
				session.close();
				return li;
			}
		
		});
		return visaList;
	}

	@Override
	public List<Visa> selectAllAdmin(int adminId) {
		
		return null;
	}

	
}
