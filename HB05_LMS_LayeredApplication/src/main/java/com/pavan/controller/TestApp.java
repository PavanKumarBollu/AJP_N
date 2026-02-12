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
//		
//		Course course = service.getCourseById(2l);
//		
//		System.out.println(course);
//		
//		Course course = new Course();
//
//		course.setCourseName("React Development");
//		course.setCourseCode("FRD");
//		course.setCourseAlis("FRD_N");
//		course.setMinBatchSize(20);
//		course.setCourseFee(1200.00);
//		course.setIltHours(200);
//		course.setTotalDurationHours(250);
//		course.setCreatedby("ANP-3634");
//		course.setStatus("Active");
		
		
//		String result=service.insertCourse(course);
//		System.out.println(result);
		
		
		
		// update method test
		
//		Course c = new Course();
//		
//		c.setId(3l);
//		c.setEligibility("Bsc Computer science");
//		
//		String result= service.updateCourseById(c);
//		System.out.println(result);
		
		
		
		
		
		// delete the course by using the id
		
		Long courseId = 2l;
		
		String result = service.deleteCourseById(courseId);
		
		System.out.println(result);
		
		
	}
}
