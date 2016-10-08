package com.example;


import java.util.HashMap;
import java.util.Hashtable;

public class TestHashTable {

	public static void main(String[] args) {
	

		// classe sincronizzata , meno performante 
		Hashtable<String, String> t1 = new Hashtable<String, String>();
		t1.put("chiave1", "valore1");
		t1.put("chiave2", "valore2");
	//	System.out.println(t1);

	
		String chiave1 =  t1.get("chiave1"); 
		String chiave2 =  t1.get("chiave2");
		
		
		// classe non sincronizzata , ed è più performante, per questo si utilizza meglio della hashtable
		HashMap<String, String> mappa = new HashMap<String, String>();
		mappa.put("key1", "value1");
		mappa.put("key2", "value2");

		System.out.println(mappa);
		
		
	 	String key1 = mappa.get("key1"); 
	 	String key2 = mappa.get("key2");

		
	}

}
