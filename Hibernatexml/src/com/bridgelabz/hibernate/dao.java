package com.bridgelabz.hibernate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mysql.jdbc.jdbc2.optional.SuspendableXAConnection;

public class dao {
	static Session session;
	static Transaction t;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		session = sf.openSession();
		t = session.beginTransaction();

		int ch;
		do {
			System.out.println("1.Add new user");
			System.out.println("2.Show");
			System.out.println("3.Delete");
			System.out.println("4.update");
			System.out.println("5.Search");
			System.out.println("6.Exit");
			System.out.println("Enter your choice");
			ch = scan.nextInt();
			switch (ch) {
			case 1:
				add_new_user();
				break;
			case 2:
				show();
				break;
			case 3:
				delete();
				break;
			case 4:
				update();
				break;
			case 5: {
				System.out.println("Enter  Id");
				int search = scan.nextInt();
				search(search);
				break;
			}
			case 6: {
				System.out.println("Existing");
				System.exit(0);
			}
			default:
				System.out.println("invalid choice..");
			}
		} while (ch != 6);

		t.commit();
		session.close();

	}

	public static int search(int search) {

		Query q = session.createQuery(" from Student where Id =" + search + " ");

		List<Student> list = q.list();
		for (Student s : list) {
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getAddress());
			System.out.println(s.getPhone());
			System.out.println(s.getAge());
			System.out.println(s.getCourse());
		}
		return search;

	}

	public static void update() {

	
		 System.out.println("Enter  Id");
		 int id = scan.nextInt(); int value = checkid(id);
		 
		 if (value > 0) {
		
		Student s = new Student();
        
		//s.setId(id);
		System.out.println("Enter the name");
		String name=scan.next();
		System.out.println("Enter the Address");
		String address=scan.next();
		
		System.out.println("Enter the age");
		int age=scan.nextInt();
		
		System.out.println("Enter the Course");
		String course=scan.next();
	
		System.out.println("Enter the moible number");
		String phone=scan.next();
		

		s.setName(name);
		s.setAge(age);
		s.setAddress(address);
		s.setPhone(phone);
		s.setCourse(course);
		session.update(s);
		t.commit();
		session.close();
		System.out.println("Record Updated");
			
		 }


	}

	public static int checkid(int id) {

		Query q = session.createQuery(" from Student where Id =" + id + " ");
		List<Student> list = q.list();
		for (Student s : list) {
			if (s.getId() == id)

			{

				return 1;
			}

		}

		return 0;
	}

	public static void delete() {
		try {
		System.out.println("Enter  Id");
		int id = scan.nextInt();
	    t = session.beginTransaction();
        Query q=session.createQuery("delete from Student s where s.id=?");
        q.setParameter(0, id);
        int value=q.executeUpdate();
        if(value>0)
        {
        	System.out.println("Record Deleted Success.......");
        }
        else
        {
        	System.out.println("Some Problem is there");
        }
        }catch(Exception e) {
        	
        	System.out.println("Enter id in Integer");
        }

	}

	public static void show() {

		Query q = session.createQuery(" from Student ");

		System.out.println("----------------Student details --------------------\n");

		List<Student> list = q.list();
		for (Student s : list) {
			System.out.println("Id       : " + s.getId());
			System.out.println("Name     : " + s.getName());
			System.out.println("Address  : " + s.getAddress());
			System.out.println("Phone no.: " + s.getPhone());
			System.out.println("Age      : " + s.getAge());
			System.out.println("Course   : " + s.getCourse());
			System.out.println("------------------------------------");
		}

	}

	public static void add_new_user() {
		Student s = new Student();

		System.out.println("Enter the name");
		s.setName(scan.next());
		System.out.println("Enter the Address");
		s.setAddress(scan.next());
		System.out.println("Enter the age");
		s.setAge(scan.nextInt());
		System.out.println("Enter the Course");
		s.setCourse(scan.next());
		System.out.println("Enter the moible number");
		s.setPhone(scan.next());
		session.save(s);
		t.commit();
		System.out.println("insert..................");

	}

}
