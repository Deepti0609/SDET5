package com.fanniemae.day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadWriteData {
public static void main(String[] args) throws NumberFormatException, IOException {
	
	BufferedReader br = new BufferedReader
			(new InputStreamReader(System.in));
	
	System.out.println("Enter Emp Id: ");
	int empId = Integer.parseInt(br.readLine());
	
	System.out.println("Enter Name:  ");
	String empName = br.readLine();

	System.out.println("Enter Salary:  ");
	double empSal = Double.parseDouble(br.readLine());
	
	System.out.println("-------You entered ------");
	System.out.println("Emp Id is:  "+ empId);
	System.out.println("Emp Name is: "+ empName);
	System.out.println("Emp Salary is:" + empSal);
	
	BufferedWriter bw = null;
			try{
			bw = new BufferedWriter(new FileWriter("Emp.txt", true));
	bw.write("Emp ID: " + empId);
	bw.newLine();
	bw.write("Emp Name: " + empName);
	bw.newLine();
	bw.write("Emp Salary: " + empSal);
	bw.newLine();
	
	
	System.out.println("Data Written");
			}catch(IOException ioex){
				ioex.printStackTrace();
			}finally{
	
	bw.close();
			}//here writing of data
	}
}
