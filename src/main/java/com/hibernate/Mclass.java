package com.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Employee;

public class Mclass {
	
	public static void main(String args[])
	

	{
		
		Employee e=new Employee(2,"ram","noida",25000);
		Employee e1=new Employee(3,"shyam","noida",25000);
		Employee e2=new Employee(4,"rahul","noida",25000);
		Employee e3=new Employee(5,"amit","noida",25000);
		
		Configuration cfg=new Configuration().configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
	
		Transaction tx= session.beginTransaction();
		session.save(e);
		session.save(e1);
		session.save(e2);
		session.save(e3);

		tx.commit();
			
		System.out.println("done............");
		
	
	}

}
