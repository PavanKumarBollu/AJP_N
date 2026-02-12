package com.pavan.persistence;

import org.hibernate.Hibernate;
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

		if (session != null) {
			course = session.get(Course.class, id);
		}

		return course;
	}

	public String insertCourse(Course course) {
		session = HibernateUtil.getSession();
		String msg = null;

		if (session != null) {
			transaction = session.beginTransaction();
		}
		if (transaction != null) {
			session.persist(course);
			transaction.commit();
			msg = "Course Has been Saved To the Database";
		}
		else
		{
			msg = "Course Has Not Saved to the database";
			transaction.rollback();
		}

		return msg;
	}

	public String updateCourseById(Course course) {

		session = HibernateUtil.getSession();
		Course c = getCourseById(course.getId());
		String msg = null;

		if (c != null) {
			transaction = session.beginTransaction();
			if (course.getCourseCode() != null)
				c.setCourseCode(course.getCourseCode());
			if (course.getCourseName() != null)
				c.setCourseName(course.getCourseName());
			if (course.getCourseAlis() != null)
				c.setCourseAlis(course.getCourseAlis());
			if (course.getEligibility() != null)
				c.setEligibility(course.getEligibility());
			if (course.getMinBatchSize() != null)
				c.setMinBatchSize(course.getMaxBatchSize());
			if (course.getMaxBatchSize() != null)
				c.setMaxBatchSize(course.getMaxBatchSize());
			if (course.getCourseFee() != null)
				c.setCourseFee(course.getCourseFee());
			if (course.getPlacementSupport() != null)
				c.setPlacementSupport(course.getPlacementSupport());
			if (course.getPreScreeingReq() != null)
				c.setPreScreeingReq(course.getPreScreeingReq());
			if (course.getTotalDurationHours() != null)
				c.setTotalDurationHours(course.getTotalDurationHours());
			if (course.getIltHours() != null)
				c.setIltHours(course.getIltHours());
			if (course.getSelfLearningHours() != null)
				c.setSelfLearningHours(course.getSelfLearningHours());
			if (course.getIltProjectHours() != null)
				c.setIltProjectHours(course.getIltProjectHours());
			if (course.getLeraningProjectHours() != null)
				c.setLeraningProjectHours(course.getLeraningProjectHours());
			if (course.getRevisionHours() != null)
				c.setRevisionHours(course.getRevisionHours());
			if (course.getTotalCertifications() != null)
				c.setTotalCertifications(course.getTotalCertifications());

			session.merge(c);
			transaction.commit();
			msg = "Course Got Updated to the database ";
		} else {
			msg = "Course not found with the given id";
			transaction.rollback();
		}

		return msg;
	}

	public String deleteCourseById(Long id) {
		
		String msg = null;
		session = HibernateUtil.getSession();
		transaction = session.beginTransaction();
		Course course = getCourseById(id);
		
		if(course != null)
		{
			
			session.remove(course);
			transaction.commit();
			msg = "Course Has been delted to from the database";
		}
		else
		{
			msg = "Please enter the valid course id : " + id;
			transaction.rollback();
			
		}
		
		
		return msg;
	}

}
