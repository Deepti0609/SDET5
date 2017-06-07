package com.fanniemae.day2;

public class ExceptionEx1 {
 public static void main(String[] args) {
	try{
		try{
			int arr[] = new int[-4];
		}catch(NegativeArraySizeException nase){
			System.out.println("Sorry you cannot pass -ve sized array");
		}
	int num1 = Integer.parseInt(args[0]);
	int num2 = Integer.parseInt(args[1]);
	
	int res = num1/num2;
	
	System.out.println("Res: " + res);
	 }catch(NumberFormatException e ){
		 System.out.println("Hey please dont enter chars");
	 }catch(ArithmeticException e){
		 System.out.println("You tried dividing by zero please check");
	 }catch(ArrayIndexOutOfBoundsException e){
		 System.out.println("Did u forget to pass param");
	 }catch(Exception e){
		 System.out.println("message: "+ e);
	 }
	System.out.println("I have some business logic");
}
}

