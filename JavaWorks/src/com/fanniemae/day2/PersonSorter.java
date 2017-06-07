package com.fanniemae.day2;

import java.util.Arrays;

public class PersonSorter {
	public static void main(String[] args) {
		Person [] pers = new Person[4];
		
		pers[0] = new Person(20, "Deepti",3500);
		pers[1] = new Person(30, "Sushma",3000);
		pers[2] = new Person(40, "Tanya",4500);
		pers[3] = new Person(50, "Tanish",5500);
		
		for(Person p : pers){
			System.out.println(p);
		}
		
		System.out.println("After sort");
		System.out.println("---------------------");
		Arrays.sort(pers);
		
		PersonSorterTemplate.sortOnIdDsc(pers);
		
		for(Person p : pers){
			System.out.println(p);
		}
	}

}
