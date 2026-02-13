package com.pavan.controller;

import java.util.Scanner;

import com.pavan.entity.Course;
import com.pavan.service.ICourseService;
import com.pavan.service.ICourseServiceImpl;

public class TestApp {

	private static ICourseService service = null;

	static
	{
		service = new ICourseServiceImpl();
	}
	public static Course getCourseById(Long id) {
		return service.getCourseById(id);
	}

	public static String insetNewCourse(Course ic, Scanner sc)
	{
		System.out.println("Enter the Course Code * : ");
		ic.setCourseCode(sc.next());
		System.out.println("Enter The Course Name * : ");
		ic.setCourseName(sc.next());
		
		System.out.println("Enter courseAlis : ");
		ic.setCourseAlis(sc.next());
		
		System.out.println("Enter Course Eligibility : ");
		ic.setEligibility(sc.next());
		
		System.out.println("Enter minimum batch size : ");
		ic.setMinBatchSize(sc.nextInt());
		
		System.out.println("Enter Maximum  batch size : ");
		ic.setMaxBatchSize(sc.nextInt());
		
		System.out.println("Enter the Course fee : ");
		ic.setCourseFee(sc.nextDouble());
		
		System.out.println("Enter is placement support needed :");
		ic.setPlacementSupport(sc.nextBoolean());
		
		System.out.println("Enter is PreScreening needed :");
		ic.setPreScreeingReq(sc.nextBoolean());
						
		System.out.println("Enter the Total Course Duration");
		ic.setTotalDurationHours(sc.nextInt());
		
		System.out.println("Enter the Total Ilt Duration");
		ic.setIltHours(sc.nextInt());
		
		System.out.println("Enter the Total Self Learning Hours");
		ic.setSelfLearningHours(sc.nextInt());
		
		System.out.println("Enter the Total Ilt Project Hours : ");
		ic.setIltProjectHours(sc.nextInt());
		
		
		System.out.println("Enter the Total Total Revision Hours");
		ic.setRevisionHours(sc.nextInt());
		
		
		System.out.println("Enter the Total Certification Count");
		ic.setTotalCertifications(sc.nextInt());
		
		System.out.println("Enter the Course Current Status : ");
		ic.setStatus(sc.next());
		
		
		System.out.println("Enter your Employee Id : ");
		ic.setCreatedby(sc.next());
		
		
		return service.insertCourse(ic);
			
	}
	
	
	
	
	public static String updateTheCourse(Long id, Scanner sc)
	{
		Course uo = getCourseById(id);
		
		Course course = new Course();
		System.out.println("The course Id : " + uo.getId());
		
		
		System.out.println("The Course Code * : " + uo.getCourseCode());
		course.setCourseCode(sc.next());
		System.out.println("Enter The Course Name * : " + uo.getCourseName());
		course.setCourseName(sc.next());
		
		System.out.println("Enter courseAlis : " + uo.getCourseAlis());
		course.setCourseAlis(sc.next());
		
		System.out.println("Enter Course Eligibility : " + uo.getEligibility());
		course.setEligibility(sc.next());
		
		System.out.println("Enter minimum batch size : " + uo.getMinBatchSize());
		course.setMinBatchSize(sc.nextInt());
		
		System.out.println("Enter Maximum  batch size : " + uo.getMaxBatchSize());
		course.setMaxBatchSize(sc.nextInt());
		
		System.out.println("Enter the Course fee : " + uo.getCourseFee());
		course.setCourseFee(sc.nextDouble());
		
		System.out.println("Enter is placement support needed : " +uo.getPlacementSupport() );
		course.setPlacementSupport(sc.nextBoolean());
		
		System.out.println("Enter is PreScreening needed : " + uo.getPreScreeingReq());
		course.setPreScreeingReq(sc.nextBoolean());
						
		System.out.println("Enter the Total Course Duration " + uo.getTotalDurationHours());
		course.setTotalDurationHours(sc.nextInt());
		
		System.out.println("Enter the Total Ilt Duration : " + uo.getIltHours());
		course.setIltHours(sc.nextInt());
		
		System.out.println("Enter the Total Self Learning Hours " + uo.getSelfLearningHours());
		course.setSelfLearningHours(sc.nextInt());
		
		System.out.println("Enter the Total Ilt Project Hours : " + uo.getIltProjectHours());
		course.setIltProjectHours(sc.nextInt());
		
		
		System.out.println("Enter the Total Total Revision Hours " + uo.getRevisionHours());
		course.setRevisionHours(sc.nextInt());
		
		
		System.out.println("Enter the Total Certification Count " + uo.getTotalCertifications());
		course.setTotalCertifications(sc.nextInt());
		
		System.out.println("Enter the Course Current Status : " + uo.getStatus());
		course.setStatus(sc.next());
		
		
		System.out.println("Enter your Employee Id : " + uo.getCreatedby());
		course.setCreatedby(sc.next());
		
		
// setting up the user entered values to the Object
		if (course.getCourseCode() != null)
			uo.setCourseCode(course.getCourseCode());
		if (course.getCourseName() != null)
			uo.setCourseName(course.getCourseName());
		if (course.getCourseAlis() != null)
			uo.setCourseAlis(course.getCourseAlis());
		if (course.getEligibility() != null)
			uo.setEligibility(course.getEligibility());
		if (course.getMinBatchSize() != null)
			uo.setMinBatchSize(course.getMaxBatchSize());
		if (course.getMaxBatchSize() != null)
			uo.setMaxBatchSize(course.getMaxBatchSize());
		if (course.getCourseFee() != null)
			uo.setCourseFee(course.getCourseFee());
		if (course.getPlacementSupport() != null)
			uo.setPlacementSupport(course.getPlacementSupport());
		if (course.getPreScreeingReq() != null)
			uo.setPreScreeingReq(course.getPreScreeingReq());
		if (course.getTotalDurationHours() != null)
			uo.setTotalDurationHours(course.getTotalDurationHours());
		if (course.getIltHours() != null)
			uo.setIltHours(course.getIltHours());
		if (course.getSelfLearningHours() != null)
			uo.setSelfLearningHours(course.getSelfLearningHours());
		if (course.getIltProjectHours() != null)
			uo.setIltProjectHours(course.getIltProjectHours());
		if (course.getLeraningProjectHours() != null)
			uo.setLeraningProjectHours(course.getLeraningProjectHours());
		if (course.getRevisionHours() != null)
			uo.setRevisionHours(course.getRevisionHours());
		if (course.getTotalCertifications() != null)
			uo.setTotalCertifications(course.getTotalCertifications());
		
	
		return service.insertCourse(uo);
			
	}
	
	
	public static String deleteCourseById(Long id) {
		return service.deleteCourseById(id);
	}

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		Boolean flag = true;
		String result = null;
		System.out.println("Hey User How are you Today .... How can i help you ..?");

