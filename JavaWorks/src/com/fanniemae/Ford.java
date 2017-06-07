package com.fanniemae;

public class Ford extends Car {
	public Ford() {
		// TODO Auto-generated constructor stub
		System.out.println("Ford Constructor created");
	}
	
public void abs(){
	System.out.println("Ford has ABS...");
}

@Override
public void move() {
	// TODO Auto-generated method stub
	System.out.println("Ford is moving");
}

@Override
public void brake() {
	// TODO Auto-generated method stub
	System.out.println("Ford has good brake controls");
	
}

}
