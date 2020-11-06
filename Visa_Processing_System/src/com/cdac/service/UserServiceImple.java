package com.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.UserDao;
import com.cdac.dto.User;

@Service
public class UserServiceImple implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public void addUser(User user) {
		
		userDao.InsertUser(user);
		
	}

	@Override
	public boolean findUser(User user) {
		
		return userDao.checkUser(user);
	}

	@Override
	public List<User> selectAll(int userId) {
	
		return userDao.selectAll(userId);
	}
	
	@Override
	public User findUser(int userId) {
		
		return userDao.selectUser(userId);
	}

	@Override
	public void modifyUser(User user) {
		
		userDao.updateDetail(user);
		
	}

	@Override
	public List<User> findAll() {
		
		return userDao.selectAll();
	}

	@Override
	public String forgotPassword(String emailId) {
		return userDao.forgotPassword(emailId);
	}

	

}
