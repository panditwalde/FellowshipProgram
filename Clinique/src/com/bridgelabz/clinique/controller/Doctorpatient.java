package com.bridgelabz.clinique.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

import com.bridgelabz.clinique.model.Appointment;
import com.bridgelabz.clinique.model.Doctor;
import com.bridgelabz.clinique.model.Patient;
import com.bridgelabz.clinique.service.Doctorpatientdata;
import com.bridgelabz.clinique.utility.Utility;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Doctorpatient implements Doctorpatientdata {

	static ObjectMapper mapper = new ObjectMapper();
	ArrayList<Patient> userlist = new ArrayList<Patient>();
	ArrayList<Doctor> doctorlist = new ArrayList<Doctor>();
	ArrayList<Appointment> appointmentlist = new ArrayList<Appointment>();
	{

		try {

			userlist = mapper.readValue(
					new File("/home/user/Desktop/pandit/Clinique/src/com/bridgelabz/clinique/respository/Patient.json"),
					new TypeReference<List<Patient>>() {
					});
			doctorlist = mapper.readValue(
					new File("/home/user/Desktop/pandit/Clinique/src/com/bridgelabz/clinique/respository/Doctor.json"),
					new TypeReference<List<Doctor>>() {
					});
			appointmentlist = mapper.readValue(new File(
					"/home/user/Desktop/pandit/Clinique/src/com/bridgelabz/clinique/respository/Appointment.json"),
					new TypeReference<List<Appointment>>() {
					});

		} catch (Exception e) {

		}
	}

	int id;
	String name;
	String availability;
	String specialization;
	String phone;
	int age;
	boolean saveflag = false;
	boolean changeflag = false;

	@Override
	public void operation() {
		try {
			int ch = 0;
			do {
				System.out.println("1. Add Doctor");
				System.out.println("2. Delete Doctor");
				System.out.println("3. Add Patients");
				System.out.println("4. Delete Patients");
				System.out.println("5. Fix Appointment & Save ");

				System.out.println("7. Exit");

				ch = Utility.readinteger();

				switch (ch) {

				case 1:
					addDoctor();
					break;
				case 2:
					deleteDoctor();
					break;
				case 3:
					addPatient();
					break;
				case 4:
					deletePatient();
					break;
				case 5:
					fixAppointment();
					save();

					break;

				case 7:
					System.out.println("exiting");
					break;
				default:
					System.out.println("Wrong choice..");
				}

			} while (ch != 7);
		} catch (Exception e) {
			System.out.println("Choice Enter only Integer");
		}

	}

	@Override
	public void addPatient() {

		System.out.println("Enter Patient name");
		name = Utility.readstring();
		System.out.println("Enter moible number");
		phone = Utility.readstring();
		System.out.println("Enter age");
		age = Utility.readinteger();
		id = 0;
		if (userlist.size() >= 1) {
			for (int i = 0; i < userlist.size(); i++) {
				if (id < userlist.get(i).getId()) {
					id = userlist.get(i).getId();
				}
			}
		}

		userlist.add(new Patient(name, id + 1, phone, age));

	}

	@Override
	public void deletePatient() {
		changeflag = true;
		saveflag = false;
		System.out.println("Enter Patient id");
		id = Utility.readinteger();
		int i = 0;
		for (i = 0; i < userlist.size(); i++) {
			if (userlist.get(i).getId() == id) {
				userlist.remove(i);
			}
		}
		if (i == userlist.size()) {
			System.out.println("No Patient Found ");
		}

	}

	@Override
	public void addDoctor() {

		System.out.println("Enter Name");
		String name = Utility.readstring();
		System.out.println("Enter Specalization");
		String specialization = Utility.readstring();
		System.out.println("Enter Availability(AM/PM/BOTH)");
		availability = Utility.readstring();
		id = 0;
		if (doctorlist.size() >= 1) {
			for (int i = 0; i < userlist.size(); i++) {
				if (id < userlist.get(i).getId()) {
					id = userlist.get(i).getId();
				}
			}
		}
		doctorlist.add(new Doctor(id + 1, name, availability, specialization, age, age));

	}

	@Override
	public void deleteDoctor() {
		System.out.println("Enter Doctor id");
		id = Utility.readinteger();
		int i = 0;
		for (i = 0; i < doctorlist.size(); i++) {
			if (i == doctorlist.size()) {
				System.out.println("invalid id");
			} else if (doctorlist.get(i).getId() == id) {
				doctorlist.remove(i);
			}
		}

	}

	@Override
	public void fixAppointment() {

		System.out.println("Enter DoctorId");
		int doctorId = Utility.readinteger();
		System.out.println("Enter PatientId");
		int patientId = Utility.readinteger();
		System.out.println("Enter Availibility");
		String avail = Utility.readstring();
		System.out.println("Enter Patient Phone Number");
		String patientphone = Utility.readstring();

		Doctor objtemp = (Doctor) doctorlist.stream().filter(i -> i.getId() == doctorId).collect(Collectors.toList())
				.get(0);
		Patient objtemp2 = (Patient) userlist.stream().filter(i -> i.getId() == patientId).collect(Collectors.toList())
				.get(0);

		if (objtemp == null || objtemp2 == null || !(objtemp2.getPhone().equals(patientphone))) {
			System.out.println("Invalid Details");
			return;
		}
		if (objtemp.getAvailability().equals(avail)) {
			if (objtemp.getAvailability().equals("AM")) {
				if (objtemp.getAmCount() > 5) {
					System.out.println("Doctor Already Have Appointments");
					return;
				} else {
					for (int i = 0; i < doctorlist.size(); i++) {
						if (doctorlist.get(i).getId() == doctorId) {
							int temp = doctorlist.get(i).getAmCount();
							doctorlist.get(i).setAmCount(temp + 1);
						}
					}
				}
			} else if (objtemp.getAvailability().equals("PM")) {
				if (objtemp.getPmCount() > 5) {
					System.out.println("Doctor Already Have Appointments");
					return;
				} else {
					for (int i = 0; i < doctorlist.size(); i++) {
						if (doctorlist.get(i).getId() == doctorId) {
							int temp = doctorlist.get(i).getPmCount();
							doctorlist.get(i).setPmCount(temp + 1);
						}
					}
				}
			}
		}

		appointmentlist
				.add(new Appointment(objtemp.getName(), doctorId, objtemp2.getName(), patientId, patientphone, avail));
		System.out.println("Appointment Fixed");

	}

	@Override
	public void save() {
		try {

			mapper.writeValue(
					new File("/home/user/Desktop/pandit/Clinique/src/com/bridgelabz/clinique/respository/Patient.json"),
					userlist);
			mapper.writeValue(new File(
					"/home/user/Desktop/pandit/Clinique/src/com/bridgelabz/clinique/respository/Appointment.json"),
					appointmentlist);
			mapper.writeValue(
					new File("/home/user/Desktop/pandit/Clinique/src/com/bridgelabz/clinique/respository/Doctor.json"),
					doctorlist);
		} catch (IOException e) {

		}

	}

}
