package com.cdac.cntr;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.dto.User;
import com.cdac.service.UserService;
import com.cdac.valid.UserValidator;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserValidator userValidator;
	
	@Autowired
	private MailSender mailSender;
	
	
	@RequestMapping(value = "/prep_reg_form.htm", method = RequestMethod.GET)
	public String prepRegForm(ModelMap map)
	{
		map.put("user", new User());
		return "reg_form";
	}
	
	@RequestMapping(value = "/reg.htm",method = RequestMethod.POST)
	public String register(User user,ModelMap map)
	{
		userService.addUser(user);
		return "index";
	}
	
	@RequestMapping(value ="/prep_log_form.htm",method = RequestMethod.GET)
	public String prepLogForm(ModelMap map)
	{	
		map.put("user", new User());
		return "login_form";
		
	}
	
	@RequestMapping(value ="/login.htm",method = RequestMethod.POST)
	public String login(User user, BindingResult result ,ModelMap map,HttpSession session)
	{	
		userValidator.validate(user, result);
		if(result.hasErrors())
		{
			return "login_form";
		}
		
		boolean b = userService.findUser(user);
		if(b)
		{
			session.setAttribute("user", user);
			return "home";
		}
		else {
			map.put("user", new User());
			return "login_form";
		}
	
		
	}
	
	
	@RequestMapping(value = "/detail_list.htm",method = RequestMethod.GET)
	public String allExpenses(ModelMap map , HttpSession session)
	{
		int userId = ((User)session.getAttribute("user")).getUserId();
		List<User> li = userService.selectAll(userId);
		map.put("detailList", li);
		return "detail_list";
	}
	
	
	@RequestMapping(value = "/home.htm",method = RequestMethod.GET)
	public String userDetail(ModelMap map, HttpSession session)
	{	
		int userId = ((User)session.getAttribute("user")).getUserId();
		List<User> li = userService.selectAll(userId);
		map.put("userDetail", li);
		return "home";
	}
	
	@RequestMapping(value = "/forgot_password.htm",method = RequestMethod.POST)
	public String forgotPassword(@RequestParam String userName,ModelMap map) {		
		String pass = userService.forgotPassword(userName);
		String msg = "you are not registered";
		if(pass!=null) {	
			
			SimpleMailMessage message = new SimpleMailMessage();  
	        message.setFrom("sanjitshelke@gmail.com");  
	        message.setTo(userName);  
	        message.setSubject("Your password");  
	        message.setText(pass);  
	        //sending message   
	        mailSender.send(message);
			msg = "check the mail for password";
		}
		map.put("msg", msg);
		return "info";
	}
	
	
//	@RequestMapping(value = "/update_details_form.htm",method = RequestMethod.GET)
//	public String updateUserDetails(@RequestParam int userId, User user, ModelMap map)
//	{	System.out.println(user);
//	    System.out.println(userId);
//	   
//		User use = userService.findUser(userId);
//		map.put("user", use);
//		return "user_detail_update";		
//	}
//	
//	@RequestMapping(value = "/update_detail.htm",method = RequestMethod.POST)
//	public String updateDetail(User user,ModelMap map, HttpSession session)
//	{
//		int userId = ((User)session.getAttribute("user")).getUserId();
//		user.setUserId(userId);
//		userService.modifyUser(user);
//		
//		List<User> li = userService.selectAll(userId);
//		map.put("userList", li);
//		
//		return "detail_list";	
//	}
}
