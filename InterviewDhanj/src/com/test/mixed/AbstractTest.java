package com.test.mixed;

abstract class abc {
	
	public abc(){
		
	}
	
	abstract int method();
	
	
}

public class AbstractTest extends abc {

	public static void main(String[] args) {
		
		System.out.println("Hi");
		
		abc a= new AbstractTest();
		a.method();
		

	}

	@Override
	int method() {
		// TODO Auto-generated method stub
		return 0;
	}

}
