package com.pavan.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pavan.entity.Course;
import com.pavan.util.HibernateUtil;

public class TestApp {

	public static void main(String[] args) {

		// Insert the New Course to the database
		
		
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;

		try {
			// get the session Object with respect to the course
			
			session = HibernateUtil.getSession();
			
			if(session!=null)
				transaction = session.beginTransaction();
			
			if(transaction != null)
			{
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
				flag =true;
				
			}
			

		} catch (HibernateException he) {
			he.printStackTrace();
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			if(flag)
			{
				transaction.commit();
				System.out.println("Course Hasbeen Saved To the Database");
			}
			else
			{
				transaction.rollback();
				System.out.println("course not saved to the database");
			}
			
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();

		}

	}

}
