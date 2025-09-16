package test;

public class Foo {
	private String stringValue; 

	private int intValue; 

	 

	public Foo() { 

	this(null, 0); 

	} 

	 

	public Foo(String stringValue) { 

	this(stringValue, 0); 

	} 

	 

	public Foo(int intValue) { 

	this(null, intValue); 

	} 

	 

	public Foo(String stringValue, int intValue) { 

	//this(); 

	this.stringValue = stringValue; 

	this.intValue = intValue; 

	} 

}
