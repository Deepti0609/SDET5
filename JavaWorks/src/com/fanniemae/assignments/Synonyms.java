package com.fanniemae.assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Synonyms {
  
	public static void main(String[] args) {
		
		TreeMap<String,List<String>> map = new TreeMap<String,List<String>>();
		List Hello = new ArrayList();
		List Bye = new ArrayList();
		
		Hello.add("hello");
		Hello.add("hi");
		Hello.add("welcome");
		
		Bye.add("bye");
		Bye.add("cye");
		Bye.add("see you");
		
		map.put("Hello", Hello);
		map.put("Bye", Bye);
		
		
		Set set = map.entrySet();
	    Iterator ita = set.iterator();
		
		//hasNext will check for element
		while(ita.hasNext()){
			 
			// get values from the set and keep it in map
			// as temp object
			
			Map.Entry<String, List<String>> temp = (Entry<String,List<String>>) ita.next();
			
			System.out.println("Synonyms for "+temp.getKey()  + "::"+ temp.getValue());		
		
	}
}
}
