package com.cdac.service;

import java.util.List;

import com.cdac.dto.User;

public interface UserService {

	void addUser(User user);
	
	boolean findUser(User user);
	
	List<User> selectAll(int userId);
	
	User findUser(int userId);
	
	void modifyUser(User user);
	
	List<User> findAll();
	
	String forgotPassword(String emailId);
	
}
