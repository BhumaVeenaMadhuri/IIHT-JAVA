package com.coursemanagement.dao;

import org.springframework.data.repository.CrudRepository;

import com.coursemanagement.models.Course;

public interface CourseRepository extends CrudRepository<Course, Integer> {

}
