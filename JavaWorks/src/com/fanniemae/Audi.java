package com.fanniemae;

public class Audi extends Car {
	public Audi() {
		// TODO Auto-generated constructor stub
		System.out.println("Audi constructor created");
	}
	
	public void view(){
		System.out.println("audi has rear view...");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Audi is moving");
	}

	}
