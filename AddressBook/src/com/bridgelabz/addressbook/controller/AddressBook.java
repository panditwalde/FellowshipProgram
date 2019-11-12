package com.bridgelabz.addressbook.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.bridgelabz.addressbook.controller.CompareAddressBook.NameComparator;
import com.bridgelabz.addressbook.controller.CompareAddressBook.ZIPComparator;
import com.bridgelabz.addressbook.model.Person;
import com.bridgelabz.addressbook.service.IAddress;
import com.bridgelabz.addressbook.utility.Utility;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;

public class AddressBook implements IAddress {

	private List<Person> newList = new ArrayList<Person>();

	ObjectMapper objectmapper = new ObjectMapper();
	FileSystem fileSystem = new FileSystem();
	static File file;
	private static String fileName;

	public AddressBook() {

	}

	public void createAddressBook() {
		System.out.println("Enter File name ");
		String fileName = Utility.readstring();
		System.out.println("Enter File Extention...!!!");
		String fileExtion = Utility.readstring();
		if (fileExtion.equals(".json")) {
			@SuppressWarnings("static-access")
			File newFile = fileSystem.createNewFile(fileName.trim(), fileExtion.trim());
			setFile(newFile);
			setFileName(fileName + fileExtion);
			FileSystem.setList(newList);
			System.out.println("\nNew AddressBook Created!\n");
		} else {
			System.out.println("\nOnly .json files can be created!\n");
		}
	}

	public void openAddressBook() {
		System.out.println("Enter File name");
		String fileName = Utility.readstring();
		System.out.println("Enter FileExtention");
		String fileExtion = Utility.readstring();
		if (fileExtion.equals(".json")) // create file with .json extension
		{
			File openFile = IAddress.getPathOfFile(fileName.trim(), fileExtion.trim());
			IAddress.readFile(openFile);
			setFile(openFile);
			setFileName(fileName + fileExtion);
		} else {
			System.out.println(" Only .json  can be create");
		}
	}

	/**
	 * @param firstName add in list first name
	 * @param lastName  add in list last name
	 * @param address   add in list address
	 * @param city      add in list city
	 * @param state     add in list state
	 * @param zip       add in list zip
	 * @param phone     add in list phone number
	 */
	public void addPerson(String firstName, String lastName, String address, String city, String state, String zip,
			String phone) {
		Person personnewEntry = new Person(firstName, lastName, address, city, state, zip, phone);
		newList = FileSystem.getList();
		newList.add(personnewEntry);
		FileSystem.setList(newList);
	}

	/**
	 * @param searchName Search name in list
	 */
	public void getFullOfPerson(String searchName) {
		int index = searchPersonbyFirstName(searchName);
		if (index >= 0) {
			System.out.println(FileSystem.getList().get(index).getFirstName() + " "
					+ FileSystem.getList().get(index).getLastName());
		} else {
			System.out.println("Person Not Found");
		}
	}

	/**
	 * @param index   update data in positon on list
	 * @param address update address data in list
	 * @param city    update city data in list
	 * @param state   update state data in list
	 * @param zip     update zip data in list
	 * @param phone   update phone data in list
	 */
	@SuppressWarnings("static-access")
	public void updatePerson(int index, String address, String city, String state, String zip, String phone) {
		
		fileSystem.getList().get(index).getAddress();
		fileSystem.getList().get(index).getCity();
		fileSystem.getList().get(index).getState();
		fileSystem.getList().get(index).getZip();
		fileSystem.getList().get(index).getPhone();
		System.out.println(index);
		try {
			objectmapper.writerWithDefaultPrettyPrinter().writeValue(getFile(), fileSystem.getList());
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("Person info updated successfully ");
	}

	/**
	 * @param index remove data in position
	 */
	@SuppressWarnings("static-access")
	public void removePerson(int index) {
		fileSystem.getList().remove(index);

	}

	@SuppressWarnings("static-access")
	public void sortByPersonName() // sort list by name
	{
		newList = fileSystem.getList();
		NameComparator compareByperson = new NameComparator();
		Collections.sort(newList, compareByperson);
		AddressBookManager.printAddressBook();
	}

	@SuppressWarnings("static-access")
	public void sortByzip() // sort list by zip
	{
		newList = fileSystem.getList();
		ZIPComparator compareByZip = new ZIPComparator();
		Collections.sort(newList, compareByZip);
		AddressBookManager.printAddressBook();
	}

	@SuppressWarnings("static-access")
	public void printAll() // print all data
	{
		newList = fileSystem.getList();
		System.out.println("--------------Person Details -------------------\n");
		for (Person p : newList) {

			System.out.println("First Name : " + p.getFirstName());
			System.out.println("Last Name  : " + p.getLastName());
			System.out.println("Address    : " + p.getAddress());
			System.out.println("City       : " + p.getCity());
			System.out.println("First Name : " + p.getState());
			System.out.println("Phone Num  : " + p.getPhone());
			System.out.println("ZIP        : " + p.getZip());
			System.out.println("----------------------------------------------");

		}
	}

	// getters and Sterrs

	public List<Person> getPersonList() {
		return newList;
	}

	/**
	 * @param personList give list data in person at set it
	 */
	public void setPersonList(List<Person> personList) {
		this.newList = personList;
	}

	/**
	 * @param file set file
	 */
	public void setFile(File file) {
		AddressBook.file = file;
	}

	/**
	 * @return return file
	 */
	public File getFile() {
		return file;
	}

	/**
	 * @return retrun file name
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName set file name
	 */
	public void setFileName(String fileName) {
		AddressBook.fileName = fileName;
	}

	/**
	 * @param keyFName which first name you want to search in list
	 * @return
	 */
	public int searchPersonbyFirstName(String keyFName) {
		int index = -1;
		for (int i = 0; i < FileSystem.getList().size(); i++) {
			String personFirstName = FileSystem.getList().get(i).getFirstName();
			if (keyFName.equals(personFirstName)) {
				index = i;
				break;
			}
		}

		return index;
	}

}
