package com.pavan.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.pavan.model.Student;
import com.pavan.uitl.HibernateUtil;

public class SelectAppLoad {
	

	public static void main(String[] args) {
		
		Session session = null;
		
		
		try {
						
			session = HibernateUtil.getSession();
			
			Student student = session.load(Student.class, 123);
			
			System.out.println(student);
			
			// if record not found in the database then get method will not give you any exception instead of it will give you the null value in return
			Student student2 = session.load(Student.class, 100);
			System.out.println(student2);
			// when object is not found then we will get the ObjectNotFoundException Exception
			// here using the load method it will create a proxy object (dummy object first) then it will go to datbase then get the detials this we call it as a lazy loading
			
			
			
			
			
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
