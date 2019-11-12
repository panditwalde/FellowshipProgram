package com.bridgelabz.addressbook.service;

import java.io.File;
import java.io.IOException;
import java.util.List;


import com.bridgelabz.addressbook.controller.FileSystem;
import com.bridgelabz.addressbook.model.Person;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;




public interface IAddress 

{
	
	

	ObjectMapper objectmapper =new ObjectMapper();
	/**
	 * @param fileName        get file for user
	 * @param fileExtension   file extension
	 * @return
	 */
	public static File getPathOfFile(String fileName, String fileExtension)
	{
		fileName = "/home/user/Desktop/pandit/AddressBook/src/com/bridgelabz/addressbook/respository/"+ fileName + fileExtension;
		
		File file = new File(fileName);
		
		return file;
	}
	/**
	 * @param file   file  path where you want to store
	 */
	public static void saveFile(File file)
	{
		List<Person> updatedList =FileSystem.getList();
		try {
			objectmapper.writerWithDefaultPrettyPrinter().writeValue(file, updatedList);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * @param file    file  path where you want to store
	 */
	public static void readFile(File file)
	{
		try 
		{
			FileSystem.setList(objectmapper.readValue(file, new TypeReference<List<Person>>() {}));
		} 
		catch (IOException e) 
		{
			System.out.println("\nFile Not Found!\n");
		}
	}
	
}

