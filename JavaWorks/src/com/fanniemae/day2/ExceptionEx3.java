package com.fanniemae.day2;

import java.io.IOException;

public class ExceptionEx3 {

	public static void validateName(String name)
		throws Exception
	     {
			if(name.length() < 5){
			throw new Exception("Sorry name cannot be less than 5 characters");
		}
	}
	
	
	public static void checkCreditScore(int cs, String name)
	throws IOException, Exception{
		try{
			validateName(name);
		}catch(Exception e){
			throw new Exception ("Sorry check of credit score not", e);
		}
		
	
		if(cs < 400){
			//throw an exception
			throw new FanniemaeException();
			//("sorry less than 400 is not processed, Mr/Ms/Mrs: " + name);
		}if(cs >= 400 && cs < 500){ 
			throw new IOException("You are not good now, try after 3 months, Mr/MS/Mrs: " +name);
		}
		else{
			System.out.println("We are good to go, Mr/Ms/Mrs: "+ name);
		}
	}
	
public static void main(String[] args) {
	try
	{
	checkCreditScore(344,"Harry");
	}catch(IOException e){
		System.out.println(e.getMessage());
		e.printStackTrace();
	}catch(FanniemaeException fe){
		fe.printStackTrace();
	}catch(Exception e){
		e.printStackTrace();
	}

}
}
