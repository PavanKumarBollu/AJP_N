package com.pavan.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pavan.model.Student;
import com.pavan.util.HibernateUtil;


public class Update3 {

	public static void main(String[] args) {
		Session session = null;
		Transaction transaction  = null;
		boolean flag = false;
		
		Integer sId = 123;
		
		try {
			
			session = HibernateUtil.getSession();
			Student student = session.get(Student.class, 123);
			System.out.println(student);
			
			System.in.read();
			
			if(session != null)
			{
				
				transaction = session.beginTransaction();
			}
			
			if(transaction != null)
			{
				
			
				if(student != null)
				{
					student.setcName("Hibernate");
					session.update(student);
					flag = true;
				}
			
			}
			
			
		}catch(HibernateException e)
		{
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			if(flag)
			{
				transaction.commit();
				System.out.println("Object has been updated for id : " + sId);
			}else
			{
				transaction.rollback();
				System.out.println("Object has not been updated for id : " + sId);
			}
			
			
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}

	}

}
