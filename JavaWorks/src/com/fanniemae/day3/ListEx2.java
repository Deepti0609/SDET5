package com.fanniemae.day3;

import java.util.ArrayList;
import java.util.List;

public class ListEx2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		System.out.println("List size:  "+ list.size());
		list.add("Deepti");
		list.add("Sushma");
		list.add("TANYA");
		list.add("TANISH");
		
		System.out.println("list.size:  "+ list.size());
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		System.out.println("list.size:  "+ list.size());
	}
}
