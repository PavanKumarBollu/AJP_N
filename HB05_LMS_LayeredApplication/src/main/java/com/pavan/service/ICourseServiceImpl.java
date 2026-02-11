package com.pavan.service;

import com.pavan.entity.Course;
import com.pavan.persistence.ICourseDao;
import com.pavan.persistence.ICourseDaoImpl;

public class ICourseServiceImpl implements ICourseService {
	
	private ICourseDao dao;
	
	public ICourseServiceImpl ()
	{
		dao = new ICourseDaoImpl();
	}
	
	

	public Course getCourseById(Long id) {
		Course course = dao.getCourseById(id);
		return course;
	}

	public String insertCourse(Course course) {
		// TODO Auto-generated method stub
		return null;
	}

	public String updateCourseById(Course course) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteCourseById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
