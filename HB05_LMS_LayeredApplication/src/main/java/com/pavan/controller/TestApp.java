package com.pavan.controller;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pavan.entity.Course;
import com.pavan.service.ICourseService;
import com.pavan.service.ICourseServiceImpl;
import com.pavan.util.HibernateUtil;

public class TestApp {
	public static void main(String[] args) {
		
		ICourseService service = new ICourseServiceImpl();
		
		Course course = service.getCourseById(2l);
		
		System.out.println(course);
		
		
		
		
		
		

	//InsertCourse();

		// Course course = getCourse(1L);
		// System.out.println(course);

		// for updating the course we need to check first weather the course is
		// available in the database
		// or not if available then only we can do the updation otherwise we can't do
		// the update part

//		Course courseToBeUpdated = getCourse(1L);
//		
//		if(courseToBeUpdated != null)
//		{
//			courseToBeUpdated.setSelfLearningHours(15);
//			updateCourse(courseToBeUpdated);
//		}

	//	deleteCourse(1l);

	}

	public static Course getCourse(Long id) {

		Session session = null;
		Course course = null;
		try {
			// get the session Object with respect to the course

			session = HibernateUtil.getSession();

			if (session != null) {
				course = session.get(Course.class, id);
			}

			if (course != null)
				return course;
			else
				return null;

		} catch (HibernateException he) {
			he.printStackTrace();
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {

//			HibernateUtil.closeSession(session);
			// HibernateUtil.closeSessionFactory();

		}

		return null;
	}

	private static void InsertCourse() {
		// Insert the New Course to the database

		Session session = null;
		Transaction transaction = null;
		boolean flag = false;

		try {
			// get the session Object with respect to the course

			session = HibernateUtil.getSession();

			if (session != null)
				transaction = session.beginTransaction();

			if (transaction != null) {
				Course course = new Course();

				course.setCourseName("JavaBackendDevelopment");
				course.setCourseCode("AdvancedJavaProgramming");
				course.setCourseAlis("AJP_N");
				course.setMinBatchSize(30);
				course.setCourseFee(1500.00);
				course.setIltHours(170);
				course.setTotalDurationHours(230);
				course.setCreatedby("ANP-3634");
				course.setStatus("Active");

				session.persist(course);
				flag = true;

			}

		} catch (HibernateException he) {
			he.printStackTrace();
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (flag) {
				transaction.commit();
				System.out.println("Course Hasbeen Saved To the Database");
			} else {
				transaction.rollback();
				System.out.println("course not saved to the database");
			}

//			HibernateUtil.closeSession(session);
			// HibernateUtil.closeSessionFactory();

		}
	}

	private static void updateCourse(Course course) {
		// Update the Course to the database

		Session session = null;
		Transaction transaction = null;
		boolean flag = false;

		try {
			// get the session Object with respect to the course

			session = HibernateUtil.getSession();

			if (session != null)
				transaction = session.beginTransaction();

			if (transaction != null) {

				session.merge(course);
				flag = true;

			}

		} catch (HibernateException he) {
			he.printStackTrace();
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (flag) {
				transaction.commit();
				System.out.println("Course Hasbeen Updated To the Database");
			} else {
				transaction.rollback();
				System.out.println("course not Updated to the database");
			}

//			HibernateUtil.closeSession(session);
			// HibernateUtil.closeSessionFactory();

		}
	}

	private static void deleteCourse(Long id) {
		Session session = null;
		Transaction transaction = null;
		try {
			// get the session Object with respect to the course

			session = HibernateUtil.getSession();

			if (session != null) {
				transaction = session.beginTransaction();
				if (transaction != null) {
					Course course = getCourse(id);
					if (course != null) {
						session.remove(course);
						transaction.commit();
					}

				}

			}

		} catch (HibernateException he) {
			he.printStackTrace();
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
