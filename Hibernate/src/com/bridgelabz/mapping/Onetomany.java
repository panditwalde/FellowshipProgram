package com.bridgelabz.mapping;

import java.util.LinkedHashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridglabz.model.Course;
import com.bridglabz.model.Student;

public class Onetomany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		
		Course c=new Course();
		c.setId(1);
		c.setName("java");
		Student s1=new Student();
		s1.setId(1);
		s1.setName("pandit");
		Student s2=new Student();
		
		s2.setId(2);
		s2.setName("ajay");
		
		
		Student s3=new Student();
		s3.setId(3);
		s3.setName("dipak");
		
		
	   Set s=new LinkedHashSet();
	   s.add(s1);
	   s.add(s2);
	   s.add(s3);
	   c.setStudents(s);
	   session.save(c);
	   t.commit();
	   session.close();
	   System.out.println("success...........");
	

	}

}
