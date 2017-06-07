package com.fanniemae.day2;

public class ExceptionalEx2 {

	public static void main(String[] args) {
		try{
			System.out.println("Connect to DB");
			return;
		}catch(Exception e){
			System.out.println("Oh Exception caught" + e);
		}finally{
			System.out.println("close to DB happens here");
		}
		
		System.out.println("I am other code in the world");
		
	}
}
