package com.bridgelabz.addressbook.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;



import com.bridgelabz.addressbook.model.Person;
import com.bridgelabz.addressbook.service.IAddress;
import com.fasterxml.jackson.databind.ObjectMapper;


public class FileSystem implements IAddress {
	public static List<Person> personList = null;
	public static ObjectMapper objM = new ObjectMapper();
	
     //getter setter
	/**
	 * @param personList
	 */
	public static void setList(List<Person> personList) {
		FileSystem.personList = personList;
	}

	/**
	 * @return
	 */
	public static List<Person> getList() {
		return personList;
	}

	/**
	 * @param fileName   file name
	 * @param fileExtension file extension
	 * @return  retrun file with extension
	 */
	public static File createNewFile(String fileName, String fileExtension) {
		File file = IAddress.getPathOfFile(fileName, fileExtension);
		try {
			@SuppressWarnings({ "unused", "resource" })
			FileWriter newFileWritten = new FileWriter(file);
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		return file;
	}
}
