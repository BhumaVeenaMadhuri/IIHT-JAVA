package com.coursemanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coursemanagement.dao.StudentRepository;
import com.coursemanagement.models.Student;

@Controller
public class StudentController {

	@Autowired
		private StudentRepository studentRepository;
		
		@RequestMapping(value="/studentlogin",method=RequestMethod.GET )
		public String displayLoginForm(Model model)
		{
			Student s=new Student();
			model.addAttribute("login", s);
			return "studentlogin";
		}
			@RequestMapping(value="/studentLogin",method=RequestMethod.POST)
				public String login(@ModelAttribute("login") Student st)
				{
				 Student s =  studentRepository.findByUserName(st.getUserName());
				System.out.println(s);
				
					return "index";
				}
			@RequestMapping(value="/studentregister",method=RequestMethod.GET)
			public String dispayRegisterForm(Model model)
			{
				model.addAttribute("register",new Student());
				return "studentregister"; 
			}
			@RequestMapping(value="/studentRegister",method=RequestMethod.POST)
			public String register(@ModelAttribute("register") Student student ,Model model )
			{ 
				 Student s=studentRepository.save(student);
				 String message="";
				 if(s!=null)
			 {
//					 Student s1=new Student();
				 	//model.addAttribute("register",s1);
				 	 message="SUCESS";
				 	model.addAttribute("Message",message);
				 	model.addAttribute("login", new Student());
				 //	System.out.println("registration success");
				return "studentlogin";
			 }
				 else
				 {
					 message="fail";
					 model.addAttribute("message",message);
					  return"studentregister";
				 }
				 }
			}
				 
		 	
		
		