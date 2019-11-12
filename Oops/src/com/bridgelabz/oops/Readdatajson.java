package com.bridgelabz.oops;

import java.io.File;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Readdatajson {

	public static void main(String[] args) {
	
		
		ObjectMapper mapper=new ObjectMapper();
		try
		{
			
			Map<String, Object>map=mapper.readValue(new File("/home/user/Desktop/pandit/BridgelabzProgram/src/com/bridgelabz/oops/file.json"), new TypeReference<Map<String, Object>>(){
			}) ;
			
			System.out.println("Name    :"+map.get("Name"));
			System.out.println("Address : "+map.get("Address"));
			System.out.println("Email   :"+map.get("Email"));
			System.out.println("Contact :"+map.get("Contact"));
			System.out.println("name    :"+map.get("name"));
			
		}
		catch(Exception e)
		{
			System.out.println("some problem is there..");
		}

	}

}
