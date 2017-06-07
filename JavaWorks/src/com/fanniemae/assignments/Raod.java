package com.fanniemae.assignments;

public class Raod {
  
	public static void main(String[] args) {
		Truck t = new Truck();
		t.setColor("Blue");
		t.setModel("Constructor");
		t.setNoofwheels(6);
		System.out.println("Truck Color: "+t.getColor()+", Truck Model: "+t.getModel()+", Truck wheels: "+t.getNoofwheels());
		t.axels();
		t.brake();
		t.fuel();
		t.move();
		System.out.println("---------------------------------------------------------");
		
		Car c = new Car();
		c.setColor("Red");
		c.setModel("Sedan");
		c.setNoofwheels(4);
		System.out.println("Car Color: "+c.getColor()+", Car Model: "+c.getModel()+", Car Wheels: "+c.getNoofwheels());
	
		c.abs();
		c.move();
		c.rearview();
		System.out.println("---------------------------------------------------------");
		
		Bus b = new Bus();
		b.setColor("Yellow");
		b.setModel("School");
		b.setNoofwheels(4);
		System.out.println("Bus Color: "+b.getColor()+", Bus Model: "+b.getModel()+", Bus wheels: "+b.getNoofwheels());
		b.capacity();
		b.move();
		b.brake();
		System.out.println("---------------------------------------------------------");
	}
}
