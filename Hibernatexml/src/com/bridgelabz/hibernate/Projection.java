package com.bridgelabz.hibernate;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import java.util.*;


public class Projection {

	public static void main(String[] args) {
		
		
		  Configuration cfg=new Configuration();
          cfg.configure("hibernate.cfg.xml");
     SessionFactory sf=cfg.buildSessionFactory();
     Session session=sf.openSession();
     Transaction t=session.beginTransaction();
  Criteria c=session.createCriteria(Employee.class);
  ProjectionList plist=Projections.projectionList();
  
  Projection pname=Projections.property("name");
  Projection psal=Projections.proeprty("salary");
   
     plist.add(pname);
     plist.add(psal);
  
     c.setProjection(plist);
     List list=c.list();
     Iterator i=list.iterator();
     while(i.hasNext())
     {
        Object obj[]=(Object[])i.next();
System.out.println(obj[0]+"\t"+obj[1]);
      }
	  
		
		

	}

}
