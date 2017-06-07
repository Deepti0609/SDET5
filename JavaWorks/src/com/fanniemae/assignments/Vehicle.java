package com.fanniemae.assignments;

public abstract class Vehicle {
		
		private String color;
		private int noofwheels;
		private String model;
	
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getNoofwheels() {
	return noofwheels;
}
public void setNoofwheels(int noofwheels) {
	this.noofwheels = noofwheels;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}

public abstract void move();

public void brake(){
		System.out.println("Vehicles apply Brake");
	}
}