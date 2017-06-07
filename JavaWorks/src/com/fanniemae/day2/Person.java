package com.fanniemae.day2;

import java.io.Serializable;

public class Person implements Comparable<Person>, Serializable{
	private int pId;
	private String pName;
	private double income;
	
	public Person(int pId, String pName, double income) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.income = income;
	}
	
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", income=" + income + "]";
	}


@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		//return (int) (this.income - o.income);//ascending order
	    //return (int) (o.income - this.income);//descending order
		return this.pName.compareTo(o.pName);
	}
	
	

}
