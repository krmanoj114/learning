package com.test.builderDesignPattern;

public class Shop {
	
	public static void main(String args[]){
		
		
		Phone p = new PhoneBuilder().setOs("Android").setRam(2).getPhone();
		System.out.println(p);
	}

}
