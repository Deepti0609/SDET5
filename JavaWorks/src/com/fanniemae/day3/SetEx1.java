package com.fanniemae.day3;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {
		
		Set<String> st = new HashSet<String>();
		st.add("Lisa");
		st.add("Deepti");
		st.add("Sushma");
		st.add("Deepti");
		st.add("Tanya");
		st.add("Tanish");
		st.add("Deepti");
		
		
		System.out.println(st);
	}
}
