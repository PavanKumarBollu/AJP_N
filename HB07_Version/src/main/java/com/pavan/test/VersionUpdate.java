package com.pavan.test;

import java.time.LocalDate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pavan.model.AccountVersion;
import com.pavan.util.HibernateUtil;

public class VersionUpdate {

	public static void main(String[] args) {
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;

		try {

			session = HibernateUtil.getSession();
			
			if(session != null)
			{
				 transaction = session.beginTransaction();
			}
			if(transaction != null)
			{
				
				AccountVersion accountVersion = session.get(AccountVersion.class, 1);
				System.out.println(accountVersion);
				
				accountVersion.setaName("Yadav");
				session.merge(accountVersion);
				System.out.println(accountVersion);
				flag = true;
			}
			
			
			
		} catch (HibernateException he) {
			he.printStackTrace();
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			if(flag)
			{
				transaction.commit();
				System.out.println("Account Details has been saved to database");
			}
			else
			{
				transaction.rollback();
				System.out.println("Account Details not saved...");
			}
		}

	}

}
