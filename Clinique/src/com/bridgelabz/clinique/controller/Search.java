package com.bridgelabz.clinique.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

import com.bridgelabz.clinique.model.Appointment;
import com.bridgelabz.clinique.model.Doctor;
import com.bridgelabz.clinique.model.Patient;
import com.bridgelabz.clinique.service.Searching;
import com.bridgelabz.clinique.utility.Utility;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Search implements Searching{
	
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
			

		} catch (Exception e) {

		}
	}

int id;
String name;
String phone;


	@Override
	public void operation() {
		try {
		int ch = 0;
		do {
			System.out.println("\n1. Search Doctor by Name");
			System.out.println("2. Search Doctor by id");
			System.out.println("3. Search Doctor by Specialization");
			System.out.println("4. Search Doctor by Availability");
			System.out.println("5. Search Patients by Name");
			System.out.println("6. Search Patients by id");
			System.out.println("7. Search Patients by Phone");
			System.out.println("8. Exit");
			ch = com.bridgelabz.clinique.utility.Utility.readinteger();
			switch (ch) {

			case 1:
				searchByDoctorName();
				break;
			case 2:
				searchByDoctorId();
				break;
			case 3:
				searchByDoctorSpecialization();
				break;
			case 4:
				searchByDoctorAvailability();
				break;
			case 5:
				searchByPatientName();
				break;
			case 6:
				serarchByPatientid();
				break;
			case 7:
				searchByPatientphone();
				break;
			case 8:
				System.out.println("Exiting ");
				break;
			default:
				System.out.println("Wrong option");
			}
		} while (ch != 8);

		}
		catch(Exception e)
		{
			System.out.println("Enter only Integer........");
		}
}


	/**
	 *
	 */
	@Override
	public void searchByPatientName() {     //search data by patient name
		  System.out.println("Enter Patient name");
		    name=Utility.readstring();
	     List<Patient> list=userlist.stream().filter(i->i.getName().equals(name)) .collect(Collectors.toList());
          if(list.isEmpty())
          {
        	  System.out.println(name+ " : not found");
          }
          else
          {
        	  for(int i=0;i<list.size();i++)
              {
              	System.out.println(list.get(i).toString());
              }
          }
	}

	@Override
	public void serarchByPatientid() {     //search data by patient id
		System.out.println("Enter Patient Id");
	    id=Utility.readinteger();
	    
	    List<Patient> list=userlist.stream().filter(i->i.getId()==id).collect(Collectors.toList());
	   
	    if(list.isEmpty())
        {
      	  System.out.println(id +":  id not found");
        }
        else
        {
        	 System.out.println(list.get(0).toString());
        }

	}

	@Override
	public void searchByPatientphone() {  //search record by patient phone number
		// TODO Auto-generated method stub
		System.out.println("Enter patient phone number");
		phone=Utility.readstring();
		List<Patient> list=userlist.stream().filter(i->i.getPhone().equals(phone)).collect(Collectors.toList());
		 if(list.isEmpty())
         {
       	  System.out.println(phone+":  phone not found");
         }
         else
         {
        	 for(int i=0;i<list.size();i++)
             {
             	System.out.println(" Doctor "+list.get(i).toString());
             }
         }

	}

	@Override
	public void searchByDoctorName() {   //search record by doctor name
	    System.out.println("Enter Doctor name");
	    String doctorname=Utility.readstring();
	    
	    List<Doctor> list=doctorlist.stream().filter(i->i.getName().equals(doctorname)).collect(Collectors.toList());
	    if(list.isEmpty())
        {
      	  System.out.println(name+ " : not found");
        }
        else
        {
      	   System.out.println(list.toString());
        }
	}

	@Override
	public void searchByDoctorId() {
		// TODO Auto-generated method stub.
		System.out.println("Enter Doctor Id");
	    int iid=Utility.readinteger();
	    List<Doctor> list=doctorlist.stream().filter(i->i.getId()==iid).collect(Collectors.toList());
	    if(list.isEmpty())
        {
      	  System.out.println(id +":  id not found");
        }
        else
        {
        	 System.out.println(list);
        }


	    


	}

	@Override
	public void searchByDoctorSpecialization() { //serach record  by doctor Specialzation
		System.out.println("Enter Specialzation");
	    name=Utility.readstring();
	    List<Doctor> list=doctorlist.stream().filter(i->i.getName().equals(name)).collect(Collectors.toList());
	    if(list.isEmpty())
        {
      	  System.out.println(name+ " : not found");
        }
        else
        {
      	  for(int i=0;i<list.size();i++)
            {
            	System.out.println(list.get(i).toString());
            }
        }
	}

	@Override
	public void searchByDoctorAvailability() {    //serach record  by doctor availability
		System.out.println("Enter Availability");
	    name=Utility.readstring();
	    List<Doctor> list=doctorlist.stream().filter(i->i.getName().equals(name)).collect(Collectors.toList());
	    if(list.isEmpty())
        {
      	  System.out.println(name+ " : not found");
        }
        else
        {
      	  for(int i=0;i<list.size();i++)
            {
            	System.out.println(list.get(i).toString());
            }
        }
	}
	



}
