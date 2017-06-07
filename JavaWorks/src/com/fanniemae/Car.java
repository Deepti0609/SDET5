package com.fanniemae;

public abstract class Car extends Vehicle {

	public Car() {
		// TODO Auto-generated constructor stub
		System.out.println("Car Constructor created");
	}
	public void steering(){
		System.out.println("Car has steering");
	}
	
	public void fuelCapacity(int capacity){
		System.out.println("Car Capacity"+ capacity);
	}
}
