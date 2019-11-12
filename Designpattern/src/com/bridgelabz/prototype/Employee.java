package com.bridgelabz.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {

	private List<String> emplist;

	public Employee() {

		emplist = new ArrayList<String>();
	}

	public Employee(List<String> list) {
		this.emplist = list;
	}

	public void loaddata() {

		emplist.add("pandit");
		emplist.add("ajay");
		emplist.add("dipak");
		emplist.add("Ravi");
	}

	public List<String> getEmpList() {

		return emplist;
	}
	
	@Override
	public Object clone()throws  CloneNotSupportedException {
		
		List<String> list=new ArrayList<String>();
		for(String  s:this.getEmpList())
		{
			list.add(s);
		}
		return new  Employee(list);
		
		
		
	}

}
