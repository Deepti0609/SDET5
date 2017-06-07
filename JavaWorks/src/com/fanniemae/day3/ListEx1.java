package com.fanniemae.day3;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {

	//collection doesnt store primitive types
	//provided it is type safe
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(10);
		list.add("hello");
		list.add(222.44);
		list.add(new Object(){});
		
		for(Object temp:list){
		System.out.println(temp);	
		}
		}
}