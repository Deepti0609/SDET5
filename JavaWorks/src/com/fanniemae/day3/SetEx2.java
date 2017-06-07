package com.fanniemae.day3;

import java.util.HashSet;
import java.util.Set;

public class SetEx2 {

	public static void main(String[] args) {
		
		Set<Device> set = new HashSet<Device>();
		set.add(new Device (101,"Laptop",3000));
		set.add(new Device (111,"Mobile",3500));
		set.add(new Device (121,"Projector",4000));
		set.add(new Device (131,"AC",3200));
		set.add(new Device (131,"AC",3200));
		set.add(new Device (131,"AC",3200));
		
		for(Object temp:set){
		System.out.println(temp);
		}
		
	}
}
