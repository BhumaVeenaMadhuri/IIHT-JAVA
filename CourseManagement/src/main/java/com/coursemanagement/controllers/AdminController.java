package com.coursemanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coursemanagement.dao.AdminRepository;
import com.coursemanagement.models.Admin;
import com.coursemanagement.models.Course;
import com.coursemanagement.services.AdminServices;

@Controller
public class AdminController {
	@Autowired
	public AdminRepository adminRepository;
	
	
	@RequestMapping(value="/adminlogin",method=RequestMethod.GET)
	public String displayAdminLogin(Model model)
	{
		Admin a=new Admin();
		model.addAttribute("login", a);
	
		return "adminlogin";
	}
	@RequestMapping(value = "/adminLogin",method=RequestMethod.POST)
	public String login(@ModelAttribute ("login") Admin admin,Model model)
	{
		String username="veena";
		String word="veena123";
		String mesg="";
		if((username.equals(admin.getUserName()))&&(word.equals(admin.getPassword())))
		{
			mesg="Successfully loged in";
			model.addAttribute("message", mesg);
		return "Admin";
		}
		else
		{
			 mesg="invalid username & Password";
			model.addAttribute("message", mesg);
			return "adminlogin";
		}
	}
	

}
