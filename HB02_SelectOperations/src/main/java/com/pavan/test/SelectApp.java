package com.pavan.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.pavan.model.Student;
import com.pavan.uitl.HibernateUtil;

public class SelectApp {
	

	public static void main(String[] args) {
		
		Session session = null;
		
		
		try {
			
			
			// get()
			session = HibernateUtil.getSession();
			
			Student student = session.get(Student.class, 123);
			
			System.out.println(student);
			
			// if record not found in the database then get method will not give you any exception instead of it will give you the null value in return
			Student student2 = session.get(Student.class, 100);
			System.out.println(student2);
			
			
			// load()
			
			
		} 
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
			
		}
		
		
		
	}

}
