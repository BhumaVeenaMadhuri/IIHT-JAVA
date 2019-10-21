package com.coursemanagement.dao;

import org.springframework.data.repository.CrudRepository;

import com.coursemanagement.models.Admin;
import com.coursemanagement.models.Student;

public interface AdminRepository extends CrudRepository<Admin, Integer> {
	public Admin findByUserName(String username); 
}
