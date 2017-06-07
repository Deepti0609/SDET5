package com.fanniemae.day3;

import java.util.Vector;

public class ListEx3 {

	public static void main(String[] args) {
		//Vector<Integer> lst = new Vector<Integer>();//default capacity is 10
		//Vector<Integer> lst = new Vector<Integer>(5);// capacity is updated to 5
		Vector<Integer> lst = new Vector<Integer>(5,3); // capacity is updated by 5 and can be jumped by 3
		int x =33;
		
		System.out.println("Size:  "+ lst.size());
		System.out.println("Capacity: "+lst.capacity());
		
		lst.add(100);
		lst.add(x);
		lst.add(200);
		lst.add(300);
		lst.add(400);
		lst.add(500);
		lst.add(600);
		lst.add(700);
		
		System.out.println("Size: "+lst.size());
		System.out.println("Capacity: "+lst.capacity());
		lst.clear();
		
	}
}
