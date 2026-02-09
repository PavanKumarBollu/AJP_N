package com.pavan.test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pavan.model.Account;
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
				Account account = new Account();
				account.setAccountNo(123456L);
				account.setaName("NoBody");
				account.setIfscCode("UBIN0004177");
				
				
				account.setDob(LocalDate.of(2001, 6, 15));
				account.setCreatedAt(LocalDateTime.of(2015,10,11,12,30));
				
				session.persist(account);
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
