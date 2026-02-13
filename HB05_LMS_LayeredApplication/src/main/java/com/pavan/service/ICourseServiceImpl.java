package com.pavan.service;

import com.pavan.entity.Course;
import com.pavan.persistence.ICourseDao;
import com.pavan.persistence.ICourseDaoImpl;

public class ICourseServiceImpl implements ICourseService {

	private static ICourseDao dao;

	static {

		dao = new ICourseDaoImpl();
	}

	public ICourseServiceImpl() {
	}

	public Course getCourseById(Long id) {
		Course course = dao.getCourseById(id);
		return course;
	}

	public String insertCourse(Course course) {
		return dao.insertCourse(course);
	}

	public String updateCourseById(Course course) {
		return dao.updateCourseById(course);
	}

	public String deleteCourseById(Long id) {
		return dao.deleteCourseById(id);
	}

}
