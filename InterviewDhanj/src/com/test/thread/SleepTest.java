package com.test.thread;

public class SleepTest {
	
	public static void main(String args[]){
		System.out.println(Thread.currentThread().getName() + "is going to sleep for 1 second");
		
		try{
			
			Thread.currentThread().sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("Main thread wokenup now");
	}

}
