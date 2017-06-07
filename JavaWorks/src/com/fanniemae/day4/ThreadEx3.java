package com.fanniemae.day4;

class BusinessLogic{}
class MyBusinessLogic extends BusinessLogic implements Runnable{
	
	Thread thread;
	int priority;
	
	MyBusinessLogic(){}
	MyBusinessLogic(String threadName, int priority){
		this.thread = new Thread(this, threadName);
		thread.setPriority(priority);
		//will create an OS level thread and invoke run
		thread.start();
		
	}
	
	public void run(){
		for(int i =0;i<400;i++){
			System.out.println("Thread  "+ Thread.currentThread().getName() 
					+ " has value " +i+" Has the priority" + thread.getPriority());
		}
		
		System.out.println("Thread  "+thread.getName()+" Exiting ...");
		
	}
	
}


public class ThreadEx3 {

	public static void main(String[] args) {
		
		MyBusinessLogic mbl = new MyBusinessLogic("Laptop", Thread.MIN_PRIORITY);
		MyBusinessLogic mbl1 = new MyBusinessLogic("Mobile", Thread.NORM_PRIORITY);
		MyBusinessLogic mbl2 = new MyBusinessLogic("Projector", Thread.MAX_PRIORITY);
		
		Thread tr1 = new Thread(new MyBusinessLogic());
		tr1.setName("Presenter");
		tr1.setPriority(mbl1.priority-2);
		tr1.start();
				
	
	}
}
