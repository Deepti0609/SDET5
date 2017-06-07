package com.fanniemae.day2;

public class AccountClient {
	public static void main(String[] args) {
		
		Runtime.runFinalizersOnExit(true);
		
		Account[] accounts = new Account[4];
		accounts[0]= new Account(1000, "Deepti");
		accounts[1]= new Account(2000, "Sushma");
		accounts[2]= new Account(1100, "Tanish");
		accounts[3]= new Account(1200, "Tanya");
		
		for(Account temp : accounts){
			System.out.println(temp);
			//System.out.println("accID:"+temp.getAccId()+","+"Balance:"+temp.getBalance()+","+"Customer:"+temp.getCustName());
		}
	}

}
