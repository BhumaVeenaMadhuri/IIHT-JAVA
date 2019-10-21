package com.coursemanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coursemanagement.dao.CourseRepository;
import com.coursemanagement.models.Course;
import com.coursemanagement.services.AdminServices;

@Controller
public class CourseController {
	@Autowired
	public CourseRepository courseRepository;
	
	@Autowired
	public AdminServices adminServices;
	
	@RequestMapping(value="/course",method=RequestMethod.GET)
	public String displayCourseForm(Model model)
	{
		model.addAttribute("subject",new Course());
		return "course";
	}
	@RequestMapping(value="/courses",method=RequestMethod.POST)
	public String addCourse(@ModelAttribute("subject") Course c,Model model)
	{
		String msg="course added sucessfully";
		if(c!=null)
		{
			adminServices.addCourse(c);
			model.addAttribute("message", msg);
			return "Admin";
		}
		else
		{
			msg="Failed to add";
			model.addAttribute("message", msg);
			return "course";
		}
			
	}
}

