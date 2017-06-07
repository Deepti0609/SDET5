package com.fanniemae.assignments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab1 {
	
	 public static void main(String[] args) {

	      

		 Map<String, List <String>> map = new HashMap<String, List <String>>();

		 BufferedReader br;

		  

		 try {

		       br = new BufferedReader(new FileReader("synonyms.txt"));

		       String line;

		       while ((line = br.readLine()) != null) {

		             //map = new HashMap<String, List <String>>();

		             

		               String parts[] = line.split("=", 2);

		               if (parts.length >= 2)

		               {         

		                   String key = parts[0];

		                   String value = parts[1];

		                   List<String> list = new ArrayList<String>();

		                   list.add(value);

		                   map.put(key, list);    

		       

		           } else {

		             //System.out.println("ignoring line: " + line);

		           }

		             //System.out.println(map.toString());

		       

		       }

		 } catch (FileNotFoundException e) {

		       //  TODO Auto-generated catch block

		       e.printStackTrace();

		 } catch (IOException e) {

		       //  TODO Auto-generated catch block

		       e.printStackTrace();

		 }

		  

		 for (String key : map.keySet())

		 {

		     System.out.println("Synonyms for " + key + ":" + map.get(key));

		 }

		       

		 BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

		 BufferedWriter bw = null;

		 int option = 0;

		 String enteredKey = "";

		 String newValue = "";

		 List<String> newList = new ArrayList<String>();

		 System.out.println("Enter Option 1 for 'Show Synonym' or Option 2 for 'Add Synonym'");
		       try {

		             option = Integer.parseInt(br1.readLine());	             

		 if (option == 1) {

		             System.out.println("You Selected: " + "Show Synonym");

		             System.out.println("Enter the word to see Synonym");

		             enteredKey = br1.readLine();

		             System.out.println("The word you entered is : " + enteredKey);
		             System.out.println(map.get(enteredKey));
		                         

		             if (map.get(enteredKey) != null){		             

		             System.out.println("Synonyms for " +enteredKey+ ":" + map.get(enteredKey));
		             }            

		             else{                   

		                   System.out.println("Word not found");     

		             }

		  

		 } else {

		             System.out.println("You Selected:" + "Add Synonym");

		             System.out.println("Enter the key word you would like to add");

		             enteredKey = br1.readLine();

		             System.out.println("The word you entered is :" + enteredKey);

		             System.out.println("Enter the list of synonyms separated by comma");

		             newValue = br1
		            		 
		            		 
		            		 
		            		 
		            		 .readLine();

		       newList.add(newValue);

		         map.put(enteredKey, newList);

		         System.out.println("Synonyms for " + enteredKey + ":" + map.get(enteredKey));

		         bw = new BufferedWriter(new FileWriter("synonyms.txt", true));//with append

		         bw.write(enteredKey + "=" + newValue);

		             bw.newLine();

		             System.out.println("-----------Synonym Added -------------");

		             bw.close();

		 }

		       } catch (NumberFormatException | IOException e) {

		             //  TODO Auto-generated catch block

		             e.printStackTrace();

		       }

		       }

		 }

		       

		 