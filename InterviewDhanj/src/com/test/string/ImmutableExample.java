package com.test.string;

public final class ImmutableExample {
	
	private final String name;
	private final int age;
	
	private ImmutableExample(final String name, final int age){
		
		super();
		this.name = name;
		this.age = age;
	}
	
	
	public int getAge(){
		return age;
	}
	
	public String getName(){
		return name;
	}
	

}
