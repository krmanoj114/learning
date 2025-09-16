package com.test.singletonDesignPattern;

public class SingletonDemo {
	
	public static void main(String args[]){
		
		Thread t = new Thread( new Runnable() {
			
			public void run() {
				
				Singleton obj = Singleton.getInstance();
				System.out.println("obj::"+obj);
			}
		} );
		
		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				Singleton obj1 = Singleton.getInstance();
				System.out.println("obj1::"+obj1);
			}
		});
		
		t.start();
		t1.start();
		
//		Singleton obj = Singleton.getInstance();
//		Singleton obj1 = Singleton.getInstance();
		
	}

}
