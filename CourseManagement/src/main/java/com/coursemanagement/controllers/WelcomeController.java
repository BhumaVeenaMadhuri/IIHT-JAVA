package com.coursemanagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
	@RequestMapping(value="/homepage",method=RequestMethod.GET)
	 public String index(Model model)
	 {
		String name ="Madhuri";
		model.addAttribute("message", name);
		 return "index";
	 }
	
}
