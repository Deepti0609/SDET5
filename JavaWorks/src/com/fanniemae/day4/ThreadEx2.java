package com.fanniemae.day4;

// now this class eligible to be a async
class SampleThread extends Thread{

	// all business logic goes here
	// every job when it executes it shall be given 
	// a quata
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		// to simulate
		for(int i=0;i<500;i++){
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("i value "+i+" in thread "+ Thread.currentThread().getName());
		}
		
		System.out.println("Thread " + Thread.currentThread().getName() + " Exiting..");
	}

	
}


public class ThreadEx2 {

	public static void main(String[] args) {
		//this will be the first  thread
		// since it has main
		 
		SampleThread st = new SampleThread();
		// this statement shall create an OS level thread and give the control to run method in the class
		st.start();
		
		SampleThread st1 = new SampleThread();
		st1.start();
		
		SampleThread st2 = new SampleThread();
		st2.start();
		
		for(int i=0;i<500;i++){
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("i value "+i+" in thread "+ Thread.currentThread().getName());
		}
		
		
		try {
			st.join();
			st1.join();
			st2.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("Thread " + Thread.currentThread().getName() + " Exiting..");
	}
	
}
