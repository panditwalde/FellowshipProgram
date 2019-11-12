package com.bridgelabz.clinique.model;

public class Doctor {

	private int id;

	public Doctor() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public int getAmCount() {
		return amCount;
	}

	public void setAmCount(int amCount) {
		this.amCount = amCount;
	}

	public int getPmCount() {
		return pmCount;
	}

	public void setPmCount(int pmCount) {
		this.pmCount = pmCount;
	}

	public Doctor(int id, String name, String availability, String specialization, int amCount, int pmCount) {
		super();
		this.id = id;
		this.name = name;
		this.availability = availability;
		this.specialization = specialization;
		this.amCount = amCount;
		this.pmCount = pmCount;
	}

	private String name;
	private String availability;
	private String specialization;
	int amCount = 0;
	int pmCount = 0;

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", availability=" + availability + ", specialization="
				+ specialization + ", amCount=" + amCount + ", pmCount=" + pmCount + "]";
	}


}
