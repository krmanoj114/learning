package com.test.thread;

public class DeadLockExample {
	
	
	
		public void method1(){
		
		synchronized (String.class) {
			
			System.out.println("Aquired lock on String.class"+Thread.currentThread().getName());
			
			synchronized (Integer.class) {
				
				System.out.println("Aquired lock on Integer.class"+Thread.currentThread().getName());
				
			}
			
		}
	}
	
	
	public void method2(){
		
		synchronized(Integer.class){
			System.out.println("Aquired lock on Integer.class"+Thread.currentThread().getName());
			
			synchronized(String.class){
				System.out.println("Aquired lock on String.class"+Thread.currentThread().getName());
			}
		}
	}
	
	
	public static void main(String args[]){
		
		Thread t1 = new Thread1();
		Thread t2 = new Thread2();
		t1.start();
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		t2.start();
	}
	
	

}

class Thread1 extends Thread{
	
	DeadLockExample de = new DeadLockExample(); 
			
	
public void run(){
		
		System.out.println("Start:"+Thread.currentThread().getName());
		
		try{
			
			Thread.sleep(1000);
			de.method1();
						
		}catch(InterruptedException e){
			e.printStackTrace();
			
		}
	}
	
}


class Thread2 extends Thread{
	
	DeadLockExample de = new DeadLockExample(); 
			
	
public void run(){
		
		System.out.println("Start:"+Thread.currentThread().getName());
		
		try{
			
			Thread.sleep(1000);
			de.method2();
						
		}catch(InterruptedException e){
			e.printStackTrace();
			
		}
	}
	
}
