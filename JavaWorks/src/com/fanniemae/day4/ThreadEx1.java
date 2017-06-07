package com.fanniemae.day4;

public class ThreadEx1 {

	public static void main(String[] args) {
		
		System.out.println("Thread Main: " + Thread.currentThread().getName());
		//MIN PRIORITY 1
		//NORM PRIORITY 5 (default)
		//MAX PRIORITY 10
		
		System.out.println("Thread Priority: " + Thread.currentThread().getPriority());
	}
}
