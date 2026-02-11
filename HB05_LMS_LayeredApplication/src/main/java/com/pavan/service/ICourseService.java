package com.pavan.service;

import com.pavan.entity.Course;

public interface ICourseService {
	
	
	public Course getCourseById(Long id);
	
	public String insertCourse(Course course);
	
	public String updateCourseById(Course course);
	
	public String deleteCourseById(Long id);

}
