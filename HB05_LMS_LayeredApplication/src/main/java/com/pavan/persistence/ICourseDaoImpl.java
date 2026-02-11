package com.pavan.persistence;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pavan.entity.Course;
import com.pavan.util.HibernateUtil;

public class ICourseDaoImpl implements ICourseDao {
	
	private Session session = null;
	private Transaction transaction = null;


	public ICourseDaoImpl() {
		
	}

	public Course getCourseById(Long id) {
		Course course = null;
		
		session = HibernateUtil.getSession();
		
		if(session != null)
		{
			course = session.get(Course.class, id);
		}
		
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
