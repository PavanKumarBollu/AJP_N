package com.pavan.test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pavan.model.AccountVersion;
import com.pavan.util.HibernateUtil;

public class InsertApp {

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
				AccountVersion accountDetails = session.get(AccountVersion.class, 1);
			
				accountDetails.setDob(LocalDate.of(2001, 8, 23));
				
				
				session.merge(accountDetails);
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
