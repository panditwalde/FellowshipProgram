package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.service.IAddress;
import com.bridgelabz.addressbook.utility.Utility;

public class AddressBookManager {
	static AddressBook addressBook = new AddressBook();

	/**
	 * 
	 */
	@SuppressWarnings("null")
	public static void addnewCustomerBook() // create new address book
	{

		String response = null;

		if (addressBook.getFile() != null) {

			System.out.println("Existing address book is opened.." + "\n Do you want continue yes/no ");
			response = Utility.readstring();

		} else if (addressBook.getFile() == null || response.equals("yes")) {

			addressBook.createAddressBook();
		} else {
			System.out.println("\ninvalid response\n");
		}

	}

	/**
	 * 
	 */
	public static void openExistingAddressBook() { // open Existing address book
		String response = null;
		if (addressBook.getFile() != null) {
			System.out.println("Already exiting open" + "\n Do you want continue yes/no ");
			response = Utility.readstring();
		}
		if (addressBook.getFile() == null || response.equals("yes")) {
			addressBook.openAddressBook();
			System.out.println();
		} else if (response.equals("no")) {
			System.out.println("\n open with exiting file \n");
		} else {
			System.out.println("\ninvalid response!\n");
		}
	}

	/**
	 * 
	 */
	public static void addPersonInAddressBook() {   //add new person data
		if (addressBook.getFile() != null) {
			System.out.println("Enter the first name:");
			String firstName = Utility.readstring();
			System.out.println("Enter the last name:");
			String lastName = Utility.readstring();
			System.out.println("enter the address:");
			String address = Utility.readstring();
			System.out.println("enter the city:");
			String city = Utility.readstring();
			System.out.println("Enter the state:");
			String state = Utility.readstring();
			System.out.println("Enter the zip");
			String zip = Utility.readstring();
			System.out.println("Enter the Phone");
			String phone = Utility.readstring();

			addressBook.addPerson(firstName, lastName, address, city, state, zip, phone);
		} else {
			System.out.println("No Address Book created new or open existing");
		}
	}

	public static void updatePersonInAddressBook() { //update  person information

		if (addressBook.getFile() != null) {
			System.out.println("Search Person by First Name: ");
			String searchName = Utility.readstring();
			int index = addressBook.searchPersonbyFirstName(searchName);
			if (index >= 0) {
				System.out.println("Enter the Address:");
				String address = Utility.readstring();
				System.out.println("Enter the City");
				String city = Utility.readstring();
				System.out.println("Enter the State:");
				String state = Utility.readstring();
				System.out.println("Enter the Zip:");
				String zip = Utility.readstring();
				System.out.println("Enter the Phone:");
				String phone = Utility.readstring();

				addressBook.updatePerson(index, address, city, state, zip, phone);
			} else {
				System.out.println("\nPerson not found!\n");
			}
		} else {
			System.out.println("No Address Book created new or open existing");
		}
	}

	public static void removePersonInAddressBook() { //remove person in a list
		if (addressBook.getFile() != null) {
			System.out.println("Enter first Name To Remove");
			String searchName = Utility.readstring();
			int index = addressBook.searchPersonbyFirstName(searchName);

			if (index >= 0) {
				addressBook.removePerson(index);

			} else {
				System.out.println("\nPerson not Found!\n");
			}
		} else {
			System.out.println("No Address Book created new or open existing");
		}
	}

	public static void sortAddressBookByName() {  //sort  all person information by first name
		if (addressBook.getFile() != null) {
			addressBook.sortByPersonName();
		} else {
			System.out.println("No Address Book created new or open existing");
		}
	}

	public static void sortAddressBookByzipCode() { //sort  all person information by Zipcode
		if (addressBook.getFile() != null) {
			addressBook.sortByzip();
		} else {
			System.out.println("No Address Book created new or open existing");
		}

	}

	public static void printAddressBook() {   //print all person information
		if (addressBook.getFile() != null) {
			System.out.println("\n " + "File Name: " + addressBook.getFileName() + " \n");
			addressBook.printAll();
			System.out.println(" End of this AddressBook \n");
		} else {
			System.out.println("No Address Book created new or open existing");
		}
	}

	public static void saveAddressBook() {
		if (addressBook.getFile() != null) {
			IAddress.saveFile(addressBook.getFile());
			System.out.println("\nAddressBook Saved Successfully!\n");
		} else {
			System.out.println("No Address Book created new or open existing");
		}
	}

	public static void saveAsAnotherAddressBook() {
		if (addressBook.getFile() != null) {
			System.out.println("enter the file name: ");
			String fileName = Utility.readstring();
			System.out.println("enter the file extension: ");
			String fileExt = Utility.readstring();
			if (fileExt.equals(".json")) {
				IAddress.saveFile(FileSystem.createNewFile(fileName, fileExt));
				System.out.println("\nAddressBook Saved to another file successfully!\n");
			}
		} else {
			System.out.println("No Address Book created new or open existing");
		}
	}

}
