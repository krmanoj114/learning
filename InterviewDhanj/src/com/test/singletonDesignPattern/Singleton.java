package com.test.singletonDesignPattern;

public class Singleton {
	
	private static Singleton obj;
	
	private Singleton() {
		System.out.println("Instance Created");
	}

	public static Singleton getInstance(){
		
		if(obj == null){
			
			synchronized (Singleton.class) {
				
				if(obj == null){
					obj = new Singleton();
				}
				
			}
	          
		}
		return obj;
	}

}
