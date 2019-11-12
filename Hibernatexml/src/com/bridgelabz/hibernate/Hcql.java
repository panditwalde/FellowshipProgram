package com.bridgelabz.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class Hcql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		Criteria c=session.createCriteria(Employee.class);
		Criterion  cn=Restrictions.gt("id",1);
		c.add(cn);
		List list=c.list();
		Iterator i=list.iterator();
		while(i.hasNext())
		{
			Employee e=(Employee) i.next();
			System.out.println(e.getId()+"\t"+e.getName()+" \t"+e.getSal());
		}
		t.commit();
		session.close();
		System.out.println("Sucess..........");

	}

}
