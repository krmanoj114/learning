package com.test.mixed;


interface Marker {
	
}

class MyException extends Exception{
	public MyException(String message) {
		super(message);
	}
}

class A {
	void method() throws MyException {
		if(this instanceof Marker ) {
			System.out.println("Successful");
		}
		else {
			throw new MyException("Must inplement Marker Interface");
		}
	}
}

public class CustomMarkerInterfaceExample extends A implements Marker{
	
	public static void main(String args[]) {
		
		CustomMarkerInterfaceExample markerInterfaceExample = new CustomMarkerInterfaceExample();
		
		try {
			markerInterfaceExample.method();
		} catch (MyException e) {
			System.out.println(e);
		}
		
	}

}
