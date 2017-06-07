package com.fanniemae.day3;

import java.util.Set;
import java.util.TreeSet;

public class SetEx3 {

	public static void main(String[] args) {
	Set<EmpName> set = new TreeSet<EmpName>(DeviceSortDescName.sortDescOnName());
	
	set.add(new EmpName("Deepti"));
	set.add(new EmpName("Archana"));
	set.add(new EmpName("Amit"));
	set.add(new EmpName("Sushma"));
	set.add(new EmpName("Lisa"));
	set.add(new EmpName("Tanya"));
	System.out.println(set);
	
	}
}
