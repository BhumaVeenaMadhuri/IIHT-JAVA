package com.coursemanagement.services;

import java.util.List;

import com.coursemanagement.models.Course;
import com.coursemanagement.models.Student;

public interface AdminServices {
	public boolean addCourse(Course course);
	public boolean deleteCourse(int eid);
	public boolean updateEmployee(int courseId,String courseNname);
	public Course getCourse(int eid);
	public List<Course> showAllCourses();
	public List<Student> showAllStudents();

}
