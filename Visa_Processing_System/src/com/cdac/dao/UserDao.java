package com.cdac.dao;

import java.util.List;

import com.cdac.dto.User;

public interface UserDao {
	
	void InsertUser(User user);
	
	boolean checkUser(User user);
	
	List<User> selectAll(int userId);
	
	void updateDetail(User user);
	
	User selectUser(int userId);
	
	List<User> selectAll();
	
	String forgotPassword(String emailId);
}
