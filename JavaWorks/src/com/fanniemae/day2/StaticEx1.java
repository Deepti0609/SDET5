package com.fanniemae.day2;

public class StaticEx1 {
	
	//when we say as statis 
	
	public static int snum = 100;
	static {
		System.out.println("Hey i'm first static block");
	}
	public static int add(int num1, int num2){
		System.out.println("SNum: " + snum);
		return num1+num2;
		
	}
	public static void main(String[] args) {
		//StaticEx1 s  = new StaticEx1();
		int res = add(10, 20);
		System.out.println("Result: "+res);
		
	}

}
