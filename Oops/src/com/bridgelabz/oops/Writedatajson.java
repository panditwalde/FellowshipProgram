package com.bridgelabz.oops;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Writedatajson {

	public static void main(String[] args) {
		
		
		ObjectMapper mapper=new  ObjectMapper();
		
		
		Map<String, Object> map=new HashMap<String, Object>();
		
		map.put("Name", "pandit");
		map.put("Address", "Aurangabad");
		map.put("Email", "panditwalde64@gmail.com");
		map.put("Contact",956131843);
		
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ajay");
		al.add("dipak");
		al.add("ravi");
		
		map.put("name", al);
		try {
			
			mapper.writeValue(new File("/home/user/Desktop/pandit/BridgelabzProgram/src/com/bridgelabz/oops/file.json"), map);
		}
		catch(Exception e)
		{
			System.out.println("Some  problem in file");
		}
		
		
		
		
		

	}

}
