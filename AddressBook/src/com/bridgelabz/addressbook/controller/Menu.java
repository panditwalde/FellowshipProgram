
/**
* @purpose     :  To hold address all the operation of address book  
* 
* @author       :  pandit walde
* 
***/
package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.utility.Utility;

public class Menu {
	static boolean value = true;

	public static void main(String x[]) {

		try {
			while (value) {
				System.out.println("Enter the choice:");
				System.out.println("1. Create New Address Book");
				System.out.println("2. Open existing Address Book");
				System.out.println("3. Add Person");
				System.out.println("4. Edit Person");
				System.out.println("5. Remove Person");
				System.out.println("6. Sort by name");
				System.out.println("7. Sort by zip");
				System.out.println("8. Display");
				System.out.println("9. Save");
				System.out.println("10.Save As");
				System.out.println("11.exit");
				System.out.println("Enter your choice : ");
				int ch = Utility.readinteger();
				switch (ch) {
				case 1:
					AddressBookManager.addnewCustomerBook();
					break;

				case 2:
					AddressBookManager.openExistingAddressBook();
					break;

				case 3:
					AddressBookManager.addPersonInAddressBook();
					break;

				case 4:
					AddressBookManager.updatePersonInAddressBook();
					break;

				case 5:
					AddressBookManager.removePersonInAddressBook();
					break;

				case 6:
					AddressBookManager.sortAddressBookByName();
					break;

				case 7:
					AddressBookManager.sortAddressBookByzipCode();
					;
					break;

				case 8:
					AddressBookManager.printAddressBook();
					break;

				case 9:
					AddressBookManager.saveAddressBook();
					break;

				case 10:
					AddressBookManager.saveAsAnotherAddressBook();
					break;

				case 11:
					System.out.println("exiting");
					value = false;
					break;

				default:
					System.out.println("invalid choice");

				}
			}
		} catch (Exception e) {
			System.out.println("\nSome problem is there...!" + e);
		}

	}

}
