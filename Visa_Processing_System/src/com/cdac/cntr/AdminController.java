package com.cdac.cntr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cdac.dto.Admin;
import com.cdac.dto.User;
import com.cdac.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	

	@RequestMapping(value = "/admin_prep_reg.htm",method = RequestMethod.GET)
	public String adminRegForm(ModelMap map)
	{
		
		map.put("admin", new Admin());
		return "admin_reg_form";			
	}
	
	@RequestMapping(value = "/reg_admin.htm",method = RequestMethod.POST)
	public String register(ModelMap map, Admin admin)
	{	
		adminService.addAdmin(admin);
		return "adminIndex";
		
	}
	
	@RequestMapping(value = "/admin_prep_login.htm",method = RequestMethod.GET)
	public String adminLogForm(ModelMap map)
	{
		map.put("admin", new Admin());
		return "admin_login_form";
		
	}
	
	@RequestMapping(value ="/adminlogin.htm",method = RequestMethod.POST)
	public String login(Admin admin,ModelMap map)
	{	
		boolean b = adminService.findAdmin(admin);
		if(b)
		{
			return "home";
		}
		else {
			map.put("user", new Admin());
			return "admin_login_form";
		}
	}
	
	
	@RequestMapping(value = "/user_list.htm",method = RequestMethod.GET)
	public String allUser(ModelMap map)
	{
		
		return "user_list";
		
	}
}
