package com.pavan.uitl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pavan.model.Student;

public class HibernateUtil {
	
	
	private HibernateUtil() {} // nobody should crated the object of the Hibernate
	
	private static SessionFactory sessionFactory = null;
	private static Session session  = null;
	
	static
	{
		sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
	}
	
	// singleton pattern
	public static Session getSession()
	{
		if(session == null) {
		 session = sessionFactory.openSession();
		}
		return session;
	}
	
	public static void closeSession(Session session)
	{
		if(session != null)
			session.close();
	}
	
	public static void closeSessionFactory()
	{
		if(sessionFactory != null)
			sessionFactory.close();
	}

}
