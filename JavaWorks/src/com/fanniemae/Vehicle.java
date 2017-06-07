package com.fanniemae;

public abstract class Vehicle {
	public Vehicle(){
		System.out.println("Vehicle Constructor created");
	}
		
public abstract void move();
public void brake(){
		System.out.println("Vehicles apply Brake");
	}
}
