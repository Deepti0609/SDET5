package com.fanniemae.assignments;

public class Car extends Vehicle{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Car moves");
		
	}

	public void abs(){
		System.out.println("Car has ABS...");
	}
	
	public void rearview(){
		System.out.println("Car has rearview...");
	}
}
