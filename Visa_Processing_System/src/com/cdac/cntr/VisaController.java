package com.cdac.cntr;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.dto.User;
import com.cdac.dto.Visa;
import com.cdac.service.VisaService;

@Controller
public class VisaController {
	
	@Autowired
	private VisaService visaService;
		
	@RequestMapping(value = "/prep_visa_add_form.htm",method = RequestMethod.GET)
	public String prepVisaAddForm(ModelMap map)
	{	
		map.put("visa", new Visa());
		return "visa_add_form";
		
	}
	
	@RequestMapping(value = "/visa_add.htm",method = RequestMethod.POST)
	public String visaAdd(Visa visa ,HttpSession session)
	{	
		int userId = ((User)session.getAttribute("user")).getUserId();
		System.out.println(userId);
		visa.setUserId(userId);
	    List<Visa> li = visaService.selectAll(userId);
		
		visaService.addVisa(visa);
		return "home";
		
	}
	
	@RequestMapping(value = "/visa_list.htm",method = RequestMethod.GET)
	public String allVisa(ModelMap map,HttpSession session)
	{	
		 int userId = ((User)session.getAttribute("user")).getUserId();
		 List<Visa> li = visaService.selectAll(userId);
		 map.put("visaList", li);
		return "visa_list";
	}
	
	@RequestMapping(value = "/visa_delete.htm",method = RequestMethod.GET)
	public String visaDelete(@RequestParam int visaId, ModelMap map,HttpSession session)
	{	
		 visaService.removeVisa(visaId);
		 int userId = ((User)session.getAttribute("user")).getUserId();
		 List<Visa> li = visaService.selectAll(userId);
		 map.put("visaList", li);
		return "visa_list";
		
	}
	
	@RequestMapping(value = "/visa_update_form.htm",method = RequestMethod.GET)
	public String visaUpdateForm(@RequestParam int visaId, ModelMap map)
	{	
		 Visa vis =  visaService.findVisa(visaId);
		map.put("visa", vis);
		return "visa_update_form";
	}
	
	@RequestMapping(value = "/visa_update.htm",method = RequestMethod.POST)
	public String visaUpdate(Visa visa, ModelMap map ,HttpSession session)
	{		
		visaService.modifyeVisa(visa);
		int userId = ((User)session.getAttribute("user")).getUserId();
	    List<Visa> li = visaService.selectAll(userId);
		map.put("visaList", li);
	
		return "visa_list";
		
	}
}
