package com.fanniemae.day4;

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




public class Assignment1 {

	public static void main(String[] args) {
		HashMap<String,List<String>> map = new HashMap<String,List<String>>();
		List<String> list = new ArrayList<String>();
		String line;
	
		try {
			BufferedReader br = new BufferedReader(new FileReader("Synonyms.txt"));
			while ((line = br.readLine()) !=null){
				String[] s1 = line.split("=",2);
				if(s1.length >=2)
				{
					String key = s1[0];
					String value = s1[1];
					list.add(value);
					map.put(key, list);	
					System.out.println("Synonym for  "+key+" : "+value);
											
				}else{
					//System.out.println("Ignoring the line"+line);
				}
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
		