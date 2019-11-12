package com.bridgelabz.prototype;

import java.util.List;

public class Prototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		

		Employee emp=new Employee();
		emp.loaddata();
		
		
		Employee emp1=(Employee) emp.clone();
		Employee emp2=(Employee) emp.clone();
		
		
		List<String> list =emp1.getEmpList();
		list.add("mark");
		List<String> list1=emp2.getEmpList();
		list.remove("dipak");
 		
		
		System.out.println("Emp  list :"+emp.getEmpList());
		System.out.println("emp1 list :"+list);
		System.out.println("emp2 list :"+list1);

	}

}