		while (flag) {


			System.out.println("Please select the any one of the following opetion");
			System.out.println();

			System.out.println("	1. for View Course	 ");
			System.out.println("	2. for Insert Course ");
			System.out.println("	3. for Update Course 	");
			System.out.println("	4. for delete Course 	");
			System.out.println("	5. for Exit 			");
			System.out.println();
			System.out.println("what is your choice : [ 1 | 2 | 3 | 4 | 5 ] : ");
			Integer uChoice = sc.nextInt();
			System.out.println();

			switch (uChoice) {
			case 1:
				System.out.println("Please Enter the course Id :: ");
				Long cId = sc.nextLong();
				Course course  = getCourseById(cId);
				System.out.println(course);
				System.out.println();

				break;
			case 2:
				Course ic = new Course();
				result = insetNewCourse(ic, sc);
				System.out.println(result);
				System.out.println();
				
				break;
			case 3:
				System.out.println("Enter the course Id : ");
				Long id = sc.nextLong();
				result = updateTheCourse(id, sc);
				System.out.println(result);
				break;
			case 4:
				System.out.println("Please Enter the course Id :: ");
				Long dId = sc.nextLong();
					result = deleteCourseById(dId);
				System.out.println(result);
				System.out.println();

				break;
			case 5:
				break;
			default:
				break;
			}

		}


	}
}
