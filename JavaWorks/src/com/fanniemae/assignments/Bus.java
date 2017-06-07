package com.fanniemae.assignments;

public class Bus extends Vehicle{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Bus moves");
		
	}
	
	public void capacity(){
		System.out.println("Bus has muliple passenger capacity");
	}
	
	public void steering(){
		System.out.println("Bus has steering");
	}
	
	public void brake(){
		System.out.println("Bus apply brake");
	}

}
