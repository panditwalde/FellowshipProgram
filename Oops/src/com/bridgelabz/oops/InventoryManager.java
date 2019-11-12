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
import com.bridgelabz.model.*;


import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class InventoryManager {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		String path = "/home/user/Desktop/pandit/Oops/src/com/bridgelabz/oops/Inventorymangementjson.json";
		readjsonfile(path, "simple");

		Inventory object;
		String[] key = { "rice 1", "rice 2", "rice 3", "wheat 1", "wheat 2" };
		
		System.out.println("-------Inventory Manager--------\n");
		for (int i = 0; i < key.length; i++) {
			object = readjsonfile(path, key[i]);

			System.out.println("Name      :" + object.getName());
			System.out.println("Weight    :" + object.getWeight());
			System.out.println("Price     :" + object.getPrice());
			System.out.println("Total Cost:" + object.getWeight() * object.getPrice());
			System.out.println("-------------------------------");

		}

	}

	public static Inventory readjsonfile(String path, String key)
			throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		Map<String, Inventory> map = mapper.readValue(new File(path), new TypeReference<Map<String, Inventory>>() {
		});
		Inventory obj = map.get(key);

		return obj;
	}

}
