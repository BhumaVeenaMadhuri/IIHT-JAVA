package com.coursemanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coursemanagement.dao.CourseRepository;
import com.coursemanagement.models.Course;
import com.coursemanagement.models.Student;
@Component
public class AdminServicesImpl implements AdminServices{
@Autowired
public CourseRepository courseRepository;
	@Override
	public boolean addCourse(Course course) {
		 boolean f =false;
         if(course.getCourseId()>0)
         {
         	courseRepository.save(course);
         			 f =false;
            
         }
        return f;
	}

	@Override
	public boolean deleteCourse(int eid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployee(int courseId, String courseNname) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Course getCourse(int eid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> showAllCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> showAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

}
