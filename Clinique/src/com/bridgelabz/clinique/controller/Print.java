package com.bridgelabz.clinique.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.clinique.model.Appointment;
import com.bridgelabz.clinique.model.Doctor;
import com.bridgelabz.clinique.model.Patient;
import com.bridgelabz.clinique.service.Display;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Print implements Display {

	static ObjectMapper mapper = new ObjectMapper();
	ArrayList<Patient> userlist = new ArrayList<Patient>();
	ArrayList<Doctor> doctorlist = new ArrayList<Doctor>();
	ArrayList<Appointment> appointmentlist = new ArrayList<Appointment>();
	{

		try {
		

			userlist = mapper.readValue(new File("/home/user/Desktop/pandit/Clinique/src/com/bridgelabz/clinique/respository/Patient.json"), new TypeReference<List<Patient>>() {
			});
			
			doctorlist = mapper.readValue(new File("/home/user/Desktop/pandit/Clinique/src/com/bridgelabz/clinique/respository/Doctor.json"), new TypeReference<List<Doctor>>() {
			});
			
			

		} catch (Exception e) {
             System.out.println("error"+e);
		}
	}
	public void operation() {   //display data  patient and doctor wise
		int ch = 0;
		do {
			System.out.println("\n1.Doctors Information");
			System.out.println("2.Patients Information");
			System.out.println("3. Exit");
			 ch=com.bridgelabz.clinique.utility.Utility.readinteger();
			switch (ch) {
			case 1:
				doctorInformation(); // print doctors data
				break;
			case 2:
				patientInformation(); // print patients data
				break;
			case 3:
				break;
			default:
				System.out.println("Invalid Entry");
			}
		} while (ch != 3);
	}


	/**
	 *
	 */
	@Override
	public void patientInformation() {	// print all patient information

		   System.out.println("--------------patient Information------------------\n");
		userlist.stream().forEach(i -> {System.out.println(i.getName() + "\t  " + i.getId() + "\t" + i.getPhone() + "\t" + i.getAge());});

	}

	@Override
	public void doctorInformation() {   // print all doctor information

		 System.out.println("--------------doctor Information------------------\n");
		doctorlist.stream().forEach(i -> {System.out.println(i.getName() + "\t  " + i.getId() + "\t" + i.getAvailability() + "\t\t" + i.getSpecialization());});
	}

}
