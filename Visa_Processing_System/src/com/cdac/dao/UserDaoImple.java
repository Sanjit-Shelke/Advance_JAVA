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

import com.cdac.dto.User;

@Repository
public class UserDaoImple implements UserDao{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void InsertUser(User user) {
		
	hibernateTemplate.execute(new HibernateCallback<Void>() {

		@Override
		public Void doInHibernate(Session session) throws HibernateException {
			
			Transaction tr = session.beginTransaction();
			session.save(user);
			tr.commit();
			session.flush();
			session.close();
			return null;
		}
	 });
	
   }

	@Override
	public boolean checkUser(User user) {
		
	boolean	b =	hibernateTemplate.execute(new HibernateCallback<Boolean>() {

			@Override
			public Boolean doInHibernate(Session session) throws HibernateException {
				
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from User where emailId = ? and password = ?");
				
				q.setString(0, user.getEmailId());
				q.setString(1, user.getPassword());
				
				List<User> li = q.list();
				boolean flag = !li.isEmpty();
				user.setUserId(li.get(0).getUserId());
				user.setFirstName(li.get(0).getFirstName());
				
				tr.commit();
				session.flush();
				session.close();
				return flag;
			}
		});
		
		return b;
	}

	@Override
	public List<User> selectAll(int userId) {
		
	List<User> infoList = 	hibernateTemplate.execute(new HibernateCallback<List<User>>() {

			@Override
			public List<User> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from User where userId = ?");
				q.setInteger(0, userId);
				List<User> li = q.list();
				System.out.println(li);
				
				tr.commit();
				session.flush();
				session.close();
				return li;
			}
		});
		return infoList;
	}
	
	@Override
	public User selectUser(int userId) {
		User user = hibernateTemplate.execute(new HibernateCallback<User>() {

			@Override
			public User doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				User us = (User)session.get(User.class, userId);
				tr.commit();
				session.flush();
				session.close();
				return us;
			}
		});
		return user;
	}


	@Override
	public void updateDetail(User user) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				
				session.update(user);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
		});
		
	}

	@Override
	public List<User> selectAll() {
		List<User> infoList = 	hibernateTemplate.execute(new HibernateCallback<List<User>>() {

			@Override
			public List<User> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from User");
			//	q.setInteger(0, userId);
				
				List<User> li = q.list();
				System.out.println(li);
				
				tr.commit();
				session.flush();
				session.close();
				return li;
			}
		});
		return infoList;
	}

	@Override
	public String forgotPassword(String emailId) {
		
		String password = hibernateTemplate.execute(new HibernateCallback<String>() {

			@Override
			public String doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from User where emailId = ?");
				q.setString(0, emailId);
				List<User> li = q.list();
				String pass = null;
				if(!li.isEmpty())
					pass = li.get(0).getPassword();
				tr.commit();
				session.flush();
				session.close();
				return pass;
			}
			
		});
		return password;
	}

	

	
	
	
}
