package com.test.java8;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class CurrentDateTimeExample {
	
	public static void main(String args[]) {
		
		System.out.println(java.time.LocalDateTime.now());
		
		Date date = new Date();
		
		System.out.println(date);
		
	}

}
