package com.pavan.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pavan.model.AccountVersion;

public class HibernateUtil {
	
	private HibernateUtil() {} // to stop the users from creating the objects of this class
	
	
	private static SessionFactory sessionFactory = null;
	
	private static Session session = null;
	
	
	static
	{
		sessionFactory = new Configuration().configure().addAnnotatedClass(AccountVersion.class).buildSessionFactory();
	}
	
	
	public static Session getSession()
	{
		if(session == null)
			session = sessionFactory.openSession();
		return session;
	}
	
	
	// close the used resources 
	
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
