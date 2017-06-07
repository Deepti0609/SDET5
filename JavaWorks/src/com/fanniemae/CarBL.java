package com.fanniemae;

public class CarBL {

	public void showCar(Car[] cars){
		
		for (Car temp : cars){
			System.out.println("-------------------------------");
			temp.move();
			temp.brake();
			temp.fuelCapacity(55);
			temp.steering();
			
			if (temp instanceof Ford){
				((Ford)temp).abs();
			}else if (temp instanceof Audi)
			((Audi)temp).view();
			
		}
	}
}
