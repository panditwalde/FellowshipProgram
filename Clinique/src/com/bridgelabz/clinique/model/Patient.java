package com.bridgelabz.clinique.model;

public class Patient {

	String name;
	int id;
	String phone;
	int age;
	
		

	public Patient() {
		super();
	}

	public Patient(String name, int id, String phone, int age) {

		this.name = name;
		this.id = id;
		this.phone = phone;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {

		return name + " " + id + " " + phone + " " + age;
	}

}
