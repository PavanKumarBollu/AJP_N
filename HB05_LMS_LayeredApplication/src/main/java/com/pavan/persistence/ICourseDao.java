package com.pavan.persistence;

import com.pavan.entity.Course;

public interface ICourseDao {
	
	public Course getCourseById(Long id);
	
	public String insertCourse(Course course);
	
	public String updateCourseById(Course course);
	
	public String deleteCourseById(Long id);

}
