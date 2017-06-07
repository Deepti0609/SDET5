package com.fanniemae.day4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class MapEx1 {

	public static void main(String[] args) {
		Map<String, Integer> accounts = new HashMap<String, Integer>();
		
		accounts.put("Deepti", 10000);
		accounts.put("Sushma", 20000);
		accounts.put("Tanya", 30000);
		accounts.put("Tanish", 40000);
		
		
		System.out.println("Deepti Balance ->" + accounts.get("Deepti"));
		System.out.println("Sushma Balance ->" + accounts.get("Sushma"));
		System.out.println("Tanya Balance ->" + accounts.get("Tanya"));
		System.out.println("Tanish Balance ->" + accounts.get("Tanish"));
		
	Set set = accounts.entrySet();
	Iterator itr = set.iterator();
	
	//hasNext will check for element
	while(itr.hasNext()){
		 
		// get values from the set and keep it in map
		// as temp object
		
		Map.Entry<String, Integer> temp = (Entry<String,Integer>) itr.next();
		
		System.out.println("Key  -> "+temp.getKey()  + ", Value  ->"+ temp.getValue());		
	}
	
	
	}
}
