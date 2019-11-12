/******************************************************************************
 *  Compilation:  javac -d bin Inventorymanagement.java
 *  Execution:    
 *  
 *  Purpose:     Read data in Json and calculate Inventory data management
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   24-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.oops;

import java.io.File;
import java.io.IOException;

import java.util.Map;
import com.bridgelabz.model.*;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Inventorymanagement {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper mapper=new ObjectMapper();
		Map<String, Inventory>map=mapper.readValue(new File("/home/user/Desktop/pandit/Oops/src/com/bridgelabz/oops/inventory.json"), new TypeReference<Map<String, Inventory>>(){
		}) ;		
		
		Inventory rice=map.get("list1");
		Inventory pulses=map.get("list2");
		Inventory wheats=map.get("list3");
		
		System.out.println("------------ Rice -----------------");
		 
		System.out.println("Quantity of Rice :"+rice.getWeight());
		System.out.println("Price of rice :"+rice.getPrice()+" per kg");		
		System.out.println("Total cost of Rice Rs."+(rice.getWeight()*(rice.getPrice())));
		
		System.out.println();
		System.out.println("------------ Pulses -----------------");
	
		System.out.println("Quantity of Pulses :"+pulses.getWeight());
		System.out.println("Price of Pulses :"+pulses.getPrice()+" per kg");		
		System.out.println("Total cost of Rice Rs."+(pulses.getWeight()*(pulses.getPrice())));
		
		System.out.println();
		System.out.println("------------ Wheats -----------------");	
		
		System.out.println("Quantity of Wheats :"+wheats.getWeight());
		System.out.println("Price of Wheats :"+wheats.getPrice()+" per kg");		
		System.out.println("Total cost of Wheats Rs."+(wheats.getWeight()*(wheats.getPrice())));
		
		
		
		
	}

	
}
