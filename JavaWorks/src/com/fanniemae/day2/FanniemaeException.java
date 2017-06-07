package com.fanniemae.day2;

public class FanniemaeException extends Exception{ 
	String msg;
	
	public FanniemaeException(){
		msg = "FannieMae Exception Called";
	}
	
	public FanniemaeException(String msg){
		this.msg = msg;
		
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.msg;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "toString:::: "+ this.msg;
	}

}
