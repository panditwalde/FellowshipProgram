package com.bridgelabz.clinique.model;

public class Appointment {

	String doctorName;

	public Appointment(String doctorName, int doctorId, String patientName, int patientId, String availibility,
			String patientPhone) {

		this.doctorName = doctorName;
		this.doctorId = doctorId;
		this.patientName = patientName;
		this.patientId = patientId;
		Availibility = availibility;
		this.patientPhone = patientPhone;
	}

	int doctorId;
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getAvailibility() {
		return Availibility;
	}
	public void setAvailibility(String availibility) {
		Availibility = availibility;
	}
	public String getPatientPhone() {
		return patientPhone;
	}
	public void setPatientPhone(String patientPhone) {
		this.patientPhone = patientPhone;
	}

	String patientName;
	int patientId;
	String Availibility;
	String patientPhone;
	
	
	public String toString()
	{
		return patientId+" "+patientName+ " "+ patientPhone+" "+Availibility;
	}
}
