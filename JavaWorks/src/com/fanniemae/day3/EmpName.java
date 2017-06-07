package com.fanniemae.day3;

import java.util.Comparator;

public class EmpName{

	private String name;

	public EmpName(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "EmpName [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return this.name.charAt(0);
	}

	@Override
	public boolean equals(Object obj)
	{
		EmpName nam = (EmpName) obj; 
		return this.name.equals(nam.name);
	}

	
}
