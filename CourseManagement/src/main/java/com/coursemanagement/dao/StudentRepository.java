package com.coursemanagement.dao;

import org.springframework.data.repository.CrudRepository;

import com.coursemanagement.models.Student;


public interface StudentRepository extends CrudRepository<Student, Integer> {

	public Student findByUserName(String username);
	
}
